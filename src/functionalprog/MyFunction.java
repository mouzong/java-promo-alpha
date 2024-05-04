package functionalprog;

@FunctionalInterface
public interface MyFunction<T,R> {
    R apply(T t);
}
