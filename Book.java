public class Book {
    int id;
    String tensach;
    int nxb;

    // void taosach(int ma, String ten, int nam) {
    // this.id = ma;
    // this.tensach = ten;
    // this.nxb = nam;
    // }

    Book(int ma, String ten, int nam) {
        id = ma;
        tensach = ten;
        nxb = nam;
    }

    void inthongtin() {
        System.out.println(id + "-" + tensach + "-" + nxb);
    }

    void thongke() {

    }

    public static void main(String[] args) {
        // Book b1 = new Book();
        // b1.taosach(123, "phat trien htth", 2015);
        // b1.inthongtin();

        // Book b2 = new Book();
        // b2.taosach(234, "mang may tinh", 2005);
        // b2.inthongtin();

        Book b3 = new Book(555, "he thong may tinh", 2000);
        b3.inthongtin();

        Book b4 = new Book(555, "he thong may tinh v2", 2002);
        b4.inthongtin();
    }
}
