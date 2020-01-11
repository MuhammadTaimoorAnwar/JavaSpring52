/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class3;

import java.util.Arrays;

/**
 *
 * @author Taimoo
 */
enum ChessPieces {
    K, Q, R, B, N, P
}
// K = King Q= Queen R=Rock B= Bishop N=Knight P=Pawn

public class ClassChessBoard {

    public static void main(String[] args) {
//        ChessPieces p;
        String[][] ChessBoard = new String[8][8];
        // iteration to produce 8X8 board
        System.out.println("********Chess Board*********");
        for (int m = 0; m < ChessBoard.length; m++) {
            //filling pawn rows
            if (m == 1 || m == 6) {
                Arrays.fill(ChessBoard[m], " " + ChessPieces.P.toString() + " ");
            } //filling empty spaces with X
            else if (m >= 2 && m <= 5) {
                Arrays.fill(ChessBoard[m], " " + "X" + " ");
            }
            else if(m==0 || m==7){
                // Column iteration
                for (int j=0;j<ChessBoard[m].length;j++){
                switch(j){
                    case 0:
                         ChessBoard[m][j]=" " +ChessPieces.R.toString();
                         break;
                    case 1:
                        ChessBoard[m][j]="  " +ChessPieces.N.toString();
                        break;
                     case 2:
                        ChessBoard[m][j]="  " +ChessPieces.B.toString();
                        break;
                     case 3:
                         ChessBoard[m][j]="  " +ChessPieces.K.toString();
                         break;
                     case 4:
                         ChessBoard[m][j]="  " +ChessPieces.Q.toString();
                         break;
                    case 5:
                         ChessBoard[m][j]="  " +ChessPieces.B.toString();
                         break;
                    case 6:
                         ChessBoard[m][j]="  " +ChessPieces.N.toString();
                         break;
                    case 7:
                         ChessBoard[m][j]="  " +ChessPieces.R.toString();
                         break;   
                }
                }
            
            }
        }
        for (String[] ChessB : ChessBoard) { //iterating over rows
            for (String ChessC : ChessB) {        //iterating over cols
                System.out.print(ChessC);
            }
            System.out.println(" ");
        }
        System.out.println("********End Of Program********");
    }
}
