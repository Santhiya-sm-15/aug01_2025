# aug01_2025
The problem that i solved today in leetcode

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Code:
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
