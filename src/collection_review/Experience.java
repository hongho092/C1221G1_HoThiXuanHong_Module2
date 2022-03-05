package collection_review;

public class Experience extends Person{
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, int birthDate, String address, int phone, String email, int candidate, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidate);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience -> {" +super.toString()+
                ", expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
//year of experience (ExpInYear), Professional Skill (ProSkill).