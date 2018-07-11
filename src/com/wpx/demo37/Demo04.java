package com.wpx.demo37;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * ���ϲ���:<br>
 * 	�������������<br>
 *  ��������ɾ��<br >
 * 	
 * 
 * {@link ConcurrentHashMap}�������ֶλ���<br>
 
 * @author wangpx
 */

public class Demo04 {
	public static void main(String[] args) {
		Test01 test01 = new Test01();
		for(int i=0;i<10;i++) {
			new Thread(test01).start();;
		}
	}
}
/**
 * {@link CopyOnWriteArrayList} {@link CopyOnWriteArraySet}: Ӧ���ڶ���д�ٵĳ���<br>
 * ���ConcurrentModificationException����
 * @author wangpx
 */
class Test01 implements Runnable{

	//private static List<String> list = Collections.synchronizedList(new ArrayList<String>());
	
	private static List<String> list=new CopyOnWriteArrayList<>();
	
	static {
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
	}
	@Override
	public void run() {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add("111");
		}
	}
	
}