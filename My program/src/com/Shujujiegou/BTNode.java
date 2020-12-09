package com.Shujujiegou;

/**
 * @ClassName BTNode
 * @Description TODO
 * @Author YPH
 * @Date 2020/11/3
 **/
public class BTNode<E> {
    E data;
    BTNode lchild;
    BTNode rchild;
    public BTNode() {
        lchild = rchild = null;
    }
    public BTNode(E d) {
        data = d;
        lchild = rchild = null;
    }
}
