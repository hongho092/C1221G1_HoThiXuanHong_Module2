public class NumberEx extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public NumberEx(String message) {
        super(message);
    }
}
