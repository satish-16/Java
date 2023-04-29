package Inheritance;

public class Satish extends Veer{

    public void Code(){
        System.out.println("Code");
    }
    public static void main(String[] args) {
        Satish s = new Satish();
        s.Read();
        s.Write();
        s.Code();
    }
}
