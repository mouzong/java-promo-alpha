public class Tableaux {
    public static void main(String[] args) {
        // Declaration d'un tab1
        // typeDeDonnee[] nomDuTableau = new typeDeDonnee[tailleDuTableau];

        int[] tab1 = new int[5];

        tab1[0] = 10;
        tab1[1] = 20;
        tab1[2] = 30;
        tab1[3] = 40;
        tab1[4] = 50;

        System.out.println(tab1[2]);

        System.out.println(tab1.length);



        // Declaration et initialisation d'un tab1
        int[] tab2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};



        // Declaration et initialisation d'un tab1
        int[] tableau3 = new int[]{10, 20, 30, 40, 50};

        int[][] tab4 = new int[3][3];

        int[][] tab6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] tab7 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] tab5 = tab4;
        /**
         *      1 2 3
         *      4 5 6
         *      7 8 9
         */
        tab4[0][0] = 1;
        tab4[0][1] = 2;
        tab4[0][2] = 3;

        tab5[1][0] = 4;

        System.out.println(tab4[0][1]);
        System.out.println(tab4[1][0]);

        System.out.println(tab5[0][0]);
        System.out.println(tab5);
        System.out.println(tab4);



    }
}
