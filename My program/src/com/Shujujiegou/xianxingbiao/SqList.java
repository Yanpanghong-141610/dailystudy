package com.Shujujiegou.xianxingbiao;

/**
 * @ClassName SqList
 * @Description 顺序表的描述
 * @Author YPH
 * @Date 2020/11/11
 **/

public class SqList  implements ListIntf {
    final int maxlen = 1000;
    String v[] = new String[maxlen];
    int len = 0;

    int getMaxlen() {
        return maxlen;
    }

    public SqList() {
    }

    //实现接口方法
    @Override
    public void size() { };
    @Override
    public void clear(){};
    @Override
    public void isEmpty(){};
    @Override
    public void get(int i){};
    @Override
    public void indexOf(Object obj){};
    @Override
    public void getPre(Object obj){};
    @Override
    public void getNext(Object obj){};
    @Override
    public void insertElementAt(Object obj,int i){};
    @Override
    public void remove(int i){};
    @Override
    public void remove(Object obj){};

    
}
