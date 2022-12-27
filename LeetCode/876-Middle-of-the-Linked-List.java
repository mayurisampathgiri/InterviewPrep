class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(head!=null) {
            len = len+1;
            head = head.next;
        }
        head = temp;
        int fin = len/2;
        while(fin > 0) {
            head = head.next;
            fin--;
        }
        return head;
    }
}
