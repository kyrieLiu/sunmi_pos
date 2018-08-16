package ys.app.petproject.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 *  自定义ListView ，解决ScrollView中嵌套ListView 显示不正常的问题
 * 作者：lv
 * 时间：2017/4/2 16:38
 */

public class MyListView extends ListView {
    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }



}