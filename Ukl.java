import java.util.Scanner;

/**
 *
 * @author moklet gaming
 */
public class cb7 {

    static int hitung(int nilai, int idIn) {
        int kwh[] = {1000, 1300, 1500};

        if (nilai > 50 && idIn == 1) {
            nilai = nilai * kwh[0];
        } else if (nilai > 38 && idIn == 2 || idIn == 4) {
            nilai = nilai * kwh[2];
        } else if (nilai > 33 && idIn == 3) {
            nilai = nilai * kwh[1];
        } else {
            nilai = 50000;
        }

        return nilai;

    }

    public static void main(String[] args) {
        String nama[] = {"galuh", "indro", "jedi", "kanu"};
        String alamat[] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        int id[] = {1, 2, 3, 4,};
        int golongan[] = {1, 3, 2, 3};
        int admin = 13000;

        Scanner i = new Scanner(System.in);

        System.out.println("Masukan ID Pelanggan");
        int idIn = i.nextInt();
        int x = Integer.valueOf(idIn);

        System.out.println("Masukan pemakaian listrik");
        int n = i.nextInt();
        int nilai = Integer.valueOf(n);

//        proses penilaian fungsi
        nilai = hitung(nilai, idIn);
        
        
        int y = nilai + admin;
        System.out.println("ID\t\t:" + idIn);
        System.out.println("Golongan\t:" + golongan[x - 1]);
        System.out.println("Nama\t\t:" + nama[x - 1]);
        System.out.println("Alamat\t\t:" + alamat[x - 1]);
        System.out.println("Pemakaian\t:" + n);
        System.out.println("Total\t\t:" + "Rp." + y + ",-");

    }
}
