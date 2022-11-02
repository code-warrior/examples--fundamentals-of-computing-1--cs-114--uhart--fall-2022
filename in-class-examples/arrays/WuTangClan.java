public class WuTangClan {
    public static void main(String[] args) {
        /*
         * This is called an initializer list. Note that no “new” keyword is used,
         * and that brackets aren’t used in the assignment.
         */
        String[] wuTangClan = {
            "RZA",
            "GZA",
            "Inspectah Deck",
            "U-God",
            "Ghostface Killah",
            "Method Man",
            "Raekwon",
            "Masta Killa",
            "Cappadonna",
            "Ol’ Dirty Bastard"
        };

        System.out.println("There were " + wuTangClan.length +
            " original members in Wu-Tang Clan.");

        System.out.printf("%s%n", "The original members of Wu-Tang Clan are");

        for(String rapper : wuTangClan) {
            System.out.printf("%s%s%n", "\t", rapper);
        }
    }
}
