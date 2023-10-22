/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagment;

/**
 *
 * @author Coco
 */
public class validate {
    public static boolean validateISBN(String isbn){
        boolean invalid=false;
        for(char c: isbn.toCharArray()){
            if((!(Character.isDigit(c))&&(!(c=='-')))){
                invalid=true;
            }
        }
        return invalid;
    }
    public static boolean validatename(String name){
        boolean invalid=false;
        for(char c:name.toCharArray())
        {
            if(Character.isDigit(c)){
                invalid=true;
            }
        }
        return invalid;
    }
    
}
