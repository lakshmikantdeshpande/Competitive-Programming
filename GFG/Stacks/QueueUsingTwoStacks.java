import java.util.*;
import java.util.Stack;
import java.util.LinkedList;
class Queue_Using_Two_Stacks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			GfG g = new GfG();
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryTyoe = sc.nextInt();
				if(QueryTyoe == 1)
				{
					int a = sc.nextInt();
					g.insert(a);
				}else
				if(QueryTyoe == 2)
				System.out.print(g.remove()+" ");
			q--;
				
			}
			System.out.println();
		t--;
		}
	}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    /* The method insert to push element into the queue */
    void insert(int B)
    {
        s1.push(B);
    }
	
    
    /*The method remove which return the element popped out of the queue*/
    int remove()
    {
	    if (s2.isEmpty()) {
	        if (s1.isEmpty()) {
	            return -1;
	        } else {
	            while (!s1.isEmpty()) {
	                s2.push(s1.pop());
	            }
	        }
	    }
	    return s2.pop();
    }
}