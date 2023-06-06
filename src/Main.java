import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static ArrayList<Boolean> arrayList = new ArrayList<Boolean>();

    public static void main(String[] args) {
        while (true) {
            core();
        }
    }
    private static void core() {
        System.out.println("1 - добавить значения в массив\n" +
                "2 - удалить значения в массиве\n" +
                "3 - изменить значения в массиве\n" +
                "4 - вывод массива\n" +
                "* - выход");
        Scanner scanCore = new Scanner(System.in);
        String caseCore = scanCore.nextLine();
            switch (caseCore) {
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
                default:
                    System.out.println("Введено неверное значение");
            }
        }
    private static void view() {
        System.out.println("Вид массива:");
        for (int i = 0; i < arrayList.size(); i++) {
            Boolean b = arrayList.get(i);
            if (b == true) {
                System.out.print("1 ");
            }
            else {
                System.out.print("0 ");
            }
        }
        System.out.println("Всего элементов:"+arrayList.size());
   }
    private static void add() {
        System.out.println("Введите 0 или 1");
        Scanner scanAdd = new Scanner(System.in);
        int inputAdd = scanAdd.nextInt();
            if (inputAdd == 0) {
                arrayList.add(false);
            }
            else if (inputAdd == 1) {
                arrayList.add(true);
            } else {
                System.out.println("Неверное значение");
                while (true) {
                    add();
                    return;
                }
            }
            }
    private static void delete() {
        System.out.println("Введите индекс в массив для его удаления");
        System.out.println("Существующие индексы: " + arrayList.size());
        Scanner scanDelete = new Scanner(System.in);
        int inputDelete = scanDelete.nextInt()-1;
        if (arrayList.size()>inputDelete){
            arrayList.remove(inputDelete);}
        else if (arrayList.size()==0)
        {
            System.out.println("Массив пуст");
        }
        else {
            System.out.println("Не существует такого индекса");
        }
    }
    private static void update() {
        System.out.println("Введите индекс в массиве для его изменения");
        System.out.println("Количество существующих индексов: " + arrayList.size());
        Scanner a = new Scanner(System.in);
        int b = a.nextInt() - 1;
        if (arrayList.size() <= b) {
            System.out.println("Не существует такого индекса\n" +
                    "Введите ещё раз");
            int d = a.nextInt() - 1;
            if (arrayList.size() <= d) {
                System.out.println("Не существует такого индекса");
                System.out.println("Введите 0 или 1");
                Scanner e = new Scanner(System.in);
                int f = e.nextInt();
                if (f == 0) {
                    arrayList.add(false);
                    System.out.println("Значение добавлено");
                }
                else if (f == 1) {
                    arrayList.add(true);
                    System.out.println("Значение добавлено");
                }
                else {
                    System.out.println("Неверное значение");
                }
            }
            else if (arrayList.size()==0){
                System.out.println("Массив пуст");}
            else{
                    System.out.println("Выбран " + (d+1) + " индекс");
                    System.out.println("Меняем на 0 или 1?");
                    int z = a.nextInt();
                    if (z==0){
                        arrayList.set(z,false);
                        System.out.println("Значение индекса изменено на 0");}
                    else{arrayList.set(z,true);
                        System.out.println("Значение индекса изменено на 1");
                }
            }
        }
        else if (arrayList.size()==0){
        System.out.println("Массив пуст");}
        else
        {System.out.println("Выбран " + (b+1) + " индекс");
            System.out.println("Меняем на 0 или 1?");
            int d = a.nextInt();
            if (d==0){
            arrayList.set(b,false);
            System.out.println("Значение индекса изменено на 0");}
            else{arrayList.set(b,true);
                System.out.println("Значение индекса изменено на 1");}
            }
        }
    private static void exit()
    {System.out.println("Выход из программы");
        System.exit(0);
}
private static void change(){

}
}