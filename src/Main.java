import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Задание 1

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");

//        Задание 2
        List<Integer> numsList = new ArrayList<>(List.of(1, 8, 20, 2, 3, 10, 4, 5, 5, 6, 7));
        Set<Integer> numsSet = new HashSet<>(numsList); /* убрал повторения */
        List<Integer> numList2 = new ArrayList<>(numsSet); /* обрптно в лист для упорядоченности */
        Collections.sort(numList2);
        for (Integer integer : numList2) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println(" ");

//        Задание 3

        List<String> strings = new ArrayList<>(List.of("dog", "dog", "dog", "cat", "cat", "beard"));
        Set<String> stringsSet = new HashSet<>(strings); /* убрал повторения */
        System.out.println(stringsSet);

//        Задание 4


        int counter = 0;
        for (String s : stringsSet) {
            for (String string : strings) {
                if (s.equals(string)) {
                    counter++;
                }
            }
            if (counter > 1) {
                System.out.print(counter + " ");
            }
            counter = 0;
        }

    }
}
