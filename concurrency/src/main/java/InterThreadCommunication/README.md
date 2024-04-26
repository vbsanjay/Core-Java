# Inter Thread Communication
- Inter thread communication happens with the help of wait() notify() notifyAll()
- wait, notify and notifyALL aare present in object call and not in thread class.
- wait, notify and notify all applicable only for multithreading only
## why wait, notify and notifyALL aare present in object call and not in thread class?
- wait, notify and notify all presetn in object class but not in thread class because thread can call these methods on any java object. 

## IllegalMontiorStateException
- To call wait on any object, thread should be owner of this object i.e thread should lock of this object i.e the thread should be inside synchronized area.
- wait, notify and notify all should be called only inside synchronized area.

- If a thread calls wait method on any object it immediately released the lock of that particular object and entered into waiting state.
- If a thread calls notify method on any object it releases the lock of that object but may not immediately, except wait, notify and notify all there is no other method where thread releases the lock.

# Thread releasing lock

| Method   | Does Thread Release Lock? |
|----------|--------------------------|
| yield()  | No                       |
| join()   | No                       |
| sleep()  | No                       |
| wait()   | Yes                      |
| notify() | Yes                      |
| notifyAll() | Yes                   |


# Which of the following is valid
- if a thread calls wait method immediately it will enter into waiting state without releasing any lock - false
- if a thread calls wait any method it releases the lock of that object but may not immediatley
- if a thread calls wait method in any method it release all lock and immediately enter into waitign state - false
- if a thread calls wait method in any object it immediatley release the lock of the particular object and go to waiting state - true
- if a thread calls notify method on any object it immediately releases the lock of that particular object - false
- if a thread calls notify method on any object it releases the lock of that object but may not immediately - true
- 
