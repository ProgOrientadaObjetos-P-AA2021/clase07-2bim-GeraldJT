/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author USUARIO PC
 */
    public class TransporteTransvia extends Transporte {

    private String transvia;

    public void establecerTransporteTransvia(String a) {
        transvia = a;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.98 + (0.14 * 0.25)/2;
    }

    public String obtenerTrasporteTransvia() {
        return transvia;
    }
}
