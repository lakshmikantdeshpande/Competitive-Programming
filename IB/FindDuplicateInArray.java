public class FindDuplicateInArray {
    
    public int repeatedNumber(final List<Integer> list) {
        int slow = list.get(0);
        int fast = list.get(list.get(0));
        while (fast != slow) {
            slow = list.get(slow);
            fast = list.get(list.get(fast));
        }
        
        fast = 0;
        while (fast != slow) {
            slow = list.get(slow);
            fast = list.get(fast);
        }
        return slow;
    } 

}

