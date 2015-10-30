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
public class PlanBlackBerry extends Plan {
    protected String pin;
    protected ArrayList<String> bbm;

    public PlanBlackBerry(String nombreCliente, int num,String pin) {
        super(nombreCliente, num);
        this.pin=pin;
        bbm=new ArrayList<String>();
    }

    public String getPin() {
        return pin;
    }

    
    public void addPinAmigo(String pin){
    boolean ver= true;
        for(String pi:bbm){
        
            if(pi.equals(pin)){
            
                ver=false;
                break;
            }
        
        }
        
        if(ver){
        
        bbm.add(pin);
        }
        else{
        
            System.out.println("El pin:"+ pin+" ya se encuentra en tus contactos");
        }
    }
    @Override
    public double pagoMensual(int mins, int msgs) {
        double tmsj,tmin;
        
        if(mins>200){
            tmin=(mins-200)*0.8;
        
        }
        else
            tmin=0;
        if(msgs>300){
            tmsj=(msgs-300)*0.2;
        }
        else
            tmsj=0;
                
        return 40+tmin+tmsj;
    }
    
}
