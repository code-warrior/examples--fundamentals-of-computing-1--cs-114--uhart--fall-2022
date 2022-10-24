public class MethodReturnsString {
    public static String getName() {
        return "My name is Mudd";
    }

    public static void main(String[] args) {
        String output = getName();

        System.out.println(output);
        System.out.println(getName());
    }
}
