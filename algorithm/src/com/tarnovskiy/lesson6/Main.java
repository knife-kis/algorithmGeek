package com.tarnovskiy.lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {



        creator(20,6);

//        MyTreeMap<Integer, String> map = new MyTreeMap<>();
//
//        map.put(5,"five");
//        map.put(1,"one");
//        map.put(3,"three");
//        map.put(2,"two");
//
//        System.out.println(map);
//        System.out.println(map.get(2));
//        map.put(2,"ttt");
//        System.out.println(map);
//
//        map.deleteMin();
//        System.out.println(map);

    }

    private static void creator(int countTree, int depthTree) {

        int balanced = 0;
        for (int i = 0; i < countTree; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            while (map.depth() < depthTree){
                map.put(insertNumber(100),0);
            }
            if (map.isBalanced()){
                balanced++;
            }
        }

        System.out.println("from " + countTree + " MyTreeMap balanced is " + balanced + "\r\nnot balanced is " + (countTree - balanced) + " trees");
    }

    private static Integer insertNumber(int i) {
        Random random = new Random();
        if (random.nextInt(i) % 2 == 0){
            return random.nextInt(i);
        } else{
            return -random.nextInt(i);
        }
    }
}
