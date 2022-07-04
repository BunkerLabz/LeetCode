class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> l;
        ArrayList<Integer> pl = new ArrayList<>();
        pl.add(1);
        list.add(pl);
        for(int i = 1; i < numRows; i++) {
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
            list.add(pl);
        }
        
        // for(int i = 0; i < numRows; i++) {
        //     if(i == 0) {
        //         System.out.println(" ");
        //     }
        // }
        return list;
    }
}