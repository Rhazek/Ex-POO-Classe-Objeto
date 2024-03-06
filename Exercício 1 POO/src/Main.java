//ALunos: Matheus Rhazek, Clarissa Camurça e Anna Carolynna

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos livros você deseja adicionar na Biblioteca?");
        int numLivros = Integer.parseInt(scan.nextLine());

        Livro[] meusLivros = new Livro[numLivros];

        for (int i = 0; i < numLivros; i++) {
            System.out.println(String.format("Digite o título do livro %d", i+1));
            String titulo = scan.nextLine();


            System.out.println(String.format("Digite a editora do livro %d", i+1));
            String editora = scan.nextLine();

            System.out.println(String.format("Digite o autor do livro %d", i+1));
            String autor = scan.nextLine();

            meusLivros[i] = new Livro(titulo, editora, autor);
        }

        for (int i = 0; i < numLivros; i++) {
            System.out.printf("""
                    *********LIVRO %d*********
                    Título: %s.
                    Editora: %s.
                    Autor: %s.
                    %n""", i + 1, meusLivros[i].titulo, meusLivros[i].editora, meusLivros[i].autor);
        }
    }
}