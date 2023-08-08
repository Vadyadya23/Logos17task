package Homework17_Advanced.Homework17_Advanced;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface UniversityRepository extends JpaRepository<University, Long> {

    University findByName(String name);

    List<University> findByNumberOfStudentsGreaterThan(int minStudents);
	void deleteById(Long id);
	List<University> findAll();
	Object findById(Long id);
	University save(University university);
}

