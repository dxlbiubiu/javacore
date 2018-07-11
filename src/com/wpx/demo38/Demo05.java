package com.wpx.demo38;

import java.util.Date;

/**
 * 
 * == �� equals������
 * 
 * @author wangpx
 */
public class Demo05 {

	public static void main(String[] args) {
		// 1. ���ڻ����������� ֻ����== ������equals
		// ���ڻ������ͱȽ���ֵ�ǹ����
		System.out.println(1 == 1);
		// System.out.println(1 .equals(1));

		Demo05 d1 = new Demo05();
		Demo05 d2 = new Demo05();
		Demo05 d3 = d1;
		// 2. == ���ڱȽ϶���ʱ,�Ƚ��� ��ַ�����Ƿ����
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);

		// 3. equals �Ƚ϶���ʱҲ�Ƚ����ַ�����Ƿ����
		/**
		 * public boolean equals(Object obj) { return (this == obj); }
		 */
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		
		// 4.�����ַ��� �ײ���дequals���� �������ж��Ƿ�Ϊһ������ ���ж��Ƿ�ֵ���
		/*
	    public boolean equals(Object anObject) {
	        if (this == anObject) {
	            return true;
	        }
	        if (anObject instanceof String) {
	            String anotherString = (String)anObject;
	            int n = value.length;
	            if (n == anotherString.value.length) {
	                char v1[] = value;
	                char v2[] = anotherString.value;
	                int i = 0;
	                while (n-- != 0) {
	                    if (v1[i] != v2[i])
	                        return false;
	                    i++;
	                }
	                return true;
	            }
	        }
	        return false;
	    }
	    */
		String s1 = new String("wpx");
		String s2 = new String("wpx");
		System.out.println(s1.equals(s2));
		

		//5. equals ��hashCode ������
		/**
		 * ����ײ����ݵĴ洢����hash�㷨 ������һ����ϣֵ
		 * ��ϣֵ���������ĸ�������
		 * ֮��ͨ��equals���ж��Ƿ�Ϊһ������(�������string������д,Ҳ�����и�Ĭ�Ϲ���)
		 * ��ͬ�򷵻�,��ͬ����ӵ�����
		 * jdk1.8 ֮���� �������8 ʱ���ú�����洢
		 * 
		 * ����    ����
		 * 1    ����1 - ����2-
		 * 2
		 * 3
		 * ..
		 * 16
		 * 
		 */
		
		
		
	}
}
