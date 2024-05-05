package exercices.FunctionalProg.Exercice1;

public class Multiplication implements MathOperation {
    int result;

    public Multiplication(int result) {
        this.result = result;
    }

    @Override
    public int operate(int a, int b) {
        result=a*b;
        return result;
    }

    public Multiplication() {
    }
}
