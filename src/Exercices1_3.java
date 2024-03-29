public class Exercices1_3 {
    public int i;
    public static void main(String[] args) {
    Exercices execution_exercice=new Exercices();

    if(args.length==1) {
        int nbreChoisi=Integer.parseInt(args[0]);
        execution_exercice.multiplicationNbreChoisie(nbreChoisi);  //exercice 1
        execution_exercice.multiplicationNbreChoisieInf9(); //exercice 2
        execution_exercice.calculMoyenneAleatoire(); //exercice 3
    }else{
       if(args.length==0) {
           System.out.println("Vous avez entré " + args.length + " nombre au lieu de 1 nombre");
       }else{
           System.out.println("Vous avez entré " + args.length + " nombres au lieu de 1 nombre");
       }
    }

    }

}

class Exercices{
    //Exercice 1
  void multiplicationNbreChoisie(int i) {
      /**
       * Multiplication du nombre choisi
       */
      System.out.println("Exercice 1");
      System.out.println("[====== Table de multiplication de "+i+" ======]");
      System.out.println("____________________________________________");
      System.out.println("\t\t\t"+i+"*1=" + (i*1) + "\n\t" +
              "\t\t"+i+"x2=" + (i*2) + "\n\t" +        
              "\t\t"+i+"x3=" + (i*3) + "\n\t" +
              "\t\t"+i+"x4=" + (i*4)+ "\n\t" +
              "\t\t"+i+"x5=" + (i*5)+ "\n\t" +
              "\t\t"+i+"1x6=" + (i*6) + "\n\t" +
              "\t\t"+i+"x7=" + (i*7) + "\n\t" +
              "\t\t"+i+"x8=" + (i*8) + "\n\t" +
              "\t\t"+i+"x9=" + (i*9) + "\n\t" +
              "\t\t"+i+"x10=" + (i*10) + "\n\t" +
              "\t\t"+i+"x11=" + (i*11) + "\n\t" +
              "\t\t"+i+"x12=" + (i*12) + "\t\t\n\n");
  }



