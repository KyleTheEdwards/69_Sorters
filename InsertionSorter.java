/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {
    /**
      Construct an instance to process the user's data
     */

  private int sortedElements;
  private int currentElement;
  private int currentElementIndex;
  private AraryList<String> toSort;
  private int toSortSize;

  public InsertionSorter(  ArrayList< String> usersData) {
      // your code here, if necessary
      toSort = usersData;
      toSortSize = toSort.size() - 1; //So that you can't
      sortedElements = 0;
  }

  /**
    sort the user's data, implementing insertion sort
   */
  public void mySort() {
    if(sortedElements != toSortSize){
      currentElementIndex = sortedElements;
      currentElement = toSort.get(currentElementIndex);;
      for(int currentCompare = currentElementIndex - 1; currentCompare >= 0; currentCompare++){
        if(toSort
      }
    }
  }
}
