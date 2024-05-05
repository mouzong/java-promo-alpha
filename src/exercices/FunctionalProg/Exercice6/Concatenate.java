package exercices.FunctionalProg.Exercice6;

public class Concatenate implements StringConcatenator{
    @Override
    public String concatenate(String str1, String str2) {
        return str1+" "+str2;
    }
}
