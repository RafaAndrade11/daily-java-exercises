import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exercício 06 - Contando Palavras
 * Bora trabalhar com Streams e Collections!
 *
 * Crie uma lista de frases e conte quantas palavras têm mais de 4 letras.
 */

public class Ex06 {
    public static void main(String[] args) {
        List<String> listaDeFrases = Arrays.asList("bola", "abacate", "azul", "céu", "parelelepipedo");

        long quantidade = listaDeFrases.stream()
                .flatMap(frase -> Arrays.stream(frase.split("\\s+")))
                .filter(palavra -> palavra.length() > 4)
                .count();
        System.out.println("Tem " + quantidade + " palavras com mais de 4 letras");
    }
}
