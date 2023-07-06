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
    public boolean play = false;
    public String start;
    public boolean end;
    public String turn;
    public String[][] board = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};

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

    public void inputRowAndCol() {
        System.out.print("Input row : ");
        row = kb.nextInt();
        System.out.print("Input column : ");
        col = kb.nextInt();
        if (((row > 0 && row < 4) && (col > 0 && col < 4))) {

            if (board[row - 1][col - 1].equals("_")) {

                board[row - 1][col - 1] = turn.toUpperCase();
                checkWin();
                nextTurn();

            } else {

                while ((!(row > 0 && row < 4) && !(col > 0 && col < 4)) && !(board[row - 1][col - 1].equals("_"))) {

                    System.out.println("Please Input Again.");
                    System.out.print("Input row :");
                    row = kb.nextInt();
                    System.out.print("Input column :");
                    col = kb.nextInt();

                }

                return;
            }

        } else {
            return;
        }
    }

    public void nextTurn() {
        if (turn.equals("x")) {
            turn = "o";
        } else {
            turn = "x";
        }

    }

    public boolean checkDraw() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].equals("_")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void checkWin() {
        if (checkRows()) {
            play = false;
            System.out.println("+--------------------+");
            System.out.println("|    !!! " + turn + " Wins !!!   |");
            System.out.println("+--------------------+");
        } if(play == true){
            if(checkDraw()){
            System.out.println("+--------------------+");
            System.out.println("|    !!! Draw !!!    |");
            System.out.println("+--------------------+");
            play = false;
            }
        }
    }

    public boolean checkRows() {
        for (int j = 0; j < board[row - 1].length; j++) {
            if (!board[row - 1][j].toLowerCase().equals(turn)) {
                return false;
            }
        }
        return true;
    }


    public void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

    }

    public void showTurn() {
        System.out.println("_________________________");
        System.out.println("Turn >>> " + turn.toUpperCase());

    }

    public void lean() {
        showBoard();
        showTurn();
        inputRowAndCol();

    }

    public static void main(String[] args) {

        Lab1OX project = new Lab1OX();
        Scanner kb = new Scanner(System.in);
        project.startGame();
        if (project.play == false) {
            System.out.println("ByeBye!!");
            return;
        }

        project.turn = "x";
        while (project.play) {
            project.lean();
        }

    }
        
    
    
     
    
}

