package com.Shujujiegou.xianxingbiao.Huffman;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName HuffmanTree
 * @Description 哈夫曼树
 * @Author YPH
 * @Date 2020/11/17
 **/

public class HuffmanTree {

    public static void main(String[] args) {
        int arr[] = { 13, 7, 8, 3, 29, 6, 1 };
        Node root = createHuffmanTree(arr);

        //测试一把
      preOrder(root);

    }

    //编写一个前序遍历的方法
    public static void preOrder(Node root) {
        if(root != null) {
            root.preOrder();
        }else{
            System.out.println("是空树，不能遍历~~");
        }
    }

    // 创建赫夫曼树的方法
    /**
     *
     * @param arr 需要创建成哈夫曼树的数组
     * @return
     */
    public static Node createHuffmanTree(int[] arr) {
        // 第一步为了操作方便
        // 1. 遍历 arr 数组
        // 2. 将arr的每个元素构成成一个Node
        // 3. 将Node 放入到ArrayList中
//        List<Node> nodes = new ArrayList<Node>();
//        for (int value : arr) {
//            nodes.add(new Node(value));
//        }
//        while(nodes.size()>1){
//            //排序
//            Collections.sort(nodes);
//            System.out.println("nodes="+nodes);
//
//            Node leftNode = nodes.get(0);
//            Node rightNode = nodes.get(1);
//
//            Node parent = new Node(leftNode.value+rightNode.value);
//            parent.left = leftNode;
//            parent.right = rightNode;
//            nodes.add(parent);
//        }
//
//        return nodes.get(0);

        //1、创建叶子结点，(利用List将数组的值创建为一个一个node)
        List<Node> nodes = new ArrayList<Node>();
        for (int value:arr){
            nodes.add(new Node(value));
            //2用循环去创建哈夫曼树
            while (nodes.size()>1)
            {
                //1)对集合中的结点进行从小到大排序
                Collections.sort(nodes);
                //2)取集合中权值最小的两个节点
                Node leftNode = nodes.get(0);
                Node rightNode = nodes.get(1);
                //3)构建一棵新的二叉树
                Node parentNode = new Node(leftNode.value+rightNode.value);
                parentNode.left = leftNode;
                parentNode.right = rightNode;
                //4)对集合进行更新
                //移除
                nodes.remove(leftNode);
                nodes.remove(rightNode);
                //增加父节点
                nodes.add(parentNode);
            }
        }
        return nodes.get(0);
    }
        //我们处理的过程是一个循环的过程


}

// 创建结点类
// 为了让Node 对象持续排序Collections集合排序
// 让Node 实现Comparable接口
class Node implements Comparable<Node> {
    int value; // 结点权值
    char c; //字符
    Node left; // 指向左子结点
    Node right; // 指向右子结点

    //写一个前序遍历
    public void preOrder() {
        System.out.print(this.value+" ");
        if (this.left !=null){
            this.left.preOrder();
        }
        if (this.right !=null){
            this.right.preOrder();
        }
    }

    public Node(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    @Override
    public int compareTo(Node o) {
        // TODO Auto-generated method stub
        // 表示从小到大排序
        return this.value - o.value;
    }

}
