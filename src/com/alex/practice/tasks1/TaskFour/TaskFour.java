package com.alex.practice.tasks1.TaskFour;
import java.util.*;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numSum = num;
        int nums = 0;
        while (numSum != 0) {
            nums = nums + (numSum % 10);
            numSum /= 10;
        }
        System.out.println(num / nums);
        System.out.println(num % nums);
    }
}

/*
        int num = new java.util.Scanner(System.in).nextInt(), n = 0;
        for (int b = num ; b!=0 ; n += b%10, b/=10) {}
        System.out.print(num/n +"\n" +num%n);
 */
