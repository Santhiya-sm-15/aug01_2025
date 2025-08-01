class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> prev=new ArrayList<>();
        prev.add(1);
        res.add(prev);
        for(int i=0;i<numRows-1;i++)
        {
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=1;j<=i;j++)
                l.add(prev.get(j-1)+prev.get(j));
            l.add(1);
            prev=l;
            res.add(l);
        }
        return res;
    }
}