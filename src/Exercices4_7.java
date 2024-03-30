public class Exercices4_7 {
    public static void main(String[] args) {

        if(args.length==2){
            int i=Integer.parseInt(args[0]);  //conversion de l'argument 1 en nombre entier
            int j=Integer.parseInt(args[1]);  //conversion de l'argument 2 en nombre entier

            //Exercice 4 Écrire un programme Java qui prend deux nombres entiers prédéfinis, les additionne, puis affiche le résultat de l'addition dans la console.
            System.out.println("\n Exercice 4 \n Le resultat de l'addition entre "+i+" et "+j+" est égal à "+(i+j));

            //Exercice 5 Écrire un programme Java qui prend deux nombres entiers prédéfinis, les soustrait, puis affiche le résultat de la soustraction dans la console.
            System.out.println("\n Exercice 5 \n Le resultat de la soustraction entre "+i+" et "+j+" est égal à "+(i-j));


            //Exercice 6 Écrire un programme Java qui prend deux nombres entiers prédéfinis, les multiplie, puis affiche le résultat de la multiplication dans la console.
            System.out.println("\n Exercice 6 \n Le resultat de la multiplication entre "+i+" et "+j+" est égal à "+(i*j));


            //Exercice 7 Écrire un programme Java qui prend deux nombres entiers prédéfinis, les multiplie, puis affiche le résultat de la multiplication dans la console.
            if(j!=0){ //Vérification du 2ième nombre pour se rassurer qu'il est différent de 0
                System.out.println("\n Exercice 7 \n Le resultat de la division entre "+i+" et "+j+" est égal à "+(i/j));
            }else{
                System.out.println("\n Exercice 7 \n Impossible de diviser un nombre par 0");
            }

        }else{
            System.out.println("Vous avez renseigné "+args.length+" nombres au lieu de 2 nombres comme décrit dans l'exercice");
        }




    }
}
