package chapter8.abstractlist_example;

import java.util.AbstractList;
import java.util.List;

public class MyStringList extends AbstractList<String> {
    private final String[] myList;

    public MyStringList(String[] strings) {
        myList = strings;
    }

    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        List<String> ducksSubList = ducksList.subList(0, 3);
        System.out.println(ducksSubList);
    }

    public String get(int index) {
        return myList[index];
    }

    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }
}
