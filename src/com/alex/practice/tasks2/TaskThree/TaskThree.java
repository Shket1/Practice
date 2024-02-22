package com.alex.practice.tasks2.TaskThree;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] mas = new double[4];

        for (int i = 0; i < mas.length; i++)
            mas[i] = sc.nextDouble();

        double res = Math.sqrt(Math.pow((mas[2] - mas[0]), 2) + Math.pow((mas[3] - mas[1]), 2));
        System.out.printf("%.3f",res);
    }
}
