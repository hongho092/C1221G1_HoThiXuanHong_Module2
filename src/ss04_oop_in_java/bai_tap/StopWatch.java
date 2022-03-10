package ss04_oop_in_java.bai_tap;

import static java.lang.System.currentTimeMillis;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime () {
        return startTime = currentTimeMillis();
    }

    public long getEndTime() {
        return endTime = currentTimeMillis();
    }

    public long getElapsedTime() {
        long miliSecond = endTime - startTime;
        return miliSecond;
    }

    public static void main(String[] args) {
        int [] arr = new int[1000000];
        StopWatch sw = new StopWatch();
        System.out.println("Thoi gian bat dau: "+sw.getStartTime());
        for (int i=0; i<arr.length; i++) {
            arr[i]=(int)(Math.random()*10000);
        }
        System.out.println("Thoi gian ket thuc: "+sw.getEndTime());
        System.out.println("Thoi gian lech: "+sw.getElapsedTime());
    }
}
