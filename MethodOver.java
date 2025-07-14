public class MethodOver {

    // private double num1;
    // private double num2;

    public int add(int num1, int num2) {
        System.out.print("Method Overloading 1 Addition: ");
        int add = num1 + num2;
        return add;
    }

     public int add(int num1, float num2) {
        System.out.print("Method Overloading 2 Addition: ");
        int add = (int)(num1 + num2);
        return add;
    }

    public static void main(String[] args) {
        //Object Created
        MethodOver method = new MethodOver();

        //Calling Method Overloading 1
        System.out.println(method.add(33, 45));
        System.out.println(method.add(45, 33.20f));
    }
}
