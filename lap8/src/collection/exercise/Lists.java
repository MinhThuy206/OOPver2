package collection.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(-1, value);
    }

    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(List<Integer> list) {
        list.removeAll(List.of(666));
    }

    public static List<Integer> generateSquare() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            lists.add(i * i);
        }
        return lists;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        if (source == null) {
            return;
        }
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(List<Integer> list) {
        if (list == null) {
            return;
        }
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = list.size(); i > 0; i--) {
            newList.add(list.get(i));
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