    //Exercice 2
  void multiplicationNbreChoisieInf9() {
      /**
       * Multiplication du nombre choisi (<9) jusqu'à 9
       */
      /**
       * Premier compartiment multiplicateur (1,2,3)
       */
      int j=1;
      System.out.println("Exercice 2");
      System.out.println("[====== Table de multiplication de "+ 1 +" à 9 ======]");
      System.out.println("_______________________________________________");
      System.out.println("|\t" + 1 + "x" + j + "=" + 1 + "\t|\t" + (1 + 1) + "x" + j + "=" + ((1 + 1)) + "\t|\t" + (1 + 2) + "x" + j + "=" + (1 + 2) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 1) + "=" + 1 * (j + 1) + "\t|\t" + (1 + 1) + "x" + (j + 1) + "=" + (1 + 1) * (j + 1) + "\t|\t" + (1 + 2) + "x" + (j + 1) + "=" + (1 + 2) * (j + 1) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 2) + "=" + 1 * (j + 2) + "\t|\t" + (1 + 1) + "x" + (j + 2) + "=" + (1 + 1) * (j + 2) + "\t|\t" + (1 + 2) + "x" + (j + 2) + "=" + (1 + 2) * (j + 2) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 3) + "=" + 1 * (j + 3) + "\t|\t" + (1 + 1) + "x" + (j + 3) + "=" + (1 + 1) * (j + 3) + "\t|\t" + (1 + 2) + "x" + (j + 3) + "=" + (1 + 2) * (j + 3) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 4) + "=" + 1 * (j + 4) + "\t|\t" + (1 + 1) + "x" + (j + 4) + "=" + (1 + 1) * (j + 4) + "\t|\t" + (1 + 2) + "x" + (j + 4) + "=" + (1 + 2) * (j + 4) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 5) + "=" + 1 * (j + 5) + "\t|\t" + (1 + 1) + "x" + (j + 5) + "=" + (1 + 1) * (j + 5) + "\t|\t" + (1 + 2) + "x" + (j + 5) + "=" + (1 + 2) * (j + 5) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 6) + "=" + 1 * (j + 6) + "\t|\t" + (1 + 1) + "x" + (j + 6) + "=" + (1 + 1) * (j + 6) + "\t|\t" + (1 + 2) + "x" + (j + 6) + "=" + (1 + 2) * (j + 6) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 7) + "=" + 1 * (j + 7) + "\t|\t" + (1 + 1) + "x" + (j + 7) + "=" + (1 + 1) * (j + 7) + "\t|\t" + (1 + 2) + "x" + (j + 7) + "=" + (1 + 2) * (j + 7) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 8) + "=" + 1 * (j + 8) + "\t|\t" + (1 + 1) + "x" + (j + 8) + "=" + (1 + 1) * (j + 8) + "\t|\t" + (1 + 2) + "x" + (j + 8) + "=" + (1 + 2) * (j + 8) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 9) + "=" + 1 * (j + 9) + "\t|\t" + (1 + 1) + "x" + (j + 9) + "=" + (1 + 1) * (j + 9) + "\t|\t" + (1 + 2) + "x" + (j + 9) + "=" + (1 + 2) * (j + 9) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 10) + "=" + 1 * (j + 10) + "\t|\t" + (1 + 1) + "x" + (j + 10) + "=" + (1 + 1) * (j + 10) + "\t|\t" + (1 + 2) + "x" + (j + 10) + "=" + (1 + 2) * (j + 10) + "\t|\n" +
              "|\t" + (1) + "x" + (j + 11) + "=" + 1 * (j + 11) + "\t|\t" + (1 + 1) + "x" + (j + 11) + "=" + (1 + 1) * (j + 11) + "\t|\t" + (1 + 2) + "x" + (j + 11) + "=" + (1 + 2) * (j + 11) + "\t|\n");
      System.out.println("_____________________________________");

      /**
       * Deuxième compartiment multiplicateur (4,5,6)
       */
      System.out.println("|\t" + (1 + 3) + "x" + j + "=" + 1 + "\t|\t" + (1 + 4) + "x" + j + "=" + ((1 + 4)) + "\t|\t" + (1 + 5) + "x" + j + "=" + (1 + 5) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 1) + "=" + (1 + 3) * (j + 1) + "\t|\t" + (1 + 4) + "x" + (j + 1) + "=" + (1 + 4) * (j + 1) + "\t|\t" + (1 + 5) + "x" + (j + 1) + "=" + (1 + 5) * (j + 1) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 2) + "=" + (1 + 3) * (j + 2) + "\t|\t" + (1 + 4) + "x" + (j + 2) + "=" + (1 + 4) * (j + 2) + "\t|\t" + (1 + 5) + "x" + (j + 2) + "=" + (1 + 5) * (j + 2) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 3) + "=" + (1 + 3) * (j + 3) + "\t|\t" + (1 + 4) + "x" + (j + 3) + "=" + (1 + 4) * (j + 3) + "\t|\t" + (1 + 5) + "x" + (j + 3) + "=" + (1 + 5) * (j + 3) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 4) + "=" + (1 + 3) * (j + 4) + "\t|\t" + (1 + 4) + "x" + (j + 4) + "=" + (1 + 4) * (j + 4) + "\t|\t" + (1 + 5) + "x" + (j + 4) + "=" + (1 + 5) * (j + 4) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 5) + "=" + (1 + 3) * (j + 5) + "\t|\t" + (1 + 4) + "x" + (j + 5) + "=" + (1 + 4) * (j + 5) + "\t|\t" + (1 + 5) + "x" + (j + 5) + "=" + (1 + 5) * (j + 5) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 6) + "=" + (1 + 3) * (j + 6) + "\t|\t" + (1 + 4) + "x" + (j + 6) + "=" + (1 + 4) * (j + 6) + "\t|\t" + (1 + 5) + "x" + (j + 6) + "=" + (1 + 5) * (j + 6) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 7) + "=" + (1 + 3) * (j + 7) + "\t|\t" + (1 + 4) + "x" + (j + 7) + "=" + (1 + 4) * (j + 7) + "\t|\t" + (1 + 5) + "x" + (j + 7) + "=" + (1 + 5) * (j + 7) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 8) + "=" + (1 + 3) * (j + 8) + "\t|\t" + (1 + 4) + "x" + (j + 8) + "=" + (1 + 4) * (j + 8) + "\t|\t" + (1 + 5) + "x" + (j + 8) + "=" + (1 + 5) * (j + 8) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 9) + "=" + (1 + 3) * (j + 9) + "\t|\t" + (1 + 4) + "x" + (j + 9) + "=" + (1 + 4) * (j + 9) + "\t|\t" + (1 + 5) + "x" + (j + 9) + "=" + (1 + 5) * (j + 9) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 10) + "=" + (1 + 3) * (j + 10) + "\t|\t" + (1 + 4) + "x" + (j + 10) + "=" + (1 + 4) * (j + 10) + "\t|\t" + (1 + 5) + "x" + (j + 10) + "=" + (1 + 5) * (j + 10) + "\t|\n" +
              "|\t" + (1 + 3) + "x" + (j + 11) + "=" + (1 + 3) * (j + 11) + "\t|\t" + (1 + 4) + "x" + (j + 11) + "=" + (1 + 4) * (j + 11) + "\t|\t" + (1 + 5) + "x" + (j + 11) + "=" + (1 + 5) * (j + 11) + "\t|\n");
      System.out.println("_____________________________________");

      /**
       * Troisième compartiment multiplicateur (7,8,9)
       */
      System.out.println("|\t" + (1 + 6) + "x" + j + "=" + 1 + "\t|\t" + (1 + 7) + "x" + j + "=" + ((1 + 7)) + "\t|\t" + (1 + 8) + "x" + j + "=" + (1 + 8) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 1) + "=" + (1 + 6) * (j + 1) + "\t|\t" + (1 + 7) + "x" + (j + 1) + "=" + (1 + 7) * (j + 1) + "\t|\t" + (1 + 8) + "x" + (j + 1) + "=" + (1 + 8) * (j + 1) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 2) + "=" + (1 + 6) * (j + 2) + "\t|\t" + (1 + 7) + "x" + (j + 2) + "=" + (1 + 7) * (j + 2) + "\t|\t" + (1 + 8) + "x" + (j + 2) + "=" + (1 + 8) * (j + 2) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 3) + "=" + (1 + 6) * (j + 3) + "\t|\t" + (1 + 7) + "x" + (j + 3) + "=" + (1 + 7) * (j + 3) + "\t|\t" + (1 + 8) + "x" + (j + 3) + "=" + (1 + 8) * (j + 3) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 4) + "=" + (1 + 6) * (j + 4) + "\t|\t" + (1 + 7) + "x" + (j + 4) + "=" + (1 + 7) * (j + 4) + "\t|\t" + (1 + 8) + "x" + (j + 4) + "=" + (1 + 8) * (j + 4) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 5) + "=" + (1 + 6) * (j + 5) + "\t|\t" + (1 + 7) + "x" + (j + 5) + "=" + (1 + 7) * (j + 5) + "\t|\t" + (1 + 8) + "x" + (j + 5) + "=" + (1 + 8) * (j + 5) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 6) + "=" + (1 + 6) * (j + 6) + "\t|\t" + (1 + 7) + "x" + (j + 6) + "=" + (1 + 7) * (j + 6) + "\t|\t" + (1 + 8) + "x" + (j + 6) + "=" + (1 + 8) * (j + 6) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 7) + "=" + (1 + 6) * (j + 7) + "\t|\t" + (1 + 7) + "x" + (j + 7) + "=" + (1 + 7) * (j + 7) + "\t|\t" + (1 + 8) + "x" + (j + 7) + "=" + (1 + 8) * (j + 7) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 8) + "=" + (1 + 6) * (j + 8) + "\t|\t" + (1 + 7) + "x" + (j + 8) + "=" + (1 + 7) * (j + 8) + "\t|\t" + (1 + 8) + "x" + (j + 8) + "=" + (1 + 8) * (j + 8) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 9) + "=" + (1 + 6) * (j + 9) + "\t|\t" + (1 + 7) + "x" + (j + 9) + "=" + (1 + 7) * (j + 9) + "\t|\t" + (1 + 8) + "x" + (j + 9) + "=" + (1 + 8) * (j + 9) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 10) + "=" + (1 + 6) * (j + 10) + "\t|\t" + (1 + 7) + "x" + (j + 10) + "=" + (1 + 7) * (j + 10) + "\t|\t" + (1 + 8) + "x" + (j + 10) + "=" + (1 + 8) * (j + 10) + "\t|\n" +
              "|\t" + (1 + 6) + "x" + (j + 11) + "=" + (1 + 6) * (j + 11) + "\t|\t" + (1 + 7) + "x" + (j + 11) + "=" + (1 + 7) * (j + 11) + "\t|\t" + (1 + 8) + "x" + (j + 11) + "=" + (1 + 8) * (j + 11) + "|\n");
      System.out.println("_____________________________________");
  }





    //Exercice 3
    /**
     * Création d'un tableau qui va contenir 3 nombres aléatoires compris entre 1 et 999
     * Effectuer une boucle for pour ajouter les données au tableau
     * Enfin afficher la moyenne de ces 3 nombres
     */
  void calculMoyenneAleatoire(){
      Integer[] tb= new Integer[3];
      for (int i=0;i<=tb.length-1;i++){
          tb[i]=(int)(Math.random()*1000);
      }
      System.out.println("\n Exercice 3 \n La moyenne des nombres "+tb[0]+","+tb[1]+","+tb[2]+" est égale à: "+(tb[0]+tb[1]+tb[2])/tb.length);
  }


}
