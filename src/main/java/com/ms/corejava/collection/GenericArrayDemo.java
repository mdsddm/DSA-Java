package com.ms.corejava.collection;

import java.util.*;

// Generic class to store an array of any type
class GenericArray<T> {
    private List<T> array;

    public GenericArray() {
        this.array = new ArrayList<>();
    }

    // Method to add an element to the array
    public void add(T element) {
        array.add(element);
    }

    // Generic linear search method
    public int search(T element) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(element)) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Method to display all elements
    public void display() {
        System.out.println("Array Elements: " + array);
    }
}

public class GenericArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericArray<String> genericArray = new GenericArray<>();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Element");
            System.out.println("2. Search Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String element = scanner.nextLine();
                    genericArray.add(element);
                    System.out.println("Element added.");
                    break;

                case 2:
                    System.out.print("Enter element to search: ");
                    String searchElement = scanner.nextLine();
                    int index = genericArray.search(searchElement);
                    if (index != -1) {
                        System.out.println("Element found at index: " + index);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    genericArray.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
