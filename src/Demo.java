import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("South African");
        placesToVisit.add("New York");
        placesToVisit.add("Paris");
        placesToVisit.add("Barcelona");
        placesToVisit.add("London");

        printList(placesToVisit);

        placesToVisit.add(1, "Belgium");
        printList(placesToVisit);

        placesToVisit.remove("London");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("========================");
    }
}
