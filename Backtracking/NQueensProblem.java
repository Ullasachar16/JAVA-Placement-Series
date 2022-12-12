package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {
    public static boolean isSafe(int row,int col,char[][]board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<board.length;i++){

        }
    }
    public void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allBoards,col+1);
                board[row][col] = ".";
            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards=new ArrayList<>();
        char[][] board = new board[n][n];
    }
    public static void main(String[] args) {

    }
}
