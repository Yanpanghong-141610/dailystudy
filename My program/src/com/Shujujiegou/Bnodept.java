package com.Shujujiegou;

/**
 * @ClassName Bnodept
 * @Description
 * @Author YPH
 * @Date 2020/11/10
 **/

public class Bnodept {
    int data;
    Bnodept lchild,rchild;
    public Bnodept(int data){
        this.data = data;
        this.lchild = null;
        this.rchild = null;
    }
    public Bnodept(int data,Bnodept lchild,Bnodept rchild){
        this.data = data;
        this.lchild=lchild;
        this.rchild = rchild;
    }

    /**
     * 先根次序遍历算法
     */
    void preorder(Bnodept t){
        if(t!=null){
            visit(t.data);
            preorder(t.lchild);
            preorder(t.rchild);
        }
    }

    /**
     * 中根次序遍历算法
      */ 
    void inorder(Bnodept t){
        if(t!=null){
            inorder(t.lchild);
            visit(t.data);
            inorder(t.rchild);
        }
    }

    private void visit(int data) {
    }

    /**
     * 后根次序遍历算法
     */
    void postorder(Bnodept t){
        if (t!=null){
            postorder(t.lchild);
            postorder(t.rchild);
            visit(t.data);
        }
    }

}
