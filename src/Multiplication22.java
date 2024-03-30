public class Multiplication22 {

    public static void main(String[] args) {
        int n=1;
        int i=0;
        do {
            System.out.println("[============TABLE DE MULTIPLICATION PAR "+n+" ==============]");
            for (i=0; i<=12; i++) {
                System.out.println("\t \t \t \t \t" + n + " x " + i + " = " + n * i );
            }
        n++;
        }
        while (n<13);
        System.out.println("\t ====================  FIN  ====================");
        }

}
