# Java Collections framework
- The Collections Framework is a unified architecture for representing and manipulating collections in Java.
- It provides a standard way to handle groups of objects and includes a set of interfaces, implementations (classes), and algorithms (methods) to work with collections.
- The collections framework consists of:
  - Collection interfaces: Represent different types of collections, such as sets, lists, and maps. These interfaces form the basis of the framework.
  - General-purpose implementations: Primary implementations of the collection interfaces.
  - Algorithms: Static methods that perform useful functions on collections, such as sorting a list.

# Collection Interface
- A collection is a root-level interface in the Java Collections Framework, 
- It defines the basic operations that can be performed on a collection of objects, such as adding, removing, and checking if an element is present.
- It has several subinterfaces like List, Set, and Queue.
- Common methods include add(), remove(), size(), isEmpty(), iterator(), contains(), and clear().

# Collections Class
- Collections is a utility class in the Java Collections Framework.
- It provides static methods that operate on or return collections. These methods are primarily algorithms that manipulate collections, such as sorting and searching.
- Examples include sort(), binarySearch(), reverse(), shuffle(), unmodifiableCollection(), synchronizedCollection(), max(), and min().
- Methods in Collections are typically used for operations that do not belong to any particular collection instance but apply to the collection as a whole.

``` java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFrameworkExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Collections.sort(list);  // Sorts the list
        System.out.println(list);

        Collections.reverse(list);  // Reverses the order of the list
        System.out.println(list);
    }
}
```
# Differences between the `Collection` interface, the `Collections` utility class, and the Collections Framework

| Aspect                      | Collection Interface                                                                                                                   | Collections Class                                                                                                 | Collections Framework                                                                   |
|-----------------------------|----------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|
| **Definition**              | A root-level interface in the Java Collections Framework.                                                                              | A utility class in the Java Collections Framework.                                                                | A unified architecture for representing and manipulating collections.                   |
| **Purpose**                 | Defines the basic operations that can be performed on a collection of objects.                                                         | Provides static methods for various operations on collections (e.g., sorting, searching).                         | Provides a set of interfaces, implementations, and algorithms to work with collections. |
| **Hierarchy**               | Superinterface for specific collection interfaces like `List`, `Set`, and `Queue`.                                                     | Not part of the hierarchy; provides utility methods for collections.                                              | Encompasses multiple interfaces (`Collection`, `List`, `Set`, `Map`, etc.) and classes. |
| **Methods**                 | Includes basic methods like `add()`, `remove()`, `size()`, `isEmpty()`, `iterator()`, `contains()`.                                    | Includes static methods like `sort()`, `binarySearch()`, `reverse()`, `unmodifiableList()`, `synchronizedList()`. | Includes methods from various interfaces and classes for collection operations.         |
| **Example Usage**           | `Collection<String> collection = new ArrayList<>();`                                                                                   | `Collections.sort(list);`                                                                                         | `List<String> list = new ArrayList<>();`                                                |
| **Return Type**             | Not applicable (it's an interface).                                                                                                    | Often returns collections, such as synchronized or unmodifiable collections.                                      | Various types (lists, sets, maps, queues, etc.).                                        |
| **Instance Creation**       | Cannot be instantiated directly; use classes like `ArrayList`, `HashSet`, etc.                                                         | Cannot be instantiated; use its static methods directly.                                                          | Involves creating instances of classes like `ArrayList`, `HashSet`, `HashMap`, etc.     |
| **Modification**            | Methods defined in the interface allow modification of the collection.                                                                 | Provides methods to create read-only or synchronized versions of collections.                                     | Supports both modification and retrieval operations via different implementations.      |
| **Thread Safety**           | Depends on the implementation (e.g., `ArrayList` is not thread-safe, `Vector` is).                                                     | Provides methods to make collections thread-safe (e.g., `synchronizedList()`).                                    | Includes both thread-safe and non-thread-safe implementations.                          |
| **Mutability**              | Depends on the implementation (modifiable collections like `ArrayList` or immutable like those from `Collections.unmodifiableList()`). | Provides methods to create immutable collections.                                                                 | Supports both mutable and immutable collections via different implementations.          |


# Hierarchy of Collection Framework
![Hierarchy of Collection Framework](img/Hierarchy%20of%20Collection%20Framework.png)

# Methods of Collection Interface
The following table lists the methods declared in the `Collection` interface:

| No. | Method                                                  | Description                                                                                                     |
|-----|---------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| 1   | `public boolean add(E e)`                               | It is used to insert an element in this collection.                                                             |
| 2   | `public boolean addAll(Collection<? extends E> c)`      | It is used to insert the specified collection elements in the invoking collection.                              |
| 3   | `public boolean remove(Object element)`                 | It is used to delete an element from the collection.                                                            |
| 4   | `public boolean removeAll(Collection<?> c)`             | It is used to delete all the elements of the specified collection from the invoking collection.                 |
| 5   | `default boolean removeIf(Predicate<? super E> filter)` | It is used to delete all the elements of the collection that satisfy the specified predicate.                   |
| 6   | `public boolean retainAll(Collection<?> c)`             | It is used to delete all the elements of invoking collection except the specified collection.                   |
| 7   | `public int size()`                                     | It returns the total number of elements in the collection.                                                      |
| 8   | `public void clear()`                                   | It removes the total number of elements from the collection.                                                    |
| 9   | `public boolean contains(Object element)`               | It is used to search an element.                                                                                |
| 10  | `public boolean containsAll(Collection<?> c)`           | It is used to search the specified collection in the collection.                                                |
| 11  | `public Iterator<E> iterator()`                         | It returns an iterator.                                                                                         |
| 12  | `public Object[] toArray()`                             | It converts collection into array.                                                                              |
| 13  | `public <T> T[] toArray(T[] a)`                         | It converts collection into array. Here, the runtime type of the returned array is that of the specified array. |
| 14  | `public boolean isEmpty()`                              | It checks if collection is empty.                                                                               |
| 15  | `default Stream<E> parallelStream()`                    | It returns a possibly parallel Stream with the collection as its source.                                        |
| 16  | `default Stream<E> stream()`                            | It returns a sequential Stream with the collection as its source.                                               |
| 17  | `default Spliterator<E> spliterator()`                  | It generates a Spliterator over the specified elements in the collection.                                       |
| 18  | `public boolean equals(Object element)`                 | It matches two collections.                                                                                     |
| 19  | `public int hashCode()`                                 | It returns the hash code number of the collection.                                                              |

# Iterable Interface
- The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.
- It contains only one abstract method. i.e.,
- ```java
  Iterator<T> iterator()  
  ```
- It returns the iterator over the elements of type T.

# Iterator interface
Iterator interface provides the facility of iterating the elements in a forward direction only.
**Methods of Iterator interface**
There are only three methods in the Iterator interface. They are:

| No. | Method                         | Description                                                                                               |
|-----|--------------------------------|-----------------------------------------------------------------------------------------------------------|
| 1   | `public boolean hasNext()`     | It returns true if the iterator has more elements otherwise it returns false.                             |
| 2   | `public Object next()`         | It returns the element and moves the cursor pointer to the next element.                                  |
| 3   | `public void remove()`         | It removes the last element returned by the iterator. It is less used.                                    |


# What is Interface inheritance?
# Map interface
# What is Iterable and iterator
Iterable is implemented by class which need to be iterable.

# What is iterator?
for each loop will use Iterator and Iterable

# Task
Create a class of yourself which is list and that class should be eligible for iterating

every collection is an iterable

# What are core iterfaces


