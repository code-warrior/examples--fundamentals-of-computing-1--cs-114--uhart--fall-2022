public class EnumerationsExample {
    public static void main(String[] args) {
        enum NirvanasDrummers {
            AARON,
            DALE,
            DAVE,
            CHAD,
            DAN
        }

        NirvanasDrummers firstDrummer = NirvanasDrummers.AARON,
            secondDrummer = NirvanasDrummers.DALE,
            thirdDrummer = NirvanasDrummers.DAVE,
            fourthDrummer = NirvanasDrummers.CHAD,
            fifthDrummer = NirvanasDrummers.DAN;

        System.out.printf("Nirvana’s 1st drummer (1987~1988): %s%n", firstDrummer);
        System.out.printf("Nirvana’s 2nd drummer (1988): %s%n", secondDrummer);
        System.out.printf("Nirvana’s 3rd drummer (1988): %s%n", thirdDrummer);
        System.out.printf("Nirvana’s 4th drummer (1988~1990): %s%n", fourthDrummer);
        System.out.printf("Nirvana’s 5th drummer (1990): %s%n", fifthDrummer);
        System.out.printf("And, Nirvana’s last drummer (1990–1994): %s%n", "Dave Grohl");

        System.out.println();

        System.out.println("Now, let’s cycle through all the drummers: ");
        for (NirvanasDrummers firstName : NirvanasDrummers.values()) {
            // Note: Instead of firstName.name(), I could have simply written firstName
            System.out.printf("  %s is at ordinal %s%n",
                firstName.name(),
                firstName.ordinal());
        }
    }
}
