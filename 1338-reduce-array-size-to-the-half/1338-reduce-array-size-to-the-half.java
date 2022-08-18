class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        int count = 0;
        int size = arr.length;
        int i = 0;
        while(size > arr.length / 2) {
            size = size - list.get(i);
            i++;
            count++;
        }
        return count;
    }
}