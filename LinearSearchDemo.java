import java.util.Scanner;
import java.util.ArrayList;
public class LinearSearchDemo {
    private static int linearSearch(ArrayList<Integer> numbers, int key) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner scnr2 = new Scanner(System.in);
        System.out.println("Enter 10 integers.");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number %d: \n", i + 1);
            numbers.add(scnr2.nextInt());
        }

        System.out.print("NUMBERS: ");
        System.out.println(numbers);

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int key = scnr.nextInt();
        int keyIndex = linearSearch(numbers, key);

        if (keyIndex == -1) {
            System.out.println(key + " was not found.");
        } else {
            System.out.printf("Found %d at index %d.\n", key, keyIndex);
        }
    }
}
