import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // sử dụng class Scanner để nhận dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n\nNhập vào chuỗi cần in hoa: ");
    message = sc.nextLine();
    System.out.println("Chuỗi sau khi in hoa: ");
    //sử dụng phương thức toUpperCase() để in hoa các ký tự trong chuỗi
    System.out.println(message.toUpperCase());
  }
}