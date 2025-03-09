package Ex07;

import java.util.*;

/**
 * Desafio:
 * <p>
 * Você tem uma lista de notas de alunos (de 0 a 10).
 * Filtre apenas as notas maiores ou iguais a 7 (aprovados).
 * Ordene essas notas de forma decrescente.
 * Pegue apenas as três maiores notas.
 * Imprima o resultado de forma organizada.
 */

public class Main {
    public static void main(String[] args) {
        List<AlunoEx07> listaDeAlunosENotas = Arrays.asList(
                new AlunoEx07("Lucas", 8.5f),
                new AlunoEx07("Mariana", 6.2f),
                new AlunoEx07("Carlos", 9.1f),
                new AlunoEx07("Fernanda", 7.4f),
                new AlunoEx07("Gabriel", 5.8f),
                new AlunoEx07("Ana", 9.7f),
                new AlunoEx07("Ricardo", 4.3f),
                new AlunoEx07("Juliana", 7.9f),
                new AlunoEx07("Pedro", 3.5f),
                new AlunoEx07("Camila", 8.2f)
        );

        List<AlunoEx07> resultado = listaDeAlunosENotas.stream()
                .filter(a -> a.getNota() >= 7)
                .sorted(Comparator.comparing(AlunoEx07::getNota).reversed())
                .limit(3)
                .toList();

        System.out.println(resultado);
    }
}
