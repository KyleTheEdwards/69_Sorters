/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {
    /**
      Construct an instance to process the user's data
     */

  private int sortedElements;
  private String currentElement;
  private int currentElementIndex;
  private int sortSize;

  public InsertionSorter(  ArrayList< String> usersData) {
      // your code here, if necessary
      super(usersData);
      sortSize = elements.size(); //So that you don't need to access the size every time
  }

  /**
    sort the user's data, implementing insertion sort
   */
  public void mySort() {
    if(sortedElements != sortSize){

      currentElementIndex = sortedElements;
      currentElement = elements.get(currentElementIndex);

      String temp;

      while(currentElementIndex != 0 && elements.get(currentElementIndex).compareTo(elements.get(currentElementIndex - 1)) < 0 ){
        //This is just a swap function
        temp = elements.get(currentElementIndex);
        elements.set(currentElementIndex, elements.get(currentElementIndex-1));
        elements.set(currentElementIndex-1, temp);

        //Keep setting the current element index back
        currentElementIndex--;
      }

      sortedElements++;

      System.out.println(elements + "\tSize of sorted: " + sortedElements);

      //Tail recursion, since we're accessing the same thing
      mySort();
    }
  }
}
