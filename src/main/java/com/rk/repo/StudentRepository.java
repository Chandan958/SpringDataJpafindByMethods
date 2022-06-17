package com.rk.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByStdName(String sname);

	List<Student> findByStdFee(Double sfee);

	List<Student> findByStdIdGreaterThan(Integer sid);

	List<Student> findByStdIdGreaterThanEqual(Integer sid);

	List<Student> findByStdIdLessThan(Integer sid);

	List<Student> findByStdIdLessThanEqual(Integer sid);

	List<Student> findByStdIdBetween(Integer start, Integer end);

	List<Student> findBystdNameIsNotNull();

	List<Student> findBystdNameLike(String input);

	List<Student> findBystdNameNotLike(String input);

	List<Student> findByStdIdIn(List<Integer> sid);

	List<Student> findByStdIdNotIn(List<Integer> sid);

	List<Student> findByStdIdNotOrderByStdName(Integer sid);

	List<Student> findByStdIdOrStdName(Integer id, String name);

	List<Student> findByStdIdAndStdName(Integer id, String name);
	
	List<Student> findDistinctByStdName(String name);

}
