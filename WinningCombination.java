package TicTacToeGame;

import java.util.Objects;

public class WinningCombination {

    static String[] winHorizontalX = {"  X  ", "  X  ", "  X  "};
    static String[] winHorizontalO = {"  0  ", "  0  ", "  0  "};

    static String[] winVerticalX1 = {"  X  "};
    static String[] winVerticalX2 = {"  X  "};
    static String[] winVerticalX3 = {"  X  "};

    static String[] winVerticalO1 = {"  0  "};
    static String[] winVerticalO2 = {"  0  "};
    static String[] winVerticalO3 = {"  0  "};

    static String[] winCurveX1 = {"  X  ", "  0  ", "  0  "};
    static String[] winCurveX2 = {"  0  ", "  X  ", "  0  "};
    static String[] winCurveX3 = {"  0  ", "  0  ", "  X  "};

    static String[] winCurveX11 = {"  0  ", "  0  ", "  X  "};
    static String[] winCurveX22 = {"  0  ", "  X  ", "  0  "};
    static String[] winCurveX33 = {"  X  ", "  0  ", "  0  "};

    static String[] winCurveO1 = {"  O  ", "  X  ", "  X  "};
    static String[] winCurveO2 = {"  X  ", "  O  ", "  X  "};
    static String[] winCurveO3 = {"  X  ", "  X  ", "  O  "};

    static String[] winCurveO11 = {"  X  ", "  X  ", "  0  "};
    static String[] winCurveO22 = {"  X  ", "  0  ", "  X  "};
    static String[] winCurveO33 = {"  0  ", "  X  ", "  X  "};


    public static int winCheck() {
        boolean returnArgX = false;
        boolean returnArgO = false;
        boolean draw = false;

        if (Objects.equals(TicTacToe.field1[0], winHorizontalX[0])
                && Objects.equals(TicTacToe.field1[1], winHorizontalX[0])
                && Objects.equals(TicTacToe.field1[2], winHorizontalX[0])) {
            //Горизонтальный икс1
            returnArgX = true;
        } else if (Objects.equals(TicTacToe.field2[0], winHorizontalX[0])
                && Objects.equals(TicTacToe.field2[1], winHorizontalX[0])
                && Objects.equals(TicTacToe.field2[2], winHorizontalX[0])) {
            //Горизонтальный икс2
            returnArgX = true;
        } else if (Objects.equals(TicTacToe.field3[0], winHorizontalX[0])
                && Objects.equals(TicTacToe.field3[1], winHorizontalX[0])
                && Objects.equals(TicTacToe.field3[2], winHorizontalX[0])) {
            //Горизонтальный икс3
            returnArgX = true;
        } else if (Objects.equals(TicTacToe.field1[0], winHorizontalO[0])
                && Objects.equals(TicTacToe.field1[1], winHorizontalO[0])
                && Objects.equals(TicTacToe.field1[2], winHorizontalO[0])) {
            //Горизонтальный ноль1
            returnArgO = true;
        } else if (Objects.equals(TicTacToe.field2[0], winHorizontalO[0])
                && Objects.equals(TicTacToe.field2[1], winHorizontalO[0])
                && Objects.equals(TicTacToe.field2[2], winHorizontalO[0])) {
            //Горизонтальный ноль2
            returnArgO = true;
        } else if (Objects.equals(TicTacToe.field3[0], winHorizontalO[0])
                && Objects.equals(TicTacToe.field3[1], winHorizontalO[0])
                && Objects.equals(TicTacToe.field3[2], winHorizontalO[0])) {
            //Горизонтальный ноль3
            returnArgO = true;
        } else if (Objects.equals(TicTacToe.field1[0], winVerticalX1[0])
                && Objects.equals(TicTacToe.field2[0], winVerticalX1[0])
                && Objects.equals(TicTacToe.field3[0], winVerticalX1[0])) {
            //Вертикальный икс1
            returnArgX = true;
        } else if (Objects.equals(TicTacToe.field1[1], winVerticalX1[0])
                && Objects.equals(TicTacToe.field2[1], winVerticalX1[0])
                && Objects.equals(TicTacToe.field3[1], winVerticalX1[0])) {
            //Вертикальный икс2
            returnArgX = true;
        } else if (Objects.equals(TicTacToe.field1[2], winVerticalX1[0])
                && Objects.equals(TicTacToe.field2[2], winVerticalX1[0])
                && Objects.equals(TicTacToe.field3[2], winVerticalX1[0])) {
            //Вертикальный икс3
            returnArgX = true;
        } else if (Objects.equals(TicTacToe.field1[0], winVerticalO1[0])
                && Objects.equals(TicTacToe.field2[0], winVerticalO1[0])
                && Objects.equals(TicTacToe.field3[0], winVerticalO1[0])) {
            //Вертикальный ноль1
            returnArgO = true;
        } else if (Objects.equals(TicTacToe.field1[1], winVerticalO1[0])
                && Objects.equals(TicTacToe.field2[1], winVerticalO1[0])
                && Objects.equals(TicTacToe.field3[1], winVerticalO1[0])) {
            //Вертикальный ноль2
            returnArgO = true;
        } else if (Objects.equals(TicTacToe.field1[2], winVerticalO1[0])
                && Objects.equals(TicTacToe.field2[2], winVerticalO1[0])
                && Objects.equals(TicTacToe.field3[2], winVerticalO1[0])) {
            //Вертикальный ноль3
            returnArgO = true;
        } else if (Objects.equals(TicTacToe.field1[0], winCurveX1[0])
                && Objects.equals(TicTacToe.field2[1], winCurveX2[1])
                && Objects.equals(TicTacToe.field3[2], winCurveX3[2])) {
            //Кривая икс1
            returnArgX = true;
        } else if (Objects.equals(TicTacToe.field1[2], winCurveX11[2])
                && Objects.equals(TicTacToe.field2[1], winCurveX22[1])
                && Objects.equals(TicTacToe.field3[0], winCurveX33[0])) {
            //Кривая икс2
            returnArgX = true;
        } else if (Objects.equals(TicTacToe.field1[0], winCurveO1[0])
                && Objects.equals(TicTacToe.field2[1], winCurveO2[1])
                && Objects.equals(TicTacToe.field3[2], winCurveO3[2])) {
            //Кривая ноль1
            returnArgO = true;
        } else if (Objects.equals(TicTacToe.field1[2], winCurveO11[2])
                && Objects.equals(TicTacToe.field2[1], winCurveO22[1])
                && Objects.equals(TicTacToe.field3[0], winCurveO33[0])) {
            //Кривая ноль2
            returnArgO = true;
        } else {
            draw = true;
        }

//        if(returnArgX) {
//            return 1;
//        } else if (returnArgO) {
//            return 0;
//        } else if (draw & TicTacToe.usedCells.size() == 9){
//            return 2;
//        }
        return 3;
    }
}
