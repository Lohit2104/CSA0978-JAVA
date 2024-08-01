import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input the names
        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Input the order choice
        System.out.print("Order (A/D): ");
        char order = scanner.next().charAt(0);

        // Sort the names
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if ((order == 'A' || order == 'a') && names[i].compareTo(names[j]) > 0) {
                    // Swap for ascending order
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                } else if ((order == 'D' || order == 'd') && names[i].compareTo(names[j]) < 0) {
                    // Swap for descending order
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // Display the sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
