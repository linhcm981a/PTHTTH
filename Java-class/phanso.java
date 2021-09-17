import java.util.Scanner;

public class phanso {  //thành phần dữ liệu phanso
    int tu;
    int mau;
    public phanso(int tu, int mau) {    //khoi tao phanso 
        this.tu = tu;
        this.mau = mau;
    }
     // tao Set va get cho tu va mau
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    // Ham nghich dao phan so
    public void Reciprocal() {
        System.out.println(this.mau + "/" + this.tu);
    }
    //congPhanSo
    public void congPhanSo(phanso ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanso phanSoTong = new phanso(ts, ms);
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
    // truPhanSo
    public void truPhanSo(phanso ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanso phanSoHieu = new phanso(ts, ms);

        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
    // nhanPhanSo
    public void nhanPhanSo(phanso ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        phanso phanSoTich = new phanso(ts, ms);
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
    // chiaPhanSo
    public void chiaPhanSo(phanso ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        phanso phanSoThuong = new phanso(ts, ms);
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
    public static void main(String[] args) {
        phanso phanSo1 = new phanso(16, 3); // tạo phân số có tử = 16 và mẫu = 4
        phanso phanSo2 = new phanso(4, 8); // tạo phân số có tử = 4 và mẫu = 8

        // gọi phương thức cộng, trừ, nhân, chia 2 phân số
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
}