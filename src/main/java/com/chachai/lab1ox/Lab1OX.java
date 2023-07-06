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
    public String start;
    public String end;
    public String turn;
    public String[][] board = {{"_ |", "_ |", "_"}, {"_ |", "_ |", "_"}, {"_ |", "_ |", "_"}, {"_ |", "_ |", "_"}};
    
    public void startGame() {

        System.out.println("Welcome to  OX game!!!");
        System.out.print("Start Game??? (y/n): ");
        start = kb.nextLine().toLowerCase();

        while (!start.equals("n") && !start.equals("y")) {
            System.out.print("Start Game (y/n): ");
            start = kb.nextLine().toLowerCase();
        }
        if (start.equals("n")) {
            play = false;
        } else {
            play = true;
        }

    }
    
    public void inputRowAndCol(){
        System.out.print("Input row : ");
         row = kb.nextInt();
         System.out.print("Input column : ");
         col = kb.nextInt();
         while(row>0 && row<4){
            //  if(!board[row-1][col-1]){
                 
            //  }
         }
    }
    
    
    
    public void endGame() {
        System.out.print("Do you want to Exit ??? (y/n): ");
        end = kb.nextLine().toLowerCase();

        while (!end.equals("n") && !end.equals("y")) {
            System.out.print("Do you want to Exit ??? (y/n): ");
            end = kb.nextLine().toLowerCase();
        }
        if (end.equals("n")) {
            play = false;
        } else {
            play = true;
        }

    }
    
    public void nextTurn() {
        if (turn.equals("X")) {
            turn = "O";
        } else {
            turn = "X";
        }

    }

    public void showBoard(){
        for(int i=1; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++){
                System.out.print(board[i][j]+ " ");
                
            }
            System.out.println();
            
        }
    
    }
    
    public static void main(String[] args) {
        Lab1OX project = new Lab1OX();
        project.showBoard();
        
    }
        
    
    
     
    
}

