import java.util.*;
public class CollectionsTask {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange", "Purple", "Black"};
        ArrayList<String> colorList = new ArrayList<String>(Arrays.asList(colors));

        colorList.remove(2);

        colorList.add("Pink");
        colorList.add(0,"Grey");

        System.out.println("Color ArrayList after deleting 3rd element and adding two more elements: ");
        for(String w : colorList){
            System.out.println(w);
        }

        System.out.println('\n');

        System.out.println("Color sublist from index 2 to index 5: ");
        List<String> colorSublist = colorList.subList(2, 5);
        for(String w : colorSublist){
            System.out.println(w);
        }
    }
}
