package collection_review;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Experience> experiences = new ArrayList<>();
    private List<Fresher> freshers = new ArrayList<>();
    private List<Intern> interns = new ArrayList<>();

    public PersonManager(List<Experience> experiences, List<Fresher> freshers, List<Intern> interns) {
        this.experiences = experiences;
        this.freshers = freshers;
        this.interns = interns;
    }

    public PersonManager() {
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<Fresher> getFreshers() {
        return freshers;
    }

    public void setFreshers(List<Fresher> freshers) {
        this.freshers = freshers;
    }

    public List<Intern> getInterns() {
        return interns;
    }

    public void setInterns(List<Intern> interns) {
        this.interns = interns;
    }

    public void showExperience () {
        System.out.println("List of Experience: ");
        for (Experience experience : getExperiences()) {
            System.out.println(experience);
        }
    }

    public void showFresher () {
        System.out.println("List of Fresher: ");
        for (Fresher fresher : getFreshers()) {
            System.out.println(fresher);
        }
    }

    public void showIntern () {
        System.out.println("List of Intern: ");
        for (Intern intern : getInterns()) {
            System.out.println(intern);
        }
    }

    public void addExperience (Experience experience) {
        experiences.add(experience);
    }

    public void addFresher(Fresher fresher) {
        freshers.add(fresher);
    }

    public void addIntern(Intern intern) {
        interns.add(intern);
    }
}
