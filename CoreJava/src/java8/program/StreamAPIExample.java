package java8.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		System.out.println(" Example of int array ");
		int a[] = { 0, 4, 6, 0, 1, 2, 4, 5, 6, 7, 8, 9, 9, 1, 2, 3, 4, 5, 6, 7 };
		int b[] = Arrays.stream(a).distinct().toArray();
		Map<Integer, Long> map = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		Arrays.sort(a);
		for (int i : b) {
			System.out.print(b[i] + " ");
		}
		System.out.println("\n Example of String array ");
		String st[] = { "0", "4", "6", "0", "2", "4", "5", "6", "7", "8", "9", "1", "2", "3", "4", "5", "6", "7" };
		String st1[] = Arrays.stream(st).distinct().toArray(String[]::new);
		String sortedArray[] = Arrays.stream(st).sorted().toArray(String[]::new);
		Map<String, Long> map1 = Arrays.stream(st)
				.collect((Collectors.groupingBy(Function.identity(), Collectors.counting())));
		System.out.println("==map1==" + map1);
		for (String j : sortedArray) {
			System.out.print(j + " ");
		}
		System.out.println("\n Example of character array ");
		char ch[] = { '0', '4', '6', '0', '1', '2', '4', '5', '6', '7', '8', '9', '9', '1', '2', '3', '4',
				'5',
				'6', '7' };

		System.out.println("// Need to find out -------------");

		System.out.println("Example of String ArrayList");
		List<String> list = new ArrayList<String>();
		list.add("shashi");
		list.add("bhusan");
		list.add("patel");
		list.add("chandra");
		list.add("bhusan");
		list.add("patel");
		// List<String> resultList =
		// list.stream().distinct().collect(Collectors.toList());
		Set<String> resultList = list.stream().collect(Collectors.toSet());
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		Map<String, Long> frequecyMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (String l : sortedList) {
			System.out.print(l + " ");
		}
		System.out.println("\nFrequency map is : " + frequecyMap);
		System.out.println("Example of object arraylist");
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("shashi", 1000));
		empList.add(new Employee("bhusan", 2000));
		empList.add(new Employee("patel", 1000));
		empList.add(new Employee("raghu", 1000));
		empList.add(new Employee("sudheer", 2500));
		List<Employee> sortList = empList.stream().sorted(Comparator.comparing(
				Employee::getSalary))
				.collect(Collectors.toList());
		for (Employee e : sortList) {
			System.out.print(e.getSalary() + " ");
		}

		Set set = new HashSet<Integer>();
		List<Employee> distictList = empList.stream().filter(i -> set.add(i.getSalary())).collect(Collectors.toList());

		for (Employee e : distictList) {
			System.out.print("\n" + e.getSalary() + " ");
		}

		Map<Integer, Long> fMap = empList
				.stream()
				.collect(
						Collectors.groupingBy(Employee::getSalary, Collectors.counting()));

		Map<Integer, List<String>> fMap1 = empList.stream().collect(
				Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.print("\n frequency fMap " + fMap);
		System.out.print("\n frequency fMap1 " + fMap1);
		System.out.println("\n Iterating Map using java 8");
		fMap1.forEach((key, value) -> System.out.print(key + " " + value));

	}

}
