package atividade_livro;

public class Livro {
    String titulo = " ";
    String autor = " ";
    String anoDePublicacao = " ";

    public void publicacaoLivro(){
        System.out.println("O autor do livro é: " + this.autor);
        System.out.println("O título do livro é: " + this.titulo);
    }

}
