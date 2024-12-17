# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        curr = ListNode(head.val)
        head = head.next

        while head is not None:
            prev = ListNode(head.val, curr)
            head = head.next
            curr = prev
        return curr
        
