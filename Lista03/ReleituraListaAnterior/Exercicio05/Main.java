package Lista03.ReleituraListaAnterior.Exercicio05;

public class Main {
    public static void main(String[] args){
        Televisao t1=new Televisao(53,4,false,false);

        t1.imprimir();

        t1.ligarDesligar();
        t1.mudarCanal();
        t1.muteTV();

        t1.imprimir();

        t1.ligarDesligar();
        t1.mudarCanal();
        t1.muteTV();

        t1.imprimir();

        if(t1.estado){
            System.out.println("Esta ligada.");
        }
        else{
            System.out.println("Esta desligada.");
        }
    }
}
