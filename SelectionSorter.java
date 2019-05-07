import java.util.ArrayList;

public class SelectionSorter extends Sorter{

	private String reigningDweeb;
	private int reigningDweebIndex;
	private int sortedSectionSize;
	private int desiredSortedSelectionSize;

	public SelectionSorter(ArrayList<String> usersData){
		super(usersData);
		desiredSortedSelectionSize = elements.size() - 1;
	}

	public void mySort(){
		if(sortedSectionSize != desiredSortedSelectionSize){

			String currentlyExaminedElement;
			String temp;

			//Reigning dweeb algorithm
			reigningDweeb = elements.get(sortedSectionSize);
			reigningDweebIndex = sortedSectionSize;
			for(int currentElement = sortedSectionSize; currentElement <= desiredSortedSelectionSize ; currentElement++){
				currentlyExaminedElement = elements.get(currentElement);
				if(currentlyExaminedElement.compareTo(reigningDweeb) < 0){
					reigningDweeb = currentlyExaminedElement;
					reigningDweebIndex = currentElement;
				}
			}

			System.out.println("Reigning dweeb: " + reigningDweeb + "\tIndex: " + reigningDweebIndex + "\tSize of sorted list: " + sortedSectionSize);

			//Swap the element on the edge with the reigning dweeb
			elements.set(reigningDweebIndex, elements.get(sortedSectionSize));
			elements.set(sortedSectionSize, reigningDweeb);

			sortedSectionSize++;

			System.out.println(elements);

			mySort();

		}
	}
}