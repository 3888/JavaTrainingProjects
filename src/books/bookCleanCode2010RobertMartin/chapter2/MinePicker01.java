package books.bookCleanCode2010RobertMartin.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinePicker01 {
    private static List<int[]> gameBoard = new ArrayList<>();
    private static final int STATUS_VALUE = 1;
    private static final int FLAGGED = 1;

    public static void main(String[] args) {
        gameBoard.add(new int[]{0, 1});
        getFlaggedCells();
    }

    private static List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);

        System.out.println(Arrays.deepToString(flaggedCells.toArray(new int[flaggedCells.size()][])));

        return flaggedCells;
    }
}
