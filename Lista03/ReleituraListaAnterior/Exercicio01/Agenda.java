package Lista03.ReleituraListaAnterior.Exercicio01;

public class Agenda {
    Contato[] listaContatos = new Contato[100];
    int k=0;
    void adicionarContato(Contato contato){

        for(int i=0;i< listaContatos.length;i++){
            if(listaContatos[i]==null){
                listaContatos[i]=contato;
                break;
            }
        }
    }
    void removerContato(Contato contato){
        for(int i=0;i< listaContatos.length;i++) {

            if(listaContatos[i]==contato){
                listaContatos[i]=null;
                break;
            }
        }

    }
    void imprimir(){
        for(int i=0;i< listaContatos.length;i++) {
            if(listaContatos[i]!=null){
                System.out.println("Nome: " + listaContatos[i].nome);
                System.out.println("Número: " + listaContatos[i].numero);
                System.out.println("E-mail: " + listaContatos[i].email);
            }

        }
    }
}
