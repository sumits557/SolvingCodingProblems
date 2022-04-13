public class PalindromeNumber {

        /**
         * GGiven an integer x, return true if x is palindrome integer.
         *
         * An integer is a palindrome when it reads the same backward as forward.
         *
         * For example, 121 is a palindrome while 123 is not.
         */
        public boolean isPalindrome(int x) {
            String str = String.valueOf(x);
            int start = 0;
            int end = str.length() - 1;
            while(start < end){
                if(str.charAt(start++) != str.charAt(end--)) {
                    return false;
                }
            }
            return true;
        }

}
