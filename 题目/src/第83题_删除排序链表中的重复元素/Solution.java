package 第83题_删除排序链表中的重复元素;

//存在一个按升序排列的链表，给你这个链表的头节点 head ，
//        请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
//        返回同样按升序排列的结果链表。
//        输入：head = [1,2,3,3,4,4,5]
//        输出：[1,2,5]
//        输入：head = [1,1,1,2,3]
//        输出：[2,3]

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int t=0;
        ListNode curr=head;
        if (head==null)return head;
        while(curr.next!=null){
            System.out.println(t);
            t=curr.val;
            while(t==curr.next.val){
                if (curr.next.next!=null)
                {
                    curr.next=curr.next.next;
                }else
                {
                    curr.next=null;
                    break;
                }
            }
            curr=curr.next;
            if (curr==null)break;
        }
        return head;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(3);
//        ListNode node6 = new ListNode(5);
//        ListNode node7 = new ListNode(5);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
//        node3.next=node4;
//        node4.next=node5;
//        node5.next=node6;
//        node6.next=node7;
        solution.deleteDuplicates(head);
    }
}