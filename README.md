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

2. Non-Comparison-Based Sorting
These do not compare elements directly and are often faster for specific cases.
Counting Sort → Uses an auxiliary array to count occurrences. (O(n + k), only for integers)
Radix Sort → Sorts numbers digit by digit. (O(nk), stable)
Bucket Sort → Distributes elements into buckets and sorts them individually. (O(n + k), stable)
