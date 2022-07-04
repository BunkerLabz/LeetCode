class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> l;
        ArrayList<Integer> pl = new ArrayList<>();
        pl.add(1);
        for(int i = 1; i < rowIndex + 1; i++) {
            l = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    l.add(1);
                }
                else {
                    l.add(pl.get(j - 1) + pl.get(j));
                }
            }
            pl = l;
        }

        return pl;
    }
}