public class Practice {

    public static void method1() {
        System.out.println("I am static mehtod!");
    }

    public void method2() {
        System.out.println("I am non-static method!!");
    }

    public static void main(String[] args) {
        //Main method
        System.out.println("Hello Java");

        //Static method called
        method1();
        
        //Object Created
        Practice prac = new Practice();

        //Non Static method called
        prac.method2();

        
    }
}
