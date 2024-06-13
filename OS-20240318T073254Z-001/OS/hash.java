import java.util.HashMap;
import java.util.Scanner;

class PagingSystem { // Keep the helper class name as PagingSystem
    private HashMap<Integer, Integer> pageTable;
    private int[] indexes;

    public PagingSystem(int indexCount) {
        pageTable = new HashMap<>();
        indexes = new int[indexCount];
        for (int i = 0; i < indexCount; i++) indexes[i] = -1;
    }

    public void loadPage(int pageNumber) {
        int indexNumber = findEmptyIndex();
        if (indexNumber == -1) {
            System.out.println("No empty indexes available. Page " + pageNumber + " cannot be loaded.");
        } else {
            pageTable.put(pageNumber, indexNumber);
            indexes[indexNumber] = pageNumber;
            System.out.println("Page " + pageNumber + " loaded into index " + indexNumber);
        }
    }

    public void accessPage(int pageNumber) {
        Integer indexNumber = pageTable.get(pageNumber);
        if (indexNumber == null) {
            System.out.println("Page " + pageNumber + " not found in memory.");
        } else {
            System.out.println("Page " + pageNumber + " is in index " + indexNumber);
        }
    }

    public void displayPageTable() {
        System.out.println("Page Table:");
        pageTable.forEach((page, index) -> System.out.println(page + " -> " + index));
    }

    private int findEmptyIndex() {
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] == -1) return i;
        }
        return -1;
    }
}

public class hash { // Rename the main class to hash
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of indexes in memory:");
        PagingSystem pagingSystem = new PagingSystem(sc.nextInt());
        while (true) {
            System.out.println("1. Load Page\n2. Access Page\n3. Display Page Table\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 4) break;
            switch (choice) {
                case 1:
                    System.out.print("Enter page number to load: ");
                    pagingSystem.loadPage(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter page number to access: ");
                    pagingSystem.accessPage(sc.nextInt());
                    break;
                case 3:
                    pagingSystem.displayPageTable();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}

