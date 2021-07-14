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
    public class TransporteMaritimo extends Transporte {

    private String aereo;

    public void establecerTransporteMaritimo(String a) {
        aereo = a;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.70 + (0.12 * 0.13);
    }

    public String obtenerTrasporteMaritimo() {
        return aereo;
    }
}
