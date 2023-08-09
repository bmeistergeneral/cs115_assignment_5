import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
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

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            numbers.add(rand.nextInt(100));
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
