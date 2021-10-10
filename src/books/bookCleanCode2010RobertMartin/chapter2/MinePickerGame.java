package books.bookCleanCode2010RobertMartin.chapter2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class MinePickerGame {

    private static final int NOT_CHECKED = 0;
    private static final int MINE = 1;
    private static final int CHECKED = 3;
    private static final int DEATH = 4;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static HashMap<String, Integer> mines = new HashMap<>();
    private static String[][] gameBoard;
    private static int BOARD_SIZE = 0;
    private static int MINES_COUNT = 0;
    private static boolean endGame = true;

    public static void main(String[] args) {
        System.out.println("Hello!!! This is Java Mine Picker Game");
        System.out.println("Please set board size:");
        while (setGameBoardSize()) {
            setGameBoardSize();
        }
        System.out.println("Board size is " + BOARD_SIZE + ":" + BOARD_SIZE);
        setGameBoard();
        placeMines();
        startGame();
    }

    private static boolean setGameBoardSize() {
        try {
            BOARD_SIZE = Integer.parseInt(scanner.nextLine());
            if (BOARD_SIZE == 0 || BOARD_SIZE == 1) {
                throw new Exception();
            }
            gameBoard = new String[BOARD_SIZE][BOARD_SIZE];
        } catch (Exception e) {
            System.out.println("Wrong size! Please try again:");
            return true;
        }
        endGame = false;
        return false;
    }

    private static void startGame() {
        do {
            try {
                System.out.println("Please input X coordinate:");
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println("Please input Y coordinate:");
                int y = Integer.parseInt(scanner.nextLine());
                checkMine(x, y);
            } catch (Exception e) {
                System.out.println("Incorrect format");
            }
        } while (!endGame);
    }

    private static void setGameBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                gameBoard[i][j] = "*";
            }
        }
        printGameBoard();
    }

    private static void placeMines() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                mines.put(String.valueOf(i).concat(String.valueOf(j)), NOT_CHECKED);
            }
        }
        while (MINES_COUNT < BOARD_SIZE) {
            placeRandomMine(random.nextInt(BOARD_SIZE), random.nextInt(BOARD_SIZE));
        }
    }

    private static void placeRandomMine(int x, int y) {
        if (mines.get(concatToString(x,y)) == NOT_CHECKED) {
            mines.put(concatToString(x,y), MINE);
            MINES_COUNT++;
        }
    }

    private static void printMinesBoard() {
        System.out.println("0 = not checked, 1 = mine, 3 = checked, 4 = death:");
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(mines.get(concatToString(i,j)) + "\t");
            }
            System.out.println();
        }
    }

    private static void printGameBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(gameBoard[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void checkMine(int x, int y) {
        if (!mines.containsValue(NOT_CHECKED)) {
            System.out.println("YOU WIN!!!");
            endGame = true;
        }
        if (mines.get(concatToString(x,y)) == MINE) {
            endGame = true;
            mines.put(concatToString(x,y), DEATH);
            System.out.println("GAME OVER!");
            printMinesBoard();
        } else {
            updateBoard(x, y);
        }
    }

    private static void updateBoard(int x, int y) {
        mines.put(concatToString(x,y), CHECKED);
        gameBoard[x][y] = "OK";
        printGameBoard();
    }

    private static String concatToString(int x, int y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}