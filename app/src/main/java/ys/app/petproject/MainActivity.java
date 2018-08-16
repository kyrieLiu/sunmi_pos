package ys.app.petproject;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;

import ys.app.petproject.activity.AchievementActivity;
import ys.app.petproject.activity.CollectMoneyActivity;
import ys.app.petproject.activity.SaleActivity;
import ys.app.petproject.activity.appointment.AppointmentMainActivity;
import ys.app.petproject.activity.inventory.InventoryActivity;
import ys.app.petproject.activity.inventory.OutPutInventoryActivity;
import ys.app.petproject.activity.manage.ManagerActivity;
import ys.app.petproject.activity.vip.VipActivity;
import ys.app.petproject.databinding.ActivityMainBinding;
import ys.app.petproject.service.InitDataService;
import ys.app.petproject.shangmi.printer.BlueToothPrintUtil;
import ys.app.petproject.viewmodel.MainViewModel;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;
    private static final String[] array = {"收银", "预约", "会员", "库存", "业绩", "促销", "管理","记录"};
    private MainViewModel mMainViewModel;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setNameArray(array);
        binding.titleTv.setText(SpUtil.getShopName());
        mMainViewModel = new MainViewModel(this);
        binding.setMainViewModel(mMainViewModel);
        Intent startIntent = new Intent(this, InitDataService.class);
        startService(startIntent);
        setListenner();
        if ("M1".equals(Build.MODEL))BlueToothPrintUtil.getInstance().connectPrinterService(this);
    }


    private void setListenner() {
        binding.rl0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CollectMoneyActivity.class));
//                Uri uri = Uri.parse("market://details?id=ys.app.petproject");
//                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
//                try {
//                    MainActivity.this.startActivity(goToMarket);
//                } catch (ActivityNotFoundException e) {
//                    e.printStackTrace();
//                }
            }
        });
        binding.rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToActivity(AppointmentMainActivity.class);
            }
        });
        binding.rl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToActivity(VipActivity.class);
//                Bitmap bitmap1= BitmapUtil.generateBitmap("1234568984",9,120,120);
//                Bitmap bitmap2 = BitmapUtil.generateBitmap("96cl228527", 8, 600, 300);//最多十二位,否则扫不出来
//                Bitmap all=mergeBitmap_LR(bitmap1,bitmap2,false);
//                BlueToothPrintUtil.getInstance().printLabel(all);

            }
        });
        binding.rl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToActivity(InventoryActivity.class);
            }
        });
        binding.rl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToActivity(AchievementActivity.class);
            }
        });
        binding.rl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToActivity(SaleActivity.class);
            }
        });
        binding.rl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToActivity(ManagerActivity.class);
            }
        });
        binding.rl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToActivity(OutPutInventoryActivity.class);
            }
        });

    }
    public  Bitmap mergeBitmap_LR(Bitmap leftBitmap, Bitmap rightBitmap, boolean isBaseMax) {

        if (leftBitmap == null || leftBitmap.isRecycled()
                || rightBitmap == null || rightBitmap.isRecycled()) {
            return null;
        }
        int height = 0; // 拼接后的高度，按照参数取大或取小
        if (isBaseMax) {
            height = leftBitmap.getHeight() > rightBitmap.getHeight() ? leftBitmap.getHeight() : rightBitmap.getHeight();
        } else {
            height = leftBitmap.getHeight() < rightBitmap.getHeight() ? leftBitmap.getHeight() : rightBitmap.getHeight();
        }

        // 缩放之后的bitmap
        Bitmap tempBitmapL = leftBitmap;
        Bitmap tempBitmapR = rightBitmap;

        if (leftBitmap.getHeight() != height) {
            tempBitmapL = Bitmap.createScaledBitmap(leftBitmap, (int)(leftBitmap.getWidth()*1f/leftBitmap.getHeight()*height), height, false);
        } else if (rightBitmap.getHeight() != height) {
            tempBitmapR = Bitmap.createScaledBitmap(rightBitmap, (int)(rightBitmap.getWidth()*1f/rightBitmap.getHeight()*height), height, false);
        }

        // 拼接后的宽度
        int width = tempBitmapL.getWidth() + tempBitmapR.getWidth();

        // 定义输出的bitmap
        Bitmap bitmap = Bitmap.createBitmap(width+20, height+7, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(getResources().getColor(R.color.white));

        // 缩放后两个bitmap需要绘制的参数
        Rect leftRect = new Rect(0, 0, tempBitmapL.getWidth(), tempBitmapL.getHeight());
        Rect rightRect  = new Rect(0, 0, tempBitmapR.getWidth(), tempBitmapR.getHeight());

        // 右边图需要绘制的位置，往右边偏移左边图的宽度，高度是相同的
        Rect rightRectT  = new Rect(tempBitmapL.getWidth()+10, 0, width+10, height);

        canvas.drawBitmap(tempBitmapL, leftRect, leftRect, null);
        canvas.drawBitmap(tempBitmapR, rightRect, rightRectT, null);
        return bitmap;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainViewModel.destroy();
        if ("M1".equals(Build.MODEL))BlueToothPrintUtil.getInstance().onDestroy();;
    }

}
