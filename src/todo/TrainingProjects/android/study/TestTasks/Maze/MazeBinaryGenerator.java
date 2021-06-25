package todo.TrainingProjects.android.study.TestTasks.Maze;

import java.util.Arrays;
import java.util.Collections;
// https://rosettacode.org/wiki/Maze_generation#Java

// технічні частина:
//        1) генерація
//        2) пошук шляху, тобто перевірка чи можна з одної сторони пройти в іншу
//        3) зберігати маєш у файл і виводити в консоль

//        вхід вихід не треба
//        треба точка S і точка F

class MazeBinaryGenerator {
    private final int highXValue;
    private final int highYValue;
    private final int[][] maze;

    MazeBinaryGenerator(int highCoordinateValue) {
        highXValue = highCoordinateValue;
        highYValue = highCoordinateValue;
        maze = new int[highXValue][highYValue];
    }

    void generateMaze(int startCoordinateXValue, int startCoordinateYValue) {
        DIRECTION[] directionValues = DIRECTION.values();
        Collections.shuffle(Arrays.asList(directionValues));

        for (DIRECTION direction : directionValues) {
            int endCoordinateXValue = startCoordinateXValue + direction.directionX;
            int endCoordinateYValue = startCoordinateYValue + direction.directionY;

            if (isArrayCellBetweenValuesEmpty(endCoordinateXValue, this.highXValue)
                    && isArrayCellBetweenValuesEmpty(endCoordinateYValue, this.highYValue)
                    && (maze[endCoordinateXValue][endCoordinateYValue] == 0)) {

                // |=
                // Получите побитовое включающее ИЛИ первого и второго операндов.
                // Cохраняет результат в указанном объекте первым операндом

                //  если оба соответствующих бита операндов равны 0, двоичный разряд результата равен 0;
                //  если же хотя бы один бит из пары равен 1, двоичный разряд результата равен 1.

                maze[startCoordinateXValue][startCoordinateYValue] |= direction.bit;
                maze[endCoordinateXValue][endCoordinateYValue] |= direction.opposite.bit;
                generateMaze(endCoordinateXValue, endCoordinateYValue);
            }
        }
    }

    // Непонятно как проверяет ? когда тут минус приходит и почему так?
    private static boolean isArrayCellBetweenValuesEmpty(int coordinateValue, int highCoordinateValue) {
        return (coordinateValue >= 0) && (coordinateValue < highCoordinateValue);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String concatToString(int x, int y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }

    void display() {
        for (int i = 0; i < highYValue; i++) {
            // draw the NORTH edge
            for (int j = 0; j < highXValue; j++) {
                System.out.print((maze[j][i] & 1) == 0 ? "+---" : "+   ");
            }
            System.out.println("+");

            // draw the WEST edge
            for (int j = 0; j < highXValue; j++) {
                //  если оба соответствующих бита операндов равны 1, результирующий двоичный разряд равен 1;
                // если же хотя бы один бит из пары равен 0, результирующий двоичный разряд равен 0.

   /*ЧТО ТАКОЕ 8?! Размер БИТА!!!!????*/
                System.out.print((maze[j][i] & 8) == 0 ? "|   " : "    ");
            }

            System.out.println("|");
        }
        // draw the BOTTOM line
        // печатается построчно сверху вниз
        for (int j = 0; j < highXValue; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

    private enum DIRECTION {
        NORTH(1, 0, -1), SOUTH(2, 0, 1), EAST(4, 1, 0), WEST(8, -1, 0);
        private final int bit;
        private final int directionX;
        private final int directionY;
        private DIRECTION opposite;

        // use the static initializer to resolve forward references
        static {
            NORTH.opposite = SOUTH;
            SOUTH.opposite = NORTH;
            EAST.opposite = WEST;
            WEST.opposite = EAST;
        }

        DIRECTION(int bit, int directionX, int directionY) {
            this.bit = bit;
            this.directionX = directionX;
            this.directionY = directionY;
        }
    }
}