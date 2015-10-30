/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.util.ArrayList;

/**
 *
 * @author Lourdes Zamora
 */
public class Tigo {
    protected ArrayList<Plan> planes;
    
    public void addPlan(int numtel,String nombre,String extra,String tipo){
        
        if(!this.busqueda(numtel,extra,tipo)){
        
           if(tipo.equalsIgnoreCase("IPHONE")){
        
            planes.add(new PlanIphone(nombre,numtel,extra));
            }
            else{
        
            planes.add(new PlanBlackBerry(nombre,numtel,extra));
        
            }
        
        
        }
    
    
    }

    public boolean busqueda(int numtel, String extra, String tipo){
        
        for(Plan bu: planes){
            
           if(bu instanceof PlanIphone){
           
              if(bu.getNum()==numtel)
                  return true;
              if(((PlanIphone)bu).getItunes_email().equalsIgnoreCase(extra)){
                  return true;
              
              }
           }
           else{
           
               if(bu.getNum()==numtel)
                  return true;
               if(((PlanBlackBerry)bu).getPin().equalsIgnoreCase(extra)){
                  return true;
              
              }
           
           }
           
            
        }
        return false;
    }
    
    /*
    
    c.	double pagoPlan(int numTel, int mins,int msgs).
    Se busca el tel y si existe se retorna el pagoMensual de ese plan. (10%)
    
    */
    
    public double pagoPlan(int numTel,int mins,int msgs){
    
         for(Plan bu: planes){
            
           if(bu instanceof PlanIphone){
           
              if(bu.getNum()==numTel)
                  return bu.pagoMensual(mins, msgs);
            
           }
           else{
           
               if(bu.getNum()==numTel)
                  return bu.pagoMensual(mins, msgs);
           
           }
        
        }
         return 0;
        
        
    
    }
    
    /*
    
    d.	void addAmigo(int numTel, String pin).
    Busca el teléfono con ese número, 
    si lo encuentra se asegura que es PlanBlackberry
    y si lo es agrega el pin a su arreglo de amigos del bbm. (15%)
    
    */
    
    public void addAmigo(int numTel,String pin){
   
        for(Plan bu: planes){

      
             if(bu.getNum()==numTel){
                 
                 if(bu instanceof PlanBlackBerry){
                 
                     ((PlanBlackBerry)bu).addPinAmigo(pin);
                 }
                 else{
                 
                    System.out.println("No es un BlackBerry");
                    return; 
                 
                 }
                     
             }
             System.out.println("No se encontro el numero");
             
        
        }
                
             

        
    }
    
    
    /*
    
    e.	void list(). Función que imprime el listado de planes agregados.
    Y un total final de cuantos son Blackberry y cuantos Iphone 
    (Sin contadores como atributo en la clase). (15%)
    
    */
    
    public void list(){
    
        int plani=0,planb=0;
        for(Plan pl:planes){
        
            if(pl instanceof PlanBlackBerry){
               
                planb++;
            }
            if(pl instanceof PlanIphone){

                planb++;
            }
            pl.print();
            
            
        
        }
        
        
        System.out.println("Total Iphones: "+plani+" Total BlackBerry: "+planb);
    
    }
    
}
