package lesson05;


public class ArraysLesson {
    public static void main(String[] args) {

        int [] prices = new int[3];
        prices[0] = 33;
        prices[1] = 22;
        System.out.println(prices); // выведится хещ массива

     //   for ( тип данных массива:массив){}

        // Найти максимальный элемент
       int[] task01 = {4, 6, 89, 90, 220, 560, 780};
        System.out.println(task01[task01.length-1]);

        int[] task02 = {1, 3, 7, 8, 9, 10, 13};
        int targetSum = 10;
        for (int i = 0; i < task02.length; i++) {
            for (int j = i + 1; j < task02.length; j++) {
                if (task02[i] + task02[j] == targetSum) {
                    System.out.println(task02[i]);
                    System.out.println(task02[j]);
                    break;
                }
            }

        }
        int left = 0;
        int right = task02.length - 1;

        while (left < right) {
            int sum = task02[left] + task02[right];
            if (sum == targetSum) {
                System.out.println(task02[left] + task02[right]);
                break;

            }
            else if (sum < targetSum) {
                left++;
            } else {
                right++;
            }
        }




    }
}
