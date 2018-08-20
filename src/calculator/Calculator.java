/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
 * @author Barry
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,##,###.##");
        System.out.println("Super Simpele Calculator");
        
        System.out.println("Voer een nummer in");
        
        double nummer1 = sc.nextDouble();
        
        System.out.println("Voer tweede nummer in");
        
        double nummer2 = sc.nextDouble();
        
        
        System.out.println("Kies 1 voor optellen");
        System.out.println("Kies 2 voor aftrekken");
        System.out.println("Kies 3 voor vermenigvuldigen");
        System.out.println("Kies 4 voor delen");
        
       
         
        
        
        int kiezen = sc.nextInt();
        if(nummer2 ==0 && kiezen ==4){
                System.out.println("Je kan niet delen door 0");
               
        }else {
            System.out.println("Het resultaat is " + formatter.format(calculate(nummer1,nummer2,kiezen)));
        }
                
       
    }
    
    public static double calculate(double nummer1,double nummer2,int kiezen){
        
        if (kiezen ==1){
            return nummer1+nummer2;
            
        }else if(kiezen ==2){
            return nummer1-nummer2;
                    }
        
        else if(kiezen ==3){
            return nummer1*nummer2;
        }
        else if(kiezen ==4){
        return nummer1/nummer2;
    }
        return 0;
    }
    
    

}