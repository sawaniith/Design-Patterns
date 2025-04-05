package Creational.SingletonDesignPattern;

//public class Singleton {

//    Thread-Safe (since it's created at class loading)
//    Not Lazy (instance is created even if not needed)

//    private static final Singleton INSTANCE = new Singleton();
//
//    private Singleton() {} // Private constructor
//
//    public static Singleton getInstance() {
//        return INSTANCE;
//    }
//}

    //Not Thread-Safe (multiple threads can create multiple instances)
    //lazy
//    public class Singleton {
//        private static Singleton instance;
//
//        private Singleton() {}
//
//        public static Singleton getInstance() {
//            if (instance == null) {
//                instance = new Singleton();
//            }
//            return instance;
//        }
//    }


//    Thread-Safe
//    Slow Performance (every call acquires a lock)
//    public class Singleton {
//        private static Singleton instance;
//
//        private Singleton() {}
//
//        public static synchronized Singleton getInstance() {
//            if (instance == null) {
//                instance = new Singleton();
//            }
//            return instance;
//        }
//    }

    //double check loading
//    public class Singleton {
//        private static volatile Singleton instance; // Volatile to prevent instruction reordering
//
//        private Singleton() {}
//
//        public static Singleton getInstance() {
//            if (instance == null) {  // First check (without locking)
//                synchronized (Singleton.class) {  // Lock on the class
//                    if (instance == null) {  // Second check (inside the lock)
//                        instance = new Singleton();
//                    }
//                }
//            }
//            return instance;
//        }
//    }

//bill pugh singleton
public class Singleton {
    private Singleton() {}

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}



//Logger Classes: Many logging frameworks use the Singleton pattern to provide a global logging object. This ensures that log messages are consistently handled and written to the same output stream.
//Database Connection Pools: Connection pools help manage and reuse database connections efficiently. A Singleton can ensure that only one pool is created and used throughout the application.
//Cache Objects: In-memory caches are often implemented as Singletons to provide a single point of access for cached data across the application.
//Thread Pools: Thread pools manage a collection of worker threads. A Singleton ensures that the same pool is used throughout the application, preventing resource overuse.
//File System: File systems often use Singleton objects to represent the file system and provide a unified interface for file operations.
//Print Spooler: In operating systems, print spoolers manage printing tasks. A single instance coordinates all print jobs to prevent conflicts.
