package com.alex.practice.tasks2.TaskTwo;

import java.util.*;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print((n < 0 && m < 0) ? n * m : n + m);
    }
}
