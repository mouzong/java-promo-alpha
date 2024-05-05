package exercices.FunctionalProg.Exercice1;

public class Division implements MathOperation {
  int result;

    public Division(int result) {
        this.result = result;
    }

    @Override
    public int operate(int a, int b) throws ArithmeticException{
        try{
            result=  a/b;
        }catch(Exception e){
            throw new ArithmeticException(e.getMessage());
        }
        return result;
    }

    public Division() {
    }
}
