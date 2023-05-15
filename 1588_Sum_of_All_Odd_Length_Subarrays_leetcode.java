class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int sum=0;
     for(int i=0; i<arr.length; i++){
         int left = i+1;                 //total number of times it appears in left
         int right = arr.length-i;      //total number of times it appears in the right
         int k = left * right;           // total number of times it can appear
         int odd =(k+1)/2;              //total number of times it can appear in odd sub arrays
         sum+= odd*arr[i];
     }
     return sum;
    }
}