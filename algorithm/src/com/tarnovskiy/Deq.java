package com.tarnovskiy;

import java.util.EmptyStackException;

/**
 * @author Tarnovskiy Maksim
 */
public class Deq<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    //0 1 2 3 4
    //4     8 6
    //      b
    //  e

    public Deq(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public Deq() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }


    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }
    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        begin = lastIndex(begin);
        list[begin] = item;
    }



    public T removeLeft() {
        T value = peek();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }
    public T removeRight() {
        T value = peekEnd();
        size--;
        list[end - 1] = null;
        end = lastIndex(end);
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }
    public T peekEnd() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[end];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }
    private int lastIndex(int index) {
        if ((index - 1) < 0){
            return list.length - 1;}
        else
        return (index - 1);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!isEmpty()) {
            int i = begin;
            while (i != end) {
                sb.append(list[i]).append(", ");
                i = nextIndex(i);
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}

