import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outter=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> inner=new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(nums[k]);

                    outter.add(inner);
                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return outter;
    }

    public static void main(String[] args) {
        ThreeSum obj=new ThreeSum();
        int[] arr = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>>res=obj.threeSum(arr);

        System.out.print(res);
    }
}