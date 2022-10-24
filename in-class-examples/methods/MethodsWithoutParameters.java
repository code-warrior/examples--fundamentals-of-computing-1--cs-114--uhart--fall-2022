public class MethodsWithoutParameters {
    /*
     * Returns a string; takes no parameters
     */
    public static String getName() {
        return "My name is Mudd";
    }

    /*
     * Returns nothing; prints a string; takes no parameters
     */
    public static void sayMyName() {
        System.out.println("Walter White");
    }

    public static void main(String[] args) {
        System.out.println(MethodsWithoutParameters.getName());
        MethodsWithoutParameters.sayMyName();

        System.out.println(getName());
        sayMyName();
    }
}
