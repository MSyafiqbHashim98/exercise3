/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
public class mainProton {
    public static void main(String[]args){
        
        ProtonPersona p = new ProtonPersona();
        System.out.println("Proton Persona features : ");
        p.printProton();
        p.boot();
        p.run();
        System.out.println();
        
        ProtonSaga s = new ProtonSaga();
        System.out.println("Proton Saga features : ");
        s.printProton();
        s.fuel();       
        s.run();
        System.out.println();
        
        ProtonX50 x5 = new ProtonX50();
        System.out.println("Proton X50 features : ");
        x5.printProton();
        x5.parking();
        x5.run();
        System.out.println();
        
        ProtonX70 x7 = new ProtonX70();
        System.out.println("Proton X70 features : ");
        x7.printProton();
        x7.pilot();
        x7.run();
        
        
        
    
    }
}
