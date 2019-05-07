/** 
  test types of sorts that are polymorphic variations of Sorter
 */
import java.util.Arrays;
import java.util.ArrayList;

public class UserOfSorts {
    public static void main(String[] commandLine) {
        // arrays to be sorted
        ArrayList< String> unsorted = new ArrayList< String>(
          /* Java's Arrays.asList provides a perspicuous
             way to build a Collection from literals,
             suitable for constructing an ArrayList */
          Arrays.asList(
            // data convenient for debugging an insertion sort
              // A single piece of data is already in order trivially.
              "R"

              // data destined for the END of the sorted region
            , "N"

              /* more data for the end, so subsequent tests
                 process a larger sorted region
                */
            , "J", "Z", "L", "Q"

              // data destined for the MIDDLE of the sorted region
            , "H"

              // data destined for the START of the sorted region
            , "E"

              /* buffering data, merely to keep the preceding data 
                 from having the special property of being last in
                 the input list.
               */
            , "A"  
            ));

        // insertion sort                   
        oneTest( "insertion sort ", new InsertionSorter( unsorted));

        //Selection sort

        oneTest( "Selection sort ", new SelectionSorter(unsorted));
    }


    /** 
     Run one test
     */
    private static void oneTest( String description
                               , Sorter sorter
                               ) {
        System.out.println( System.lineSeparator() + description);
        sorter.mySort();
        System.out.println( sorter);
        System.out.println( "sorted: " + sorter.isSorted());
     }
}
