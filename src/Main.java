import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        ArrayList <Integer> dataSet = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers. To stop reading lines enter an empty one");
        while (scanner.hasNextLine()) {
            String tmp = scanner.nextLine();
            if (tmp == "") {
                break;
            } else {
                dataSet.add(Integer.parseInt(tmp));
            }
        }
        System.out.println("Choose mode: asc/desc");
        String mode = scanner.next();
        scanner.close();
        // System.out.println(dataSet);

        System.out.println("Choose sorting algorithm: bubble/selection/quick");
        String algorithm = scanner.next();

        switch (algorithm) {
            case ("bubble"):
                System.out.println(BubbleSort.execute(dataSet, mode));
                break;
            case ("selection"):
                System.out.println(SelectionSort.execute(dataSet, mode));
                break;
            case ("quick"):
                System.out.println(QuickSort.execute(dataSet, mode));
                break;
            default:
                System.out.println("Error");
        }
    }
}