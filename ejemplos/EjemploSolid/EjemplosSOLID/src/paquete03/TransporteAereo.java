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
public class TransporteAereo {
    private String cooperativaAerea;
    private double tarifa;
    
    public void establecerCooperativaAerea(String n){
        cooperativaAerea = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerCooperativaAerea(){
        return cooperativaAerea;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
