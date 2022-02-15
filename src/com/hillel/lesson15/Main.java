package com.hillel.lesson15;
//Task 1,2. Interfaces, List, Polymorphism
        /*1) Есть интерфейс IntList:
        public interface IntList {
            void add(int value);
            int get(int index);
            void set(int index, int value);
            int size();
        int[] toArray();
        }
        Реализовать класс IntArrayList который реализует этот интерфейс.
        В качестве демонстрации с его помощю реализовать сортировку пузырьком IntList.
        Логика метода add:
        создаем временный массив на 1 элемент больше чем arr, копируем в него все элементы из arr,
        на последнюю позицию записываем новый элемент и заменяем arr на временный массив.
        2*) Добавить в IntList методы которые позволяют вставить в средину и удалить по индексу.*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList();

        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);
        System.out.println("Демонстрация toString: " + list1);
        list1.set(2, -5);
        list1.set(3, -34);

        System.out.println("Демонстрация toString: " + list1);
        System.out.println("Размер данного IntArrayList: " + list1.size());
        System.out.println("Значние элемента под индексом '3': " + list1.get(3));
        System.out.println("Демонстрация toArray: " + Arrays.toString(list1.toArray()));
        bubbleSort(list1);
        System.out.println("Отсортированный IntArrayList: " + list1);
    }

    private static void bubbleSort(IntList array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.toArray()[i] > array.toArray()[i + 1]) {
                    isSorted = false;
                    toSwap(array, i, i + 1);
                }
            }
        }
    }

    private static void toSwap(IntList array, int first, int second) {
        int temp = array.get(first);
        array.set(first, array.get(second));
        array.set(second, temp);
    }

}
