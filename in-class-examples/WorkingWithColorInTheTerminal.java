public class WorkingWithColorInTheTerminal {
    public static void main(String[] args) {
        final String YELLOW = "\033[33m";
        final String RESET = "\033[39m";

        System.out.printf("%s%s%s%s%s%n",
            "The following syntax is yellow :: ",
            YELLOW,
            "THIS CONTENT IS IN YELLOW",
            RESET,
            " :: and this content was reset back to the default.");
    }
}
