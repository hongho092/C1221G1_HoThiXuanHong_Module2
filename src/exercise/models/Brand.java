package exercise.models;

public class Brand {
    protected String code;
    protected String nameBrand;
    protected String nameCountry;

    public Brand(String code, String nameBrand, String nameCountry) {
        this.code = code;
        this.nameBrand = nameBrand;
        this.nameCountry = nameCountry;
    }

    public String brand() {
        return code+","+nameBrand+","+nameCountry;
    }

//    @Override
//    public String toString() {
//        return "Brand{" +
//                "code='" + code + '\'' +
//                ", nameBrand='" + nameBrand + '\'' +
//                ", nameCountry='" + nameCountry + '\'' +
//                '}';
//    }
}
