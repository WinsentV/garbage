package stepic.exercises;

/**
 * Created by Alex on 13.09.2016.
 *
 * Реализуйте метод, который возвращает букву, стоящую в
 * таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 *
 * В качестве примера написано заведомо неправильное выражение.
 * Исправьте его.
 */
public class Stepic_2_2_3 {

    public static char charExpression(int a) {
        int c = '\\';
        return (char) (c + a);
    }

    public static void main(String[] args) {
        // тестовые данные
        System.out.println(charExpression(12));
        System.out.println(charExpression(29));
    }
}
