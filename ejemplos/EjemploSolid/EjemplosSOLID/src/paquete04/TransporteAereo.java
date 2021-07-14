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
    public class TransporteAereo extends Transporte {

    private String aereo;

    public void establecerTransporteAereo(String a) {
        aereo = a;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.89 + (0.80 * 0.8);
    }

    public String obtenerTrasporteAereo() {
        return aereo;
    }
}
