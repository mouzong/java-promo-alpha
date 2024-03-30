public class ControlFlow {
    public static void main(String[] args) {
        int a = 2;

//        a = a + 2;
//        a += 2;

        System.out.println(a %= 2); // a = a % 2

        if (a >= 1) {
            System.out.println("Le nombre " + a + " est un nombre positif !");
        } else if (a == 0) {
            System.out.println("Le nombre " + a + " est nul !");
        } else {
            System.out.println("Le nombre " + a + " est un nombre négatif !");
        }
    }
}
