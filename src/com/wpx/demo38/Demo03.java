package com.wpx.demo38;

import java.util.Collection;

/**
 * 
 * {@link LinkedList}�ײ�Ϊ����ṹ ���ҽ�ArrayList�� ����ɾ���� �ڴ�ռ䲻����
 * 
 * @author wangpx
 * @param <E>
 */
class MyLinkedList<E> {
	// ��ʼֵ
	transient int size = 0;
	//ͷ���
	transient Node<E> first;
	
	//�޲ι���
	 public MyLinkedList() {
	    
	 }
	 //......
    public void MyLinkedList(Collection<? extends E> c) {
        //���Collecion���Ӽ�
    }
	
  private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
	

}

public class Demo03 {
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
	}
}
