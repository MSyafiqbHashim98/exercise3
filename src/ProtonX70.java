/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
public class ProtonX70 extends Proton{
    
    String autopilot;
    
    ProtonX70(){
        this.autopilot = "Auto drive";
    }
    
    public void pilot(){
        System.out.println("Auto driving assist : " + autopilot);
    }
    
    void run(){
        System.out.println("Proton X70 is running safely");
        super.run();
    }
    
}
