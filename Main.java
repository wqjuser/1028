package com.wqj;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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
        List l2 = new ArrayList();
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
        for (int j = 0; j < l1.size(); j++) {
            for (int i = 0; i < l1.size(); i++) {
                if (i + 1 < l1.size() && l1.get(i).equals("B") && l1.get(i + 1).equals("G") || i + 1 < l1.size() && l1.get(i).equals("G") && l1.get(i + 1).equals("B")) {
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
            l3.add(l4.get(temp1));
            l3.add(l4.get(temp2));
            temp1 = 0;
            temp2 = 0;
            c = 20000000;
            count++;
            j = 0;
        }
        System.out.println(count);
//        System.out.print(l3);
        for (int i = 0; i < count; i++) {
            i = 0;
            if (i + 1 < l3.size()) {
                int num1 = l3.get(i) - 1;
                 int num2 = l3.get(i + 1) - 1;
                System.out.println(l4.get(num1) + " " + l4.get(num2) + " ");
                l4.remove(num1);
                l4.remove(num2 - 1);
                l3.remove(i);
                l3.remove(i);
            } else break;
        }
    }
}
