package functionalprog;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        convertUpperCase.accept("bonjour !");
        convertToUpperCaseAndMultiplyPrint.accept("Adacorps is Good !",5);
    }

    static Consumer<String> convertUpperCase = str -> System.out.println(str.toUpperCase());

    static BiConsumer<String, Integer> convertToUpperCaseAndMultiplyPrint =
            (str, x)->{
                for (int i=0; i<x; i++){
                    System.out.println(str.toUpperCase());
                }
            };
}
