public class ManipulateString {

    public static void main(String[] args) {
        System.out.println("Result: " + manipulateString("Pqrst", "psrqz"));
    }

    /**
     * This method compares the characters of two strings and generate the ouput as final string accordingly.
     *
     * input : String A = "Pqrst" B = "psrqz", Output = "PqRs-"
     * @param A of type String
     * @param B of type String
     * @return String result
     */
    public static String manipulateString(String A, String B) {
        String result = "";
        for(int i=0; i<A.length(); i++) {
            if (String.valueOf(A.charAt(i)).equalsIgnoreCase(String.valueOf(B.charAt(i)))) {
                result  = result.concat(String.valueOf(A.charAt(i)).toUpperCase());
            } else if (B.contains(String.valueOf(A.charAt(i)).toLowerCase())) {
                result = result.concat(String.valueOf(A.charAt(i)).toLowerCase());
            } else {
                result = result.concat("-");
            }
        }
        return result;
    }
}
