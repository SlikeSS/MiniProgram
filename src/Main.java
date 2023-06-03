import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - добавить значения в массив\n" +
                "2 - удалить значения в массив\n" +
                "3 - изменить значения в массив\n" +
                "4 - вывод массива\n" +
                "* - выход");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        String c = "*";
        if (b == "1" | b == "2" |b == "3" | b == "4") {
            switch (b) {
                case "1":
                    dobavit();
                    break;
                case "2":
                    udalit();
                    break;
                case "3":
                    izmenit();
                    break;
                case "4":
                    prosmotr();
                    break;
            }
        }
        else if (c.equals(b)){
            System.exit(0);
        }
        else {
            System.out.println("Введено неверное значение");
        }
    }
    private static void dobavit() {
        System.out.println("Введите 0 или 1");
    }
    private static void udalit() {
        System.out.println("Введите индекс в массив для его удаления");
    }
    private static void izmenit() {
        System.out.println("Введите индекс в массиве для его изменения");
    }
    private static void prosmotr(){
        System.out.println("Вид массива:");
        boolean[] array = new boolean[5];
        System.out.println(Arrays.toString(array));

    }
}