public class Shortest_path {
    // Given a route containing 4 directions (E, W, N, S), find the shortest path
    // to reach the destination from origin (0,0).

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // east
            else if (dir == 'E') {
                x++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
