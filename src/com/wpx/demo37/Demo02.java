package com.wpx.demo37;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * <h2>���̴߳�������  �� �� д </h2>
 * �ɼ��� ��֤������{@link Demo01}<br>
 * ���ܱ�֤ԭ�������� {@link Demo02}<br>
 * ����취:ʹ��jdk1.5�Ժ��ԭ�ӱ���{@see java.util.concurrent.atomic}�����ṩԭ�ӱ���<br>
 *  
 *  ԭ�ӱ���:<br>
 *  	1.volatile��֤�ڴ�ɼ���<br>
 *  	2.CAS(Compare And Swap) �㷨��֤���ݵ�ԭ����<br>
 *  	CAS�㷨��Ӳ�����ڲ��������������ݵ�֧��<br>
 *  	<h4>CAS��������������:</h4><br>
 *  	�ڴ�ֵ V <br>
 *  	Ԥ��ֵ A <br>
 *  	����ֵ B <br>
 *    ���ҽ���V == A ʱ,V = B,���򽫲����κβ���		
 *  
 *  	
 * @author wangpx
 */
public class Demo02 implements Runnable{
	
	//private volatile int serialNumber ;
	private AtomicInteger serialNumber=new AtomicInteger();
	
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : "+ getSerialNumber());
	}

	public int getSerialNumber() {
		return serialNumber.getAndAdd(1);
	}
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		for (int i = 0; i < 10; i++) {
			new Thread(demo02).start();;
		}
	}

	
	
}
