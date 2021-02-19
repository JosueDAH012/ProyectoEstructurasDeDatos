/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Colas.Cola;

/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar Jmenez
 */
public class Factura {//clase factura 
//variables de la factura private

    private String nFac;//variable nFactura Privada
    private String NombreClient;//variable NombreClient Privada
    private int CedulaClient;//variable cedulaClientPrivada
    private String Fecha;//variable fecha Privada
    private String Hora;//variable hora Privada
    private Cola cola;//variable cola Privada
    private int CantidadArt;//variable CantidadArt Privada
    private int SubTotal;//variable subtotal Privada
    private int impuesto;//variable impuesto Privada
    private int MontTotal;//variable MontTotal Privada
    private boolean nula;//variable nula Privada
//contructor factura 

    public Factura(String nFac, String NombreClient, int CedulaClient, String Fecha, String Hora, Cola cola,int CantidadArt, int SubTotal, int impuesto, int MontTotal, boolean nula) {
        this.nFac = nFac;
        this.NombreClient = NombreClient;
        this.CedulaClient = CedulaClient;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.cola = cola;
        this.CantidadArt = CantidadArt;
        this.SubTotal = SubTotal;
        this.impuesto = impuesto;
        this.MontTotal = MontTotal;
        this.nula = nula;
    }
//Getters and Setters
    public String getnFac() {
        return nFac;
    }

    public void setnFac(String nFac) {
        this.nFac = nFac;
    }

    public String getNombreClient() {
        return NombreClient;
    }

    public void setNombreClient(String NombreClient) {
        this.NombreClient = NombreClient;
    }

    public int getCedulaClient() {
        return CedulaClient;
    }

    public void setCedulaClient(int CedulaClient) {
        this.CedulaClient = CedulaClient;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getCantidadArt() {
        return CantidadArt;
    }

    public void setCantidadArt(int CantidadArt) {
        this.CantidadArt = CantidadArt;
    }

    public int getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(int SubTotal) {
        this.SubTotal = SubTotal;
    }

    public int getMontTotal() {
        return MontTotal;
    }

    public void setMontTotal(int MontTotal) {
        this.MontTotal = MontTotal;
    }

    public boolean isNula() {
        return nula;
    }

    public void setNula(boolean nula) {
        this.nula = nula;
    }

    public void CargaFactura() {

    }

    public String MostarData() {
        return "Factura " + nFac;
    }

    public String MostrarNumerador() {
        return nFac;
    }

    public Boolean RetornaNula() {
        return nula;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public String toString() {
        return "Número de Factura: " + nFac 
                + "\nNombreClient: " + NombreClient 
                + "\nCedulaClient: " + CedulaClient 
                + "\nFecha: " + Fecha 
                + "\nHora: " + Hora 
                + "\nArtículos: \n" + cola.toStringConCantidad()
                + "\nCantidadArt: " + CantidadArt 
                + "\nSubTotal: " + SubTotal 
                + "\nImpuesto: " + impuesto 
                + "\nMontTotal: " + MontTotal;
    }

}
