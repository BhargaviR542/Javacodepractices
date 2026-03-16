class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int n= arr.length;
        ArrayList<Integer> ls= new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int i=0; i< arr.length; i++) {
           if(!s.add(arr[i])) {
               ls.add(arr[i]);
           } 
        }
        return ls;
    }
}