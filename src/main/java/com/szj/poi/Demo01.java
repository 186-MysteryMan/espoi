package com.szj.poi;

/**
 * @author shenggongjie
 * @date 2021/3/4 21:06
 */
public class Demo01 {

    public static void main(String[] args) {
//        int aaa = aaa(3);
//        System.out.println(aaa);
//        int bbb = bbb(3,1, 1);
//        System.out.println(bbb);
}

    public static int aaa(int a){
        int var1 = 1,var2 = 0;

        for (int i = 1; i <= a; i++) {
            var1 = i * var1;
            var2 += var1;
        }

        return var1;
    }

    public static int bbb(int b,int var1, int var2){
        var1 = var1 * var2;
        var2 += 1;
        if (var2 <= b){
            var1 = bbb(b,var1,var2);
        }
        return var1;
    }
}
