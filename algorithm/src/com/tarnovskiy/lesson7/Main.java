package com.tarnovskiy.lesson7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        for (int i = 0; i < 10; i++) {
            graph.addEdge(new Random().nextInt(10),new Random().nextInt(10));
        }

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 2);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(1));
        System.out.println(bfp.getCountPath());
        System.out.println(bfp.hasPathTo(3));

    }
}
