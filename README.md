January 19

Printed the message "Welcome to Bridgelabz!" and explored basic arithmetic operations.
Implemented calculations for temperature, area, and volume.
Solved self-practice problems, including Simple Interest, Perimeter, Power, and Unit Conversion.
Focused on writing code with proper indentation and naming conventions.
Worked on basic computational programs to enhance programming skills.
Completed tasks like calculating age, computing average marks, working with profit & loss, and converting distances.

January 23

Studied Java control structures, boolean data types, and boolean expressions.
Used logical operators and conditional statements (if, else if, else).
Practiced iteration using Java loops (for and while).
Implemented flow control in loops with break and continue statements.
Worked on switch statements for handling multiple conditions.

January 25

Created and accessed Java arrays using a for loop.
Modified arrays and utilized the length property.
Explored two-dimensional arrays (matrices) and worked with multi-dimensional arrays.
Worked on determining the size and accessing elements in multi-dimensional arrays.

January 28

Focused on building user-defined methods for custom functionality.
Improved code reusability by invoking methods multiple times.
Implemented recursive methods for problems requiring repeated logic.
Worked with static methods to call functions without needing to instantiate objects.
Used the java.lang.Math class for performing mathematical operations like power and square roots.

January 29

Developed modular Java programs like a Number Guessing Game, Maximum of Three Numbers, and Prime Number Checker.
Created a Fibonacci sequence generator, Palindrome Checker, and Factorial calculator using recursion, ensuring clear function separation.
Built a GCD/LCM Calculator, Temperature Converter, and Basic Calculator, each with distinct methods for each operation.
Handled date and time operations such as Time Zone adjustments with ZonedDateTime, date arithmetic, and formatting with DateTimeFormatter.
Applied Java's built-in classes like LocalDate and ZonedDateTime for effective manipulation of dates and times.

January 29

Worked with Java strings to solve problems such as counting vowels, reversing strings, and checking for palindromes.
Focused on writing functions that pass parameters and return values for modular programming.
Solved problems like removing duplicates, finding the longest word, and counting substring occurrences.
Implemented string comparison, case toggling, and determining the most frequent character in a string.

January 31

Worked with Java class and object .such as Book , Employee ,circle

February 02

Worked with access modifiers, getters, and setters to manage class attributes.
Practiced using constructors for initializing object attributes.
Used the this keyword to refer to the current instance of the class.
Created a displayDetails() method to display the details of objects.

feb 04

Use static for shared values.
Using This keyword which refers to the current class instance in Java.
Using final variables for identifiers or constants that should remain unchanged.
Using instanceof for safe type-checking and to prevent runtime errors during typecasting.

feb 06

learned how to visually represent class relationships, including aggregation, composition, and association. - understood how to represent objects and their states through object diagrams. learned the difference between aggregation and composition, where aggregation allows independent existence of objects, and composition means objects depend on the parent object. learned how to represent associations between objects, like the relationship between a customer and their account. - gained an understanding of UML relationships and how to diagrammatically represent different types of relationships, such as association, aggregation, and composition.

feb 07

A base class has been created to hold common properties and methods shared across multiple derived classes.
Derived classes inherit from the base class, gaining access to its attributes and behaviors.
This structure reduces redundancy by allowing subclasses to reuse code from the parent class while adding or modifying specific functionality when necessary.
Use Inheritance - Use Single Level Inheritance - Using Multilevel Inheritance - Hierarchical Inheritance - Method Overriding - Constructor Inheritance in Java - Access Modifiers and Inheritance

feb 10

Encapsulation:
Class properties are made private to prevent unauthorized access and modification. Public methods are provided to access and manipulate the internal state safely.

Interface:
Created an interface to define method signatures that are implemented by concrete classes, ensuring that they adhere to specific behaviors.

Polymorphism:
Demonstrated polymorphism by overriding methods in derived classes. This allows the same method to behave differently depending on the object calling it.

Abstract Class:
Implemented abstract classes that serve as templates for child classes, forcing them to implement specific methods.

feb 12

A Linked List is a dynamic data structure where elements (nodes) are linked using pointers. Each node contains data and a reference to the next node.

Types of Linked Lists:
Singly Linked List – Each node points to the next node.
Doubly Linked List – Each node has pointers to both the next and previous nodes.
Circular Linked List – The last node connects back to the first, forming a loop.

Key Operations:
Insertion (beginning, end, specific position)
Deletion (by value or position)
Traversal (forward/backward in doubly linked lists)
Searching (find an element)

feb 13

Stack 📚
A stack is a LIFO (Last In, First Out) data structure. Elements are added and removed from the same end (top).

