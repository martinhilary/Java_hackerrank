/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeapplication;

/**
 *
 * @author martinhilary
 */
public class TicTacToe {

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aiMaker) {
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
    }

    public static char[] setBoard(){
        char[] board = new char[9];
        for(int i =0; i<board.length; i++){
            board[i] = '-';
        }
        return board;
    } 
    public boolean playTurn(int spot){
        boolean isValid = withinRange(spot) && isSpotTaken(spot);
        if(isValid){
            board[spot-1] = currentMarker;
            currentMarker = (currentMarker == userMarker)? aiMarker: userMarker;
        }
        return isValid;
    }
    
    //Check if our spot is in range
    public boolean withinRange(int number){
        return number>0 && number< board.length+1;
    }
    
    //Check if the spot is taken
    public boolean isSpotTaken(int number){
        return board[number-1] != '-';
    }
    
    public void printBoard(){
        System.out.println();
        for(int i=0; i < board.length; i++){
            if(i % 3 == 0 && i!=0 ){
                System.out.println();
                System.out.println("---------------------");
            }
            System.out.println("|" + board[i]);
        }
        System.out.println();
    }
    
    public void printIndexBoard(){
        System.out.println();
        for(int i =0; i<board.length; i++){
            if(i% 3 == 0 && i != 0){
                System.out.println();
                System.out.println("--------------------");
            }
            System.out.println("|" + i+1);
        }
        System.out.println();
    }
    
    
}
