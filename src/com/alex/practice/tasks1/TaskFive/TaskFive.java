package com.alex.practice.tasks1.TaskFive;
import java.util.*;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int c, res = 0;

        for (int i = n; i != 0; i /= 10) {
            c = i % 10;
            res = res + (c % p);
        }
        System.out.print(res);
    }
}
