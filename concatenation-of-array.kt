class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(2*n) { i -> nums[i % n] }
        return ans
    }
}
