/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csi3770;

/**
 *
 * @author cklemm
 */
public class BeerSong {
    
    public static void main(String[] args){
        Ninety_Nine_Bottles_of_Beer();
    }
    
    public static void Ninety_Nine_Bottles_of_Beer() {
        for (int i=99; i > 2; i--){
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer\n" +
                "Take one down, pass it around, " + (i-1) + " bottles of beer on the wall.");
        }
        
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer\n" +
            "Take one down, pass it around, 1 bottle of beer on the wall.");
        
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer\n" +
            "Take one down, pass it around, no more bottles of beer on the wall.");
    }
}
