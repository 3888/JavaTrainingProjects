package books.bookCleanCode2010RobertMartin.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinePicker02Updated {
    private static List<Cell[][]> gameBoard = new ArrayList<>();
    private static final int BOARD_SIZE = 1;
    private static final int STATUS_VALUE = 1;
    private static final boolean FLAGGED = true;

    public static void main(String[] args) {
//        gameBoard.add();
//        getFlaggedCells();
    }

    private static List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
//        for (int[] cell : gameBoard)
//            if (cell[STATUS_VALUE] == FLAGGED)
//                flaggedCells.add(cell);

        System.out.println(Arrays.deepToString(flaggedCells.toArray(new int[flaggedCells.size()][])));

        return flaggedCells;
    }

    public class Cell {
        private boolean flagged;

        public boolean isFlagged() {
            return flagged = true;
        }

        public boolean isUnFlagged() {
            return flagged = false;
        }
    }

}
