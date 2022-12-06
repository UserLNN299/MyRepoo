package TicTacToeGame;

public class BotSteps {
    public static int[] getBotsMoveSets() {
        int stepBot = (int)(Math.random() * 8) + 1;
        int[] botMoveSet = new int[0];
        switch (stepBot) {
            case 1:
                //field1 {O,O,O}
                botMoveSet = new int[]{1, 2, 3};
                break;
            case 2:
                //field2 {O,O,O}
                botMoveSet = new int[]{4, 5, 6};
                break;
            case 3:
                //field3 {O,O,O}
                botMoveSet = new int[]{7, 8, 9};
                break;
            case 4:
                //field4 {O,X,X}
                //field1 {O,X,X}
                //field1 {O,X,X}
                botMoveSet = new int[]{1, 4, 7};
                break;
            case 5:
                //field1 {X,O,X}
                //field1 {X,O,X}
                //field1 {X,O,X}
                botMoveSet = new int[]{2, 5, 8};
                break;
            case 6:
                //field1 {X,X,O}
                //field1 {X,X,O}
                //field1 {X,X,O}
                botMoveSet = new int[]{3, 6, 9};
                break;
            case 7:
                //field1 {O,X,X}
                //field1 {X,O,X}
                //field1 {X,X,O}
                botMoveSet = new int[]{1, 5, 9};
                break;
            case 8:
                //field1 {X,X,O}
                //field1 {X,O,X}
                //field1 {O,X,X}
                botMoveSet = new int[]{3, 5, 7};
                break;
        }
        return botMoveSet;
    }

    public static void placeOToField(int botStep){
        switch (botStep) {
            case 1:
                TicTacToe.field1[0] = "  O  ";
                break;
            case 2:
                TicTacToe.field1[1] = "  O  ";
                break;
            case 3:
                TicTacToe.field1[2] = "  O  ";
                break;
            case 4:
                TicTacToe.field2[0] = "  O  ";
                break;
            case 5:
                TicTacToe.field2[1] = "  O  ";
                break;
            case 6:
                TicTacToe.field2[2] = "  O  ";
                break;
            case 7:
                TicTacToe.field3[0] = "  O  ";
                break;
            case 8:
                TicTacToe.field3[1] = "  O  ";
                break;
            case 9:
                TicTacToe.field3[2] = "  O  ";
                break;
        }

    }
}
