class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int [] hash = new int[60001];
        for(int i=0; i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0; i<hash.length;i++){
            if(hash[i] > nums.length/3){
                arr.add(i);
            }
        }
        return arr;

    }
}