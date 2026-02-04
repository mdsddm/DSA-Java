package com.ms.corejava.collection;

import java.util.*;

// Class representing a Triplet
class Triplet<K, V1, V2> {
    private K key; // Unique key
    private V1 value1; // First value
    private V2 value2; // Second value

    public Triplet(K key, V1 value1, V2 value2) {
        this.key = key;
        this.value1 = value1;
        this.value2 = value2;
    }

    public K getKey() {
        return key;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value1 + ", " + value2 + ")";
    }
}

// Custom collection class to store Triplets
class TripletCollection<K, V1, V2> {
    private Map<K, Triplet<K, V1, V2>> tripletMap;

    public TripletCollection() {
        tripletMap = new HashMap<>();
    }

    // Method to add a triplet to the collection
    public boolean add(K key, V1 value1, V2 value2) {
        if (tripletMap.containsKey(key)) {
            System.out.println("Error: Key already exists. Key must be unique.");
            return false;
        }
        tripletMap.put(key, new Triplet<>(key, value1, value2));
        return true;
    }

    // Method to get a triplet by key
    public Triplet<K, V1, V2> get(K key) {
        return tripletMap.get(key);
    }

    // Method to remove a triplet by key
    public boolean remove(K key) {
        if (tripletMap.remove(key) != null) {
            return true;
        }
        System.out.println("Error: Key not found.");
        return false;
    }

    // Method to display all triplets
    public void displayAll() {
        for (Triplet<K, V1, V2> triplet : tripletMap.values()) {
            System.out.println(triplet);
        }
    }
}

// Main class to demonstrate the working of the custom collection
public class CustomTripletCollection {
    public static void main(String[] args) {
        // Create an instance of TripletCollection
        TripletCollection<Integer, String, Double> collection = new TripletCollection<>();

        // Add triplets to the collection
        collection.add(1, "Alice", 85.5);
        collection.add(2, "Bob", 92.0);
        collection.add(3, "Charlie", 78.9);

        // Attempt to add a duplicate key
        collection.add(1, "David", 88.0); // Should display an error

        // Display all triplets
        System.out.println("All Triplets:");
        collection.displayAll();

        // Get and display a specific triplet by key
        System.out.println("\nGet Triplet with Key 2:");
        System.out.println(collection.get(2));

        // Remove a triplet by key
        System.out.println("\nRemoving Triplet with Key 3...");
        collection.remove(3);

        // Display all triplets after removal
        System.out.println("\nAll Triplets after removal:");
        collection.displayAll();
    }
}
