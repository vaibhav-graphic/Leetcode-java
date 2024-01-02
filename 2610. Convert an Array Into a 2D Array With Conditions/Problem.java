import java.util.ArrayList;
import java.util.List;

public class Problem {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        int[] freq = new int[nums.length + 1];
        List<List<Integer>> res = new ArrayList<>();

        for(int c : nums){
            if(freq[c] >= res.size()){
                res.add(new ArrayList<>());
            }

            res.get(freq[c]).add(c);
            freq[c]++;
        }

        return res;
   }
}
