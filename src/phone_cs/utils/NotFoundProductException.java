package phone_cs.utils;

public class NotFoundProductException extends Exception{
    public NotFoundProductException() {
    }

    public NotFoundProductException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
