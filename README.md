# DSA-Java

A comprehensive collection of Data Structures and Algorithms implementations in Java, covering essential topics for technical interviews and competitive programming.

## 📚 Topics Covered

### Array
- **Stock Problems**: BuyAndShellStock
- **Mathematics**: CalculateMoneyLeetcodeBank, PowerOfTwo, XPowerN
- **Frequency & Counting**: CountElementsWithMaximumFrequency, MajortyElement, FindLuckyInteger
- **Searching**: FindAllKDistanceIndices, FindDuplicate, FindMissingRepeatNum, SingleNumber, SingleElementSortedArray
- **Sum Problems**: FourSum, ThreeSum
- **Intervals**: HandOfStraights, MergeIntervals
- **Matrix Operations**: SearchIn2DArray, SearchIn2DArray2, SetMatrixZeroes, SpiralMatrix
- **Difference Problems**: MaxDifferenceChangingInteger, MaximumDifferenceBetweenAdjacentElementsInACircularArray, MaximumDifferenceByRemappingDigit, MaximumDifferenceIncreasingElement, MinimizeTheMaximumDifferenceOfPairs
- **Subarrays**: MaxSubArray
- **Permutations**: Permutations, PermutationSequence
- **Array Manipulation**: MergeTwoShortedArray, MoveZeroes, ProductOfArrayExceptSelf, RearrangeArrayElementsBySign, RemoveDuplicatesFromSortedArray, SetMismatch, SortColor
- **Sliding Window**: SlidingWindow
- **Specialized**: LastStoneWeight, TheTwoSneakyNumbers, TrappingRainWater, WaterContain

### ArrayList
- CommonInThreeSortedArrays
- FindLonelyNumber
- MaximumErasureValue
- MostFrequentNumber

### Binary Search
- FindElementInMountainArray
- FindFirstAndLastPosition
- NextGreatestLetter
- PeakIndexInMountainArray
- SearchInRotatedShortedArray

### Binary Tree
- AVLTrees
- BalanceBinaryTree
- BinarySearchTreeToGreaterSumTree
- BinaryTreeMaximumPath
- BST (Binary Search Tree)
- ConvertSortedArrayToBinarySearchTree
- ConvertSortedListToBinarySearchTree

### Additional Topics
- **BST**: Binary Search Tree operations
- **Dynamic Programming**: Classic DP problems
- **Graph**: Graph algorithms and traversals
- **Greedy Algorithm**: Greedy approach problems
- **Hashing**: Hash-based solutions
- **Heap**: Priority queue implementations
- **Linked List**: Single and doubly linked list problems
- **Queue**: Queue-based algorithms
- **Recursion & Backtracking**: Recursive solutions
- **Stack**: Stack operations and applications
- **String**: String manipulation problems
- **Tries**: Trie data structure
- **Two Pointer Algorithm**: Two pointer technique

## 🗂️ Folder Structure

```
DSA-Java/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── ms/
│                   ├── dsa/                    # Data Structures & Algorithms
│                   │   ├── array/
│                   │   ├── arraylist/
│                   │   ├── binarysearch/
│                   │   ├── binarytree/
│                   │   ├── bst/
│                   │   ├── dynamicprogramming/
│                   │   ├── graph/
│                   │   ├── greedyalgorithm/
│                   │   ├── hashing/
│                   │   ├── heap/
│                   │   ├── linkedlist/
│                   │   ├── queue/
│                   │   ├── recursionbacktracking/
│                   │   ├── stack/
│                   │   ├── string/
│                   │   ├── tries/
│                   │   └── twopointeralgorithm/
│                   ├── corejava/               # Core Java Concepts
│                   │   ├── collection/
│                   │   ├── exceptionhandling/
│                   │   ├── genericprogramming/
│                   │   ├── guiprogramming/
│                   │   ├── multithread/
│                   │   ├── packagetester/
│                   │   ├── passwordgenerator/
│                   │   └── stringmanipulation/
│                   └── collectionframework/    # Collection Framework Examples
│                       ├── list/
│                       └── set/
├── bin/              # Compiled class files
├── lib/              # External dependencies
└── README.md         # Project documentation
```

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- VS Code with Java Extension Pack (recommended) or any Java IDE

### Package Structure
All Java files follow the package naming convention:
- **DSA**: `com.ms.dsa.<topic>`
- **Core Java**: `com.ms.corejava.<topic>`
- **Collection Framework**: `com.ms.collectionframework.<topic>`

### Running Programs
1. Navigate to the specific topic folder in `src/main/java/com/ms/`
2. Open the Java file you want to run
3. Use VS Code's built-in Java runner or compile and run from terminal:
   ```bash
   # Compile
   javac -d bin src/main/java/com/ms/dsa/array/BuyAndShellStock.java

   # Run
   java -cp bin com.ms.dsa.array.BuyAndShellStock
   ```

## 📝 Usage

Each Java file contains:
- Problem description (in comments)
- Implementation with detailed comments
- Time and space complexity analysis
- Test cases where applicable

## 🤝 Contributing

Feel free to contribute by:
- Adding new problems
- Improving existing solutions
- Adding test cases
- Fixing bugs
- Enhancing documentation

## 📄 License

This project is open source and available for educational purposes.
