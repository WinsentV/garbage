package stepic.exercises;

import java.math.BigInteger;

/**
 * Created by Alex on 15.09.2016.
 *
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 * Факториал N вычисляется как 1⋅2⋅...⋅N1⋅2⋅...⋅N.
 * Поскольку это очень быстро растущая функция, то даже для небольших N
 * вместимости типов int и long очень скоро не хватит. Поэтому будем использовать
 * BigInteger. Воспользуйтесь предоставленным шаблоном. Декларацию класса,
 * метод main и обработку ввода-вывода добавит проверяющая система.
 */
public class Stepic_2_4_8 {
    public static BigInteger factorial(int value)
    {
        if (value == 1)
        {
            return BigInteger.valueOf(value);
        }
        else
        {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }

    public static void main(String[] args) {
        // тестовые данные
        System.out.println(factorial(1).toString());
        System.out.println(factorial(3).toString());
        System.out.println(factorial(6).toString());
    }
}
