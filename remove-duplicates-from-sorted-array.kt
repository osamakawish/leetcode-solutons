class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var curr = 0
        var i = 0
        while (i < nums.size) {
            var x = nums[i++]
            nums[curr++] = x
            while (i < nums.size && nums[i] == x) i++
        }
        return curr
    }
}
