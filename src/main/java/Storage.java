import java.util.ArrayList;

public class Storage {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> addElement(int element1, int element2, int element3, int element4) {
        arrayList.add(element1);
        arrayList.add(element2);
        arrayList.add(element3);
        arrayList.add(element4);
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