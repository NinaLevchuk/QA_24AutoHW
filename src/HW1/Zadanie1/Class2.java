package HW1.Zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Class2 {
    //Метод, принимающий массив целых чисел и выводящий все четные и нечетные числа
    public static void printEvenAndOdd(int[] nums) {

        // Создаем два пустых списка для четных и нечетных чисел соответственно
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // Проходимся по всем элементам массива
        //Цикл "for" выводит все четные числа из массива. Он использует оператор "%"
        // для определения остатка от деления числа на 2.
        for (int num : nums) {

            // Если число четное, добавляем его в список четных чисел
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
            // Если число нечетное, добавляем его в список нечетных чисел
            else {
                oddNumbers.add(num);
            }
        }

        // Выводим на экран все четные числа
        System.out.print("Even numbers: ");
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
        System.out.println();

        // Выводим на экран все нечетные числа
        System.out.print("Odd numbers: ");
        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " ");
        }
        System.out.println();
    }
}
