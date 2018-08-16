package ys.app.petproject.utils;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2017/5/3.
 */

public class MathUtil {

    public static double add(double d1,double d2,double d3){
        return d1+d2+d3;
    }



    //保留两位小数 四舍五入
    public static Double retainTwoDecimal(Double d) {
        d += 0.001;
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(d));
    }
    //保留两位小数 四舍五入
    public static Double retainTwoDecimal1(Double d) {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(d));
    }

}
