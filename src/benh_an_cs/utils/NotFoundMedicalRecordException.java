package benh_an_cs.utils;

public class NotFoundMedicalRecordException extends Exception{
    public NotFoundMedicalRecordException() {
        super();
    }

    public NotFoundMedicalRecordException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
