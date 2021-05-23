package leetcode.jpmorgan;

public class DesignParkingSystem {
        private final int[] parkingLot;

        public DesignParkingSystem(int big, int medium, int small) {
            parkingLot = new int[]{ big, medium, small };
        }

        public boolean addCar(int carType) {
            return parkingLot[carType - 1]-- > 0;
        }
}

