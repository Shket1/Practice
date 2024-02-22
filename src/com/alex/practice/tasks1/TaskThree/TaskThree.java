package com.alex.practice.tasks1.TaskThree;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res;
        int m = 0;
        int count = 0;
        boolean isTrue = true;
        while (n != 0) {
            res = n % 10;
            System.out.println(res);
            n = (n - res) / 10;
            if (count == 0 || m > res) {
                m = res;
                count++;
            } else {
                isTrue = false;
            }

        }
        System.out.println((isTrue) ? "YES" : "NO");
    }
}
