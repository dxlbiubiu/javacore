package com.wpx.demo38;

import java.util.HashMap;

/**
 * ͳ�����������ִ���
 * 
 * @author wangpx
 */
public class Demo01 {

	public static void main(String[] args) {

		int[] arr=  {1,2,4,5,8,0,1,2,2,1,5};
		HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
		for (int i = 0; i < arr.length; i++) {
			//���� ����ͨ��ֵ��ȡ����
			Integer integer = hashMap.get(arr[i]);
			//Ϊ���㿪ʼ
			if(integer == null) {
				integer=0;
				hashMap.put(arr[i], integer);
			}
			//�����1
			integer++;
			hashMap.put(arr[i], integer);
		}
		System.out.println(hashMap);
	}
}
	

