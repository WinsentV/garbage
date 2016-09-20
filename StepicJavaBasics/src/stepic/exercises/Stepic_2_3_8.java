package stepic.exercises;

/**
 * Created by Alex on 14.09.2016.
 *
 * Выберите выражения, которые дадут в качестве результата строку A12.
 */
public class Stepic_2_3_8 {
    public static void main(String[] args) {
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A' + "12");
        System.out.println("A" + 12);
        System.out.println('A' + '1' + "2");
    }
}
