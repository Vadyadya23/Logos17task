package Homework17_Advanced.Homework17_Advanced;

import java.util.List;

public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    public University createUniversity(University university) {
        return universityService.saveUniversity(university);
    }

    public Object getUniversity(Long id) {
        return universityService.getUniversityById(id);
    }

    public List<University> getAllUniversities() {
        return universityService.getAllUniversities();
    }

    public void deleteUniversity(Long id) {
        universityService.deleteUniversity(id);
    }
}
