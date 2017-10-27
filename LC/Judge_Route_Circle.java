// N time 1 Space
class Judge_Route_Circle {
    public boolean judgeCircle(String moves) {
        int upDown = 0, leftRight = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    upDown++;
                    break;
                case 'D':
                    upDown--;
                    break;
                case 'L':
                    leftRight--;
                    break;
                case 'R':
                    leftRight++;
                    break;
            }
        }
        return upDown == 0 && leftRight == 0;
    }
}
