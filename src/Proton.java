/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
public class Proton {
    String brand, windows, headlight;
    int tyresizes;
    
    Proton(){
        this.brand = "Dunlop";
        this.tyresizes=18;
    }
    
    Proton(String w, String h){
        this.windows = "w";
        this.headlight = "h";
    }
    
    public void printProton(){
        
        Proton obj1 = new Proton();
        Proton obj2 = new Proton("up","On");
        Proton obj3 = new Proton("down","Down");
        
        System.out.println("Tyre Brand : " + obj1.brand);
        System.out.println("Tyre Size : " + obj1.tyresizes);
        System.out.println("Windows : " + obj2.windows);
        System.out.println("Windows : " + obj2.windows);
        System.out.println("Headlight : " + obj2.headlight);
        System.out.println("Tyre Brand : " + obj2.headlight); 
    }
 
    void run(){
        System.out.println("This vehicle is running");
    }
}
