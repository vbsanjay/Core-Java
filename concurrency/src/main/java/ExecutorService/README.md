# Executors and Thread Pools

## Requirement

Imagine you are developing a web server that needs to handle incoming HTTP requests. The server should be able to respond to multiple requests simultaneously to ensure a good user experience.

## Challenges

1. **Concurrency:** Handling multiple requests concurrently is essential for performance.
2. **Threads**: Creating and destroying a new thread for each incoming request is inefficient and can lead to resource exhaustion.

## Solution

1. **Thread Pool**: Create a Thread pool with a fixed number of worker Threads. Worker threads are reused to handle multiple requests, eliminating the overhead of thread creation and destruction for each request.
2. **Concurrency Control:** The thread pool ensures the number of concurrently exciting tasks and does not exceed the number of available worker threads. If all threads are busy, incoming requests are queued until a thread becomes available.

# Thread Pools

1. A thread pool is a design pattern and concurrency management mechanism used in multithreaded and parallel computing environments.
2. It is a pool of pre-created threads that are available for executing tasks.
3. In a thread pool, a fixed number of threads are created in advance, and these threads are reused to execute multiple tasks.
4. Tasks are submitted to the thread pool for execution. The thread pool maintains a queue of tasks. When a thread becomes available, it retrieves the next task from the queue and executes it.
5. Thread pools often distribute tasks evenly among available threads.


# execute()
# shutdown()
# waitTermination(1000)
# submit(new Runnable())
# submit(new Callable())
# invokeAny
# invokeAll
# Future Object
# Future Task