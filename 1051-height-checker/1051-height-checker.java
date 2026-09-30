class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int arr[] = Arrays.copyOf(heights,heights.length);

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(heights[i] != arr[i])count++;
        }
        return count;
    
    }
}