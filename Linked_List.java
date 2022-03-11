//Diketahui saya=(Ghina Fitri Hidayah). saya adalah sebuah LinkedList.
//nama lengkap anda tsb lengkap dengan spasi.
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:

//1.add karakter lain yang anda inginkan
import java.util.LinkedList;
public class Linked_List{
    public static void main(String[] args){
        LinkedList<String> saya = new LinkedList<String>();
    
        //Karakter nama Ghina Fitri Hidayah
        saya.add("G");
        saya.add("H");
        saya.add("I");
        saya.add("N");
        saya.add("A");
        saya.add(" ");

        saya.add("F");
        saya.add("I");
        saya.add("T");
        saya.add("R");
        saya.add("I");
        saya.add(" ");

        saya.add("H");
        saya.add("I");
        saya.add("D");
        saya.add("A");
        saya.add("Y");
        saya.add("A");
        saya.add("H");
        System.out.println("=============================NAMA LENGKAP============================");
        System.out.println(saya);
        System.out.println("");
        
        //Fungsi menambahkan karakter lain
        saya.addFirst(" ");
        saya.addFirst("S");
        saya.addFirst("M");
        saya.addLast(" ");
        saya.addLast("S");
        saya.addLast("."); 
        saya.addLast("K"); 
        saya.addLast("O"); 
        saya.addLast("M"); 
   
        System.out.println("List setelah ditambahkan karaketer : " + saya);
        System.out.println("");

        // SOAL 2 sisipkan karakter lain yang anda inginkan
        saya.set(0,"K");
        saya.set(1,"A");
        saya.set(2,"K");
        
        System.out.println("Sisipan karakter lain yang diUpdate SET : "+saya);
        System.out.println("");

        // SOAL 3 hapus beberapa karaker yang ingin anda hapus
        saya.remove(0);
        saya.remove(1);
        saya.remove(2);
        System.out.println("Karakter yang dihapus REMOVE :" +saya);
        System.out.println("");

        // buat fungsi POP dan PUSH pada project anda
        saya.push("HALLO");
        System.out.println("Isi yang diUpdate Push"+saya);
        System.out.println("");

        saya.pop();
        System.out.println("Isi yang diUpdate POP"+saya);
        System.out.println("");

    }
}