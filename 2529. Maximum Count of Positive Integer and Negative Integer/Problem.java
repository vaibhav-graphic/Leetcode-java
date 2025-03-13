class Problem {
    public int maximumCount(int[] nums) {
        int low=0, high=nums.length-1;

        int pos=posNumber(nums,low,high);
        int neg=negNumber(nums,low,high);

        if(pos>neg){
            return pos;
        }else{
            return neg;
        }
    }

    private int posNumber(int []nums, int low, int high){
        int n=nums.length;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]>0){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(res==-1){
            return 0;
        }else{
            return n-res;
        }
    }

    private int negNumber(int []nums, int low, int high){
        int res=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]<0){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        if(res==-1){
            return 0;
        }else{
            return res+1;
        }
    }
}