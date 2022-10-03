import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Coloque quantos metros você quer");
        System.out.print("Metros: ");
        float metros = console.nextFloat();

        float cm = (metros * 100);

        System.out.print("Em centimetros a resposta é " + cm);

    }
}