import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercício 02: Manipulação de Strings e Streams
 * Descrição:
 * Crie um programa que receba uma lista de nomes e faça as seguintes operações utilizando Streams API:
 *
 * Filtrar apenas os nomes que começam com a letra "R".
 * Converter todos os nomes para letras maiúsculas.
 * Ordenar os nomes em ordem alfabética.
 * Exibir a quantidade total de nomes na lista que passaram pelo filtro.
 * Imprimir a lista final no console.
 */

public class Ex02 {
    public static void main(String[] args) {
        List<String> listaDeNomes = Arrays.asList("Rafael", "João", "Ricardo", "Maria", "Pedro");

        List<String> nomesFiltrados = listaDeNomes.stream()
                .filter(nome -> nome.startsWith("R"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println("Total de nomes filtrados: " + nomesFiltrados.size());
        System.out.println(nomesFiltrados);
    }
}

/**
 * Neste exercício, foi inserido alguns nomes em uma lista e com o uso de Streams foram feitos os filtros necessários
 * para executar o pedido ao exercício. Essa abordagem é uma das melhores em termos de desempenho e legibilidade do
 * código para manipulação de dados, principalmente quando estamos lidando com coleções imutáveis e operações que podem
 * ser feitas de forma paralela ou sequencial.
 */
