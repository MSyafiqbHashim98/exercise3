/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
public class ProtonX50 extends Proton {
    
    String park;
    
    ProtonX50(){
        this.park = "Auto park";                
    }
    
    public void parking(){
        System.out.println("Auto Parking assists : " + park);
    }
    
    void run(){
        System.out.println("Proton X50 is running safely");
        super.run();
    }
}
