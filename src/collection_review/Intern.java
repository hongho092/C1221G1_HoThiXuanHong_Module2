package collection_review;

public class Intern extends Person{
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
    }

    public Intern(int id, String firstName, String lastName, int birthDate, String address, int phone, String email, int candidate, String majors, String semester, String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidate);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern -> {" +super.toString()+
                ", majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
//Majors, Semester, University name