// nlogn time n space

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Flatland_Space_Stations {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int cities = scanner.nextInt();
        int ships = scanner.nextInt();
        int[] spaceships = new int[ships];

        for (int i = 0; i < ships; i++) {
            spaceships[i] = scanner.nextInt();
        }
        Arrays.sort(spaceships);

        /*We are  interested in the cities that are in the middle of two space stations
         as this city will be furthest for that set of two space stations
            City         : 0,1,2,3,5,6,7,8
            SpaceStation : .,.,2,.,.,.,7,.
        */
        int maxDistance = spaceships[0];
        for (int i = 1; i < ships; i++) {   // started from 1, as we're comparing it with 0
            int distance = (spaceships[i] - spaceships[i - 1]) / 2;
            maxDistance = Math.max(maxDistance, distance);
        }

        // last spacestation and city
        maxDistance = Math.max(maxDistance, (cities - 1 - spaceships[ships - 1]));
        pw.println(maxDistance);

        pw.close();
        scanner.close();
    }
}
