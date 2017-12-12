@SuppressWarnings("serial")
public class MazeSolution extends Maze {

    static int[][] maze;
    static int goalX, goalY;

    // Wie verändern sich x und y durch bewegen in direction:
    // xDiff = dir[direction][0]
    // yDiff = dir[direction][1]
    static final int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    /**
     * Directions:
     *   2
     * 3   1
     *   0
     * */

    public static void main(String[] args) {
        int width = 20;
        int height = 20;
        goalX = width - 1;
        goalY = height - 2;
        maze = generateMaze(width, height);
        walk(1, 0, 0);
    }
    
    /**
     * Gibt das Feld zurück auf dem man landet, wenn man von x und y aus in Richtung direction geht.
     */
    public static int get(int x, int y, int direction) {
        int[] diff = dir[direction];
        int diffX = diff[0];
        int diffY = diff[1];
        return maze[x + diffX][y + diffY];
    }

    public static void walk(int x, int y, int direction) {
        maze[x][y] = PLAYER;
        draw(maze);
        maze[x][y] = OLD_PATH_DONE;
        
        // Sind wir am Ziel?
        if (x == goalX && y == goalY) {
            System.out.println("Wie sind am Ziel!");
            return;
        }
        // Sind wir wieder am Anfang?
        if (x == 1 && y == 0 && direction != 0) {
            System.out.println("Kein Ausgang :(");
            return;
        }
        
        // Haben wir rechts eine Wand?
        if (get(x, y, (direction + 3) % 4) == WALL) {
            // Ja, haben wir vorne eine Wand?
            if (get(x, y, direction) == WALL) {
                // Ja, also nach links drehen
                walk(x, y, (direction + 1) % 4);
            }
            else {
                // Nein, also gerade aus gehen?
                int[] diff = dir[direction];
                int diffX = diff[0];
                int diffY = diff[1];
                walk(x + diffX, y + diffY, direction);
            }
        }
        else {
            // Nein, also nach rechts gehen
            direction = (direction + 3) % 4;
            int[] diff = dir[direction];
            int diffX = diff[0];
            int diffY = diff[1];
            walk(x + diffX, y + diffY, direction);
        }
    }
}
