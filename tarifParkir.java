import java.util.Scanner;

public class tarifParkir {
    public static void main(String[] args) {
        String platNomor;
        int jumlahjam;
        double harga;

        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nomor Plat: ");
        platNomor = s.nextLine();
        System.out.print("jumlah jam");
        jumlahjam = s.nextInt();

        if(jumlahjam >0 && jumlahjam <=1){
            harga=3000;
        }else if(jumlahjam >1 && jumlahjam<=4){
            harga=7000;
        }else if(jumlahjam > 4){
            harga = 10000;
        }else{
            harga = 0;
            System.out.println("System ");

        }   
            System.out.println(platNomor);
            System.out.println("Tarif Parkir "+harga);
            
            
        

        

    }
    
}
