public class TestNode {
    public int data;
    public TestNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TestNode getNext() {
        return next;
    }

    public void setNext(TestNode next) {
        this.next = next;
    }

    public TestNode(int data, TestNode next) {
        this.data = data;
        this.next = next;
    }

    public static TestNode reversed(TestNode head){
        TestNode preNode = null;
        TestNode curNode = head;
        TestNode nextNode = null;

        if(null == head || null == head.getNext()){
            return head;
        }else {
            while (curNode != null) {
                // nextNode = curNode.getNext();
                // nextNode.setNext(curNode);
                // curNode.setNext(preNode);
                //
                // preNode = curNode;
                // curNode = nextNode;
                nextNode = curNode.getNext();//nextNode 指向下一个节点
                curNode.setNext(preNode);//将当前节点next域指向前一个节点
                preNode = curNode;//preNode 指针向后移动
                curNode = nextNode;//curNode指针向后移动

            }
        }
        return preNode;
    }


    public static void main(String[] args) {
        TestNode node1 = new TestNode(1,null);
        TestNode node2 = new TestNode(2,node1);
        TestNode node3 = new TestNode(3,node2);
        TestNode node4 = new TestNode(4,node3);
        TestNode node5 = new TestNode(5,node4);


        TestNode myNode = reversed(node5);

        System.out.println("finish");
    }






















}
