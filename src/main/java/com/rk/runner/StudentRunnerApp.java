package com.rk.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.repo.StudentRepository;

@Component
public class StudentRunnerApp implements CommandLineRunner{
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * repo.saveAll(Arrays.asList( new Student(100, "chandan", 11.0, "java"), new
		 * Student(101, "kundan", 21.0, "java project"), new Student(102, "kiran", 31.0,
		 * "OS"), new Student(103, "shiv", 41.0, "php"), new Student(104, "sushila",
		 * 51.0, "oracle"), new Student(105, "chandan", 61.0, "mysql") ));
		 * System.out.println("All Data Save");
		 */
		//repo.findByStdName("chandan").forEach(System.out::println);
		//repo.findByStdFee(21.0).forEach(System.out::println);
		//repo.findByStdIdGreaterThan(104).forEach(System.out::println);
		//repo.findByStdIdGreaterThanEqual(104).forEach(System.out::println);
		//repo.findByStdIdLessThan(104).forEach(System.out::println);
		//repo.findByStdIdLessThanEqual(104).forEach(System.out::println);
		//repo.findByStdIdBetween(101, 105).forEach(System.out::println);
		//repo.findBystdNameIsNotNull().forEach(System.out::println);
		//repo.findBystdNameLike("c%").forEach(System.out::println);
		//repo.findBystdNameNotLike("c%").forEach(System.out::println);
		//repo.findByStdIdIn(Arrays.asList(102,104,106)).forEach(System.out::println);
		//repo.findByStdIdNotIn(Arrays.asList(102,104,106)).forEach(System.out::println);
		//repo.findByStdIdNotOrderByStdName(103).forEach(System.out::println);
		//repo.findByStdIdOrStdName(104,"sushila").forEach(System.out::println);
		//repo.findByStdIdAndStdName(104,"sushila").forEach(System.out::println);
		repo.findDistinctByStdName("chandan").forEach(System.out::println);
		
		
	}
}
