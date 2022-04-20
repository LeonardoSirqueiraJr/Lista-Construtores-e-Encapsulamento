package Lista03.ReleituraListaAnterior.Exercicio01;

public class Main {
    public static void main(String[] args){

        Contato contato1=new Contato("21987902306","leonardo","leonardo@gmail.com");
        Contato contato2=new Contato("21920027410","junior","junior@yahoo.com.br");
        Agenda agenda1=new Agenda();

        agenda1.adicionarContato(contato1);
        agenda1.imprimir();
        System.out.println();

        agenda1.adicionarContato(contato2);
        agenda1.imprimir();
        System.out.println();

        agenda1.removerContato(contato1);
        agenda1.imprimir();

    }
}
