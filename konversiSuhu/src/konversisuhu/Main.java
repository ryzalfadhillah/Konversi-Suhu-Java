package konversisuhu;

/**
 *
 * @author Ryzal
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //deklarasi variabel
        double suhuDalamCelcius;
        int opsiMenu;
        
        //membuat scanner untuk input nilai variabel
        Scanner input = new Scanner(System.in);
        
        System.out.println("+-------------------------------+");
        System.out.println("|   Program Konversi Suhu Air   |");
        System.out.println("+-------------------------------+");
        System.out.println("           Input Data :          ");
        System.out.println("---------------------------------");
        System.out.print("Suhu dalam celcius  : ");
        suhuDalamCelcius = input.nextDouble();
        
        do{
            Konversi celcius = new Konversi(suhuDalamCelcius);
            
            System.out.println("\nOpsi :");
            System.out.println("---------------------------------");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.println("---------------------------------");
            System.out.print("Pilih : ");
            opsiMenu = input.nextInt();
            
            switch(opsiMenu){
                case 1 -> { 
                    celcius.lihatDataKonversi();
                    celcius.kondisiAir();
                }
                case 2 -> {
                    System.out.println("---------------------------------");
                    System.out.println("\n           Input Data :        ");
                    System.out.println("---------------------------------");
                    System.out.print("Suhu dalam celcius  : ");
                    suhuDalamCelcius = input.nextDouble();
                }
                case 3 -> System.out.println("\nTerimakasih...");
                default -> System.out.println("\nOpsi tidak ada. Mohon masukan opsi dengan benar!");
            }         
        }while(opsiMenu != 3);
    }
}
