import javax.swing.JOptionPane;
public class Output2{
    public static void main(String[] args){
  
      String namaDepan = "Muhammad";
      String namaTengah = "Rizqi";
      String namaBelakang = "Yusuf";
      int usia = 20;
      int targetTahunKuliah = 4;
      double ipk = 3.89764512;
      char nilaiAbjad = 'A';
      boolean tampan = true;
      
      System.out.println("Nama depan : " + namaDepan);
      System.out.println("Nama tengah : " + namaTengah);
      System.out.println("Nama belakang : " + namaBelakang);
      System.out.println("Usia : " + usia);
      System.out.println("Target Kuliah : " + targetTahunKuliah + "tahun");
      System.out.println("IPK : " + ipk);
      System.out.println("Nilai PBO : " + nilaiAbjad);
      System.out.println("Tampan : " + tampan);

      JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);
      
    }
  }