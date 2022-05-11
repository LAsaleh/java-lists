package session2;

import java.util.ArrayList;
import java.util.List;

public class CollectionsJava {
    public static void main(String[] args) {


        //primitive arrays

        int [] nums = {1,2,3,4,5,6,7};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }




        System.out.println(" \n            ==============================          \n");

        //ArrayList
        List<Integer> digits = new ArrayList<>();

        digits.add(45);
        digits.add(67);

        for (int i = 0; i < digits.size(); i++) {
            System.out.print(digits.get(i) + " " );

        }




    }
}
