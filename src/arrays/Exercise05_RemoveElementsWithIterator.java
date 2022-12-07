package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {

        ArrayList<String> objects = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Notebook",
                "MacBook Pro"
        ));

        /*
        Task
        Remove elements that contains "book"
        -This is case-insensitive

        Print the line -> [Pen, Pencil]
         */

        Iterator<String> objectsIterator = objects.iterator();
        while(objectsIterator.hasNext()){
            String o = objectsIterator.next();
            if(o.toLowerCase().contains("book")) objectsIterator.remove();
        }
        System.out.println(objects);
    }
}
