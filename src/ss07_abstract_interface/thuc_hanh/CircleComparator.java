package ss07_abstract_interface.thuc_hanh;

import ss06_inheritance.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
        // comparable sử dụng ngay tại lớp của đối tượng
        // comparator muốn sử dụng phải tạo lớp khác rồi implement nó