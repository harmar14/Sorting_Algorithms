import java.util.ArrayList;

public class InsertionSort {
    public static ArrayList execute(ArrayList <Integer> dataSet, String mode) {

        ArrayList <Integer> array = new ArrayList (dataSet); // we should not change an original array

        switch (mode) {
            case ("asc"):
                for (int i = 1; i < array.size(); i++) {
                    int current = array.get(i);
                    int j = i;
                    while (j > 0 && array.get(j - 1) > current) {
                        array.set(j, array.get(j - 1));
                        j--;
                    }
                    array.set(j, current);
                }
                break;
            case ("desc"):
                for (int i = 1; i < array.size(); i++) {
                    int current = array.get(i);
                    int j = i;
                    while (j > 0 && array.get(j - 1) < current) {
                        array.set(j, array.get(j - 1));
                        j--;
                    }
                    array.set(j, current);
                }
                break;
            default:
                System.out.println("Error");
        }

        return array;

    }

}