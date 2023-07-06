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
    public int row;
    public int col;
    Scanner kb = new Scanner(System.in);
    public boolean play;
    
    public void inputRowAndCol(){
        System.out.print("Input row : ");
         row = kb.nextInt();
         System.out.print("Input column : ");
         col = kb.nextInt();
    }
    
    
    public static void main(String[] args) {
        
    }
}
