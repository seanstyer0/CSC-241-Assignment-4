/*
Name: Sean Styer
File: StreamingIntegers.java
Input: Integers from the user
Output: The contents of the sorted priority queue
*/
import java.util.PriorityQueue;
import java.util.Scanner;
public class StreamingIntegers{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String userInput = "";
    // Create a Priority Queue
    PriorityQueue<Integer> numbers = new PriorityQueue<>();

    //popluate the priority Queue
    userInput = input.nextLine();
    while(userInput.compareTo("END") != 0){
      String [] seperateInputs = userInput.split(" ");
      for(int i = 0; i < seperateInputs.length; i++){
        numbers.add(Integer.parseInt(seperateInputs[i]));
      }
      userInput = input.nextLine();
    }

    //output the contents of the priority queue
    String output = "";
    while (!numbers.isEmpty()) {
            output += numbers.remove() + " ";
    }
    System.out.println(output.substring(0,output.length() - 1));
  }
}
