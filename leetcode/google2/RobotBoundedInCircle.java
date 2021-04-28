package leetcode.google2;

public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        int x = 0, y = 0;
        int dir = 0; // 0 north 1 east 2 south 3 west

        for (char c : instructions.toCharArray()) {
            switch (c) {
                case 'L':
                    dir = (dir + 3) % 4;
                    break;
                case 'R':
                    dir = (dir + 1) % 4;
                    break;
                case 'G':
                    x += directions[dir][0];
                    y += directions[dir][1];
            }
        }

        return (x == 0 && y == 0) || dir != 0;
    }
}
