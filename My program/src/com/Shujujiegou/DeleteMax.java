package com.Shujujiegou;

import java.util.ArrayList;
import java.util.List;

public class DeleteMax {

    static class LinkList {  //单链表泛型类
        public DeleteMax.LinkNode head;

        /**
         * 默认构造函数
         */
        public LinkList() {
            head = new DeleteMax.LinkNode();
            head.next = null;
        }

        /**
         * 构造函数初始化单向链表
         * data 泛型数组
         */
        public LinkList(Integer[] data){
            head = new DeleteMax.LinkNode();
            head.next = null;
            addArray(data);
        }
   //头插法
        public void add(Integer value) {
            LinkNode newNode = new LinkNode(value);
            newNode.next = this.head.next;
            this.head.next = newNode;
        }
       /*
       * array 待插入链表的数组
       * 遍历Integer data数组
        */
        public void addArray(Integer[] data){
            for (Integer item:data) {
                add(item);
            }
        }

        @Override
        /*
           这里的toString是Linklist对象的方法
         */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            LinkNode p = head;
            while (p.next != null) {
                sb.append(" ");
                sb.append(p.next.data);
                sb.append(" ");
                p = p.next;
            }
            sb.append("}");
            return sb.toString();
        }
    }


    static class LinkNode {
        public Integer data;
        public DeleteMax.LinkNode next;

        public LinkNode() {
            next = null;
        }

        public LinkNode(Integer d) {
            data = d;
            next = null;
        }
        public LinkNode(Integer data,LinkNode next){
            this.next = next;
            this.data = data;
        }
    }

    public static void main(String[] args) {
        //新建一个数组
        Integer[] tmp = new Integer[]{1, 2, 5, 6, 8, 4, 8, 2, 8, 5, 5, 8};
        //初始化这个对象以默认构造函数方式
        DeleteMax.LinkList temp = new DeleteMax.LinkList();
        temp.addArray(tmp);
        System.out.println("删除前的:"+temp);
        delmax(temp);


    }

    public static void delmax(LinkList list1)
    {   Integer maxe;
        LinkNode p=list1.head.next,pre;
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
        LinkNode preNode = list1.head;
        p = preNode.next;
        while(p != null){
            if (maxe.equals(p.data)) {
                preNode.next = p.next;
            }else{
                preNode =  preNode.next;
            }
            p = preNode.next;
        }
        System.out.println("删除后数组" + list1.toString());
    }
}
