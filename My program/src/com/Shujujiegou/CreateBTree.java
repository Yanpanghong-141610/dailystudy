//package com.Shujujiegou;
//
//import java.util.Stack;
//
///**
// * @ClassName CreateBTree
// * @Description
// * @Author YPH
// * @Date 2020/11/10
// **/
//
//public class CreateBTree(String str) {
//    Stack<BTNode> st = new Stack<BTNode>();
//    BTNode<Character> p=null;
//    boolean flag = true;
//    char ch;
//    int i=0;
//
//    while(i<str.length())
//    {
//        ch = str.charAt(i);
//        switch (ch){
//            case '(':
//                st.push(p);
//                flag = true;
//                break;
//            case ')':
//                st.pop();
//                break;
//            case ',':
//                flag = false;
//                break;
//            default:
//                p=new BTNode<>(Character)(ch);
//                if (b==null) b=p;
//                else {
//                    if (flag)
//                    {
//                        if(! st.empty()){st.peek().lchild = p;}
//
//                    }
//                }
//                break;
//        }
//        i++;
//    }
//}
//
//public String toString()
//{
//    bstr = "";
//    toString1(b);
//    return bstr;
//}
//private void toString1(BTNode<Character> t){
//    if(t!=null)
//    {
//        bstr += t.data;
//        if (t.lchild !=null || t.rchild !=null){
//            bstr+="(";
//            toString1(t.lchild);
//            if (t.rchild!=null)
//                bstr+=",";
//            toString1(t.rchild);
//            bstr+=")";
//        }
//    }
//}
//
//public BTNode<Character> FindNode(char x)
//{
//    return FindNode1(b,x);
//}
//
//private BTNode<Character> FindNode1(BTNode<Character> t,char x)
//{
//    BTNode<Character> p;
//    if(t == null) return null;
//    else if(t.data == x)
//        return t;
//    else{
//        p=FindNode1(t.lchild,x);
//        if(p!=null)
//            return p;
//        else
//            return FindNode1(t.rchild,x);
//    }
//}
//
//public int Height()
//{
//    return Height1(b);
//}
//
//private int Height1(BTNode<Character> t)
//{
//    int lchildh,rchildh;
//    if(t ==null) return 0;
//    else
//    {
//        lchildh = Height1(t.lchild);
//        rchildh = Height1(t.rchild);
//        return Math.max(lchildh,rchildh)+1;
//    }
//}