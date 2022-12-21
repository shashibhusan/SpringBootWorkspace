package com.shashi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		LocalDate date = LocalDate.now(); 
		LocalTime time = LocalTime.now();
		List<Employee> lt=new ArrayList<Employee>();
		
		lt.add(new Employee("shashi",time.minusMinutes(1),"Ballia",LocalDate.now()));
		lt.add(new Employee("shashi",time.minusMinutes(2),"Ballia",LocalDate.now()));
		
		lt.add(new Employee("bhusan",time.minusMinutes(3),"Noida",date.minusDays(1)));
		lt.add(new Employee("bhusan",time.minusMinutes(4),"Noida",date.minusDays(1)));
		
		lt.add(new Employee("patel",time.minusMinutes(5),"New Ashok Nagar",date.minusDays(2)));
		lt.add(new Employee("patel",time.minusMinutes(6),"New Ashok Nagar",date.minusDays(2)));
		
		Collections.sort(lt, (c1, c2) -> {

			if (c1.getJoingingDate().equals(c2.getJoingingDate())) {
				if (c1.getJoingingTime().isBefore(c2.getJoingingTime())) {
					return -1;
				} else {
					return 1;
				}
			} else if (c1.getJoingingDate().isBefore(c2.getJoingingDate())) {
				return -1;
			} else {
				return 1;
			}

		});
		
		for(int i=0; i<lt.size(); i++) {
			//System.out.println(lt.get(i).getJoingingDate()+"     "+lt.get(i).getJoingingTime());	
		}
		
		// Group By Logic
		
		List<IndicatorData> indData=new ArrayList<IndicatorData>();
		indData.add(new IndicatorData("1", "p1", "CH1", "m1"));
		indData.add(new IndicatorData("1", "p1", "CH1", "m2"));
		indData.add(new IndicatorData("1", "p1", "CH1", "m3"));
		
		indData.add(new IndicatorData("2", "p1", "CH1", "m11"));
		indData.add(new IndicatorData("2", "p1", "CH1", "m12"));
		indData.add(new IndicatorData("2", "p1", "CH1", "m13"));
		
		indData.add(new IndicatorData("11", "p1", "CH1", "m10"));
		indData.add(new IndicatorData("11", "p1", "CH1", "m100"));
		
		indData.add(new IndicatorData("a", "p1", "CH1", "m1a"));
		indData.add(new IndicatorData("a", "p1", "CH1", "m1b"));
		indData.add(new IndicatorData("a", "p1", "CH1", "m1c"));
		
		Map<String, List<IndicatorData>> groupBytechnicalObjectId = 
				indData.stream().collect(Collectors.groupingBy(IndicatorData::getTechnicalObjectId));
		
		System.out.println(groupBytechnicalObjectId);
	}

}
