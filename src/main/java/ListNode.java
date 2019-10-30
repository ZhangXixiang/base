

public class ListNode {
    ListNode next;
    int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public static  ListNode fun(ListNode head){
        if(head == null) return  null;
        if(head.next == null) return  head;

        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while(cur != null){

            /*q = p.next;
            p.next = pre;
            p = q;
            p.next = pre;*/
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;

        }
        return  pre;
    }

    public  static  void  main(String[] args){
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode list3 = new ListNode();
        list1.setVal(1);
        list2.setVal(2);
        list3.setVal(3);
        list1.setNext(list2);
        list2.setNext(list3);
        ListNode node = fun(list1);
        System.out.println("");


    }






}
