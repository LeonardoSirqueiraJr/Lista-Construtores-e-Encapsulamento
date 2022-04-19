/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03.Carro;

/**
 *
 * @author Aluno
 */
public class CarroRevendedora {
    
    private String marca;
    private String modelo;
    private int ano;
    private float quilometragem;
    private float precoCompra;

    public CarroRev(int ano, String marca,String modelo,int quilometragem, double precoCompra){
        this.ano=ano;
        this.marca=marca;
        this.modelo=modelo;
        this.quilometragem=quilometragem;
        this.precoCompra=precoCompra;
    }
    
    public void CalcularDepreciacao() {
        
    }
    
    public void DataDeEntradaNoCatalogo() {
        
    }
    
    public void CalcularPrecoDeVenda(){
        
    }
    
    public void CalcularLucro(){
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
