public class MultiplicationNbrePaire {


    public static void main(String[] args) {
        int a = 8;
        int b = 1;
        if (a % 2 == 0) {

            System.out.println("===TABLE DE MULTIPLICATION PAR" + a + "===");

            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));

            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));
            System.out.println("\t\t\t" + a + "*" + ++b + " = " + (a * b));

        } else {
            System.out.println("===" + a + " nest pas un nombre paire===");
        }
    }
}
