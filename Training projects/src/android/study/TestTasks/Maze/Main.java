package android.study.TestTasks.Maze;

public class Main {
    private static final int MAZE_SIZE = 8;

    public static void main(String[] args) {
        MazeBinaryGenerator maze = new MazeBinaryGenerator(MAZE_SIZE);
        maze.generateMaze(0, 0);
        maze.display();

    }
}
