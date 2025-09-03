import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            if (initialBalance >= 0) {
                balance = initialBalance;
            } else {
                balance = 0;
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }

    public static class SeasonTest {
        public static String recommendActivity(Season currentSeason) {
            switch (currentSeason) {
                case SPRING:
                    return "Plant flowers";
                case SUMMER:
                    return "Go to the beach";
                case AUTUMN:
                    return "Rake leaves";
                case WINTER:
                    return "Build a snowman";
                default:
                    return "Rest";
            }
        }
    }

    
    static class Vehicle {
        public void startEngine() {
            System.out.println("Engine has started.");
        }
    }

    static class Car extends Vehicle {
        public void drive() {
            System.out.println("The car is moving.");
        }
    }

    interface IStringable {
        String toString();
    }


    interface IPrintable {
        default void print(IStringable obj) {
            System.out.println(obj.toString());
        }
    }

    static class Book implements IStringable {
        private String title;
        private String author;

        public Book(String t, String a) {
            this.title = t;
            this.author = a;
        }

        @Override
        public String toString() {
            return "'" + title + "' by " + author;
        }
    }

    abstract static class Shape {
        public abstract double getArea();
    }

    static class Rectangle extends Shape {
        private double w, h;
        public Rectangle(double width, double height) {
            this.w = width;
            this.h = height;
        }
        @Override
        public double getArea() {
            return w * h;
        }
    }

    static class Circle extends Shape {
        private double r;
        public Circle(double radius) {
            this.r = radius;
        }
        @Override
        public double getArea() {
            return Math.PI * r * r; 
        }
    }

    public static long calculateSum() {
        long sum = 0;
        for (long i = 1; i <= 1000000000L; i++) {
            sum += i;
        }
        return sum;
    }

    public static void processAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Age processed successfully: " + age);
    }

    /**
     * This is a documentation-style comment (Javadoc format).
     * It explains the purpose of the main method.
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //task1
        //Q1
//        System.out.println("number of objects:" + args.length);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("Argument " + (i + 1) + ": " + args[i]);
//        }

        /*
        Q2. When you run the program, it looks for main to start the execution.
        It is static in java cuz JVM needs to call main without creating an object first.
        If it weren't static, the JVM would need to instantiate the class, but it wouldn't know how.
        Q3. In C++ the return type is int, parameters are usually empty or int argc, char* argv[], and it has no access modifiers.
        In Java return type is void, parameters String[] args, and it has public static access modifiers
        Q4. Return value indicates success/failure. Success=0, fail = any non-zero number
        */

        //task2
        int a = 10;
        int b = 20;

        System.out.println("Before swap a=" + a + ", b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap a=" + a + ", b=" + b);

        /*
        Q2. Primitive stores the data in the memory directly, and pointers store the address to the object
        Q3. Scope is where a variable exists: local scope means inside a method, class/static scope means tied to the class and available longer.
        Q4. Static typing (C++/Java) means variable types are fixed at compile time. Dynamic typing (like Python) decides types while running.
        */

        //task3
        int n1 = 0, n2 = 1, nextTerm;

        System.out.print("First 10 Fibonacci numbers: ");

        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.print(n1 + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(n2 + " ");
                continue;
            }
            nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;

            System.out.print(nextTerm + " ");
        }
        System.out.println();

        /* Q2. A while loop checks the condition first, then runs the body. A do-while loop runs the body once before checking.
        You use do-while when you want the code to execute at least once no matter what.
        Q3. A switch statement chooses one path out of many based on a variable's value.
        Each case is a possible match, break stops execution so it doesn't fall into the next case, and default runs if no case matches.
        Q4. Short-circuit evaluation means in A && B, if A is false, B won't even be checked; in A || B, if A is true, B won't be checked.
        This is useful, for example, when checking if (x != 0 && 10 / x > 1) so the division is skipped if x is zero.
        */

        //task4
        //Q1
        System.out.println("madam is palindrome? " + isPalindrome("madam"));
        System.out.println("hello is palindrome? " + isPalindrome("hello"));
        /* Q2. In C++ you can pass arguments by value (a copy), by pointer (an address), or by reference (an alias).
        Java only has pass-by-value, but when you pass an object, the value being copied is the reference itself.
        That means methods can change the object's contents but not make the caller's reference point somewhere else.
        Q3. Overloading means having multiple functions with the same name but different parameters.
        In both C++ and Java, the return type alone is not enough. The parameter list must differ in number of types.
        Q4. Recursion is when a function calls itself. A base case is the condition where the function stops calling itself.
        Without a base case, recursion would never end and the program would crash.
        */

        //task5
        // Q1. this is comments
        /* Q2. Comments help explain why the code is written a certain way.
        In a team, other developers (or your future self) can understand and maintain the code more easily without guessing the intent.
        Q3. Documentation comment systems like Javadoc (Java) or Doxygen (C++) let you generate external documentation directly from special comments in the code.
        This keeps code and docs in sync.
        Q4. Even clear code can't always explain reasoning, design decisions, or tricky edge cases.
        Comments are still useful for those situations even if the logic itself looks straightforward.
        */

        //task6
        BankAccount myAccount = new BankAccount(100.50);
        System.out.println("Initial balance: " + myAccount.getBalance());

        myAccount.deposit(50.25);
        System.out.println("Balance after deposit: " + myAccount.getBalance());
        /* Q2. A class is the blueprint or template, while an object is an instance created from that blueprint.
        Q3. public means accessible from anywhere, private means only within the class, and protected means within the class and subclasses.
        Q4. A constructor initializes an object when it is created. A default constructor has no parameters.
        If you don't write any constructor, the compiler provides one automatically.
        */

        //task7
        Season now = Season.AUTUMN;
        System.out.println("It's autumn! Let's: " + SeasonTest.recommendActivity(now));
        /* Q2. Enums are safer and clearer than raw strings or integers, because only valid named values can be used and mistakes are caught by the compiler.
        Q3. Enums make code self-explanatory, because the values have descriptive names, and they prevent mixing unrelated constants.
        Q4. In Java, enums are more powerful: they can have fields, methods, and constructors. In C++, scoped enums are type-safe but can't have methods.
        Old C-style enums were just integers and less safe.
        */

        //task8
        Car myCar = new Car();
        myCar.startEngine(); // Inherited
        myCar.drive();       // Defined in Car
        /* Q2. Inheritance represents an "is-a" relationship, like a Car is a Vehicle. Composition represents a "has-a" relationship, like a Car has an Engine.
        Q3. Overriding is redefining a method in a subclass with the same signature. In C++, you use virtual in the base and override in the subclass.
        In Java, you use @Override to mark it.
        Q4. The Diamond Problem happens when a class inherits from two classes that both inherit from the same base, causing ambiguity.
        C++ solves it with virtual inheritance.
        Java avoids it by not allowing multiple inheritance of classes, only multiple interfaces.
        */

        //task9
        Book myBook = new Book("The Hobbit", "J.R.R. Tolkien");

        IPrintable p = new IPrintable(){};
        p.print(myBook);
        /* Q2. Mixins and interfaces with default methods allow code reuse without strict inheritance. They add behavior without forcing a deep class hierarchy.
        Q3. In Java, interfaces can define default methods with an implementation, so classes that implement the interface automatically gain that method unless they override it.
        Q4. Inheritance is straightforward but can create rigid hierarchies. Composition gives more flexibility by combining behaviors.
        Mixins or default methods add reusable functionality without the downsides of multiple inheritance.
        */

        //task10
        Shape[] shapes = { new Rectangle(10, 5), new Circle(3) };
        for (Shape s : shapes) {
            System.out.println("Area: " + s.getArea());
        }
        /* Q2. Compile-time polymorphism happens when the method being called is known at compile time, like method overloading or operator overloading.
        Runtime polymorphism is when the method is chosen at run time based on the actual object type, like overriding.
        Q3. An abstract class can have both defined and undefined (abstract) methods. An interface (Java) or pure abstract class (C++) only declares methods with no implementation.
        Use abstract classes when you want some shared code, interfaces when you only need a contract.
        Q4. Interfaces in Java and abstract classes with pure virtual methods in C++ both define a common API.
        They let different classes implement the same functions so code can work with them polymorphic.
        */

        //task11
        System.out.println("Main thread: Starting calculation...");

        CompletableFuture<Long> sumFuture = CompletableFuture.supplyAsync(Main::calculateSum);

        System.out.println("Main thread: Waiting for result...");

        long result = sumFuture.get();

        System.out.println("Main thread: The calculated sum is: " + result);
        /* Q2. Asynchronous programming solves the problem of blocking operations like file access or network calls.
        It keeps the program responsive instead of freezing while waiting.
        Q3. Parallel means tasks truly run at the same time on multiple processors.
        Concurrent means tasks take turns and appear to run simultaneously, even if one processor switches between them.
        Q4. A Future (Java/C++) or Promise (JavaScript) represents a result that isn't ready yet but will be later.
        It lets you run a task asynchronously and then get the result once it finishes.
        */

        //task12
        int userAge = -5;
        try {
            System.out.println("Processing age: " + userAge);
            processAge(userAge);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues.");
        /* Q2. try marks code that may throw an error, catch handles that error, and finally (Java) runs code whether an error occurred.
        C++ doesn't have finally but uses RAII, where destructors release resources automatically when objects go out of scope.
        Q3. In Java, checked exceptions must be declared and handled, unchecked ones don't.
        C++ doesn't distinguish; all exceptions are unchecked.
        Q4. Exceptions separate normal logic from error handling, making code cleaner.
        They also let errors propagate up without clutter. Downsides: they can be overused, harder to follow in control flow, and sometimes slower than error codes.
        */
    }
}
