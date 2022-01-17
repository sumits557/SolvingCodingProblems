# SolvingCodingProblems

# Problem 1. On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive one of three instructions:

  "G": go straight 1 unit;
  "L": turn 90 degrees to the left;
  "R": turn 90 degrees to the right.
  The robot performs the instructions given in order, and repeats them forever.
  
  Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
  
      Example 1:

      Input: instructions = "GGLLGG"
      Output: true
      Explanation: The robot moves from (0,0) to (0,2), turns 180 degrees, and then returns to (0,0).
      When repeating these instructions, the robot remains in the circle of radius 2 centered at the origin.
      
      Example 2:

      Input: instructions = "GG"
      Output: false
      Explanation: The robot moves north indefinitely.
      
      Example 3:

      Input: instructions = "GL"
      Output: true
      Explanation: The robot moves from (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ...
  
  # Problem 2. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    
    Example 1:

      Input: nums = [2,7,11,15], target = 9
      Output: [0,1]
      Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    
    Example 2:

      Input: nums = [3,2,4], target = 6
      Output: [1,2]
    
    Example 3:

      Input: nums = [3,3], target = 6
      Output: [0,1]


# Problem 3. Addition of two list nodes,
Inout - [2,4,3], [5,6,4]
Output - [7,0,8]

# Problem 4. Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

# Problem 5. Median of two sorted arrays.

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

# Problem 6.  Longest Palindromic Substring.

Given a string s, return the longest palindromic substring in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


# Problem 7.  Zigzag Conversion.

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"