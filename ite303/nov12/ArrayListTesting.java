package nov12;

import java.util.*;

public class ArrayListTesting {

    // Arrays are not dynamic, meanwhile ArrayList is dynamic, it grows and shrinks
    // it grows and shrinks based on the variables that we put into it
    public static void main(String[] args) {
        // without the <String> or <Integer>, the arrayList will have a yellow underline
        // which is a discouraged habit, you always want your arrayList to have the same
        // type, Why is Integer instead of int, out of class' range, they're
        // called generic classes, but because its because generics are refrence types
        // while int is a primitve
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);

        // the return type of get is an object, so this course doesnt cover it
        // so if we want to print it we have to sysout it
        System.out.println(al.get(1));

        // to add an element wherever you want
        al.add(0, 40);

        // to get the index of an element
        System.out.println("the index of value 10 is " + al.indexOf(10));

        // removing an element
        al.remove(10);

        // loop below to traverse the ArrayList ds
        for (int i = 0; i < al.size(); i++) {
            System.out.printf("%d ", al.get(i));
        }

    }
}
