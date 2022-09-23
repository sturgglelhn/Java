package com.javase.danlianbiao;

/*
链表类（单向链表）
* */
public class Link {
    //头节点
    Node header;

    int size = 0;

    public int size(){
        return size;
    }

    //向链表中添加元素的方法（向末尾添加）
    public void add(Object data){
        // 创建一个新的节点对象
        // 让之前单链表的末尾节点next指向新节点对象。
        // 有可能这个元素是第一个，也可能是第二个，也可能是第三个
        if(header == null){
            header = new Node(data, null);
        }else {
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
        size++;
    }

    /**
     * 专门查找末尾节点的方法。
     */
    private Node findLast(Node node) {
        if(node.next == null){
            //如果一个节点的next是null
            // 说明这个节点就是末尾节点。
            return node;
        }
        // 程序能够到这里：node节点不是末尾节点。
        return findLast(node.next);
    }

    //删除链表中某个数据的方法
    public void remove(Object obj){

    }

    //修改链表中某个数据的方法
    public void modify(Object newObj){

    }

    //查找链表中某个元素的方法
    public int find(Object newObj){
        return 1;
    }
}
