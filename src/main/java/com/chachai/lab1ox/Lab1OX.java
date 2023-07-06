/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.chachai.lab1ox;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Lab1OX {



    

    public String[][] list = {{"_ |","_|","_"},{"_ |","_ |","_"},{"_ |","_ |","_"},{"_ |","_ |","_"}};
    public int row;
    public int column;
    
    Scanner sc = new Scanner(System.in);
    
    public void showBoard(){
        for(int i=1; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++){
                System.out.print(list[i][j]+ " ");
                
            }
            System.out.println();
            
        }
    }
    
    public static void main(String[] args) {
        Lab1OX project = new Lab1OX();
        project.showBoard();
        
    }
        
    
    
     
    
}