Operations:
push(x): Adds x to the top.
pop(): Removes and returns the top element.
peek(): Returns the top element without removing it.
Uses: Function calls (recursion), undo/redo, expression evaluation (parentheses matching).

Queue 🚃
A queue is a FIFO (First In, First Out) data structure. Elements are added at the rear and removed from the front.

Operations:
enqueue(x): Adds x to the rear.
dequeue(): Removes and returns the front element.
Types:
Simple Queue (FIFO)
Circular Queue (Wraps around)
Deque (Double-Ended Queue) (Insert/delete at both ends)
Priority Queue (Elements sorted by priority)
Uses: Scheduling (OS processes, CPU tasks), BFS (Graph traversal).


HashMap (Dictionary in Python, Map in Java/C++) 🗺️
A hashmap is a key-value data structure that allows fast lookups (O(1) on average) using a hash function.

Operations:
put(key, value): Inserts a key-value pair.
get(key): Retrieves the value for a key.
remove(key): Deletes the key-value pair.
Uses: Caching, database indexing, frequency counting.


Hashing 🔑
Hashing is a technique to map data to a fixed-size hash table using a hash function.

Good Hash Functions:
Distributes keys uniformly.
Minimizes collisions (when different keys get the same hash).
Collision Resolution Techniques:
Chaining: Store multiple values in a list at the same index.
Open Addressing: Find another empty slot (e.g., linear probing).
Uses: HashMaps, password security (SHA, MD5), data structures like Bloom filters.


feb 14

Sorting is the process of arranging elements in a specific order, typically ascending or descending. 

1. Comparison-Based Sorting
These algorithms compare elements to determine their order.

Bubble Sort → Repeatedly swaps adjacent elements if they are in the wrong order. (O(n²))

Selection Sort → Finds the smallest element and places it at the beginning. (O(n²))

Insertion Sort → Builds a sorted array one element at a time. (O(n²), but O(n) for nearly sorted data)

Merge Sort → Divides the array, sorts each part, and merges them. (O(n log n), stable)

Quick Sort → Uses a pivot to partition the array and sorts recursively. (O(n log n) avg, O(n²) worst)

Heap Sort → Uses a heap data structure to sort efficiently. (O(n log n), not stable)

3. Non-Comparison-Based Sorting
These do not compare elements directly and are often faster for specific cases.

Counting Sort → Uses an auxiliary array to count occurrences. (O(n + k), only for integers)

Radix Sort → Sorts numbers digit by digit. (O(nk), stable)

Bucket Sort → Distributes elements into buckets and sorts them individually. (O(n + k), stable)

feb 15

StringBuffer:

A mutable sequence of characters (unlike String which is immutable).
Thread-safe (synchronized), meaning it can be used in a multithreaded environment.
Slower than StringBuilder due to synchronization.
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
System.out.println(sb);

StringBuilder:

Similar to StringBuffer but not thread-safe.
Faster than StringBuffer, making it more efficient for single-threaded applications.

FileReader:

Used to read character-based data from a file.
Reads data character by character, making it suitable for text files.
Often used with BufferedReader for efficient line-by-line reading.
FileReader fr = new FileReader("file.txt");
int ch;
while ((ch = fr.read()) != -1) {
    System.out.print((char) ch);
}
fr.close();

InputStreamReader:

Converts byte streams (like FileInputStream or System.in) into character streams.
Useful for reading binary files with character encoding (like UTF-8).
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String input = br.readLine();
System.out.println("You entered: " + input);

 Linear Search:
 
Sequential search algorithm used to find an element in an array/list.
Time Complexity: 
O(n) (worst case).
Best for: Small or unsorted datasets.


Binary Search:

Efficient search algorithm for sorted arrays.
Uses divide and conquer approach by repeatedly dividing the search range in half.
Time Complexity: 
O(logn).
Best for: Large, sorted datasets.

Hashset:

HashSet is a part of Java’s Collection Framework and implements the Set interface.
It stores unique elements only (does not allow duplicates).
Uses HashMap internally for storage, ensuring fast operations.
Unordered: Does not maintain any insertion order.
Allows null values but only one.

feb 17

Runtime analysis is the process of evaluating the performance of an algorithm in terms of how its execution time increases as the size of the input grows. The goal is to understand how efficiently an algorithm runs, particularly for large inputs, and predict its behavior based on input size.
Big O Notation (O):

Represents the upper bound of an algorithm's time complexity, providing a worst-case scenario for how the algorithm performs.
For example, O(n) means the algorithm's running time grows linearly with the size of the input.

