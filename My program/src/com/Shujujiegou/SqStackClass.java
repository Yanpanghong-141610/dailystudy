package com.Shujujiegou;

/**
 * @ClassName SqStackClass
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/20
 **/

public class SqStackClass<E> {
    final int initcapacity = 10;
    private int capacity;
    private E[] data;
    private int top;

    public SqStackClass()
    {
        data = (E[])new Object[initcapacity];
        capacity = initcapacity;
        top = -1;
    }

    private void updateapacity(int newcapacity)
    {
        E[] newdata = (E[])new Object[newcapacity];
        for (int i=0;i<top;i++) {
            newdata[i]=data[i];
            capacity = newcapacity;
            data = newdata;
        }
    }

    public boolean empty()  //判断栈是否为空
    {
        return top==-1;
    }

    public void push(E e){   //元素e进 栈
        if (top == capacity-1){  //顺序栈空间满时倍增容量
        updateapacity(2*(top+1));}
          top++;    //栈顶指针+1
          data[top]=e;

    }

     public E pop() {  //出栈操作
         if(empty()){
             throw new IllegalArgumentException("栈空");
         }
         E e=(E)data[top];
         top --;
         if(top+1>initcapacity && top+1==capacity/4){  //满足条件容量减半
             updateapacity(capacity/2);
         }
         return e;
     }

    public E peek(){
        if (empty()){
            throw new IllegalArgumentException("栈空");
        }
        return (E)data[top];
    }
}
