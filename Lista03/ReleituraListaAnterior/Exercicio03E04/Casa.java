package Lista03.ReleituraListaAnterior.Exercicio03E04;

public class Casa {
    String cor;
    Porta[] listaPortas=new Porta[3];

    Casa(String cor){
        this.cor=cor;
    }
    public static void main(String[] args){


    }
    void quantasPortasEstaoAbertas(){
        int a = 0;
        for(int i=0;i< listaPortas.length;i++){
            if(this.listaPortas[i].estado){
                a++;
            }
        }
        System.out.println(a +" porta(s) estao abertas");
    }
}
