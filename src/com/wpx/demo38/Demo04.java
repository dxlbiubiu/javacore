package com.wpx.demo38;

/**
 * java��������ǰ�Ķ���Ƕ��
 * 
 * @author wangpx
 */
public class Demo04 {

	public static void main(String[] args) {

		one: for (;;) {
			two: for (int i = 0; i < 10; i++) {
				System.out.println("i: " + i);
				if (i == 5)
					break /* one */;
			}
		}

	}
}
