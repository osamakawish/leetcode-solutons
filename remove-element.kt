class Solution {
    fun removeElement(nums: IntArray, v: Int): Int {
        var curr = 0
        for (x in nums) {
            if (x != v) nums[curr++] = x
        }
        return curr
    }
}
