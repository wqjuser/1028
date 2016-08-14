package com.wqj;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by mona on 2016/8/5.
 */
public class test_2 {
    static Boolean yizhongxingbie  = false;
    public static void main(String[] args){
        test_2 task = new test_2();
        //--------------------------数据初始化-------------------------------
        List<List<Integer>> result = new ArrayList<List<Integer>>();//男女序号
        List<String> list = new ArrayList<String>();//男女序号
        List<Integer> chengji = new ArrayList<Integer>();
        List<Integer> chushiweizhi = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        int jige = scanner.nextInt();
        String first = scanner.next();
        String[] fenkai = first.split("");

        for(int i = 0 ;i<jige ;i++)
        {
            chengji.add(scanner.nextInt());
            list.add(fenkai[i]);
            chushiweizhi.add(i+1);
        }
        //---------------------------------------------------------------
        while (!yizhongxingbie && !(chengji.size()==0) &&!(chengji.size()==1))
        {
            int[] back = task.compare(list,chengji);
            if (yizhongxingbie){
                break;
            }
            chengji.remove(back[0]);
            chengji.remove(back[0]);
            list.remove(back[0]);
            list.remove(back[0]);
            List<Integer> shishi = new ArrayList<Integer>();//男女序号
            shishi.add(chushiweizhi.get(back[0]));
            shishi.add(chushiweizhi.get(back[1]));
            result.add(shishi);
            chushiweizhi.remove(back[0]);
            chushiweizhi.remove(back[0]);
        }
        System.out.println(result.size());

        for (int o = 0;o<result.size();o++){
            System.out.println(result.get(o).get(0) + " " + result.get(o).get(1));
        }
    }
    public int[] compare(List<String> nannv,List<Integer> sc) {//找出list存在的男女最小的两个点坐标
        int[] reback = new int[2];
        int chenji = 1000000000;
        int a = -1;
        int b = -1;
        for (int i = 0; i < nannv.size(); i++) {
            if (i + 1 < nannv.size() && !nannv.get(i).equals(nannv.get(i + 1))) {
                int score = java.lang.Math.abs(sc.get(i) - sc.get(i + 1));
                if (score < chenji) {
                    chenji = score;
                    a = i;
                    b = i + 1;
                }
            }
        }
        //ab出来的是相差最小的男女两个的坐标；
        if (a == -1 && b == -1) {
            yizhongxingbie = true;

        }
        else {

            reback[0] = a;
            reback[1] = b;
        }
        return reback;
    }



}
