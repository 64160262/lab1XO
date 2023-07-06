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
    public String reset;
    public String end;

    public String[][] board = {{"_ |","_|","_"},{"_ |","_ |","_"},{"_ |","_ |","_"},{"_ |","_ |","_"}};


    public String turn;

    
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
         while(((row > 0 && row < 4) && (col > 0 && col < 4))){
             
            if (board[row - 1][col - 1].equals("-")) {
                 board[row - 1][col - 1] = turn.toUpperCase();
            } else {

                while (((row > 0 && row < 4) && (col > 0 && col < 4)) && (!board[row - 1][col - 1].equals("-"))) {

                    System.out.println("Please Input Again.");
                    System.out.print("Input row :");
                    row = kb.nextInt();
                    System.out.print("Input column :");
                    col = kb.nextInt();

                }

                return;
            }
         }
    }
    
    
    
    public void endGame() {
        System.out.print("Do you want to Exit ??? (y/n): ");
         String end = kb.nextLine().toLowerCase();


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
     public void reset() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "-";
            }
        }
    }
    
    public void nextTurn() {
        if (turn.equals("X")) {
            turn = "O";
        } else {
            turn = "X";
        }

    }
     public void showTurn() {
         System.out.println("_________________________");
         System.out.println("Turn >>> " + turn.toUpperCase());
        

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
       
         Scanner kb = new Scanner(System.in);
         project.startGame();
       if (project.play != true) {
            System.out.println("ByeBye!!");
            return;
        }
       project.showBoard();
        }
        
    }
        
    
    
     


