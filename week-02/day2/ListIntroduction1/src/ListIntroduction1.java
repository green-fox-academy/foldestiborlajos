

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;
import java.util.*;


public class ListIntroduction1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add(0, "James");
        names.add("Martin");
        names.add(0, "Jacob");
        System.out.println(names.toString());
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        names.add("Amanda");
        names.add ("John");
        System.out.println(names.get(2));
        Iterator iterator = names.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next() + " ");
        for (int ind = 1; ind <= names.size(); ind++){
            System.out.println(ind + "." + names.get(ind -1));
        }
        names.remove(2);
        int m = names.size();
        ListIterator<String> iterator1 = names.listIterator(m);
        while(iterator1.hasPrevious()) {
            System.out.println(iterator1.previous());
        }
        names.clear();
        System.out.println(names.isEmpty());
    }
}
