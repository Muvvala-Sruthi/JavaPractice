class Solution {    
    public void sortColors(int[] nums) { 
        int i=0;
        int j=nums.length-1;
        int m=0;
       while(m<=j){
        if(nums[m]==2){
            swap(nums,m,j);
            j--;
        }
        else if(nums[m]==1){
            m++;
        }
        else{
             swap(nums,i,m);
            i++;
            m++;          
        }
       }
    }
       public static void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
       }
       }
