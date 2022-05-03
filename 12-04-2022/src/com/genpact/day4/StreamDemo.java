package com.genpact.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	int id;String name;float sal;


	public Employee(int id, String name, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	
}

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "a", 3000f));
		emp.add(new Employee(2, "b", 4000f));
		emp.add(new Employee(3, "Arti", 50000f));
		emp.add(new Employee(5, "D", 34000f));
		emp.add(new Employee(6, "Amitabh", 4000f));
		emp.add(new Employee(6, "X", 6000f));

		
		System.out.println(emp);
		
		Collection<String> e = Arrays.asList("A","B","C","A");
		List<String> dis = e. stream().distinct().collect(Collectors.toList());
		
		List<String> data = emp.stream().map(s->s.name.toUpperCase()).collect(Collectors.toList());
		System.out.println(data);
		
		
		List<Float> salary = emp.stream().filter(s1->s1.sal>4000f).map(s1->s1.sal).collect(Collectors.toList());
		System.out.println("Salary : "+salary);
		
		List<String> startA = emp.stream().filter(s2->s2.name.startsWith("A")).map(s2->s2.name).collect(Collectors.toList());
		System.out.println("Start with A : "+startA);
		
		List<String> sort = emp.stream().map(s2->s2.name.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println("Sorted : "+sort);
		
		
		boolean res = emp.stream().anyMatch((b)->b.name.startsWith("b"));
		System.out.println("anymatch : "+res);
		
		res = emp.stream().allMatch((b)->b.name.startsWith("a"));
		System.out.println("Allmatch : "+res);
		
		res = emp.stream().noneMatch((b)->b.name.startsWith("d"));
		System.out.println("None match : "+res);
		
		
		Optional<String> red = emp.stream().map(a->a.name).reduce((s1,s2)->s1+" "+s2);
		System.out.println("Reduce : "+red);
		
		
		
		emp.forEach(System.out::println);
		
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(5,6,7,8);
		List<Integer> l3 = Arrays.asList(10,20,30);
		
		List<List<Integer>> listRes = Arrays.asList(l1,l2,l3);
		List<Integer> ListAns = listRes.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(ListAns);
		
		String[] [] data1 = new String[][] {{"a","b"}, {"x","y"},{"r","t"}};
		
		
		
		
		

	}

}
