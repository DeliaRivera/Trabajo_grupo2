/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

/**
 *
 * @author Delia
 */
public  class PlanIphone extends Plan {
    protected  String itunes_email;
    
    public PlanIphone(String nombreCliente, int num,String e){
        super(nombreCliente, num);
        this.itunes_email=e;
    }

    public String getItunes_email() {
        return itunes_email;
    }
    

    @Override
    public double pagoMensual(int mins, int msgs) {
       
          mins*=0.4; 
          msgs *= 0.1;
       
        return 22+mins+msgs;      
        
        
    }
    @Override
    public void print(){
        super.print();
         System.out.print("itunes e-mail: "+itunes_email);
    }
    
    
    
    
}
