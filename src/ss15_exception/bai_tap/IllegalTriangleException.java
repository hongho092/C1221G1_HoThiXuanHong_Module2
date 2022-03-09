package ss15_exception.bai_tap;

public class IllegalTriangleException extends Throwable {
    private int a;

    public IllegalTriangleException(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String getMessage() {
        return "Cạnh nhập bị lỗi.";
    }
    public String getMessage2() {
        return "Không thể là số âm.";
    }
}
