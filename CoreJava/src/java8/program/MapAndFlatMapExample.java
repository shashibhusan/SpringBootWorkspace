package java8.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Institute {
	private String instName;
	private List<String> instAddress;

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public List<String> getInstAddress() {
		return instAddress;
	}

	public void setInstAddress(List<String> instAddress) {
		this.instAddress = instAddress;
	}

	public Institute(String instName, List<String> instAddress) {
		super();
		this.instName = instName;
		this.instAddress = instAddress;
	}
}

public class MapAndFlatMapExample {

	public static void main(String[] args) {
		List<Institute> instituteList = new ArrayList<>();
		instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
		instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
		instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));

		System.out.println("Use of map() : ");
		List<String> instituteNameList = instituteList.stream().map(m -> m.getInstName()).collect(Collectors.toList());
		for (String name : instituteNameList) {
			System.out.print(" " + name);
		}

		System.out.println("\n Use of flatMap() : ");
		List<String> instituteAddressList=
		instituteList.stream().flatMap(m->m.getInstAddress().stream()).collect(Collectors.toList());
		for (String name : instituteAddressList) {
			System.out.print(" " + name);
		}

	}

}
