package com.tarnovskiy.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Tarnovskiy Maksim
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Long x = stepen(2, 12);
        System.out.println(x);


    }
       private static long stepen(int a, int b) {
        if (b <= 0) {
            return 1;
        }
        else if (b % 2 == 0){
            return stepen(a, b - 2) * a * a;
        }
        return stepen(a, b - 1) * a;
    }


}
