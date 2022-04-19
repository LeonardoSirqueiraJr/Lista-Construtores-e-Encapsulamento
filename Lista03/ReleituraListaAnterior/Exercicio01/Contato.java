package Lista03.ReleituraListaAnterior.Exercicio01;

public class Contato {

    String numero;
    String nome;
    String email;

    Contato(String numero, String nome, String email){
        this.numero = numero;
        this.nome = nome;
        this.email = email;

    }

    public void imprimir(){
        System.out.println("Nome: "+ nome);
        System.out.println("Número: "+ numero);
        System.out.println("E-mail: "+ email);
        System.out.println();
    }



}
