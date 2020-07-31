package com.tarnovskiy;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(stack.pop());
//        }

//        Expression e = new Expression("(4-6)+[{67+45} * {a / b}]");
//        System.out.println(e.checkBracket());

        Deq<Integer> deq = new Deq<>();
        deq.insertLeft(1);
        deq.insertLeft(2);
        deq.insertLeft(3);
        deq.insertRight(4);
        deq.removeRight();

        System.out.println(deq);

        for (int i = 0; i < 4; i++) {
            System.out.println(deq.removeLeft());
        }

//
//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//
//        mpq.insert(5);
//        mpq.insert(1);
//        mpq.insert(7);
//        mpq.insert(4);
//        mpq.insert(2);
//
//        System.out.println(mpq);
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(mpq.remove());
//        }

        String str = "abcd";
        System.out.println(str);
        str = upend(str);
        System.out.println(str);
    }

    private static String upend(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbUpend = new StringBuilder();
        sb.append(str);
        System.out.println(sb.length());

        for (int i = sb.length() - 1; i >= 0; i--) {
            sbUpend.append(str.charAt(i));
        }

        return sbUpend.toString();
    }
}
