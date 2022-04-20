package Lista03.Data;

public class Data {
    private int dia;
    private int mes;
    private String mesS;
    private int ano;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    Data(int dia, String mes, int ano){
        this.dia = dia;
        this.mesS = mes;
        this.ano = ano;
    }
    public void imprimir1(){
        System.out.printf("%02d/%02d/%d\n",dia,mes,ano);
    }
    public void imprimir2(){
        System.out.printf("%s %02d, %d\n",mes,dia,ano);
    }
    public void imprimir3(){
        System.out.printf("%02d %d\n",dia,ano);
    }
}
