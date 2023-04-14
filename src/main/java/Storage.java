import java.util.ArrayList;

public class Storage {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> addElement(int firstElement, int secondElement, int thirdElement, int fourthElement) {
        arrayList.add(firstElement);
        arrayList.add(secondElement);
        arrayList.add(thirdElement);
        arrayList.add(fourthElement);
        return arrayList;
    }

    // Function to remove the element from the ArrayList, if present.
    public String removeElement(int element) {
        String result = "";
        if (arrayList.contains(element)) {
            result = "Element removed";
            arrayList.remove(element);
        } else {
            result = "Element is not present";
        }
        return result;
    }

    // Function to remove all the elements of the ArrayList.
    public String removeAllElements() {
        String empty = "";
        System.out.println(arrayList.size());
        if (arrayList.size() != 0) {
            empty = "Elements removed";
        } else {
            empty = "Empty";
        }
        return empty;
    }

    // Function to check if the element is present in the list.
    public Boolean checkElement(int element) {
        return arrayList.contains(element);
    }

}