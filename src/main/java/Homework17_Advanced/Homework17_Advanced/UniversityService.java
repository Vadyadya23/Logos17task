package Homework17_Advanced.Homework17_Advanced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public class UniversityService {
    private final UniversityRepository universityRepository;

    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public University saveUniversity(University university) {
        return universityRepository.save(university);
    }

    public Object getUniversityById(Long id) {
        return universityRepository.findById(id);
    }

    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    public void deleteUniversity(Long id) {
        universityRepository.deleteById(id);
    }
}

