public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile)
            return true;
        else if (!aSmile && !bSmile)
            return true;
        else if (aSmile && !bSmile)
            return false;
        else
            return false;
    }
}