Time Complexity Analysis
Time complexity refers to how the running time of an algorithm increases as the size of the input grows. It is generally expressed using Big O notation, which represents the upper bound of the runtime.

Common Time Complexities:
O(1): Constant time. The algorithm's runtime doesn't depend on the size of the input.

Example: Accessing an element in an array by index.
O(log n): Logarithmic time. The runtime grows logarithmically with the input size.

Example: Binary search.
O(n): Linear time. The runtime grows linearly with the input size.

Example: Linear search or iterating over an array.
O(n log n): Linearithmic time. Often seen in efficient sorting algorithms like Merge Sort and Quick Sort.

O(n²): Quadratic time. The runtime grows quadratically with the input size.

Example: Bubble sort, selection sort, or nested loops iterating over an array.
O(2^n): Exponential time. The runtime doubles with each additional input element.

Example: Solving problems with exhaustive search like the traveling salesman problem.
O(n!): Factorial time. The runtime grows factorially with input size, often seen in problems involving permutations.

Example: Solving the traveling salesman problem using brute force.
2. Space Complexity Analysis
Space complexity measures the amount of memory an algorithm needs relative to the input size. This is also expressed using Big O notation.

Common Space Complexities:
O(1): Constant space. The amount of memory used does not depend on the input size.

Example: Sorting in place using algorithms like QuickSort.
O(n): Linear space. The algorithm requires memory proportional to the size of the input.

Example: Storing an array or linked list of size n.
O(n²): Quadratic space. This happens when an algorithm uses a two-dimensional structure, like a matrix.

Example: Storing an adjacency matrix for a graph.

feb 18

ava Generics allow you to write code that can work with different types while providing compile-time type safety. They enable classes, interfaces, and methods to operate on objects of various types while maintaining type integrity, reducing runtime errors, and improving code reusability.

Key points about Java Generics:

Type Parameters: Generics use type parameters (e.g., T, E, K, V) to define the type of elements they operate on. For example, a generic class might look like class Box<T> { T value; }.
Compile-time Safety: Generics ensure that type errors are caught at compile time rather than runtime, preventing ClassCastException.
Generic Methods: Methods can be defined with generics to handle different types. For example, public <T> void print(T item) { System.out.println(item); }.
Bounded Types: You can constrain the types a generic can work with using the extends keyword. For example, <T extends Number> restricts T to be a subclass of Number.
Wildcards: The wildcard ? can represent an unknown type. ? extends T is used for upper bounds, and ? super T for lower bounds.

feb 19

In Java, Collection is a framework that provides an architecture to store and manipulate a group of objects. It contains interfaces, classes, and methods for working with different data structures like lists, sets, queues, and maps.

Set Interface

A Set is a collection that does not allow duplicate elements.
Implementations:
HashSet → Unordered, allows fast lookups.
LinkedHashSet → Maintains insertion order.
TreeSet → Stores elements in sorted order (natural ordering or custom comparator).

List Interface

A List is an ordered collection that allows duplicates and maintains insertion order.
Implementations:
ArrayList → Fast random access, dynamic resizing.
LinkedList → Fast insertions/deletions, slow random access.
Vector → Synchronized version of ArrayList (thread-safe).

Queue Interface

A Queue follows FIFO (First In, First Out) order.
Special types:
PriorityQueue → Orders elements based on priority (natural/custom order).
Deque (Double-ended Queue) → Allows adding/removing elements from both ends (LinkedList, ArrayDeque).

Map Interface

A Map stores key-value pairs (unique keys).
Implementations:
HashMap → Unordered, allows fast lookups.
LinkedHashMap → Maintains insertion order.
TreeMap → Stores elements in sorted order (by key).

feb 20

Java Streams - Overview
Java Streams (introduced in Java 8) provide a functional and efficient way to process collections, arrays, or I/O operations using a pipeline of operations.

Key Features:
✅ Declarative – Focuses on what to do, not how to do it.
✅ Lazy Evaluation – Operations are executed only when needed.
✅ Parallel Processing – Supports parallel execution for better performance.

Types of Streams:
I/O Streams (java.io)

Byte Streams: InputStream, OutputStream (e.g., FileInputStream)
Character Streams: Reader, Writer (e.g., BufferedReader)
Java 8 Streams (java.util.stream)

Stream API for processing collections.
Example:

List<String> names = List.of("Alice", "Bob", "Charlie");
names.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);
Common Stream Operations:
🔹 Intermediate (return a stream) → map(), filter(), sorted()
🔹 Terminal (produce result) → collect(), forEach(), count()

