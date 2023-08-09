public class LatihanData {
     public static void main(String[] args) {

         String NamaSiswa = "Valen";
         char jeniskelamin = 'P';
         int usia = 15;
         double beratbadan = 40.87;
         float tinggibadan = 155.54f;
         boolean statussiswa = true;

         System.out.println("===Biodata Siswa===");
         System.out.println("Nama Siswa :" +NamaSiswa);
         System.out.println("Jenis Kelamin :" +jeniskelamin);
         System.out.println("Usia SIswa :" +usia);
         System.out.println("Berat Badan :" +beratbadan);
         System.out.println("Tinggi Badan :" +tinggibadan);
         System.out.println("Status Siswa :" +statussiswa);


         int nilaiMatematika = 90;
         int nilaiProduktif = 100;
         int nilaiInformatika = 98;
         int hasil = (nilaiMatematika + nilaiProduktif + nilaiInformatika) / 3;
         System.out.println("Rata-rata" + hasil);
         System.out.println();
    }
    
}
