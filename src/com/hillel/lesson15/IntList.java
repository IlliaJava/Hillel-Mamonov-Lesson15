package com.hillel.lesson15;

public interface IntList {

    void add(int value);

    int get(int index);

    void set(int index, int value);

    int size();

    int[] toArray();

}
