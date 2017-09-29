package net.telesoftas.guts;
import java.util.*;

public class RecentlyUsedList {

    private LinkedList<String> list = new LinkedList<String>();
    private int capacity = 100;

    public RecentlyUsedList() {
    }

    public RecentlyUsedList(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getList() {
        return list;
    }

    public String getLast() {
        return list.getLast();
    }

    public String get(int index) {
        return list.get(index);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String item) {
        if (list.size() + 1 > capacity) {
            list.remove(list.getLast());
        }
        if (list.contains(item)) {
            list.remove(item);
        }

        list.addFirst(item);
    }
}
