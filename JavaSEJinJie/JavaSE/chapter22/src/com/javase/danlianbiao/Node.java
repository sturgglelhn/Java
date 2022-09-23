package com.javase.danlianbiao;

/*
单链表中的节点：
节点是单向链表中基本的单元
每一个节点Node都有两个属性：
    一个属性：是存储的数据。(data)
    另一个属性：是下一个节点的内存地址。(next)

链表优点：随机增删元素效率较高（因为增删元素不涉及到大量元素位移）
链表缺点：查询效率较低，每一次查找某个元素的时候都需要从头节点开始往下遍历。
* */
public class Node {
    // 存储的数据
    Object data;

    // 下一个节点的内存地址
    Node next;
    public Node(){

    }

    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }
}
