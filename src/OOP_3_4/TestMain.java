package OOP_3_4;

public class TestMain {
    public static void main(String[] args) {
        MyTime time = new MyTime(12, 30, 45);

        System.out.println("Thời gian ban đầu: " + time);

        // Kiểm tra phương thức nextSecond, nextMinute, nextHour
        time.nextSecond();
        System.out.println("Giây tiếp theo: " + time);

        time.nextMinute();
        System.out.println("Phút tiếp theo: " + time);

        time.nextHour();
        System.out.println("Giờ tiếp theo: " + time);

        // Kiểm tra phương thức previousSecond, previousMinute, previousHour
        time.previousSecond();
        System.out.println("Giây trước: " + time);

        time.previousMinute();
        System.out.println("Phút trước: " + time);

        time.previousHour();
        System.out.println("Giờ trước: " + time);

        // Kiểm tra việc đặt giờ, phút và giây
        time.setHour(5);
        time.setMinute(15);
        time.setSecond(10);
        System.out.println("Thời gian sau cập nhật: " + time);

        // Kiểm tra giá trị không hợp lệ
        try {
            time.setTime(25, 70, 100); // Ném ngoại lệ IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Bắt lỗi nhập không hợp lệ: " + e.getMessage());
        }
    }
}

