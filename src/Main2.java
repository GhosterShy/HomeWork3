//KISS
//Избегание ненужного вложения кода:
//
//Упрощение логики, убрав лишние вложения:
class Number
{
    public void processNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {

        return;

    }


    for (int number : numbers) {

        if (number > 0) {

            System.out.println(number);

        }

    }

}
//Избегание ненужного использования Stream API (аналог LINQ в Java)

    public void printPositiveNumbers(int[] numbers) {

        for (int number : numbers) {

            if (number > 0) {

                System.out.println(number);

            }

        }

    }

    //Избегание избыточного использования исключений:
    //Вместо использования исключения для деления на ноль, можно добавить проверку:
    public int divide(int a, int b) {

        if (b == 0) {

            return 0;

        }

        return a / b;

    }

}






public class Main2 {
    public static void main(String[] args) {

    }
}

