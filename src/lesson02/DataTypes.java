package lesson02;

public class DataTypes {
    // тестовый коментарий. Вся строка является коментарием (например пометки)
    // можно делать сколько угодно раз
    /*
    Многострочный комментарий
    можно писать пока не закроешь тег
     */

   public static void main(String[] args) {
       //точка входа в приложение (одно приложение - одна точка входа)
       System.out.println("Консольный вывод");
       //Точка с запятой ; являеться обязательной в инструкции java
       // тип данных имяПеременной
int yearOfBirth;

int length, height;

yearOfBirth = 1990;
// во второй раз только используем только имя, тоесть обращаемся
       length = 20;
       height = 12;

       yearOfBirth = 2000;
       // при втором обращении может изменить значение переменной

int numberOfPears = 10;
int numberOfApples = 30, numberOfBananas = 40;
numberOfBananas = 100;

System.out.println(numberOfApples);
System.out.println(numberOfBananas);

byte readByte = 56;
short userAge = 35;
long temp = 12, planetAge = 4_000_000_000_000L;
// в пременной типа "long" добавляем L если числовой литерал (принято использовать L большого реестра)
       // нижние подчеркивания не выводится кодом.
System.out.println(planetAge);

float outsideTemp = -12.5f, catAge = 4.5F;
// В флоат в конце ставим f в любом реестре
double weight = 200.5;

System.out.println(outsideTemp);

boolean isActive = true;
boolean isConected = false;

       System.out.println(isActive);

       char aLetter = 'a';
// char 1 символ в одинарных ковычках либо его номер в таблице юникода
       System.out.println(aLetter);

   int numberOfStones01 = 12_000;
    long nemberOfStones02 = numberOfStones01;
       System.out.println(numberOfStones01);
       System.out.println(nemberOfStones02);

       int distance = 100;
       byte smallDistance = (byte) distance;
// int не может влезть в byte

       final int a =5;
       byte b=a;
       // явное привидение и тактическое. булен нельзя привести ни во что

       System.out.println(smallDistance);
       // объявление переменных через var
       // начиная с java 10
       var version = 10; // int
       var bigNumber = 10L; // long
       var connected = true; // boolean
       var balance = 4000.8; // double
       var nemberOfHours = 50.5F; // float
       var price = (short) 290; // нужно привести в short и byte







   }

}
