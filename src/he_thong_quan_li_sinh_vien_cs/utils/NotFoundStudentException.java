package he_thong_quan_li_sinh_vien_cs.utils;

public class NotFoundStudentException extends Exception{
    public NotFoundStudentException() {
        super();
    }

    public NotFoundStudentException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
