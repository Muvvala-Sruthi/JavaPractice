class Solution {
    public int getDecimalValue(ListNode head) {
        String s="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        return Integer.parseInt(s,2);
    }
}
