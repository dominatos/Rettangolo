import java.util.Scanner;

public class Rettangolo {
    public Scanner sc = new Scanner(System.in);
    public int altezza;
    public int largezza;

    public void getAltezza()
    {
        System.out.println("Insira o altezza do rettangolo");
        int altezza=Integer.parseInt(sc.nextLine());
        this.altezza=altezza;
        //return altezza;
    }

    public void getLargezza() {
        System.out.println("Insira o Largezza do rettangolo");
        int largezza=Integer.parseInt(sc.nextLine());
        this.largezza=largezza;
        //return largezza;
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
        System.out.println("Altezza: "+this.altezza);
        System.out.println("Largezza: "+this.largezza);
        System.out.println("perimetro:"+this.perimetro());
        System.out.println("area: "+this.arearet());

    }
}


