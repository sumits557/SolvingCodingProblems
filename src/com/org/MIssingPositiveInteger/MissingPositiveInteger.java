import java.util.HashSet;

public class MissingPositiveInteger {

    public int solution(int[] A) {
        // special case
        if (A.length <= 0) {
            return  1;
        }
        //define int variable
        int smallest  = 1;

        //define hash set Data structure for checking array element
        // is unique or not, hash set will only add once not hte duplicate value.
        HashSet<Integer> hash = new HashSet<>();

        //define for loop
        for (int i = 0; i < A.length; i++) {
            hash.add(A[i]);
        }

        while (hash.contains(smallest)) {
            smallest++;
        }
        return smallest;
    }

}
