/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import static Interface.Historial.historialCalculados;
import static Interface.Planilla.planillasImpresas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class cEmpleado extends javax.swing.JOptionPane {
    //constructores
     public cEmpleado(){
     leerArchivo();
    }
    
    public cEmpleado(int id,String nombre, String apellido, int edad, String puesto, String fecha  ){
        this.id=id; 
        this.nombre=nombre; 
        this.apellido=apellido;
        this.edad=edad;
        this.puesto=puesto;
        this.fecha=fecha;

    }
    public cEmpleado(int id, String numeroPlanilla, int mesPlanilla, int anioPlanilla, double SalarioNetoPlanilla  ){
        this.id=id; 
        this.numeroPlanilla=numeroPlanilla; 
        this.mesPlanilla=mesPlanilla;
        this.SalarioNetoPlanilla=SalarioNetoPlanilla;
        this.anioPlanilla=anioPlanilla;
    }
    //metodos
    /*public String darDatos(){
        return "El id:"+id+"  nombre:"+nombre+ "  apellido:"+apellido+"  edad:"+edad+"  puesto:"+puesto+"  fecha"+fecha;
    }*/
    // METODOS GET
    public int getId(){
        return id; 
    }
    public String getNombre(){
        return nombre; 
    }
    public String getApellido(){
        return apellido; 
    }
    public int getEdad(){
        return edad; 
    }
    public String getPuesto(){
        return puesto; 
    }
    public String getFecha(){
        return fecha; 
    }
    public String getPlanilla(){
        return numeroPlanilla;
    }
    public int getMesPlanilla(){
        return mesPlanilla;
    }
    public int getAnioPlanilla(){
        return anioPlanilla;
    }
    public double getSalarioNetoPlanilla(){
        return  SalarioNetoPlanilla;
    }

    //METODO QUE INGRESA DATOS
    public void IngresaUsuarios (int id, String nombre, String apellido, int edad, String puesto, String fecha){
    empleado=new cEmpleado (id, nombre, apellido, edad, puesto, fecha);
    ListaEmpleados.add(empleado);
    
    escribirArchivo(ListaEmpleados);


}
    //METODOS MODIFICAR ARRAY
    public ArrayList<cEmpleado> modificarArrayList( int idAntiguo,int idNuevo, String nombre, String apellido, int edad, String puesto, String fecha, boolean registro){
        int indice=0;
    for(int i=0; i<ListaEmpleados.size();i++){
            if(ListaEmpleados.get(i).getId()==idAntiguo&&registro){
              indice=i;
              System.out.print("entra aqui");
              break; 
            }
            else if(ListaEmpleados.get(i).getId()==idAntiguo&&!registro){
               indice=i;
              ListaEmpleados.set(indice, new cEmpleado(idNuevo, nombre, apellido,edad, puesto, fecha));  
              break; 
            }
         
        }

           ListaEmpleados.set(indice, new cEmpleado(idNuevo, nombre, apellido,edad, puesto, fecha));  
    return ListaEmpleados;
}
    
     

    //METODOS BORRAR ARRAYLIST
     public ArrayList<cEmpleado> borrarArrayList(int id){
        for(int i=0; i<ListaEmpleados.size();i++){
            if(ListaEmpleados.get(i).getId()==id){
                ListaEmpleados.remove(i);
               
            }
    }
        return ListaEmpleados;
    }
    //METODOS ESCRIBIRARCHIVO
      public void escribirArchivo(ArrayList<cEmpleado> lista){
         
        try{
            FileWriter fileWriter=new FileWriter("empleados.txt");
            PrintWriter printWriter=new PrintWriter(fileWriter);// imprime con formato de objetos
            for(cEmpleado empleado:lista){
                printWriter.println(empleado.getId()+","+ empleado.getNombre()+","+ empleado.getApellido()+","+empleado.getEdad()+","+empleado.getPuesto()+","+empleado.getFecha());
            }
            printWriter.close();
     
          
            
            
            
        } catch(IOException e){
           JOptionPane.showMessageDialog(this, "ERRO NO SE HA PODIDO CREAR EL ARCHIVO ", "ERROR", JOptionPane.ERROR_MESSAGE);    
        }
    
    }
    //METODOS ESCRIBIRARCHIVO 
    public void leerArchivo() {

        try{
            File archivo=new File("empleados.txt");
            Scanner scanner=new Scanner(archivo);
            while(scanner.hasNextLine()){
                String linea=scanner.nextLine();
                String[] datos=linea.split(",");
                int id=Integer.parseInt(datos[0]);
                String nombre=datos[1];
                String apellido=datos[2];
                int edad=Integer.parseInt(datos[3]);
                String puesto=datos[4];
                String fecha=datos[5];
                cEmpleado empleado=new  cEmpleado(id, nombre, apellido, edad, puesto, fecha);
                ListaEmpleados.add(empleado);
                //Calculadora.ListaEmpleados.add(empleado);  
            }
            
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(this, "ERRO NO SE HA ENCONTRADO EL ARCHIVO POR FAVOR INGRESE UN PRIMER DATO ", "ERROR", JOptionPane.ERROR_MESSAGE);    
        }
  
    }
    //METODOS INGRESAR PLANILLAS
    public void IngresarPlanillas (int id, String numeroPlanilla, int mesPlanilla, int anioPlanilla, double SalarioNetoPlanilla){
    empleado=new cEmpleado (id, numeroPlanilla, mesPlanilla, anioPlanilla, SalarioNetoPlanilla);
    planillasImpresas.add(empleado);
}
    
   
    // RETORNA EL ARRAYLIST
    public ArrayList<cEmpleado> getArrayList(){
        return ListaEmpleados;
    }

    // atributos 
    private int id, edad, mesPlanilla, anioPlanilla;; 
    private String nombre, apellido, puesto, numeroPlanilla;
    private double SalarioNetoPlanilla;
    private String fecha; 
    private ArrayList<cEmpleado> ListaEmpleados = new ArrayList<cEmpleado>();
    private cEmpleado empleado;
  
    
}
