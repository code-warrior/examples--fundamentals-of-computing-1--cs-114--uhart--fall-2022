public class DeclarationsAndInitializations {
    public static void main(String args[]) {
        int a;     // Declaration. The variable a is an lvalue.
        int b = 3; // Initialization. The number 3 is a constant and ONLY an rvalue.

        a = b; // Both a and b are lvalues and rvalues
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
}
