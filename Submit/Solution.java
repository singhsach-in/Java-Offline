package Submit;

import java.util.*;

class Solution {
    public static void solveSudoku(char[][] board) {
        int n = board[0].length;
        char[][] ans = new char[n][n];
        
        solve(0, 0, n, board, ans);
    }

    static boolean solve(int row, int col, int n,char[][] board, char[][] ans) {
        
        if(row == n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++) {
                    ans[i][j] = board[i][j];
                }
            }
            return true;
        }
        if(col == n){
            row+=1;
            col=0;
        }
        for(char k='1'; k<='9'; k++){
            if(isValid(row, col, k, board)){
                board[row][col] = k;
                if(solve(row, col+1, n, board, ans)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    static boolean isValid(int row, int col, char k, char[][] board) {
        // col check
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] == k)
                return false;
        }
        // row check
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == k)
                return false;
        }

        // sub-board check
        for (int i = (row / 3) * 3; i < ((row / 3) * 3) + 3; i++) {

            for (int j = (col / 3) * 3; j < ((col / 3) * 3) + 3; j++) {
                if (board[i][j] == k)
                    return false;
            }
        }

        return true;
    }
}
