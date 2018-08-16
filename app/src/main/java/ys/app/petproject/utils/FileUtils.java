/**
 * Copyright ® 2007-2014 ebrun.com Co. Ltd.
 * All right reserved.
 */

package ys.app.petproject.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {

	private static final String CHARSET = "UTF-8";

	/** 分隔符. */
	public final static String FILE_EXTENSION_SEPARATOR = ".";

	/**
	 * 
	 * @description 获取文件内容
	 * 
	 * @param file
	 * @return
	 * 
	 * @return String
	 */
	public static String getContent(File file) {
		StringBuffer strBuffer = new StringBuffer();
		InputStreamReader inputReader = null;
		BufferedReader bufferReader = null;
		OutputStream outputStream = null;
		try {
			InputStream inputStream = new FileInputStream(file);
			inputReader = new InputStreamReader(inputStream);
			bufferReader = new BufferedReader(inputReader);

			// 读取一行
			String line = null;

			while ((line = bufferReader.readLine()) != null) {
				strBuffer.append(line);
			}

		} catch (IOException e) {
			Logger.i("", e);
		} finally {
			try {
				if (inputReader != null) {
					inputReader.close();
				}
				if (bufferReader != null) {
					bufferReader.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
			} catch (IOException e) {
				Logger.i("", e);
			}
		}
		return strBuffer.toString();
	}

	/**
	 * 将信息追加到手机内存中的文件中
	 */
	public static void saveAppend(Context context, String channelId,
								  String content) throws Exception {
		List<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		File dir = new File(context.getFilesDir().getAbsolutePath()+"/ebrun_record");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		try{
			String fileName = "record_"+channelId+".txt";
			File file = new File(dir, fileName);
			if (!file.exists()){
				file.createNewFile();
			}
			String temContent = getContent(file);
			if (temContent != null && !temContent.equals("")) {// 有记录
				String content1 = "";
				String[] split = temContent.split(",");
				if (split.length > 99) {
					list = Arrays.asList(split);
					list2.addAll(list);
					list2.remove(0);
					for (int i = 0; i < list2.size(); i++) {
						if (i != list2.size() - 1) {
							content1 = content1 + list2.get(i) + ",";
						} else {
							content1 = content1 + list2.get(i);
						}
					}

					saveRecord(file.getAbsolutePath(), content1 + "," + content,false);

				// FileOutputStream outStream = new FileOutputStream(fileName,
				// true);
				// OutputStreamWriter writer = new OutputStreamWriter(outStream,
				// CHARSET);
				// writer.write(content1 + "," + content);
				// writer.flush();
				// writer.close();
				// outStream.close();
				} else {
					saveRecord(file.getAbsolutePath(), content + ",",true);
	
					// FileOutputStream outStream = new FileOutputStream(fileName,
					// true);
					// OutputStreamWriter writer = new OutputStreamWriter(outStream,
					// CHARSET);
					// writer.write(content+",");
					// writer.flush();
					// writer.close();
					// outStream.close();
				}
	
			} else {
				saveRecord(file.getAbsolutePath(), content + ",",true);
	
				// FileOutputStream outStream = new FileOutputStream(fileName,
				// true);
				// OutputStreamWriter writer = new OutputStreamWriter(outStream,
				// CHARSET);
				// writer.write(content+",");
				// writer.flush();
				// writer.close();
				// outStream.close();
			}
		} catch (IOException e) {
			Logger.i("", e);
		}

	}

	/**
	 * 保存阅读记录
	 * @description
	 *
	 * @return
	 *
	 * @param filename
	 * @param content
	 * @param isAppend
	 */
	public static void saveRecord(String filename, String content, boolean isAppend) {
		OutputStreamWriter writer = null;
		FileOutputStream outStream = null;
		try {
			outStream = new FileOutputStream(filename, isAppend);
			writer = new OutputStreamWriter(outStream, CHARSET);
			writer.write(content);
			writer.flush();

		} catch (FileNotFoundException e) {
			Logger.i("", e);
		} catch (UnsupportedEncodingException e) {
			Logger.i("", e);
		} catch (IOException e) {
			Logger.i("", e);
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
				if (outStream != null) {
					outStream.close();
				}
			} catch (IOException e) {
				Logger.i("", e);
			}
		}
	}

	/**
	 * 检查是否安装了sd卡
	 * 
	 * @return false 未安装
	 */
	public static boolean sdCardMounted() {
		final String state = Environment.getExternalStorageState();
		if (state.equals(Environment.MEDIA_MOUNTED)
				&& !state.equals(Environment.MEDIA_MOUNTED_READ_ONLY)) {
			return true;
		}
		return false;
	}

	/**
	 * 是否阅读过
	 * @description
	 *
	 * @return
	 *
	 * @param channelId
	 * @param id
	 * @return
	 */
	public static boolean isReaded(Context context, String channelId, String id) {
		boolean isRead = false;
		File file = new File(context.getFilesDir().getAbsolutePath()+"/ebrun_record", "record_"+channelId+".txt");
		//File file = new File("/data/data/com.ebnews/files/ebrun_record/record_"+ channelId + ".txt");
		String content = getContent(file);
		if (content.contains(id)) {
			isRead = true;
		}

		return isRead;
	}


	/**
	 * 获得不带扩展名的文件名称
	 * @param filePath 文件路径
	 * @return
	 */
	public static String getFileNameWithoutExtension(String filePath) {
		if (TextUtils.isEmpty(filePath)) {
			return filePath;
		}
		int extenPosi = filePath.lastIndexOf(FILE_EXTENSION_SEPARATOR);
		int filePosi = filePath.lastIndexOf(File.separator);
		if (filePosi == -1) {
			return (extenPosi == -1 ? filePath : filePath.substring(0,
					extenPosi));
		}
		if (extenPosi == -1) {
			return filePath.substring(filePosi + 1);
		}
		return (filePosi < extenPosi ? filePath.substring(filePosi + 1,
				extenPosi) : filePath.substring(filePosi + 1));
	}
	/**
	 * 删除指定目录中特定的文件
	 * @param dir
	 * @param filter
	 */
	public static void delete(String dir, FilenameFilter filter) {
		if (TextUtils.isEmpty(dir))
			return;
		File file = new File(dir);
		if (!file.exists())
			return;
		if (file.isFile())
			file.delete();
		if (!file.isDirectory())
			return;

		File[] lists = null;
		if (filter != null)
			lists = file.listFiles(filter);
		else
			lists = file.listFiles();

		if (lists == null)
			return;
		for (File f : lists) {
			if (f.isFile()) {
				f.delete();
			}
		}
	}


	//根据byte数组，生成文件
	public static File getFile(byte[] bfile, String filePath,String fileName) {
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		File file = null;
		try {
			File dir = new File(filePath);
			if(!dir.exists()&&dir.isDirectory()){//判断文件目录是否存在
				dir.mkdirs();
			}
			file = new File(filePath+"\\"+fileName);
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			bos.write(bfile);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		return file;
	}

}
