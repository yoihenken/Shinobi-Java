/**
 * konoha
 */
import java.util.Scanner;

 public class konoha {

    public static void main(String[] args) {
        //deklarasi Scanner
        Scanner scanint = new Scanner(System.in);
        Scanner scanstr = new Scanner(System.in);
        //deklari object
        dataKonoha araShinobi[] = new dataKonoha[3];
        dataKonoha objShinobi = new dataKonoha();

        //Memasukan data Sasuke
        objShinobi.setNo(012606);
        objShinobi.setNama("Uchiha Sasuke");
        objShinobi.setPeringkat("Genin");
        araShinobi[0] = objShinobi;
        //Memasukkan data Naruto
        objShinobi.setNo(012607);
        objShinobi.setNama("Uzumaki Naruto");
        objShinobi.setPeringkat("Genin");
        araShinobi[1] = objShinobi;
        //Memasukkan data Sakura
        objShinobi.setNo(012601);
        objShinobi.setNama("Haruno Sakura");
        objShinobi.setPeringkat("Chunin");
        araShinobi[2] = objShinobi;

        for (int i = 0; i< araShinobi.length; i++) {
            System.out.println("Shinobi ke-" + (i+1));
            System.out.println("No. ID\t:\t" + araShinobi[i].getNo());
            System.out.println("Nama\t:\t" + araShinobi[i].getNama());
            System.out.println("Peringkat:\t" + araShinobi[i].getPeringkat());
            System.out.println("");
        }
    }
}