public class Front3 {
    public String front3(String str) {
        int len = str.length();
        String temp;
        if (len < 3)
            return str + str + str;
        else {
            temp = str.substring(0, 3);
            temp = temp + temp + temp;
        }
        return temp;
    }
}
