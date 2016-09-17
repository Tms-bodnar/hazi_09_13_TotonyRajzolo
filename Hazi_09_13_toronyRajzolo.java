/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi_09_13_toronyrajzolo;
import java.util.*;
/**
 *
 * @author bodnart
 */
public class Hazi_09_13_toronyRajzolo {

    /**
     * @param args the command line arguments
     */
    
    public static void toronyRajzolo(int meret, int kocka){
        int eltolo = 0;
        int temp = meret-2*(kocka-1);
        do{
        for( int i = 0; i < temp; i++){
            int eltolas = (meret-temp)/2;
                for( int k = 0; k < eltolas; k++){
                    System.out.print(" ");
            }           
            for(int j = 0; j < temp; j++){              
            System.out.print("*");
            }
            System.out.println();
        }    
        temp = temp+2;
        }while( temp <= meret);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Milyen széles legyen a torony alapja?");
        int meret = sc.nextInt();
        System.out.println("Hány blokkból álljon a torony?");
        int kocka = sc.nextInt();


        toronyRajzolo(meret,kocka);

            
    
    }
    
}

