package BACKTRACKING;

import java.util.*;

// --------------------- >>>> ALL POSSIBLE SOLUTIONS  <<<<<<---------------------------
public class NQUEENALL {

    static public List<List<String>> solveNQueens(int n) {
        // to store the result
        List<List<String>> ans = new ArrayList<>();
        // to store the possible order
        char[][] board = new char[n][n];
        // initialize the board with all dots (empty squares)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        // call the recursive function to solve the problem
        solve(0, board, ans, n);
        // return the answer
        return ans;
    }

    // helper function to check if a given cell is safe to place a queen
    static boolean isValid(int row, int col, int n, char[][] board) {
        // check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        // check the left upper diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        // check the right upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // if none of the above conditions is violated, return true
        return true;
    }

    // recursive function to solve the N-Queens problem
    static void solve(int row, char[][] board, List<List<String>> ans, int n) {
        // if all rows have been filled, add the solution to the answer list and return
        if (row == n) {
            // create a new list to store the solution
            List<String> solution = new ArrayList<>();
            // convert the char array board to a list of strings and add it to the solution
            // list
            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }
            ans.add(solution);
            return;
        }
        // try to place a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            // if the cell is safe to place a queen, mark it as such and recurse to the next
            // row
            if (isValid(row, col, n, board)) {
                board[row][col] = 'Q';
                solve(row + 1, board, ans, n);
                // after backtracking, mark the cell as empty again to explore other
                // possibilities
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {
        List<List<String>> ans = solveNQueens(4); // call the solveNQueens function with n=4
        for (List<String> ls : ans) {
            for(String s : ls){
                System.out.println(s); // print the solution(s) to the console
            }
            System.out.println();
        }
            
    }
}
