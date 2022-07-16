import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        List<Cats> cats = Arrays.asList(
                new Cats(
                        "Peach",
                        7,
                        getRandom(),
                        getRandom(),
                        getRandom()),
                new Cats(
                        "Jasper",
                        3,
                        getRandom(),
                        getRandom(),
                        getRandom()),
                new Cats(
                        "Poppy",
                        10,
                        getRandom(),
                        getRandom(),
                        getRandom())
        );

    }

    private static int getRandom(){
        return (int) (Math.random() * 60) + 20;
    }

    public static void printCats(List<Cats> cats) {
        System.out.println("+---+----------+------+--------+------+---------+--------------+");
        System.out.println("| # |   name   |  age | health | mood | satiety | averageLevel |");
        System.out.println("+---+----------+------+--------+------+---------+--------------+");
        int count = 1;
        for (Cats cat : cats) {
            System.out.printf("| %d", count);
            count++;
            System.out.println(cat);
        }
        System.out.println("+---+----------+------+--------+------+---------+--------------+");
    }



}
