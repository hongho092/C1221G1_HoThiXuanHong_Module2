package collection_review;

public class Fresher extends Person{
    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, int birthDate, String address, int phone, String email, int candidate, int graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher -> {" +super.toString()+
                ", graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
//graduated time (Graduation_date), Rank of Graduation (Graduation_rank) and university where student graduated (Education)