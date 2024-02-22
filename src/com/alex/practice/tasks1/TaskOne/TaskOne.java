package com.alex.practice.tasks1.TaskOne;

import java.util.*;

public class TaskOne {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int num = Integer.parseInt(st);

        long time = System.currentTimeMillis();
        methodOne(st);
// some code
        System.out.println("Первый метов - " + (System.currentTimeMillis() - time));

        long time1 = System.currentTimeMillis();
        methodOne(num);
// some code
        System.out.println("Второй метов - " + (System.currentTimeMillis() - time1));
    }

    public static void methodOne(String st) {
        System.out.print((Integer.parseInt(String.valueOf(st.charAt(0))) + Integer.parseInt(String.valueOf(st.charAt(3))) == Integer.parseInt(String.valueOf(st.charAt(1))) + Integer.parseInt(String.valueOf(st.charAt(2)))) ? "YES" : "NO");
    }

    public static void methodOne(int n) {
        System.out.print((n / 1000 + n % 10) == (n / 100 % 10 + n / 10 % 10) ? "YES" : "NO");
    }
}

