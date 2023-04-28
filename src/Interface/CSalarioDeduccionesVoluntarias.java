/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import static Interface.Historial.historialCalculados;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class CSalarioDeduccionesVoluntarias extends CSalarios {

    // constructores
    public CSalarioDeduccionesVoluntarias() {

    }

    public CSalarioDeduccionesVoluntarias(int id, String nombreCompleto, String puesto, double salarioCalcular, double salarioNeto, double rebajos) {
        super(id, nombreCompleto, puesto, salarioCalcular, salarioNeto, rebajos);

    }

    /**
     * **************************************************************************************************************************************************
     */
    //metodos
    //LLENADO DE ARRAY
    public void llenadoArrayList(int id, String nombreCompleto, String puesto, double salarioCalcular, double ahorraNavidad, double otrosRebajos, boolean check1, boolean check2) {

        calculoPorcentajes(salarioCalcular, ahorraNavidad, otrosRebajos, check1, check2);
        ImpuestoRenta(salarioCalcular);
        SalarioNeto(salarioCalcular);
        historialCalculados.add(new CSalarioDeduccionesVoluntarias(id, nombreCompleto, puesto, salarioCalcular, this.salarioNeto, this.rebajos));

    }
//CALCULAR PORCENTAJES

    public void calculoPorcentajes(double salarioCalcular, double ahorroNavidad, double otrosRebajos, boolean check1, boolean check2) {
        seguroSocial = salarioCalcular * 0.055;
        coutaPension = salarioCalcular * 0.0417;
        ahorroBanco = salarioCalcular * 0.01;
        this.ahorroNavidad = salarioCalcular * (ahorroNavidad / 100);
        this.otrosRebajos = otrosRebajos;
        if (check1) {
            asociacionS = salarioCalcular * 0.03;
        } else {
            asociacionS = 0.0;
        }
        if (check2) {
            cooperativa = salarioCalcular * 0.01;
        } else {
            cooperativa = 0.0;
        }
    }

    // METODO SALARIONETO LO SOBREESCRIBE AL METODO PADRE
    public void SalarioNeto(double salarioCalcular) {
        rebajos = seguroSocial + coutaPension + ahorroBanco + impuestoSobreRenta + ahorroNavidad + otrosRebajos + asociacionS + cooperativa;
        salarioNeto = salarioCalcular - rebajos;
    }
//ATRIBUTOS
    private CSalarioDeduccionesVoluntarias historial;
    private ArrayList<CSalarioDeduccionesVoluntarias> historialCalculadora = new ArrayList<CSalarioDeduccionesVoluntarias>();

}
