package com.alex.practice.tasks2.TaskOne;
import java.util.*;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.print((a *= 5) + "\n" + b);
        else
            System.out.print(a + "\n" + b);
    }
}
