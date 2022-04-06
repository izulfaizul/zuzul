/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi;
import java.util.Scanner;

/**
 *
 * @author Hewlett-Packard
 */
public class Seleksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        
        int pilih = 1;
        int pilih1 = 1;
        int pengulangan =1;
        int nik;
        String nama;
        double tulis,koding,wawancara;
        
       while (pilih<4){ 
        System.out.println("From pendaftaran PT Udin");
        System.out.println("1. Android Developer");
        System.out.println("2. Web Developer");
        System.out.println("Pilih Jenis Form : ");
        pilih = input.nextInt();
        switch(pilih){
            case 1 : 
            {
                System.out.println("");
                System.out.println("===FORM PENDAFTARAN===");
                 System.out.println("");
               
                System.out.println("input Nik:");
                nik = input.nextInt();
                System.out.println("\nInput Nilai tes tulis  :");
                tulis = input.nextDouble();
                System.out.printf("\nInput Nilai tes koding :");
                koding = input.nextDouble();
                System.out.printf("\nInput Nilai tes  wawancara:");
                wawancara = input.nextDouble();
                 hasilandroid  hasilandroid = new hasilandroid(tulis,koding,wawancara);
                
                while(pilih1 < 4){
                System.out.println("===Menu===");
                System.out.println("1. Edit"
                        + "\n2. Tampil"
                        + "\n3. Exit");
                System.out.printf("Pilih : ");
                pilih1 = input.nextInt();
                switch(pilih1){
                    case 1 :
                    {System.out.println("===edit===");
                System.out.printf("\nInput Nilai tes tulis  :");
                tulis = input.nextDouble();
                System.out.printf("\nInput Nilai tes koding :");
                koding = input.nextDouble();
                System.out.printf("\nInput Nilai tes  wawancara:");
                wawancara = input.nextDouble();
               
        
                    
                    }
                        
                        
                        
                        break;
                    case 2 : 
                    {if(hasilandroid.hasil(tulis,koding,wawancara)<85){
                        System.out.println("Nilai Akhir : "+hasilandroid.hasil(tulis,koding,wawancara));
                            System.out.println("Keterangan : Gagal");
                            System.out.println("Mohon Maaf, kepada"+nik+ "telah ditolak sebagai anggota android");
                            
                        }
                        else{
                            System.out.println("Nilai Akhir : "+hasilandroid.hasil(tulis,koding,wawancara));
                            System.out.println("Keterangan : Lolos");
                            System.out.println("Selamat telah diterima sebagai anggota android ");
                        }
                    }
                       
                        break;
                    case 3 :
                        System.out.println("Terima Kasih");
                        pilih1 = 4;
                        break;
                }
        }
            }
                break;
            case 2 :
                System.out.println("===FORM PENDAFTARAN===");
                System.out.printf("input NIK :");
                nik = input.nextInt();
               
                System.out.printf("\nInput Nilai tes tulis  :");
                tulis = input.nextDouble();
                System.out.printf("\nInput Nilai tes koding :");
                koding = input.nextDouble();
                System.out.printf("\nInput Nilai tes  wawancara:");
                wawancara = input.nextDouble();
                web  web = new web(tulis,koding,wawancara);
                while(pengulangan < 4){
                System.out.println("===Menu===");
                System.out.println("1. Edit"
                        + "\n2. Tampil"
                        + "\n3. Exit");
                System.out.printf("Pilih : ");
                pengulangan = input.nextInt();
                switch(pengulangan){
                    case 1 :
                        System.out.println("===edit===");
                System.out.printf("\nInput Nilai tes tulis  :");
                tulis = input.nextDouble();
                System.out.printf("\nInput Nilai tes koding :");
                koding = input.nextDouble();
                System.out.printf("\nInput Nilai tes  wawancara:");
                wawancara = input.nextDouble();
                        
                        break;
                    case 2 : 
                        if(web.hasil(tulis,koding,wawancara)<85){
                        System.out.println("Nilai Akhir : "+web.hasil(tulis,koding,wawancara));
                            System.out.println("Keterangan : Gagal");
                            System.out.println("Mohon Maaf,  telah ditolak sebagai anggota web");
                            
                        }
                        else{
                             System.out.println("Nilai Akhir : "+web.hasil(tulis,koding,wawancara));
                            System.out.println("Keterangan : Lolos");
                            System.out.println("Selamat,  telah diterima sebagai anggota web ");
                        }
                        
                        break;
                    case 3 :
                        System.out.println("Terima Kasih");
                         pengulangan = 4;
                        
                      
                
                }
                }
        break;
                case 3 :
                    System.out.println("Terima Kasih");
                   
                      
        }
        
        }
    }
    }
    
    

