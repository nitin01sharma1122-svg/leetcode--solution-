import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int j = 0;
        long radius = 0;

        for (int i = 0; i < houses.length; i++) {

            while (j < heaters.length - 1 &&
                   Math.abs((long)heaters[j + 1] - houses[i]) <= 
                   Math.abs((long)heaters[j] - houses[i])) {
                j++;
            }

            long dist = Math.abs((long)houses[i] - heaters[j]);
            radius = Math.max(radius, dist);
        }

        return (int) radius;
    }
}