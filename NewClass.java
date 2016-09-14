package PerkenalanDebug;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
//        System.out.println("" + mhs.size());
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama : ");
            String nama = input.next();
            System.out.print("Masukkan no HP : ");
            String nim = input.next();
            System.out.print("Masukkan kelas : ");
            String kelas = input.next();
            Mahasiswa mhsContainer = new Mahasiswa(nama, nim, kelas);
            mhs.add(i, mhsContainer);
        }
        System.out.println("" + mhs.size());
    }
}
