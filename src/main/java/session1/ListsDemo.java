package session1;

import java.util.ArrayList;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {

        //int[] nums = {1,2,3,4};
//        int [] nums = new int [100];

        List<Integer> nums = new ArrayList();
        nums.add(12);
        nums.add(44);
        nums.add(85);
        nums.add(99);

        System.out.println(nums);
//        System.out.println(nums.get(2) );
        for (int i = 0; i < nums.size(); i++) {
            Integer iterate = nums.get(i);
            System.out.println(iterate);

        }




        List<Student> students = new ArrayList<>();

        students.add(new Student("mohammed", 6));
        students.add(new Student("kenan", 3));
        students.add(new Student("Aylla",9));

        System.out.println(students.size());
        System.out.println(students);



        //Arraylist can contains duplicates.
        //Arraylist preserve the order sequence.
        //













    }



}


