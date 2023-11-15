package collection.exercise;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer i : first) {
            if (second.contains(i)) {
                newSet.add(i);
            }
        }
        return newSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer i : first) {
            newSet.add(i);
        }
        for (Integer i : second) {
            newSet.add(i);
        }
        return newSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>();
        newSet.retainAll(second);
        return newSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>(first);
        newSet.addAll(second);
        return newSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(new HashSet<>());
    }

    public static List<Integer> removeDuplicates(Set<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(Set<Integer> source) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : source) {
            if (newList.contains(i)) {
                newList.add(i);
            }
        }
        return newList;
    }

    public static String firstRecurringCharacter(String s) {
        if (s == null && s.length() == 0) {
            return null;
        }
        Set<String> newSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String res = s.charAt(i) + " ";
            if (newSet.contains(res)) {
                return res;
            }
            newSet.add(res);
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> res = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                res.add(c);
            } else {
                set.add(c);
            }
        }
        return res;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}






