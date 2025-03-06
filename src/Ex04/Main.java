/**
 * Crie um programa onde você tenha uma lista de produtos, cada produto com:
 *
 * Nome
 * Categoria
 * Preço
 * Utilize Streams API para:
 *
 * Filtrar apenas produtos com preço maior que 50.00
 * Agrupar os produtos por Categoria
 * Somar os preços de cada categoria
 * Exibir o resultado agrupado e somado por categoria
 */

package Ex04;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ProdutoEx04 produto1 = new ProdutoEx04("Camiseta", "Vestuário", 80.00);
        ProdutoEx04 produto2 = new ProdutoEx04("Notebook", "Eletrônico", 3500.00);
        ProdutoEx04 produto3 = new ProdutoEx04("Tênis", "Vestuário", 200.00);
        ProdutoEx04 produto4 = new ProdutoEx04("Mouse", "Eletrônico", 40.00);
        ProdutoEx04 produto5 = new ProdutoEx04("Chinelo", "Vestuário", 35.00);

        List<ProdutoEx04> listaDeProdutos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);

        Map<String, Double> resultado = listaDeProdutos.stream()
                .filter(produto -> produto.getPreco() > 50)
                .collect(Collectors.groupingBy(ProdutoEx04::getCategoria,
                        Collectors.summingDouble(ProdutoEx04::getPreco)));

        resultado.forEach((categoria, soma) ->
                System.out.println(categoria + ": R$ " + soma));

    }
}
