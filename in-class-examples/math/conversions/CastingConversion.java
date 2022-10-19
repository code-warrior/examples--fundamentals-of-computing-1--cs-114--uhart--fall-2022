public class CastingConversion {
    public static void main(String[] args) {
        float money;
        int dollars = 20;

        System.out.println("Variable `dollars` is " + dollars);
        money = dollars;

        System.out.println("Variable `dollars` is still " + dollars +
            ", but `money` is now " + money);
   }
}
