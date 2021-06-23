package lect1.additionaltasks;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(getNumber(167, 135));
    }

    //TODO: Вместо void указать правильный тип данных (Сделано на лекции)
    public static void checkLength(String str, Integer strLength)
    {
        //TODO: Реализовать алгоритм, который считает количество символов 'A' в строке str.
        // Если количество символов > 5 функция должна вернуть true. В противном случае возвращает false.
        // Необходимо использовать операторы if, for в реализации алгоритма
    }

    public static boolean checkNumber(Integer number)
    {
        //TODO: Реализовать алгоритм, который возвращает true, если входной параметр number чётный
        // В противном случае вернуть false
        // PS: Чётность определяется результатом получения остатка от деления на 2. Как получить остаток от деления - гуглите.
        return number % 2 == 0;
    }

    public static Integer getNumber(Integer number1, Integer number2)
    {
        //TODO: Реализовать алгоритм, который определяет, какое из чисел (number1 или number2) ближе к 150 и возвращает
        // его в качестве результата
        if((150 - number1) < (150 - number2))
            return number1;
        else
            return number2;
    }

    //TODO: Задание "Со звёздочкой"
    public static Integer getSecondNumber(Integer number1)
    {
        //TODO: Реализовать алгоритм, который принимает трехзначное число и возвращает его вторую цифру
        // Например: Дано 658, алгоритм вернул 5
        // PS: Соответствующая цифра также определяется операцией нахождения остатка от деления
        int res = number1 % 100;
        res = res / 10;
        return res;
    }

    //TODO: Задание "Со звёздочкой"
    public static double solve(Integer a, Integer b, Integer c)
    {
        //TODO: Реализовать алгоритм, который находит сумму корней квадратного уравнения ax*x + bx + x = 0
        // Если корней не существует, необходимо вернуть -1
        // PS: Решение находится с помощью теоремы Виета или через нахождение дискриминанта
        double discriminant = (b*b) - (4 * a * c);

        if (discriminant > 0)
        {
            double x1 = (-b-Math.sqrt(discriminant))/(2*a);
            double x2 = (-b+Math.sqrt(discriminant))/(2*a);
            return x1 + x2;
        }

        if (discriminant == 0)
        {
            double x1 = (-b)/(2*a);
            return x1;
        }
        return -1;

    }
}
