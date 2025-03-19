import java.util.Scanner;

public class Rettangolo {
    public Scanner sc = new Scanner(System.in);
    public int altezza;
    public int largezza;

    public int getAltezza()
    {
        System.out.println("Insira o altezza do rettangolo");
        int altezza=Integer.parseInt(sc.nextLine());
        return altezza;
    }

    public int getLargezza() {
        System.out.println("Insira o Largezza do rettangolo");
        int largezza=Integer.parseInt(sc.nextLine());
        return largezza;
    }

    public int perimetro() {
        int perimetro = (this.altezza + this.largezza)*2;
        //System.out.println(perimetro
        return perimetro;
    }
    public int arearet() {
        int arearet= this.altezza*this.largezza;
        //System.out.println(arearet);
        return arearet;}
    public void stampa()
    {
        System.out.println(this.perimetro());
        System.out.println(this.arearet());
    }
}


