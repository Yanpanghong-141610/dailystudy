package com.Shujujiegou;


import java.util.List;

public class DeleteMax {

    static class LinkList {  //单链表泛型类
        public DeleteMax.LinkNode head;
        public DeleteMax.LinkList temp;
        public LinkList(int[] list){
            for (L e :list)
        }

        public LinkList() {
            head = new DeleteMax.LinkNode();
            head.next = null;
        }
    }

    static class LinkNode {
        public int data;
        public DeleteMax.LinkNode next;

        public LinkNode() {
            next = null;
        }

        public LinkNode(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 5, 6, 8, 4, 8, 2, 8, 5, 5, 8};
        DeleteMax.LinkList temp = new DeleteMax.LinkList();
        delmax(temp);
    }

    public static void delmax(LinkList L)
    {   Integer maxe;
        LinkNode p=L.head.next,pre;
        maxe=p.data;

        while(p.next!=null){
            if(p.next.data>maxe)
            {
                maxe=p.next.data;
            }
            else
            {
                p=p.next;
            }
        }


    }
}
