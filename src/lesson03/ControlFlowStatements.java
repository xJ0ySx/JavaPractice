package lesson03;

public class ControlFlowStatements {
    public static void main(String[] args) {

        double maxTemperatureValue = 1000;
        double curretTemperatureValue = 200.5;
        if (curretTemperatureValue > maxTemperatureValue) {
            System.out.println("Предупреждение" + "Привышено максимальное значение");
        }

        int maxScoreValue = 100;
        int curretScoreValue = 80;
        if (curretScoreValue == maxScoreValue) {
            System.out.println("Вы набрали досточное количество очков");
        } else {
            System.out.println("Вы не успели набрать достаточное количество очков. Попробуйте еще раз");
        }

        char curretChar = 'a';
        if (curretChar == 'a' || curretChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        } else if (curretChar == 'x') {
            System.out.println("Ваша роль администратор");
        } else {
            System.out.println("Вам еще не выдана роль");
        }

        boolean requestResult = false;
        if (requestResult) System.out.println("Запрос успешно обработан");
        else System.out.println("Обработка запроса завершилась неудачей");


        //Если однострочная инструкция можно не ставить фигурную скобку
//Если хотить сравнить с false используем "не" (!)
        curretChar = 'a';
        if (curretChar == 'a' || curretChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        }
        if (curretChar == 'x') {
            System.out.println("Ваша роль - администратор");
        }

        int var1 = 1;
        int var2 = 2;
        int var3 = 3;

        if (var1 > var2 && var1 > var3) {
            System.out.println(var1);
        } else if (var2 > var3 && var2 > var1) {
            System.out.println(var2);
        } else {
            System.out.println(var3);
        }
int monthNumber = 4;
        switch (monthNumber) {
            /*работает только с int
            byte
            short
            char
            enum
            String
            и Выполняеться от первого совпадения до первого break
             */
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка номера месяца");

        }
// начиная с java 14 можно использовать синтаксис switch
        // в стиле лямбда выражений (labda style)
        monthNumber = 6;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            //  default -> System.out.println("неверрный ввод"); не является обьязательноей
        }

        char seasonLetter = switch (monthNumber) {
            case 12, 1, 2 -> 'з';
            case 3, 4, 5  -> 'в';
            case 6, 7, 8  -> 'л';
            case 9, 10, 11 -> 'о';
            default -> 'e'; // обязательный блок
        } ;
        System.out.println(seasonLetter);

        seasonLetter = switch (monthNumber) {
            case 12, 1, 2 -> {
                System.out.println("Зима");
                yield 'з';
            }
            case 3, 4, 5 -> {
                System.out.println("Весна");
                yield 'в';
            }
            case 6, 7, 8 -> {
                System.out.println("Лето");
                yield 'л';
            }
            case 9, 10, 11 -> {
                System.out.println("Осень");
                yield 'о';
            }
            default -> {
                System.out.println("Ошибка");
                yield 'e';
            }
        };
        var florNumber = 1717;
        switch (florNumber) {
        case 1, 2 -> System.out.println("На этаже 7 квартир");
        case 3, 4 -> System.out.println("На этаже 5 квартир");
        case 5 -> System.out.println("На этаже 2 квартиры");
            default -> System.out.println("Этаж не выбран или не существует");
        }

    }
}





