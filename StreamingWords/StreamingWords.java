/*
Name: Sean Styer
File: StreamingWords.java
Input: Strings from the user
Output: The contents of the priority queue, sorted based on # of words
*/
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;
public class StreamingWords{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //create a custom comparator to check for # of words
    Comparator<String> numWordsComparator = new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
          //when comparing two strings, split them around empty space
          String[] firstWords = s1.split(" ");
          String[] secondWords = s2.split(" ");
          //return the difference of the sizes of the resulting arrays
          return firstWords.length - secondWords.length;
      }
    };

    //create and populate a priority queue of strings
    PriorityQueue<String> wordQueue = new PriorityQueue<>(numWordsComparator);
    String userInput = input.nextLine();

    while(userInput.compareTo("END") != 0){
      wordQueue.add(userInput);
      userInput = input.nextLine();
    }

    //print out the priority queue
    while (!wordQueue.isEmpty()) {
            System.out.println(wordQueue.remove());
    }
  }
}
