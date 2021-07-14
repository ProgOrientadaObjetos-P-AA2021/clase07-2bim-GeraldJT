/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author USUARIO PC
 */
public class TransporteMaritimo {
    private String cooperativaMaritima;
    private double tarifa;
    
    public void establecerCooperativaMaritima(String n){
        cooperativaMaritima = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerCooperativaMaritima(){
        return cooperativaMaritima;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
