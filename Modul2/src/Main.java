import model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("19630206","Rizky","09-01-01");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());
    }
}
