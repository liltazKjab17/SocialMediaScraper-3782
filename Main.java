```java
// Import required packages
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicDataProcessing {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 12, 9, 34, 65, 18, 45, 78, 90, 22};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Calculate the sum of the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum of the array
        System.out.println("Sum of array: " + sum);

        // Calculate the average of the array
        double average = sum / (double) numbers.length;

        // Print the average of the array
        System.out.println("Average of array: " + average);

        // Create a list from the array
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        // Print the list
        System.out.println("List: " + numberList);

        // Filter the list to only include numbers greater than 20
        List<Integer> filteredList = numberList.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("Filtered list: " + filteredList);

        // Map the list to their squares
        List<Integer> squaredList = numberList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Print the squared list
        System.out.println("Squared list: " + squaredList);

        // Find the max of the list
        int max = numberList.stream()
                .reduce(Integer::max)
                .orElse(-1);

        // Print the max of the list
        System.out.println("Max of list: " + max);

        // Find the min of the list
        int min = numberList.stream()
                .reduce(Integer::min)
                .orElse(-1);

        // Print the min of the list
        System.out.println("Min of list: " + min);
    }
}
```
Цей код виконує ряд базових операцій обробки даних, включаючи сортування, обчислення суми, обчислення середнього значення, фільтрацію, маппінг (преобразування) та знаходження мінімального та максимального значення. Всі ці операції виконуються за допомогою вбудованих функцій мови Java та Java Streams API.