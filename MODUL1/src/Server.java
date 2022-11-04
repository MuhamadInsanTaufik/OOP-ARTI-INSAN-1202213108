// package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("=================================");

        Scanner input = new Scanner(System.in);

        // TODO Create User
        String nama = input.nextLine();
        int nomor = input.nextInt();
        User manggil = new User();
        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // Display Menu
    }
}
