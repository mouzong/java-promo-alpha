public class Exercices9 {
    public static void main(String[] args) {

        //Exercice 9 Ecrire un programme qui vérifie l'age d'un utilisateur et lui dit s'il est éligible au vote.
      if(args.length==1){

          int ageChoisi=Integer.parseInt(args[0]);
          final int ageLegal=20;
          if(ageChoisi>=ageLegal){
              System.out.println("Vous êtes éligible pour voter au Cameroun");
          }else{
              System.out.println("Vous n'êtes pas éligible pour voter au Cameroun, il vous reste "+(ageLegal-ageChoisi)+" ans.");
          }
      }else{
          System.out.println("Un seul paramètre est requis");
      }
  }

    }

