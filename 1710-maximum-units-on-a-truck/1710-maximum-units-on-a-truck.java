class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int maxFill = 0;
        for(int box[] : boxTypes) {
            if(truckSize < box[0]) {
                return maxFill + truckSize * box[1];
            }
            maxFill += box[0] * box[1];
            truckSize -= box[0];
        }
        return maxFill;
    }
}