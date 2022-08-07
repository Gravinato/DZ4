public class Main {
    public static void main(String[] args) {

//        ### Задание 1
//
//        int counter = 1;
//        while (counter < 11) {
//            System.out.print(counter + " ");
//            counter++;
//        }
//        System.out.println();
//        for (int i = counter - 1; i > 0; i--) {
//            System.out.print(i + " ");
//        }

//        ### Задание 2

        int monthDays = 31;

        for (int i = 1; i < monthDays; i = i + 7) {
            System.out.println(i + " -е число. Необходимо подготовить отчёт.");
        }

        int friday = 1;
        while (friday < monthDays) {
            System.out.println(friday + " -е число. Необходимо подготовить отчёт.");
            friday = friday + 7;
        }
//        ### Задание 3

        int currentYear = 2022;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;

        for (int i = 0; i < futureYear; i = i + 79) {
            if (i > pastYear) {
                System.out.println(i);
            }
        }
        System.out.println();
        int dayX = 0;
        while (dayX < futureYear) {
            if (dayX > pastYear) {
                System.out.println(dayX);
            }
            dayX += 79;
        }
    }
}