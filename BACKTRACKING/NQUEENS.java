package BACKTRACKING;

import java.util.*;
// --------------------- >>>> ONLY ONE SOLUTION   <<<<<<---------------------------
public class NQUEENS {

    // Function to solve N-Queens problem
    static public List<String> solveNQueens(int n) {
        List<String> ans = new ArrayList<>(); // to store the result
        char[][] board = new char[n][n]; // to store the chess board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.'); // initialize board with dots
        }
        solve(0, board, ans, n); // start the recursive backtracking algorithm
        return ans; // return the result
    }

    // Backtracking recursive function to solve N-Queens problem
    static boolean solve(int row, char[][] board, List<String> ans, int n) {
        // If all N queens are placed, store the board configuration in the result
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }
            ans.addAll(solution);
            return true;
        }
        // Try placing queen in all columns in current row
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, n, board)) { // check if queen can be placed at current position
                board[row][col] = 'Q'; // place the queen
                if (solve(row + 1, board, ans, n)) { // recursively try to place the rest of the queens
                    return true;
                }
                board[row][col] = '.'; // backtrack and remove the queen from current position
            }
        }
        return false;
    }

    // Function to check if a queen can be placed at a given position
    static boolean isValid(int row, int col, int n, char[][] board) {
        // check if there is any queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        // check if there is any queen in the left upper diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        // check if there is any queen in the left lower diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> ans = solveNQueens(4); // call the solveNQueens function with n=4
        for (String s : ans)
            System.out.println(s); // print the solution(s) to the console
    }
}
