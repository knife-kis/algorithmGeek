package com.tarnovskiy.lesson4;

import java.util.List;

public class MyLinkedQueue <T> {
    private MyLinkedList<T> queue = new MyLinkedList<>();

    public void enqueue(T value){
        queue.insertFirst(value);
    }
    public T pop(){
        return queue.deleteLast();
    }

    public T peek(){
        return queue.getLast();
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
}

