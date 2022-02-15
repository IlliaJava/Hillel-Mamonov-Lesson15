package com.hillel.lesson15;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] array = new int[0];

    @Override
    public void add(int value) {
        int[] tempArray = new int[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        tempArray[tempArray.length - 1] = value;
        array = tempArray;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, int value) {
        array[index] = value;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int[] toArray() {
        int[] toArray = new int[array.length];
        System.arraycopy(array, 0, toArray, 0, array.length);
        return toArray;
    }

    /**
     * Insets a new element into specific index. And shifts other lements to the right.
     *
     * @param index - where to paste the new element
     * @param value - what value this element should have
     */
    @Override
    public void pasteElement(int index, int value) {
        int[] tempArray = new int[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, index);
        System.arraycopy(array, index, tempArray, index + 1, array.length - index);
        tempArray[index] = value;
        array = tempArray;
    }

    @Override
    public void deleteElement(int index) {
        int[] tempArray = new int[array.length - 1];
        System.arraycopy(array, 0, tempArray, 0, index);
        System.arraycopy(array, index + 1, tempArray, index, array.length - index - 1);
        array = tempArray;
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
