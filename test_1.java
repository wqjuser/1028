package com.wqj;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = Integer.parseInt(a);
        int count = 0;
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        String str = s.nextLine();
        String[] str1 = str.split("");
        List l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        List<Integer> l3 = new ArrayList();
        List<Integer> l4 = new ArrayList();
        int c = 20000000;
        for (int i = 0; i < str1.length; i++) {
            l1.add(str1[i]);
            l2.add(s.nextInt());
        }
        for (int i = 1; i <= str1.length; i++) {
            l4.add(i);
        }
//        String str2 = str.replaceAll("[B]","");
//        String str3 = str.replaceAll("[G]","");
        while(l1.size()!=0){
            for (int i = 0; i < l1.size(); i++) {
                if (i+1<l1.size()&&!(l1.get(i).equals(l1.get(i+1)))) {
                    int jueduizhi = Math.abs(Integer.parseInt(l2.get(i).toString()) - Integer.parseInt(l2.get(i + 1).toString()));
                    if (jueduizhi < c) {
                        c = jueduizhi;
                        temp1 = i;
                        temp2 = i + 1;
                    }
                }
            }
            l1.remove(temp2);
            l1.remove(temp1);

            l2.remove(temp2);
            l2.remove(temp1);
            l3.add(temp1 + 1);
            l3.add(temp2 + 1);
            temp1 = 0;
            temp2 = 0;
            c = 20000000;

        }
        System.out.println(l3.size());

//        for (int i = 0; i < l3.size() / 2 - 1; i++) {
//            i = 0;
//            if (i + 1 < l3.size() - 1) {
//                System.out.println(l4.get(l3.get(i) - 1) + " " + l4.get(l3.get(i + 1) - 1));
//                l4.remove(l3.get(i) - 1);
//                l4.remove(l3.get(i) - 1);
//                l3.remove(i);
//                l3.remove(i);
//            } else break;
//        }
    }
}

