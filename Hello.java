import java.util.*;
import java.text.*;
public class Hello {
  public static void main(String []args) {
    System.out.println("Hello World"); // prints Hello World
    
    //Pemakaian waktu
    Date sekarang = new Date();
    SimpleDateFormat format_waktu = new SimpleDateFormat("dd MM yyyy");
    System.out.println("Sekarang : " + format_waktu.format(sekarang));
    
    //array biasa
    int [] numbers = {10, 20, 30, 40, 50};
    for(int x = 0; x < numbers.length; x++){
      System.out.println(numbers[x]);
    }
    
    for(int x : numbers){
      System.out.print(x + ",");
    }
    
    //array of object
    
    Mahasiswa [] daftar_mahasiswa = {
      new Mahasiswa("Mahasiswa 1", "SI-11"),
      new Mahasiswa("Mahasiswa 2", "SI-1"),
      new Mahasiswa("Mahasiswa 3", "SI-12"),
      new Mahasiswa("Mahasiswa 4", "SI-13"),
      new Mahasiswa("Mahasiswa 5", "SI-14")
    };
    for(Mahasiswa x : daftar_mahasiswa){
      System.out.println(x.nm + " - " + x.kls);
    }
    
    //string, char, enumerate
    HelloAngka angka = new HelloAngka();
    FreshJuice jus = new FreshJuice();
    String tulisan = "Wau wau wau";
    char huruf = 'A';
    System.out.println(angka.angka()); // prints Hello World
    System.out.println(jus.size.SMALL); // prints Hello World
    System.out.println(tulisan); // prints Hello World
    System.out.println(huruf); // prints Hello World
  }
}
class HelloAngka {
  public int angka(){
    return 5;
  }
}
class FreshJuice {
  enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
  FreshJuiceSize size;
}
class Mahasiswa {
  public String nm;
  public String kls;
  public Mahasiswa(String nm, String kls){
    this.nm = nm;
    this.kls = kls;
  }
}
