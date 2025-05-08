package N02_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twosum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j= i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumHas(int[] nums, int target){
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            if(numsMap.containsKey(key)){
                return new int[]{numsMap.get(key), i};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] arg){
        TwoSum twoSum = new TwoSum();
        int[] nums = {1,2,3,4,5,6};
        int target = 10;
        int[] numbers = twoSum.twosum(nums, target);
        int[] number = twoSum.twoSumHas(nums, target);
        System.out.println("Los índices de los dos números que suman " + target + " son: [" + numbers[0] + ", " + numbers[1] + "]");
        System.out.println("Los índices de los dos números que suman " + target + " son: [" + number[0] + ", " + number[1] + "]");

    }


}
