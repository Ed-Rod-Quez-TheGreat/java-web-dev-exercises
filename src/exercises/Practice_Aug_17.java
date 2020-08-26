package exercises;


import java.util.Scanner;

public class Practice_Aug_17 {
    // make a method
        //takes in an array of integers
        // returns sum of the first and last value in the array

    public static int sumOfFirstAndLast(int [] array) {
        return array[0] + array[array.length - 1];
    }

    public static void main(String[] args) {
        int [] anArray = {5, 1, 9, 18, -4, 9, 11}; //11 is an integer, 11.0 is a double class
                //optional line 13: new int[10]; //10 items in array
        //System.out.println(anArray[0]); //all zeroes in each place unless specified
        int results = sumOfFirstAndLast(anArray);
        System.out.println(results);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank";
        Scanner in = new Scanner(System.in);
        System.out.println("type in a word to search for: ");
        String searchTerm = in.nextLine();
        System.out.println(sentence.contains(searchTerm.toLowerCase()));

    }
    //public accessable outside of the class (private is alternative)
    //line 12 is our main method 'this is where program starts/begins'
    // in terminal enter "java Practice_Aug_17 here are some arguments" 'java' compiles code,
    //Practice_Aug_17 is this file, 'here are some arguments' would be whats entered in the array on 12
    //if line 12 isn't in a code, it won't work, must be in every code for java


}
