package lect2.additionaltasks;

public class Main {
    public static void main(String[] args)
    {
        printNums();
    }

    // TODO: Вместо void указать правильный тип данных (если это необходимо)
    public static void sort(Integer [] arr)
    {
        //TODO: Реализовать алгоритм, который выполнит пузырьковую сортировку массива arr по убыванию.
        // Алгоритм сортировки найти самостоятельно.
        // Результат вывести в консоль
    }

    public static void printNums()
    {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //TODO: Реализовать цикл, который переберёт все элементы массива arr и выполнить следующее
        // 1) Если текущий элемент массива находится в промежутке {1..3}, вывести значение текущего элемента в консоль.
        // 2) Если текущий элемент массива находится в промежутке {4..6} продолжить цикл без вывода значения текущего элемента в консоль.
        // 3) Если текущий элемент == 9, то необходимо прервать выполнение цикла.
        // 4) Если не выполнено ни одно из условий, вывести в консоль строку : "Не знаю что делать"
        // ВАЖНО: в реализации должны быть использованы switch, break, continue, default
        for(int i = 0; i < arr.length; i++)
        {
            switch (arr[i])
            {
                case 1,2,3:
                    System.out.println(arr[i]);
                    break;
                case 4,5,6:
                    continue;
                case 9:
                    return;
                default:
                    System.out.println("Не знаю что делать");
            }
        }
    }

    public static void fib(Integer n)
    {
        //TODO: Реализовать алгоритм, который выводит первые n чисел ряда Фибоначчи(1, 1, 2, 3, 5...)
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }

    public static void fact(Integer n)
    {
        //TODO: Реализовать алгоритм, который выводит факториал входного параметра n
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
