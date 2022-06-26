package org.validBracketSequence;

import java.util.*;


public class ValidBracketSequence {

    public final Map<Character, Character> map = Map.of('(',')','{','}','[',']');

    /**
     * This method validates if the input string has valid sequence of brackets or not
     *
     * Input : "( { [ ] } )"
     * @param input of type String
     * @return boolean flag true if valid
     */
    public boolean isValidBracketSequence(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c: input.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (map.get(open) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
