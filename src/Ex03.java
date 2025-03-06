import java.util.List;

/**
 * Exercício 3 - Contagem de Palavras Únicas
 * Crie um programa que receba uma String de texto (pode ser uma frase qualquer) e utilize a Streams API para contar
 * quantas palavras únicas existem na frase, ignorando letras maiúsculas e minúsculas.
 */

public class Ex03 {
    public static void main(String[] args) {
        String texto = "Pode ser uma frase qualquer";

        List<String> textoSeparado = List.of(texto.split(" "));

        long palavrasUnicas = textoSeparado.stream()
                .count();

        System.out.println("Quantidade de palavras únicas: " + palavrasUnicas);
    }
}
