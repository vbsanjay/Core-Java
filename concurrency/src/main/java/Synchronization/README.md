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
- Whenever we are "synchronized" keyword then only the lock concept will come into the picture.
- If a thread wants to execute synchronized method on the given object, first it has get lock of that object, once thread got the lock then it is allowed to execute any synchronized method on that object.
- Once method execution completes, automatically thread releases the lock.
- Aquiring and releasing lock internally taken care by JVM  and programmer not responsible for this activity.

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

# 

