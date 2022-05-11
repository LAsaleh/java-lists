package session2;

import java.util.*;

public class ListsTypes {
    public static void main(String[] args) throws InterruptedException {

//Lists is an interface which is implemented by classes:ArrayLists , LinkedList, vector, Stack.
        //List preserve insertion order.
        // List allows duplicate.

        for (int i = 0; i < 100; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(90);
            list.add(100);
            list.add(120);
            list.add(140);

            Thread.sleep(1000);
            System.out.println(list);
        }

        for (int i = 0; i < 100; i++) {


            List<Integer> list1 = new LinkedList<>();


            list1.add(90);  //the head
            list1.add(100);  //
            list1.add(120);  //
            list1.add(140);  //
            list1.add(140);  //
            list1.add(99);  //      they are nodes
            list1.add(56);  //
            list1.add(45);  //
            list1.add(78);  //
            list1.add(67); // the tail

            list1.remove(0);
            System.out.println(list1.size());
            list1.addAll(List.of(3, 56, 8, 6));
            System.out.println(list1.contains(120));
            list1.add(0, 70);
            System.out.println(list1);
            System.out.println(list1.get(7));

                System.out.print(list1.get(i) + " ");

            }


            // Thread.sleep(1000);


            //vactor is a thread safe and it is syncrinized

            List<Integer> list2 = new Vector<>();
            list2.add(88);
            list2.add(90);
            list2.add(100);
            list2.add(120);
            list2.add(140);
            list2.add(140);
            list2.add(99);
            list2.add(56);
            list2.add(45);
            list2.add(78);
            list2.add(67);


            //we can also initialize the capacity

            new Vector<>(10, 2);


            Stack<String> books = new Stack<>();
            books.push("Harry Potter");
            books.push("Beuty and beast");
            books.push("Afrah Alobah");
            books.push("Doctor Stranger");

            String topElement = books.peek();
            System.out.println(topElement);

            System.out.println(books.pop());
            System.out.println(books.size());
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));

            }


        }
    }

