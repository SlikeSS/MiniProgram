import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean repeat = true;

    public static void main(String[] args) {
        while (repeat) {
            core();
        }
    }

    private static void core() {
        System.out.println("1 - добавить значения в массив\n" +
                "2 - удалить значения в массив\n" +
                "3 - изменить значения в массив\n" +
                "4 - вывод массива\n" +
                "* - выход");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        switch (b) {
            case "1":
                add();
                break;
            case "2":
                delete();
                break;
            case "3":
                update();
                break;
            case "4":
                view();
                break;
            case "*":
                exit();
                break;
        }
        System.out.println("Введено неверное значение");
    }

    public static void view() {
        System.out.println("Вид массива:");
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        System.out.println(arrayList);
        System.out.println("Всего элементов:"+arrayList.size());}

    public static void add() {
        System.out.println("Введите 0 или 1");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b == 0) {
            arrayList.add(false);
            System.out.println(arrayList);
        } else if (b == 1) {
            arrayList.add(true);
            System.out.println(arrayList);
        } else {
            System.out.println("Неверное значение");
        }
    }
    public static void delete() {
        System.out.println("Введите индекс в массив для его удаления");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
    }
    public static void update() {
        System.out.println("Введите индекс в массиве для его изменения");
    }
    public static void exit()
    {System.out.println("Выход из программы");
        System.exit(0);
}
}