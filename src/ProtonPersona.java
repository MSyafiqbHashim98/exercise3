/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
 public class ProtonPersona extends Proton{
    String Bigboot;
    
    ProtonPersona(){
        this.Bigboot = "Spaces";
    }
    
    public void boot(){
        System.out.println("Bigger boot " + Bigboot); 
    }
    
    void run(){
        System.out.println("Proton Persona is running safely");
        super.run();
        
    }
 }
    
