public class Fatorial {
    public static void main(String[] args) {
        int num = 1;
        int mult = 1;
        int decrem = num;

        System.out.println(decrem + "! =");

        if (decrem == 0) {
            System.out.println("1");
        } else {
            while (decrem >= 1) {
                mult = mult * decrem;

                if (decrem > 1) {
                    System.out.print(decrem + " * ");
                } else {
                    System.out.print(decrem + " = " + mult);
                }

                decrem--; 
            }
        }
    }
}
