Files I uploaded:
--------
1) ThreadDemo1 -> Creating a thread by extending thread class
2) ThreadDemo2 -> Overloading of run() method
3) ThreadDemo3 -> Overriding of start() method
4) ThreadDemo4 -> Creating a thread by implementing runnable interface
5) ThreadDemo5 -> Getting and Setting name of Thread

Thread class constructors:
-------------------------
1) Thread t = new Thread();
2) Thread t = new Thread(Runnable r);
3) Thread t = new Thread(String name);
4) Thread t = new Thread(Runnable r, String name);
5) Thread t = new Thread(ThreadGroup g, String name);
6) Thread t = new Thread(ThreadGroup g, Runnable r);
7) Thread t = new Thread(ThreadGroup g, Runnable r, String name);
8) Thread t = new Thread(ThreadGroup g, Runnable r, String name, long stackSize);

Getting and Setting name of the thread:
------------------
1) public final String getName();
2) public final void setName(String name);
3) public static Thread currentThread();

Thread priorities:
-----
1) Thread.MIN_PRIORITY ---- 1
2) Thread.MAX_PRIORITY ---- 10
3) Thread.NORM_PRIORITY ---- 5