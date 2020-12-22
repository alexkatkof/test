import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ArraySolution {


    public static void main(String[] args) {
        //Stream.empty();
        //Stream.of(1, 2, 3)
        //        .forEach(System.out::println);

        //Stream.concat(
        //        Stream.of(1, 2, 3),
        //        Stream.of(4, 5, 6))
        //                .forEach(System.out::println);

        //IntStream.of(120, 410, 85, 32, 314, 12)
         //           .filter(x -> x < 300)
         //           .map(x -> x + 11)
         //           .limit(3)
         //           .forEach(System.out::println);

        //Stream.generate(() ->  0b01010101)
         //       .limit(6)
         //       .forEach(System.out::println);

        //Stream.iterate(2, x -> x + 6)
        //        .limit(6)
        //        .forEach(System.out::println);

        //Stream.iterate(2, x -> x + 5)
         //       .filter(x -> x < 40)
         //       .forEach(System.out::println);

        //Stream.Builder<Integer> streamBuider = Stream.<Integer>builder()
        //        .add(0)
        //        .add(1);
        //for (int i = 2; i <= 8; i += 2) {
        //    streamBuider.accept(i);
        //}
        //streamBuider
        //        .add(9)
        //        .add(10)
        //        .build()
        //        .forEach(System.out::println);

        //IntStream.range(0, 10)
         //       .forEach(System.out::println);
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        //LongStream.range(-10L, -5L)
        //        .forEach(System.out::println);
        // -10, -9, -8, -7, -6

        //IntStream.rangeClosed(0, 5)
        //        .forEach(System.out::println);
        // 0, 1, 2, 3, 4, 5

        //LongStream.rangeClosed(-8L, -5L)
        //        .forEach(System.out::println);
        // -8, -7, -6, -5

        //Stream.of(1, 2, 3)
        //        .filter(x -> x == 10)
        //        .forEach(System.out::print);
        // Вывода нет, так как после фильтрации стрим станет пустым

        //Stream.of(120, 410, 85, 32, 314, 12)
         //       .filter(x -> x > 100)
         //       .forEach(System.out::println);
        // 120, 410, 314

        //Stream.of("3", "4", "5")
        //        .map(Integer::parseInt)
        //        .map(x -> x + 10)
        //        .forEach(System.out::println);
        // 13, 14, 15

        //Stream.of(120, 410, 85, 32, 314, 12)
        //        .map(x -> x + 11)
        //        .forEach(System.out::println);
        // 131, 421, 96, 43, 325, 23

        //Stream.of("10", "11", "32")
        //        .map(x -> Integer.parseInt(x, 16)) // radix это представление парсищегося числа в какой системе его представить
                                                        //в 2 - двоичной, 8- восьмиричной, 10- десятичной, 16- шестнадцатиричной
        //        .forEach(System.out::println);
        // 16 , 17 , 50











    }


}
