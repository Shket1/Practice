package com.alex.practice.Collections.countries;

import java.util.*;

class Countries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String[]> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String key = sc.next().trim();
            String[] arr = sc.nextLine().split(" ");
            map.put(key, arr);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String value = sc.next().trim();
            for (String key : map.keySet()) {
                for (String arr : map.get(key)) {
                    if (arr.equals(value))
                        System.out.println(key);
                }
            }
        }
    }
}
