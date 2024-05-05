package exercices.FunctionalProg.Exercice1;

public class Addition implements MathOperation {

int result;

    public Addition(int result) {
        this.result = result;
    }

    @Override
    public int operate(int a, int b) {
        result=a+b;
        return result;
    }

    public Addition() {
    }
}
