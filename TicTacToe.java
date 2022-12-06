package TicTacToeGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static String[] field1 = {"  -  ", "  -  ", "  -  "};
    public static String[] field2 = {"  -  ", "  -  ", "  -  "};
    public static String[] field3 = {"  -  ", "  -  ", "  -  "};

    public static void printAllField() {
        System.out.println(Arrays.toString(field1));
        System.out.println(Arrays.toString(field2));
        System.out.println(Arrays.toString(field3));
    }

    public static void placeToField(int pos, String player) {
        String symbol;

        if(player.equals("X")) {
            symbol = "  X  ";
        } else {
            symbol = "  O  ";
        }

        switch (pos) {
            case 1:
                field1[0] = symbol;
                break;
            case 2:
                field1[1] = symbol;
                break;
            case 3:
                field1[2] = symbol;
                break;
            case 4:
                field2[0] = symbol;
                break;
            case 5:
                field2[1] = symbol;
                break;
            case 6:
                field2[2] = symbol;
                break;
            case 7:
                field3[0] = symbol;
                break;
            case 8:
                field3[1] = symbol;
                break;
            case 9:
                field3[2] = symbol;
                break;
            default:
                break;
        }
    }

    public static ArrayList<Integer> XCells = new ArrayList<>();
    public static ArrayList<Integer> OCells = new ArrayList<>();

    public static String checkWinner() {
        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> midRow = Arrays.asList(4,5,6);
        List<Integer> lowRow = Arrays.asList(7,8,9);
        List<Integer> leftColumn = Arrays.asList(1,4,7);
        List<Integer> midColumn = Arrays.asList(2,5,8);
        List<Integer> rightColumn = Arrays.asList(3,6,9);
        List<Integer> cross1 = Arrays.asList(1,5,9);
        List<Integer> cross2 = Arrays.asList(3,5,7);

        List<List<Integer>> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(lowRow);
        winning.add(leftColumn);
        winning.add(midColumn);
        winning.add(rightColumn);
        winning.add(cross1);
        winning.add(cross2);

        for(List<Integer> l : winning) {
            if(XCells.containsAll(l)) {
                return "X";
            } else if (OCells.containsAll(l)) {
                return "O";
            } else if (XCells.size() + OCells.size() == 9) {
                return "Draw";
            }
        }

        return "";
    }

    public static void printWinner() {
        if(checkWinner().equals("X")) {
            System.out.println();
            System.out.println("X wins!!!");
            printAllField();
            System.exit(0);
        } else if (checkWinner().equals("O")) {
            System.out.println();
            System.out.println("O wins!!!");
            printAllField();
            System.exit(0);
        } else if (checkWinner().equals("Draw")) {
            System.out.println();
            System.out.println("Tie!!!");
            printAllField();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("TicTacToe Game");
        System.out.println("Write 1 - 9 to play the game!!!");
        System.out.println("[  1  ],[  2  ],[  3  ]");
        System.out.println("[  4  ],[  5  ],[  6  ]");
        System.out.println("[  7  ],[  8  ],[  9  ]");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        while(true) {
            printAllField();
            printWinner();

            System.out.println("X - MOVE");
            int stepX = scan.nextInt();
            while (XCells.contains(stepX) | OCells.contains(stepX) | stepX <= 0 | stepX >= 10) {
                System.out.println("Write the correct number! 1 - 9");
                printAllField();
                stepX = scan.nextInt();
            }
            placeToField(stepX, "X");
            XCells.add(stepX);
            printWinner();
            System.out.println();

            printAllField();

            System.out.println("O - MOVE");
            int stepO = scan.nextInt();
            while (XCells.contains(stepO) | OCells.contains(stepO) | stepO <= 0 | stepO >= 10) {
                System.out.println("Write the correct number! 1 - 9");
                printAllField();
                stepO = scan.nextInt();
            }
            placeToField(stepO, "O");
            OCells.add(stepO);
            printWinner();
            System.out.println();
        }
    }
}
