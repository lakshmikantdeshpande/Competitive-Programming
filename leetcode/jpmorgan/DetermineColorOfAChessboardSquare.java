package leetcode.jpmorgan;

public class DetermineColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a' + 1;
        int y = coordinates.charAt(1) - '0';
        return (x + y) % 2 != 0;
    }
}
