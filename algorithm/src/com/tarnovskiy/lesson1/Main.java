package com.tarnovskiy.lesson1;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 10;
//        Person p1 = new Person("Ivan");
//        Person p2 = new Person("Ivan");
//
//
//        if (p1.equals(p2)) {
//            System.out.println("равны");
//        } else {
//            System.out.println("не равны");
//        }


//        int a = 10;
//        inc(a);
//        System.out.println(a);


//        Person p = new Person("Ivan");
//        updateName(p);
//        System.out.println(p);

//        System.out.println(isPrime(17));

//        int b = -5;
//        printIntBinary(b);
//
//        int b1 = -6;
//        printIntBinary(b1);
//
//        int a = 26;
//        printIntBinary(a);
//
//        int c = -45;
//        c = ~c;
//        c++;
//        printIntBinary(c);

        //1101 0111 1010 1010
//        int x = 0xD7AA;
//        System.out.println(x);
//        printIntBinary(x);


//        int x = Integer.MIN_VALUE;
//        System.out.println(x);
//        System.out.println(Math.abs(x));
//        printIntBinary(x);


//        int a = 26;
//        printIntBinary(a);
//        a <<= 2;
//        printIntBinary(a);

//        int b = -26;
//        printIntBinary(b);
//        b <<= 1;
//        printIntBinary(b);

//        int a = 26;
//        printIntBinary(a);
//        a >>= 1;
//        printIntBinary(a);
//
//        int b = -26;
//        printIntBinary(b);
//        b >>= 1;
//        printIntBinary(b);
//
//        int c = -26;
//        printIntBinary(c);
//        c >>>= 1;
//        printIntBinary(c);

//       & | ^

        int a = 125;
        int b = 179;
        int c = a ^ b;

        printIntBinary(a);
        printIntBinary(b);
        printIntBinary(c);


    }

    public static void printIntBinary(int x) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(x));
        while (sb.length() < 32) {
            sb.insert(0, "0");
        }
        System.out.printf("%5d = %s\n", x, sb);
    }


    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int b(int... arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    k++;
                }
            }
        }
        return k;
    }

    public static int a(int... arr) {
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                k++;
            }
        }
        return k;
    }

    public static void inc(int a) {
        a++;
    }

    public static void updateName(Person p) {
        p.setName("super" + p.getName());
    }

}
