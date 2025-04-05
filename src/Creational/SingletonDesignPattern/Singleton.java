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
