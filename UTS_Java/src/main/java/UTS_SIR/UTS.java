/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_SIR;

import java.util.Scanner;

public class UTS {

    public static void main(String[] args) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("UTS 20 Mei oleh : \n\tABIMANYU PRIYO WIDAGDO - Nim 23201245");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
// variabel
        String namaPengguna;
        int jenisKelamin;
        String panggilan = "";

        double bilangan1;
        double bilangan2;
        char operator;
        String ulangi = null;
//      no 4 dan 5  
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Anda : ");
        namaPengguna = input.nextLine();
        System.out.println("Nickname " + namaPengguna);
//        no 6
        System.out.println("Masukkan Jenis kelamin : (1 : Laki | 2 : Perempuan)");
        jenisKelamin = input.nextInt();
        if (jenisKelamin == 1) {
            panggilan = "Mas ";
            System.out.println(panggilan + namaPengguna);
        } else if (jenisKelamin == 2) {
            panggilan = "Mbak ";
            System.out.println(panggilan + namaPengguna);
        } else {
            System.out.println("Inputan Tidak Valid!!!!");
            return;
        }
//      no 8
        System.out.println("Selamat Datang " + panggilan + namaPengguna);
        //        no 9
        System.out.println("==============Kalkulator=================");
//        no 10
        do {
            System.out.println("Silahkan masukkan bilangan 1 : ");
            bilangan1 = input.nextDouble();
            System.out.println("Silahkan masukkan bilangan 2 : ");
            bilangan2 = input.nextDouble();

            boolean validOperator = false;
            do {
                System.out.println("Silahkan Operator (+ | - | * | / ) : ");
                operator = input.next().charAt(0);

                switch (operator) {
                    case '+':
                        System.out.println("Hasil: " + (bilangan1 + bilangan2));
                        validOperator = true;
                        break;
                    case '-':
                        System.out.println("Hasil: " + (bilangan1 - bilangan2));
                        validOperator = true;
                        break;
                    case '*':
                        System.out.println("Hasil: " + (bilangan1 * bilangan2));
                        validOperator = true;
                        break;
                    case '/':
                        if (bilangan2 == 0) {
                            System.out.println("Pembagian dengan 0 tidak diizinkan!");
                        } else {
                            System.out.println("Hasil: " + (bilangan1 / bilangan2));
                        }
                        validOperator = true;
                        break;
                    default:
                        System.out.println("Operator tidak valid! Silahkan coba lagi.");
                }
            } while (!validOperator);

            System.out.println("Apakah Anda ingin mengulang program? (y/n): ");
            ulangi = input.next();

        } while (ulangi.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan program. Sampai jumpa!");
    }
}
