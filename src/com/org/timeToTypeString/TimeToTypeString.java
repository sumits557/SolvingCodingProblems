public class TimeToTypeString {

    /**
     * Input: keyboard = "abcdefghijklmnopqrstuvwxy", text = "cba"
     * Output: 4
     * Explanation:
     * Initially your finger is at index 0. First you have to type 'c'. The time taken to type 'c' will be abs(2 - 0) = 2 because character 'c' is at index 2.
     * The second character is 'b' and your finger is now at index 2. The time taken to type 'b' will be abs(1 - 2) = 1 because character 'b' is at index 1.
     * The third character is 'a' and your finger is now at index 1. The time taken to type 'a' will be abs(0 - 1) = 1 because character 'a' is at index 0.
     * The total time will therefore be 2 + 1 + 1 = 4.
     *
     * @param input
     * @return
     */
    public int calculateTime(String keyboard, String inputText) {
        int result = 0;

        Map<Character, Integer> hashmap = new HashMap<Character,Integer>();
        for(int i=0; i<keyboard.length(); i++) {
            hashmap.put(keyboard.charAt(i),i);
        }

        int result = hashmap.get(word.charAt(0));

        for(int i=1; i < word.length(); i++) {
            int n = hashmap.get(word.charAt(i));
            int m = hashmap.get(word.charAt(i-1));
            System.out.println("n= " +n+ "m= "+m);
            result = result + Math.abs(n-m);
        }
        return result;
    }

 }

}
