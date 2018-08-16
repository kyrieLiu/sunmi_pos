package ys.app.petproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.zxing.BarcodeFormat;

import ys.app.petproject.shangmi.printer.BitmapUtil;
import ys.app.petproject.utils.DensityUtil;
import ys.app.petproject.widget.wrapperRecylerView.RefreshHeaderLayout;

public class BarCodeActivity extends AppCompatActivity {

    ImageView image_qr_code,image_bar_code,image_merge_code,image_t1mini_merge_code;
    Bitmap mergeBitmap,qrBitmap,barBitmap;
    String content = "1234567890";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_code);
        DisplayMetrics metrics =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(metrics);
        int width = metrics.widthPixels;

        image_qr_code = (ImageView) findViewById(R.id.image_qr_code);
        qrBitmap = BitmapUtil.generateBitmap(content,9,400,400);
        image_qr_code.setImageBitmap(qrBitmap);

        image_bar_code = (ImageView) findViewById(R.id.image_bar_code);
        image_bar_code.setImageBitmap( BitmapUtil.creatBarcode(
                getApplicationContext(), content, width, 200, true));
        barBitmap = BitmapUtil.creatBarcode(
                getApplicationContext(), content, width, 150, true);

        image_merge_code = (ImageView) findViewById(R.id.image_merge_code);
        image_merge_code.setImageBitmap(BitmapUtil.mergeBitmap_LR(qrBitmap,barBitmap,false));

        image_t1mini_merge_code = (ImageView) findViewById(R.id.image_t1mini_merge_code);
        Bitmap bitmapWhite = BitmapFactory.decodeResource(getResources(),R.mipmap.white);
        Bitmap t1miniBitmap = BitmapUtil.generateBitmap(content,9,DensityUtil.dip2px(this,40),DensityUtil.dip2px(this,40));
        image_t1mini_merge_code.setImageBitmap(BitmapUtil.mergeBitmap_LR(t1miniBitmap,bitmapWhite,false));
    }
}
