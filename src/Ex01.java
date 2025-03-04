import java.util.Scanner;

/**
 * 📝 EXERCÍCIO 1 - Manipulação de Strings
 * 📌 Tema: Strings, Loops e Condicionais
 * 🎯 Objetivo: Reverter uma String e dizer se ela é um palíndromo (ex: "arara" ou "ovo").
 * <p>
 * Regras:
 * Receba uma palavra pelo Scanner.
 * Reverta a palavra.
 * Diga se ela é ou não um palíndromo.
 */

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.next().toLowerCase();

        if(isPalindromo(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        entrada.close();
    }

    private static boolean isPalindromo(String palavra) {
        char[] letras = palavra.toCharArray();

        int inicio = 0;
        int fim = letras.length - 1;

        while(inicio < fim) {
            if(letras[inicio] != letras[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}


/**
 * Linha de raciocínio:
 * O uso de char[] faz com que eu trabalhe direto na memória, sem alocar novos objetos. Isso otimiza minha performance
 * e faz com que eu aumente meu desempenho evitando o uso do garbage collector.
 * Outras formas de fazer seria com o string builder e com a própria concatenação de strings (performances reduzidas).
 */