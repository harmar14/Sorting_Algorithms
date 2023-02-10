import java.util.ArrayList;

public class BubbleSort {
    public static ArrayList execute(ArrayList <Integer> dataSet, String mode) {

        ArrayList <Integer> array = new ArrayList(dataSet); // we should not change an original array
        boolean completed = false;

        switch (mode) {
            case ("asc"):
                while (!completed) {
                    completed = true;
                    for (int i = 1; i < array.size(); i++) {
                        int previous = array.get(i - 1);
                        int current = array.get(i);
                        if (previous > current){
                            array.set(i - 1, current);
                            array.set(i, previous);
                            completed = false;
                        }
                    }
                }
                break;
            case ("desc"):
                while (!completed) {
                    completed = true;
                    for (int i = 1; i < array.size(); i++) {
                        int previous = array.get(i - 1);
                        int current = array.get(i);
                        if (previous < current){
                            array.set(i - 1, current);
                            array.set(i, previous);
                            completed = false;
                        }
                    }
                }
                break;
            default:
                System.out.println("Error");
        }

        return array;

    }

}
