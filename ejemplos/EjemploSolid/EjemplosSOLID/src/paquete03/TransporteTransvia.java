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
public class TransporteTransvia {
    private String cooperativaTransvia;
    private double tarifa;
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativaTransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
