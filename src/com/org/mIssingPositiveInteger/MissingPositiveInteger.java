import java.util.HashSet;

public class MissingPositiveInteger {

    public int solution(int[] A) {
        Arrays.sort(nums);
        int[] rev = new int[nums.length];
        for(int i=nums.length-1, j=0; i>=0; i--)
        {
            rev[j++] = nums[i];
        }
        int max = 0;
        for(int i=0; i<nums.length; i++)
        {
            int sum = nums[i]+rev[i];
            max = Math.max(sum, max);
        }
        return max;
    }

}
