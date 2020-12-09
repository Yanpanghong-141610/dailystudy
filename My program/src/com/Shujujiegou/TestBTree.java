//package com.Shujujiegou;
//
///**
// * @ClassName TestBTree
// * @Description
// * @Author YPH
// * @Date 2020/11/3
// **/
//
//public class TestBTree {
//    public static void main(String[] args) {
//        String data;
//        data = "A(B(D(,G)),C(E,F))";
//        System.out.println("括号表示法"+data);
//        BTreeClass btree = new BTreeClass();
//        btree.CreateBTree(data);
//        System.out.println("树的结果:"+btree.toString());
//
//        System.out.println("查找:");
//        BTNode _node = btree.FindNode('C');
//        System.out.println(_node.data);
//        System.out.println("高度为:"+btree.Height());
//    }
//}
