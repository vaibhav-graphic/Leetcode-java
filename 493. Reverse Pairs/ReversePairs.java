import java.util.ArrayList;

class ReversePairs{
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
    }

    private int mergeSort(int[] arr,int low,int high){
        int count=0;
        //base case
        if(low>=high) return count;
        int mid=(low+high)/2;
        //recursive call
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=countPair(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }

    private void merge(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }

    private int countPair(int[] arr,int low,int mid, int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)arr[i]>2L*arr[right]) right++;
            count+=(right-(mid+1));
        }
        return count;
    }
    public static void main(String[] args){
        ReversePairs obj=new ReversePairs();
        int[] arr={1,3,2,3,1};

        int res=obj.reversePairs(arr);

        System.out.println(res);
    }
}