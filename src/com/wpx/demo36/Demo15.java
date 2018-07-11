package com.wpx.demo36;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.LocalDateTime;


import org.junit.Test;

/**
 * ��ʱ�������API
 * {@link Demo16}
 * ʱ��
 * @see com.wpx.demo36.Demo16
 * 
 * @author wangpx
 */
public class Demo15 {

	/**
	 * 
	 * ����
	 *{@link  LocalDate} 
	 * ʱ��
	 *{@link  LocalTime}
	 * ����ʱ��
	 *{@link  LocalDateTime}
	 *
	 *<br>��ͬ��ʹ�÷�ʽ �������˶�
	 */
	@Test
	public void test01() {
		//��ȡ��ǰʱ��
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		//ָ��ʱ��
		LocalDateTime of = LocalDateTime.of(2018, 8, 8, 8, 23, 12, 2);
		System.out.println(of);
		//������/��/..
		LocalDateTime plusYears = of.plusYears(1);
		System.out.println(plusYears);
		//�� ��/��/...
		LocalDateTime minusWeeks = plusYears.minusWeeks(2);
		System.out.println(minusWeeks);
		
		System.out.println(minusWeeks.getYear() +"��"+ minusWeeks.getMonth()+"��"+minusWeeks.getDayOfWeek());
	}
	/**
	 * ���������ʱ��
	 * {@link Instant} :ʱ��� (1970��1��1�� 00:00:00��ָ��ʱ��ĺ���ֵ)
	 */
	@Test
	public void test02() {
		Instant now = Instant.now();// UTCʱ��
		System.out.println(now);  
		//ƫ������
		OffsetDateTime atOffset = now.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);
		//ʱ���
		System.out.println(now.toEpochMilli());
	}
	/**
	 * {@link Duration}
	 * ��������ʱ��֮��ļ��
	 * {@link Period}
	 * ������������֮��ļ��
	 */
	@Test
	public void test03() {
		Instant now1 = Instant.now();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant now2 = Instant.now();
		Duration between = Duration.between(now1, now2);
		System.out.println(between.getSeconds());
		
		//�����ж�����
		LocalDate now3 = LocalDate.now();
		LocalDate now4 = LocalDate.now();
		LocalDate now5 = now4.plusWeeks(2);
		System.out.println(now3);
		System.out.println(now4);
		Period between2 = Period.between(now3,now5);
		System.out.println(between2.getDays());
	}
}
