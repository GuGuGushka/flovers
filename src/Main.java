import java.util.Scanner;

public class Main {

    static void PrintHeader(){
        System.out.println("Маша и Таня заебали уже переставлять эти ебаные цветы.");
        System.out.println("Давайте выясним в каком порядке они стоят сейчас.");
    }

    static int InputDays(){
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    static void Introduction(){
        System.out.print("Введите количество дней: ");
    }

    static void Indent(){
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }


    static void AfterThePermutations(){
        System.out.println("После перестановок:");
    }

    static char[] ArrayAfterThePermutations(int days,char[] flovers){
        for (int i = 0; i == days; i++) {
            for (int j = 0; j < flovers.length; j++) {
                flovers[i] = 'h';
            }

        }
        return flovers;
    }

    static void PrintAfterTheRearrangement(char[] floversAfter){
        for (int i = 0; i < floversAfter.length; i++) {
            System.out.println(floversAfter[i]);
        }
    }

    static void BeforeTheRearrangement(){
        System.out.println("До перестановки:");
    }

    static char[] ArrayBeforeTheRearrangement(){
        char[] flovers = {'G','C','V'};
        return flovers;
    }

    static void PrintBeforeTheRearrangement(char[] flovers){
        for (int i = 0; i < flovers.length; i++) {
            System.out.println(flovers[i]);
        }
    }

    public static void main(String[] args) {
        PrintHeader();

        Introduction();

        int days = InputDays();

        BeforeTheRearrangement();
        char[] flovers = ArrayBeforeTheRearrangement();
        PrintBeforeTheRearrangement(flovers);

        AfterThePermutations();
        char[] floversAfter;
        floversAfter = ArrayAfterThePermutations(days, flovers);
        PrintAfterTheRearrangement(floversAfter);
    }
}