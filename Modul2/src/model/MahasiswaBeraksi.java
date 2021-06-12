package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {

        Mahasiswa mahasiswa =new Mahasiswa("19630306", "Muhammad Rizqi Yusuf", "18-01-2001");
        mahasiswa.tampilkanAtribut();

        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + "tahun");
        System.out.println("============================================");

        Mahasiswa mahasiswa2 =new Mahasiswa("19630308", "Rizka Yuni", "18-02-2002");
        mahasiswa2.tampilkanAtribut();
        mahasiswa2.menyapa();
        System.out.println("Usiaku : " + mahasiswa2.hitungUsia() + "tahun");
    }
}
