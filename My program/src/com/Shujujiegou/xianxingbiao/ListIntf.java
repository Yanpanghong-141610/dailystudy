package com.Shujujiegou.xianxingbiao;

/**
 * @ClassName ListIntf
 * @Description 线性表的抽象数据类型定义
 * @Author YPH
 * @Date 2020/11/11
 **/
public interface ListIntf {
    public void size();
    public void clear();
    public void isEmpty();
    public void get(int i);
    public void indexOf(Object obj);
    public void getPre(Object obj);
    public void getNext(Object obj);
    public void insertElementAt(Object obj,int i);
    public void remove(int i);
    public void remove(Object obj);
}
