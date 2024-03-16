package atividade_livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomeAutor = " ";
        String tituloLivro = " ";
        String anoPublicacao = " ";

        System.out.print("Digite o nome do autor do livro: ");
        nomeAutor = leia.nextLine();
        System.out.print("Digite o nome do título do livro: ");
        tituloLivro = leia.nextLine();
        System.out.println("Digite o ano de publicação do livro: ");
        anoPublicacao = leia.nextLine();

        Livro livro1 = new Livro();
        livro1.autor = nomeAutor;
        livro1.titulo = tituloLivro;

        livro1.publicacaoLivro();

    }
}
