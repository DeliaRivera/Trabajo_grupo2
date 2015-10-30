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
           return false;
            
        }
        return false;
    }
    
}
