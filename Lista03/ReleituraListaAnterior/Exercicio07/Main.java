package Lista03.ReleituraListaAnterior.Exercicio07;

public class Main {
    public static void main(String[] args){
        Pedido p1=new Pedido("cheque");

        p1.item[0]=new Produto("alimento",1.99,10);
        p1.item[1]=new Produto();
        p1.imprimir();
    }
}
