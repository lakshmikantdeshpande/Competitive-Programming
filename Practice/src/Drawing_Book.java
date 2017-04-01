import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Drawing_Book {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws Exception {
		int N = Integer.parseInt(br.readLine());
		int pages = Integer.parseInt(br.readLine());

		int front = pages / 2;
		int back = N % 2 == 0 ? ((N + 1) - pages) / 2 : (N - pages) / 2;
		System.out.println(front < back ? front : back);

		br.close();
		br = null;
		System.gc();
	}
}

// Logic
// 0 1 2 3 4 5 6 7 //pages
// 1 2 3 4 5 6 7 8 //index
//
// front page sathi /2
// 4/2 = 2
// 5/2 = 2
//
// back page sathi
//
// n % 2 == 0 (n+1 - p)/ 2
// n % 2 != 0 (n - p)/2