import java.util.Scanner;
public class Main {
       static String res;
       public static  void  main (String[] arqs) {
              res = calc("otvet");   // принимаем ответ метода calc
              System.out.println(res);  // печатаем ответ
       }
       public static String calc(String input ) {
              int x = 0;
              int y = 0;
              int a = 0;
              int b = 0;
              int c = 0;  // задаем переменные
              String otvet;
              String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
                      "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
                      "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                      "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII",
                      "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI",
                      "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII",
                      "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII",
                      "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX",
                      "C"};  // задаем массив римских чисел

              Scanner wwod = new Scanner(System.in);
              String primer = wwod.nextLine(); //запрашиваем ввод
              String[] data = primer.split(" ");// делим строку по пробелам
              if (data.length != 3) {
                     System.out.println("A!A!A! Должно быть два операнда и один оператор!!!");
                     System.exit(0) ;}// отсекаем неправильные выражения
              String operand1 = data[0];
              String operand2 = data[2];
              String operator = data[1];


              switch (operand1) {
                     case "1":
                            x = 1;
                            break;
                     case "2":
                            x = 2;
                            break;
                     case "3":
                            x = 3;
                            break;
                     case "4":
                            x = 4;
                            break;
                     case "5":
                            x = 5;
                            break;
                     case "6":
                            x = 6;
                            break;
                     case "7":
                            x = 7;
                            break;
                     case "8":
                            x = 8;
                            break;
                     case "9":
                            x = 9;
                            break;
                     case "10":
                            x = 10;
                            break;
                     case "I":
                            a = 1;
                            break;
                     case "II":
                            a = 2;
                            break;
                     case "III":
                            a = 3;
                            break;
                     case "IV":
                            a = 4;
                            break;
                     case "V":
                            a = 5;
                            break;
                     case "VI":
                            a = 6;
                            break;
                     case "VII":
                            a = 7;
                            break;
                     case "VIII":
                            a = 8;
                            break;
                     case "IX":
                            a = 9;
                            break;
                     case "X":
                            a = 10;
                            break;
                     default:
                            System.out.println("A!A!A! Неверный операнд 1 !!!");
                            System.exit(0)  ;// опеределяем операнд 1 и отсекаем неподходящее
              }
              switch (operand2) {
                     case "1":
                            x = 1;
                            break;
                     case "2":
                            y = 2;
                            break;
                     case "3":
                            y = 3;
                            break;
                     case "4":
                            y = 4;
                            break;
                     case "5":
                            y = 5;
                            break;
                     case "6":
                            y = 6;
                            break;
                     case "7":
                            y = 7;
                            break;
                     case "8":
                            y = 8;
                            break;
                     case "9":
                            y = 9;
                            break;
                     case "10":
                            y = 10;
                            break;
                     case "I":
                            b = 1;
                            break;
                     case "II":
                            b = 2;
                            break;
                     case "III":
                            b = 3;
                            break;
                     case "IV":
                            b = 4;
                            break;
                     case "V":
                            b = 5;
                            break;
                     case "VI":
                            b = 6;
                            break;
                     case "VII":
                            b = 7;
                            break;
                     case "VIII":
                            b = 8;
                            break;
                     case "IX":
                            b = 9;
                            break;
                     case "X":
                            b = 10;
                            break;
                     default:
                            System.out.println(" A!A!A! Неверный операнд 2 !!!");
                            System.exit(0)  ;// опеределяем операнд 2 и отсекаем неподходящее

              }
              if (x > 0 && y == 0 || x == 0 && y > 0 || a > 0 && b == 0 || a == 0 && b > 0) {
                     System.out.println(" A!A!A! Арабские и римские цифры не смешивать !!!");
                     System.exit(0)  ;// отсекаем разные системы исчислений
              }
              if (x > 0) {
                     switch (operator) {
                            case "+":
                                   c = x + y;
                                   break;
                            case "-":
                                   c = x - y;
                                   break;
                            case "*":
                                   c = x * y;
                                   break;
                            case "/":
                                   c = x / y;
                                   break;
                            default:
                                   System.out.println( "A!A!A! Неверный оператор !!!");//отсекаем неверный оператор
                                   System.exit(0)  ;

                     }
                     otvet = Integer.toString(c);
                     return otvet;   // определяем оператор и считаем если система арабская
              }
              if (a > 0) {
                     switch (operator) {
                            case "+":
                                   c = a + b;
                                   break;
                            case "-":
                                   c = a - b;
                                   break;
                            case "*":
                                   c = a * b;
                                   break;
                            case "/":
                                   c = a / b;
                                   break;
                            default:
                                   System.out.println( "A!A!A! Неверный оператор !!!");  //отсекаем неверный оператор
                                   System.exit(0)  ;


                     }
                     if (c <= 0) {
                            System.out.println("A!A!A! Римские цифры не могут быть отрицательными  или равны 0!!!");
                            System.exit(0)  ;//отсекаем отрицательные римские числа

                     }
                     otvet = rim[c - 1];
                     return otvet;// определяем оператор и считаем если система римская
              }
              String tr = " ";// этот кусок кода бесполезен , но без него пишет ошибку нет оператора возврата
              return tr;
       }
}
