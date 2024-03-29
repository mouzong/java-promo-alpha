public class Exercices4_7 {
    public static void main(String[] args) {
     Exercice executionExercice1=new Exercice();
      if(args.length==2){
          int i=Integer.parseInt(args[0]);  //conversion de l'argument 1 en nombre entier
          int j=Integer.parseInt(args[1]);  //conversion de l'argument 2 en nombre entier
          executionExercice1.additionNbre(i,j); //exercice 4
          executionExercice1.soustractionNbre(i,j); //exercice 5
          executionExercice1.multiplicationNbre(i,j); //exercice 6
          /**
           * Condition pour éviter la division par 0 qui causera une erreur
           */
          if(j!=0){
              executionExercice1.divisionNbre(i,j);//exercice 7
          }else{
              System.out.println("\n Impossible de diviser un nombre par 0");
          }

      }else{
          System.out.println("Vous avez renseigné "+args.length+" nombres au lieu de 2 nombres comme décrit dans l'exercice");
      }
    }
}

class Exercice{
    //Exercice 4
    /**
     * Définir 2 nombres;
     * Afficher le résultat de l'addition
     */
    void additionNbre(int x, int y){

        System.out.println("\n Exercice 4 \n Le resultat de l'addition entre "+x+" et "+y+" est égal à "+(x+y));
    }

    //Exercice 5
    /**
     * Définir 2 nombres;
     * Afficher le résultat de la soustraction
     */
    void soustractionNbre(int x, int y){

        System.out.println("\n Exercice 5 \n Le resultat de la soustraction entre "+x+" et "+y+" est égal à "+(x-y));
    }

    void multiplicationNbre(int x, int y){

        System.out.println("\n Exercice 6 \n Le resultat de la multiplication entre "+x+" et "+y+" est égal à "+(x*y));
    }

    void divisionNbre(int x, int y){

        System.out.println("\n Exercice 7 \n Le resultat de la division entre "+x+" et "+y+" est égal à "+(x/y));
    }

}
