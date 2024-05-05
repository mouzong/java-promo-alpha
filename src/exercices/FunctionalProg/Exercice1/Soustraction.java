package exercices.FunctionalProg.Exercice1;

public class Soustraction implements MathOperation {
    int result;

    public Soustraction(int result) {
        this.result = result;
    }

    @Override
    public int operate(int a, int b) {
       result=a-b;
        return result;
    }

    public Soustraction() {
    }
}
