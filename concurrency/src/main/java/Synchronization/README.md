# Synchronization Introduction

## What is Synchronization?
- Synchronized is a modifier applicable only for methods and blocks but not for classes and variables.
- If multiple thread trying to operate simultaneously on the same object, then there may be a chance of data inconsistency problem. To overcome this problem we should go for "synchronized" keyword.
- If a method or block declared as synchronized, then at a time only one thread is allowed to execute that method or block on the given object, so that date inconsistency problem will be resolved.

---

## Advantage and Disadvantage of Synchronization
- The main advantage of "synchronized" keyword is we can resolve data inconsistency problems.
- Disadvantage of "synchronized" keyword is it increases waiting time of thread and creates performance problems. Hence, if there is no specific requirement then it is not recommended to use synchronized keyword.

---

# Lock
- Internally synchronization concept is implemented by using lock.
- Every object in java has a unique lock.
- Whenever we use "synchronized" keyword then only the lock concept will come into the picture.
- If a thread wants to execute synchronized method on the given object, first it has get lock of that object, once thread got the lock then it is allowed to execute any synchronized method on that object.
- Once method execution completes, automatically thread releases the lock.
- Acquiring and releasing lock internally taken care by JVM  and programmer not responsible for this activity.

---

# How multiple synchronized method in the same object works?
- While a thread is executing synchronized method on the given object, the remaining threads are not allowed to execute any synchronized method simultaneously on the same object.
- But remaining threads are allowed to execute non-synchronized methods simultaneously.
- Lock concept is implemented based on object but not based on the method.

---

# Synchronized area vs Non Synchronized area
- Synchronized area:
  - This area can be accessed by only one thread at a time.
  - Wherever we are performing update operation (add/update/delete) i.e. where state of object changing.
- Non Synchronized area:
  - This area can be accessed by any no of threads simultaneously.
  - Wherever object state won't be changed like read() operation.

![syncAndNonSyncArea.png](img/syncAndNonSyncArea.png)

---

# What happens when we use 2 different object with synchronized method?

``` java
public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "Dhoni");
        MyThread t2 = new MyThread(d2, "Virat");

        t1.start();
        t2.start();

    }
```
![syncWithDifferentObject.png](img/syncWithDifferentObject.png)

- Even though wish method is synchronized we will get irregular output because threads are operating on different Java Objects.
- If multiple threads are operating on same java object then synchronization is required. If multiple threads are operating on multiple java objects then synchronization is not required.
- Example:
  - If you and your wife doing transactions in same joint account, synchronization is required.
  - If you and your wife doing transactions in separate account, synchronization is not required.

# Static synchronized method
- A static synchronized method in Java is a synchronized method that is associated with a class rather than with an instance (object) of that class. 
- This means that the synchronization lock for a static synchronized method is on the class itself, not on a specific object instance.

## Purpose of Static Synchronized Methods
- Static synchronized methods are used when you need to synchronize access to shared resources at the class level. 
- This is useful in scenarios where shared resources are common to all instances of a class or are static variables that need synchronized access.

## How Static Synchronized Methods Work (important)
- When a static synchronized method is invoked, the synchronization lock is acquired on the Class object representing the class to which the method belongs. 
- This ensures that only one thread at a time can execute any static synchronized method for that class.
- If another thread tries to execute a static synchronized method from the same class while the lock is held, it must wait until the lock is released.

# What is Class level lock?
- Every class in java has a unique lock which is nothing but class level lock.
- When a thread requires class level lock?
  - If a thread want to execute a static synchronized method, then thread required class level lock.
  - Once thread got class level lock then it is allowed to execute any static synchronized method of that class.
  - Once method execution completes automatically thread releases the lock.

## Simultaneous method execution during Class level lock
- While a thread executing static synchronized method the remaining threads are not allowed to execute static synchronized method simultaneous of the class.
- But remaining threads are allowed to execute the following method simultaneously:
  - non-synchronized static method
  - synchronized instance methods
  - non-synchronized instance methods

## 2 Methods to acquire class level lock
1. Using the synchronized static method.
2. Using synchronized block.
- Reference: https://www.geeksforgeeks.org/class-level-lock-in-java/

![threadAndLockInStaticMethod.png](img/threadAndLockInStaticMethod.png)

# Synchronized block

## What is Synchronized block?
- A synchronized block in Java is a critical section of code where access to shared resources is controlled to prevent concurrent modification issues.
- By marking a block of code as synchronized, you ensure that only one thread can execute that block at a time, providing thread safety and avoiding race conditions.

## When to use Synchronized block?
- When very few lines of code need to be synchronized within a method then it is not recommended to declare entire method as synchronized.
- We have to enclose those few lines of the code by using synchronized block.
- The main advantage of synchronized block over synchronized method is it reduces waiting time of threads and improves performance of the system.

## Points to remember
- Synchronized block is used to lock an object for any shared resource.
- Scope of synchronized block is smaller than the method.
- Scope of synchronized block is smaller than the method.

## Syntax
``` java
synchronized (object reference expression) {     
//code block     
}   
``` 
![declaringSyncBlock.png](img/declaringSyncBlock.png)

> Locks in Java are associated with objects, not primitive types. When you use a synchronized block, you need to specify an object that acts as the lock. If you try to use a primitive type (like int, char, boolean, etc.) as the lock for a synchronized block, you will get a compile-time error indicating that a reference type is required.
## Can thread acquire multiple lock?
Yes, a thread can acquire multiple lock simultaneously from different object.
### Example
``` java
class X{
  public synchronized void m1(){
    //here thread has lock of X Object
    Y y = new Y();
    synchronized(y){
      //here thread has lock of X Object and Y Object
      Z z = new Z();
      synchronized(z){
        //here thread has lock of X Object, Y Object and Z Object
      }
    }
  }
} 
```
## What is synchronized statement? (not official java terminology, but interviewer terminology)
 The statements present in synchronized method or synchronized block are called synchronized statements.