import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> text = new ArrayList<>(List.of("В", "консоль", "выводятся", "только", "уникальные", "слова",
                "из", "списка", "слов", "Код", "работает", "с", "любой", "последовательностью", "и", "объемом", "списка", "слов"));

        task1(nums);
        task2(nums);
        task3(text);
        task4(text);
    }

    public static void task1(List<Integer> nums) {
        System.out.println("Задание 1");
        List<Integer> numbers = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                numbers.add(num);
            }
        }
        System.out.println(numbers);

    }

    public static void task2(List<Integer> nums) {
        System.out.println("Задание 2");
        Set<Integer> numsSet = new HashSet<>(List.copyOf(nums));
        List<Integer> numbers = new ArrayList<>();
        for (Integer num : numsSet) {
            if (num % 2 == 0) {
                numbers.add(num);
            }
        }
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }

    public static void task3(List<String> text) {
        System.out.println("Задание 3");
        Set<String> textSet = new HashSet<>(List.copyOf(text));
        System.out.println(textSet);
    }

    public static void task4(List<String> text) {
        System.out.println("Задание 4");
        Integer num;
        List<Integer> numbers = new ArrayList<>();
        Set<String> textSet = new HashSet<>(List.copyOf(text));
        for (String strSet : textSet) {
            num = 0;
            for (String str : text) {
                if (strSet.equals(str)) {
                    num++;
                }
            }
            if (num > 1) {
                numbers.add(num);
            }
        }
        System.out.println(numbers);
    }
}