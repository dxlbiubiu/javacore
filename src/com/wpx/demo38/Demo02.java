package com.wpx.demo38;
/**
 * 
 * {@linkArrayList}�ײ����������
 * 
 * ��{@LinkedList}��Ȳ��ҿ� ,LinkedListΪѰַ����
 * 	
 * ɾ������ӽ���
 * 
 * �ڴ�ռ�����
 * 
 * @author wangpx
 */
class MyArrayList<E>{

	//Ĭ�������С
	private static final int DEFAULT_CAPACITY=2 << 3;
	//һ���յ��������
	private static final Object[] EMPTY_ARRAYLIST= {};
	//Ԫ�ض���
	transient  Object elementData;
	//�����С
	private int size=2<<3;
	/**
	 *�޲� 
	 */
	MyArrayList(){
		this.elementData= new Object[DEFAULT_CAPACITY];
	}
	MyArrayList(int initalCapacity){
		if(initalCapacity<0)
			throw new RuntimeException("��ʼֵ��С����С��0");
		this.elementData=new Object[initalCapacity];
		this.size=initalCapacity;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}
	
	public void add(Object object) {
		this.elementData=object;
	}
	
	
}
public class Demo02 {

	public static void main(String[] args) {
		MyArrayList<Object> myArrayList = new MyArrayList<Object>(2);
		System.out.println(myArrayList.size());
		myArrayList.add("ad");
		System.out.println(myArrayList.elementData);
		
		MyArrayList<Object> myArrayList2 = new MyArrayList<Object>();
		System.out.println(myArrayList2.size());
	}
	
	
}
