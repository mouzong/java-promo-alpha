package functionalprog;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("Valeur de test");
        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.get());
    }
}
