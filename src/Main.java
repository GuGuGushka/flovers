import java.util.Scanner;

public class Main {

    static void PrintHeader(){
        System.out.println("Маша и Таня заебали уже переставлять эти ебаные цветы.");
        System.out.println("Давайти выясним в каком порядке они стоят сейчас");
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
        System.out.println("После перестановок.");
    }

    static char ArrayAfterThePermutations(char[] flovers, int days){
        for (int i = 1; i < days; i++) {
            for (int j = 0; j < flovers.length; j++) {
                char first = flovers[1];
                char second = flovers[2];
                char third = flovers[3];

                flovers[1] = third;
                flovers[2] = first;
                flovers[3] = second;
            }
        }
        return flovers;
    }

    static void BeforeTheRearrangement(){
        System.out.println("До перестановки");
    }

    static char[] ArrayBeforeTheRearrangement(){
        char[] flovers = {'G','C','V'};
        return flovers;
    }

    static void PrintBeforeTheRearrangement(char[] flovers){
        for (int i = 0; i < flovers.length; i++) {
            System.out.print(flovers[i]);
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
        char floversAfter = ArrayAfterThePermutations(flovers,days);
        char[] floversAfter = ArrayAfterThePermutations();
    }
}