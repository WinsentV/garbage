package stepic.exercises;

/**
 * Created by Alex on 20.09.2016.
 *
 * Реализуйте метод, возвращающий ответ на вопрос:
 * правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 *
 * Можно использовать класс Math и его методы.
 * Класс Math доступен всегда, импортировать его не надо.
 *
 * В качестве примера написано заведомо неправильное выражение.
 * Исправьте его.
 */
public class Stepic_2_1_12 {
    public static boolean doubleExpression(double a, double b, double c) {
        if (java.lang.Math.abs((a + b) - c) < 1E-4 )
            return true;
        else
            return false;
    }
}
