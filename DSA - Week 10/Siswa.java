public class Siswa {
    String nama, nim, alamat;
    
    void setDataSiswa(String nim, String nama_siswa, String alamat) {
    nama = nama_siswa;
    this.nim = nim;
    this.alamat = alamat;
    }
    
    String getNim() {
        return nim;
    }
    
    String getNama(){
    return nama;
    }
    
    String getAlamat(){
    return alamat;
    }

    void infoSiswa(){
        System.out.println("NIM : " + getNim());
        System.out.println("NAMA : " + getNama());
        System.out.println("ALAMAT : " + getAlamat());
    }

}

   