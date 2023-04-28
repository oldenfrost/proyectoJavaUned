/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import static Interface.Historial.historialCalculados;
import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class CSalarios {
//CONSTRUCTORES
    public CSalarios() {

    }

    public CSalarios(int id, String nombreCompleto, String puesto, double salarioCalcular, double salarioNeto, double rebajos) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.salarioCalcular = salarioCalcular;

        this.salarioNeto = salarioNeto;
        this.rebajos = rebajos;

    }

    // calcula porcentajes de los rebajos
    public void calculoPorcentajes(double salarioCalcular) {
        seguroSocial = salarioCalcular * 0.055;
        coutaPension = salarioCalcular * 0.0417;
        ahorroBanco = salarioCalcular * 0.01;
    }

    // metodo que determina si hay que rebajar el impuesto de renta
    public void ImpuestoRenta(Double salarioCalcular) {

        double excedente = salarioCalcular;
        if (excedente > 941000) {
            if (excedente > 4845000) {
                excedente = salarioCalcular - 4845000;
                impuestoSobreRenta += (excedente * 0.25);
                excedente = 4845000;

            }
            if (excedente > 2423000) {

                excedente = excedente - 2423000;
                impuestoSobreRenta += (excedente * 0.20);
                excedente = 2423000;

            }

            if (excedente > 1381000) {
                excedente = excedente - 1381000;
                impuestoSobreRenta += (excedente * 0.15);
                excedente = 1381000;

            }
            if (excedente > 941000) {
                excedente = excedente - 941000;

                impuestoSobreRenta += (excedente * 0.10);
            }

        }

    }
    //calcula los rebajos y el salario neto

    public void SalarioNeto(double salarioCalcular) {
        rebajos = seguroSocial + coutaPension + ahorroBanco + impuestoSobreRenta;
        salarioNeto = salarioCalcular - rebajos;

    }

    public void SalarioMayor() {

        salarioMayor = historialCalculados.get(0).getSalarioNeto();
        for (int i = 0; i < historialCalculados.size(); i++) {

            if (salarioMayor < historialCalculados.get(i).getSalarioNeto()) {
                salarioMayor = historialCalculados.get(i).getSalarioNeto();
            }

        }
    }

    public void SalarioMenor() {

        salarioMenor = historialCalculados.get(0).getSalarioNeto();
        for (int i = 0; i < historialCalculados.size(); i++) {

            if (salarioMenor > historialCalculados.get(i).getSalarioNeto()) {
                salarioMenor = historialCalculados.get(i).getSalarioNeto();
            }

        }
    }

    public void Promedio() {
        int cantidad = 0;
        for (int i = 0; i < historialCalculados.size(); i++) {

            this.promedio += historialCalculados.get(i).getSalarioNeto();
            cantidad++;

        }

        promedio = promedio / cantidad;
    }

    public void sumaSalarios() {
        for (int i = 0; i < historialCalculados.size(); i++) {
            this.sumaTotalSalarios += historialCalculados.get(i).getSalarioNeto();
        }

    }

    public void sumaReducciones() {
        for (int i = 0; i < historialCalculados.size(); i++) {
            this.sumaTotalDeducciones += historialCalculados.get(i).getRebajos();
        }

    }

    /**
     * ******************************************************************************************
     */
    //METODOS GET
    public double getSalarioBruto() {
        return this.salarioCalcular;
    }

    public double getSeguroSocial() {
        return seguroSocial;
    }

    public double getCoutaPension() {
        return coutaPension;
    }

    public double getBancoPopular() {
        return ahorroBanco;
    }

    public double getImpuestoRenta() {
        return impuestoSobreRenta;
    }

    public double getSolidarista() {
        return asociacionS;
    }

    public double getCooperativa() {
        return cooperativa;
    }

    public double getAhorroNavidad() {
        return ahorroNavidad;
    }

    public double getOtrosRebajos() {
        return otrosRebajos;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public double getRebajos() {
        return rebajos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombreCompleto;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalarioMayor() {
        return salarioMayor;
    }

    public double getSalarioMenor() {
        return salarioMenor;
    }

    public double getPromedio() {
        return promedio;
    }

    public double getSumaSalario() {
        return sumaTotalSalarios;
    }

    public double getSumaReducciones() {
        return sumaTotalDeducciones;
    }

    // atributos 
    protected int id;
    protected String nombreCompleto;
    protected String puesto;
    protected double salarioCalcular;
    protected double ahorroNavidad;
    protected double otrosRebajos;
    protected double asociacionS;
    protected double cooperativa;
    protected double seguroSocial;
    protected double coutaPension;
    protected double ahorroBanco;
    protected double impuestoSobreRenta;
    protected double rebajos;
    protected double salarioNeto;
    protected double salarioMayor;
    protected double salarioMenor;
    protected double promedio;
    protected double sumaTotalSalarios;
    protected double sumaTotalDeducciones;
    protected ArrayList<CSalarios> planilla = new ArrayList<CSalarios>();
    protected ArrayList<CSalarioDeduccionesVoluntarias> historial = new ArrayList<CSalarioDeduccionesVoluntarias>();

}
