import java.util.Scanner;

public class TemperatureConverter {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("|    Wpisz 1 aby przeliczyć z Stopni Celcjusza na  Fahrenheita.   |");
        System.out.println("|    Wpisz 2 aby przeliczyć z Stopni Fahrenheita na Celcjusza.    |");
        System.out.println("|    Wpisz 3 aby zakończyć program.                              |");
        System.out.println("-------------------------------------------------------------------");
        int wybor = scan.nextInt();

        double temperatura = 0.0;
        double zamiana = 0.0;
        if (wybor == 1) {
            System.out.println("Wpisz Temperature w stopniach Celcjusza:");
            temperatura = scan.nextDouble();
            zamiana = 9 / 5.0 * temperatura + 32;
            System.out.println("Temperatura " + temperatura + " w Stopniach Celcjusza = " + zamiana + "°F");
        } else if (wybor == 2) {
            System.out.println("Wpisz Temperature w stopniach Fahrenheita:");
            temperatura = scan.nextDouble();
            zamiana = 5 / 9.0 * temperatura - 32;
            System.out.println("Temperatura " + temperatura + " w Stopniach Fahrenheita = " + zamiana + "°C");

        }if (wybor == 3){
           return;

            }

        else {
            System.out.println("");
            System.out.println("Dokonaj ponownego wyboru, wybierz  1, 2 lub 3 .");
            main(args);
        }
    }
}





