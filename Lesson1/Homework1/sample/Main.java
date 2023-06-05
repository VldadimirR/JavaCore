package Lesson1.Homework1.sample;

import Lesson1.Homework1.regular.First;
import Lesson1.Homework1.regular.Two;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */

public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {

        int result = Two.add(2, 4);
        System.out.println(First.methodFirst(result));
        result = Two.sub(2, 4);
        System.out.println(First.methodFirst(result));
        result = Two.mul(2, 4);
        System.out.println(First.methodFirst(result));
        result = Two.div(2, 4);
        System.out.println(First.methodFirst(result));
    }

}
