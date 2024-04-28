package formesGeometriques;

public class MainForme {
    public static void main(String[] args) {
        Forme cercle = new Cercle();
        Forme triangle = new Triangle();
        Forme rectangle = new Rectangle();
        Forme carre = new Carre();

        System.out.println("========== Calcul des surfaces ==============" );
        System.out.println(" La surface du cercle est " + cercle.calculerSurface());
        System.out.println(" La surface du triangle est " + triangle.calculerSurface());
        System.out.println(" La surface du rectangle est " + rectangle.calculerSurface());
        System.out.println(" La surface du carré est " + carre.calculerSurface());

//        Forme[] tab = new Forme[4];
//        tab[0] = new Cercle();
//        tab[1] = new Triangle();
//        tab[2] = new Rectangle();
//        tab[3] = new Carre();
//
//        for( Forme forme: tab){
//            System.out.println("\t\t\t" +forme.calculerSurface());
//        }

    }
}
