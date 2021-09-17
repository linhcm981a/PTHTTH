import java.util.Scanner;

public class Point { //thành phần dữ liệu point

    int x;
    int y;
    public static Point origin = new Point();// Khai báo biến static origin biểu diễn gốc tọa độ (0, 0).

    public Point(int x, int y) {// khoi tao Point co toa do xy
        this.x = x;
        this.y = y;
    }

    public Point() {// khoi tao voi toa do 0;0
        this.x = 0;
        this.y = 0;
    }

    // tao Set va get cho x va y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

 

    // tính khoảng cách từ điểm đó đến gốc tọa độ (0,0)
    public double distance() {
        return Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2));
    }

    public static void main(String[] args) {
        double x, y; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tọa độ điểm x: ");
        x = scanner.nextDouble();
        System.out.println("Nhập tung độ điểm y: ");
        y = scanner.nextDouble();
        System.out.println("Tọa độ: (" + x + ", " + y + ")");

    }
}
