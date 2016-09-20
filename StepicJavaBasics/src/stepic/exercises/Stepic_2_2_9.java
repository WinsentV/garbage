package stepic.exercises;

/**
 * Created by Alex on 13.09.2016.
 *
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной
 * величине степенью двойки.
 *
 * Решать можно разными способами:
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой
 * задаче после просмотра соответствующих уроков).
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку
 * ввода-вывода добавит проверяющая система.
 */
public class Stepic_2_2_9 {

    public static boolean isPowerOfTwo(int value)
    {
        value = Math.abs(value);
        return value == 0 ? false : (Math.pow(2.0,Math.log(value)/Math.log(2.0)) == (double)value);
    }

    public static void main(String[] args) {
        // тестовые данные
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
    }
}
