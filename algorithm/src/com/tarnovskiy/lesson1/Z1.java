package com.tarnovskiy.lesson1;

import java.io.*;
import java.util.*;

public class Z1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a*b*n*2);

        out.flush();
    }
}
