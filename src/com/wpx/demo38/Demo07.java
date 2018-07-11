package com.wpx.demo38;

/**
 * ʹ��javaʵ�ֶ�����
 * 
 * ���ҽڵ�ֵ ��Ϊ�ݹ�ķ�ʽ
 * 
 * @author wangpx
 */

class Node{
	private int value;
	private Node left;
	private Node right;

	// �洢
	public void store(int value) {
		//�ų�Ĭ�ϳ�ʼֵΪ0 ��һ������Ϊ���ڵ� ������ڵ�һֱΪ0
		if(this.value == 0)
			this.value=value;
		//�жϵ�ǰֵ��С
		if( value < this.value ) {
			//����ڵ�Ϊ��
			if( left == null) {
				left = new Node();
				left.value = value;
			}else{
				left.store(value);
			}
		}else if(value > this.value) {
			if(right == null) {
				right = new Node();
				right.value=value;
				
			}else {
				right.store(value);
			}
		}
	
	}
	
	// ����ֵ
	public boolean find(int value) {
		System.out.println("��ǰֵΪ: "+this.value);
		if(value == this.value) {
			return true;
		}else if(value > this.value) {
			if(right ==null)
				return false;
			return right.find(value);
		}else {
			if(left == null)
				return false;
			return left.find(value);
		}
	}
	
	//ǰ�����
	public void perList() {
		System.out.println(this.value + ",");
		if(left != null)
			left.perList();
		if(right != null)
			right.perList();
	}
	//�������
	public void middleList() {
		if(left !=null)
			left.middleList();
		System.out.println(this.value + ",");
		if(right != null) {
			right.middleList();
		}
	}
	//�������
	public void afterList() {
		if(left != null)
			left.afterList();
		if(right != null) {
			right.afterList();
		}
		System.out.println(this.value+ ",");
	}
}
public class Demo07 {

	public static void main(String[] args) {
		Node root = new Node();
		int j=2;
		for(int i=0;i<3;i++) {
			root.store(j);
			j=j+2;
		}
		/**
		 * 2�� 
		 * 	 4��
		 *     6��
		 */
		System.out.println("ǰ����� : Ԥ��ֵ 2 4 6");
		root.perList();
		
		System.out.println("������� : Ԥ��ֵ 2 4 6 ");
		root.middleList();
		
		System.out.println("������� : Ԥ��ֵ 6 4 2");
		root.afterList();
		System.out.println(root.find(5));
	}
}
