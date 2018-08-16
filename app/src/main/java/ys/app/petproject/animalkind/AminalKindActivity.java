package ys.app.petproject.animalkind;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.greendao.AnimalTypeClassifyInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ys.app.petproject.BaseActivity;
import ys.app.petproject.R;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.model.AnimalTypeClassifyInfo;

public class AminalKindActivity extends BaseActivity {

    private EditText et_filter;
    private ListView listView;
    private TextView tv_index;
    private SideView sideView;
    private List<AnimalTypeClassifyInfo> typeList;

    //汉字转化为拼音的类
    private CharacterParser characterParser;
    //根据拼音来排列ListVIew里面的数据类
    private PinyinComparator pinyinComparator;
    private AnimalKindSortAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_book);
        et_filter= (EditText) findViewById(R.id.et_address_book_filter);
        listView= (ListView) findViewById(R.id.lv_address_book);
        tv_index= (TextView) findViewById(R.id.tv_address_book_index);
        sideView= (SideView) findViewById(R.id.as_address_book_side_view);
        setBackVisiable();
        String categoryID=getIntent().getStringExtra("categoryID");
        AnimalTypeClassifyInfoDao employeeInfoDao = GreenDaoUtils.getmDaoSession().getAnimalTypeClassifyInfoDao();
        QueryBuilder<AnimalTypeClassifyInfo> qb = employeeInfoDao.queryBuilder();
        qb.where(AnimalTypeClassifyInfoDao.Properties.Type.eq(categoryID));
        typeList =qb.list();
        if (typeList !=null&& typeList.size()>0){
            initPage();
        }

    }
    public void initPage() {

        sideView.setTextView(tv_index);
        // 实例化汉字转拼音类
        characterParser = CharacterParser.getInstance();
        pinyinComparator = new PinyinComparator();
        initData();
    }


    private void initData() {
        for (int i = 0; i < typeList.size(); i++) {
            // 汉字转化为拼音
            String pinyin = characterParser.getSelling(typeList.get(i).getName());
            String sortString = null;
            if (!pinyin.equals("") && pinyin != null) {
                sortString = pinyin.substring(0, 1).toUpperCase();
                if (sortString.matches("[A-Z]")) {
                    typeList.get(i).setSortLetters(sortString.toUpperCase());
                } else {
                    typeList.get(i).setSortLetters("#");
                }
            }
        }
        setTouchListener();

    }


    /**
     * 根据输入框的值来过滤数据并更新ListView
     */
    private void filterData(String filterStr) {
        List<AnimalTypeClassifyInfo> filterDateList = new ArrayList<AnimalTypeClassifyInfo>();

        if (TextUtils.isEmpty(filterStr)) {
            filterDateList = typeList;
        } else {
            filterDateList.clear();
            for (AnimalTypeClassifyInfo sortModel : typeList) {
                String name = sortModel.getName();
                if (name.indexOf(filterStr.toString()) != -1
                        || characterParser.getSelling(name).startsWith(
                        filterStr.toString())) {
                    filterDateList.add(sortModel);
                }
            }
        }

        // 根据a-z进行排序
        Collections.sort(filterDateList, pinyinComparator);
        adapter.updateListView(filterDateList);
    }


    private void setTouchListener() {
        // 设置右侧触摸监听
        sideView.setOnTouchingLetterChangedListener(new SideView.OnTouchingLetterChangedListener() {

            @Override
            public void onTouchingLetterChanged(String s) {
                // 该字母首次出现的位置
                int position = adapter.getPositionForSection(s.charAt(0));
                if (position != -1) {
                    listView.setSelection(position);
                }

            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                AnimalTypeClassifyInfo info= (AnimalTypeClassifyInfo) adapter.getItem(position);
                Intent intent=new Intent();
                Bundle bundle=new Bundle();
                bundle.putSerializable("typeInfo",info);
                intent.putExtras(bundle);
                setResult(10,intent);
                finish();

            }
        });

        // 根据a-z进行排序源数据
        Collections.sort(typeList, pinyinComparator);
        //创建适配器
        adapter = new AnimalKindSortAdapter(this, typeList);
        listView.setAdapter(adapter);

        // 根据输入框输入值的改变来过滤搜索
        et_filter.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                // 当输入框里面的值为空,更新为原来的列表,否则为过滤数据列表
                filterData(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }




    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
