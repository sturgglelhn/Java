package com.javase.Number;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //java.text.DecimalFormat专门负责数字格式化的

        /*
        数字格式有哪些？
            # 代表任意数字
            , 数字千分位
            . 代表小数点
            0 代表不够是补0

           ###,##.##
                表示：加入千分位，保留2个小数
        * */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.56);
        String s2 = df.format(12345.3432);
        System.out.println(s);
        System.out.println(s2);

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s3 = df2.format(1234.6);
        System.out.println(s3);
    }
}
