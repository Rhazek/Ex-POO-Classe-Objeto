//ALunos: Matheus Rhazek, Clarissa Camurça e Anna Carolynna

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos alunos você deseja adicionar na Turma?");
        int numAlunos = Integer.parseInt(scan.nextLine());

        Aluno[] meusAlunos = new Aluno[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println(String.format("Digite o nome do aluno %d", i+1));
            String nome = scan.nextLine();

            System.out.println(String.format("Digite a matrícula do aluno %d", i+1));
            String matricula = scan.nextLine();

            System.out.println(String.format("Digite a idade do aluno %d", i+1));
            int idade = Integer.parseInt(scan.nextLine());

            meusAlunos[i] = new Aluno(nome, matricula, idade);
        }

        for (int i = 0; i < numAlunos; i++) {
            System.out.printf("""
                    *********ALUNO %d*********
                    Nome: %s.
                    Matrícula: %s.
                    Idade: %s.
                    %n""", i + 1, meusAlunos[i].nome, meusAlunos[i].matricula, meusAlunos[i].idade);
        }
    }
}
