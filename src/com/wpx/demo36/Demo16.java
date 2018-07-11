package com.wpx.demo36;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import org.junit.Test;

/**
 * 
 * @author wangpx
 */
public class Demo16 {
	
	/**
	 * {@link TemporalAdjuster}
	 * ʱ��У���� 
	 */
	@Test
	public void test() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime with = now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(with);
	}
	/**
	 * {@link DateTimeFormatter}
	 * ʱ���ʽ
	 */
	@Test
	public void tes02() {
		//DateTimeFormatter dfm = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter dfm = DateTimeFormatter.ofPattern("yyyy��MM��dd��");
		LocalDate now = LocalDate.now();
		String format = now.format(dfm);
		System.out.println(format);
	}
	
	
	/**
	 * ��ʱ����ʽʱ��
	 * 
	 * {@link ZonedDateTime}
	 * 
	 */
	@Test
	public void test03() {
		ZonedDateTime now1 = ZonedDateTime.now();
		System.out.println(now1.getZone());
		//�鿴����ʱ��
		System.out.println(ZoneId.getAvailableZoneIds().stream().count());
		ZoneId.getAvailableZoneIds().forEach(System.out::println);
		//ָ��ʱ�䴴������
		LocalDate now = LocalDate.now(ZoneId.of("America/Cuiaba"));
		System.out.println(now);
	}
}
