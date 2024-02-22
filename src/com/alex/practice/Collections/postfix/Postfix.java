package com.alex.practice.Collections.postfix;

import java.util.*;

class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace(" ", "");
        Stack<Integer> st = new Stack<>();

        for (Character x : str.toCharArray()) {
            switch (x) {
                case '*': st.push(st.pop() * st.pop()); break;
                case '+': st.push(st.pop() + st.pop()); break;
                case '-': st.push(-st.pop() + st.pop()); break;
                default: st.push(Integer.parseInt(String.valueOf(x)));
            }
        }
        System.out.print(st.pop());
    }
}

