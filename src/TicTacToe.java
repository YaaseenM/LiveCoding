import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Player 1: x");
        System.out.println("Player 2: o\n");

        final int ROWS = 3, COLUMNS = 3;
        char[][] board = new char[ROWS][COLUMNS];
        Scanner scanner = new Scanner(System.in);
        int row, col;
        boolean player1 = true;
        char token;

        initializedBoard(board);
        printBoard(board);
        while (true) {
            if (player1) {
                System.out.println("\nPlayer1's Turn (x):");
                token = 'x';
            } else {
                System.out.println("\nPlayer2's Turn (o):");
                token = 'o';
            }
            while (true) {
            System.out.print("Enter a row number (0, 1, or 2): ");
            row = scanner.nextInt();
            System.out.print("Enter a column number (0, 1, or 2): ");
            col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("This position is off the bounds of the board! Try again.");
            } else if (board[row][col] != '-') {
                System.out.println("Someone has already made a move at this position! Try again.");
            } else {
                break;
            }
        }

            board[row][col] = token;

            if (checkIfWinner(board, token)) {
                if (token == 'x') {
                    System.out.println("Player 1 has won!");
                    printBoard(board);
                    break;
                } else {
                    System.out.println("Player 2 has won!");
                    printBoard(board);
                    break;
                }
            }

            if (boardIsFull(board)) {
                System.out.println("It's a tie!");
                printBoard(board);
                break;
            }

            printBoard(board);

            player1 = !player1;
        }


    }
    public static void initializedBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = '-';
            }
        }
    }
    public static void printBoard(char[][] board) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static boolean checkIfWinner(char[][] board, char chipType) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] == chipType ) {
                return true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[2][col] == chipType ) {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == chipType) {
            return true;
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] == chipType) {
            return true;
        }
        return false;
    }
    public static boolean boardIsFull(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] == '-') {
                    return false;
                }
            }
        }
       return true;
    }
}
