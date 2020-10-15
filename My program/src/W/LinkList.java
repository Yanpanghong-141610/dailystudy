package W;

public class LinkList implements List {
    Node head;//头指针
    Node current;//当前结点对象
    int size;//结点个数
    //初始化一个空链表
    public LinkList(){
        //初始化头节点，让头指针指向头节点。并且让当前节点对象等于头节点
        this.head=current=new Node(null);
        this.size=0;//单向链表，初始长度为零。
    }
    //定位函数，实现当前操作对象的前一个结点，也就是让当前结点对象定位到要操作结点的前一个结点。
    //比如我们要在a2这个节点之前进行插入操作，那就先要把当前节点对象定位到a1这个节点，然后修改a1节点的指针域
    public void index(int index) throws  Exception
    {
        if(index<-1||index>size-1){
            throw  new Exception("参数错误！");
        }
        //说明在头结点之后操作。
        if(index==-1)
            return;
        current=head.next;
        int j=0;//循环变量
        while (current!=null&&j<index){
            current=current.next;
            j++;
        }

    }
//返回链表长度
    @Override
    public int size() {
        return this.size;
    }
//判断链表是否为空
    @Override
    public boolean isEmpty() {
        return this.size==0;
    }
//添加链表节点
    @Override
    public void insert(int index, Object obj) throws Exception {
        if(index<0||index>size)
        {
            throw new Exception("参数错误！");
        }
        index(index-1);//定位到要操作节点的前一个节点对象
        current.setNext(new Node(obj,current.next));
        size++;


    }
//删除链表节点
    @Override
    public void delete(int index) throws Exception {
        //判断链表是否为空
        if(isEmpty())
        {
            throw  new Exception("链表为空，无法删除！");

        }
        if(index<0||index>size)
        {
            throw new Exception("参数错误！");
        }
        index(index-1);//定位i到要操作节点的前一个节点对象。
        current.setNext(current.next.next);
        size--;

    }
//获取链表节点
    @Override
    public Object get(int index) throws Exception {
        if (index<-1||index>size-1)
        {
            throw new Exception("参数非法");

        }
        index(index);
        return current.getElement();
    }
}
