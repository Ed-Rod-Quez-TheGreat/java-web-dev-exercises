/* package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListAdder_Aug_19 {

    public static ArrayList<Integer>sumArrayLists(ArrayList<Integer> first, ArrayList<Integer> second) {

        //make an arraylist to hold the result
        ArrayList<Integer> result = new ArrayList<>();

        //check lengths of the array lists
        if(first.size() > second.size()){

        // for each element in the longer arraylist
        for (int i = 0; i < first.size(); i++) {
            // if not run out of ints from shorter list
             if(i < second.size()) {
                 Integer sum = first.get(i) + second.get(i);
                 result.add(sum);
             } else {
                 //just keep the value from the longer list
                 result.add(first.get(i));
             }
        }



        //return result

    }

}*/
