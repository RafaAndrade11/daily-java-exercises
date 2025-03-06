/**Exercício 5: Desafio de Manipulação de Dados com Streams
 Objetivo: Aprimorar o uso de Streams API, filtragem, mapeamento e ordenação.

 Descrição:
 Você tem uma lista de funcionários, e cada funcionário tem:

 Nome
 Cargo
 Salário
 Idade

 Filtrar apenas os funcionários com salário maior que 3000.00.
 Ordenar por idade (do mais novo para o mais velho).
 Mapear apenas o nome e o cargo para exibir na tela.
 Exibir a lista final no console.
 **/

package Ex05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FuncionarioEx05 funcionario1 = new FuncionarioEx05("Marcelo", "Gerente", 5000, 29);
        FuncionarioEx05 funcionario2 = new FuncionarioEx05("Ricardo", "Estoquista", 2000, 23);
        FuncionarioEx05 funcionario3 = new FuncionarioEx05("João", "Dono", 10000, 43);
        FuncionarioEx05 funcionario4 = new FuncionarioEx05("Fernando", "Estoquista", 1800, 21);
        FuncionarioEx05 funcionario5 = new FuncionarioEx05("Junior", "Vendedor", 3000, 33);

        List<FuncionarioEx05> listaDeFuncionarios = Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4, funcionario5);

        List<FuncionarioEx05> listaResultado = listaDeFuncionarios.stream()
                .filter(func -> func.getSalario() > 3000)
                .sorted(Comparator.comparing(FuncionarioEx05::getNome))
                .toList();
        listaResultado.forEach(func -> System.out.printf("Nome: %s | Cargo: %s | Salário: %.2f | Idade: %d%n",
                func.getNome(), func.getCargo(), func.getSalario(), func.getIdade()));

    }
}
