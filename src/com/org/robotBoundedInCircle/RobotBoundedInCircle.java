public class RobotBoundedInCircle {

    /**
     * "G": go straight 1 unit; "L": turn 90 degrees to the left; "R": turn 90 degrees to the right. The robot performs the instructions given in order, and repeats them forever.
     *
     * Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
     *
     * Input: instructions = "GGLLGG"
     * Output: true
     * Explanation: The robot moves from (0,0) to (0,2), turns 180 degrees, and then returns to (0,0).
     * When repeating these instructions, the robot remains in the circle of radius 2 centered at the origin.
     *
     * Input: instructions = "GG"
     * Output: false
     * Explanation: The robot moves north indefinitely.
     *
     *
     * Input: instructions = "GL"
     * Output: true
     * Explanation: The robot moves from (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0).
     *
     * @param instructions
     * @return boolean flag
     */
 public boolean isRobotBondedCircle(String instructions) {

     // Let suppose North = 0, East = 1, West = 2, South = 2;
     int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};

     // Intial position in the center
     int x = 0, y = 0;

     //facing towards north
     int idx = 0;

     for(char i : instructions.toCharArray()) {
        if (i == 'L') {
            idx = (idx + 3) % 4;
        }
         else if (i == 'R') {
             idx = (idx + 1) % 4;
         }
         else {
             x += directions[idx][0];
             y += directions[idx][1];
        }
     }
     return (x == 0 && y == 0) || (idx =! 0);
 }

}
