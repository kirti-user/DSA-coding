package com.kirti.recursion.easy;

public class NTo1 {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    static void fun(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        fun(n - 1);
    }

    static void fun2(int n) {
        if(n == 0)
            return ;

        fun2(n - 1);
        System.out.println(n);
    }

    static void fun3(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        fun3(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        if (n <= 1)
            return 1;

        return n * factorial(n-1);
    }

}
