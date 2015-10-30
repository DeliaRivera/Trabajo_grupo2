/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

/**
 *
 * @author Lourdes Zamora
 */
public abstract class Plan {
    
    protected String nombreCliente;
    protected int num;

    public Plan(String nombreCliente, int num) {
        this.nombreCliente = nombreCliente;
        this.num = num;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNum() {
        return num;
    }
/*
    (int mins,int msgs). Tiene una funcion imprimir que imprime los 2 atributos de la clase.
    
    */
    public abstract double pagoMensual(int mins,int msgs);
    
    public void print(){
    
        System.out.println("Nombre Cliente: "+nombreCliente+" numero: "+num);
    
        
    }
    
}
