package Lista03.ReleituraListaAnterior.Exercicio02;

public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void imprimir(){
        System.out.println(nome);
        System.out.println(idade);

    }
    public void aniversario(){

        idade =++;
    }
}
