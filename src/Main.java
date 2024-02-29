public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1:");
        double deposit = 0;
        double invest = 15000; // тип double назначен для Задачи 4 - 6
        int i = 0;
        while (deposit <= 2_459_000) {
            i++;
            deposit += deposit/100;
            deposit += invest;

            System.out.println("Месяц " + i + ", сумма накоплений равна "
                    + String.format("%.2f", deposit) + " рублей");
            // Наконец-то нашел в "Обсуждениях" как округлить double до определенного знака
        }
        /*
        После того как сделаю домашку, всегда прочитываю "Обсуждения"
        и там увидел такое решение от ментора:
        Спойлер: если это будет дальше по учебе, то не нужно пояснять, просто скажите "Будет дальше")

        int amountPurpose = 12_000_000;
        int depositAmount = 15000;
        double monthlyPercent = 0.07;
        int month = 1;

        while (depositAmount <= amountPurpose) {
            depositAmount += depositAmount * monthlyPercent;
            System.out.printf("Месяц %d, сумма накоплений: %d%n", monthCount, depositAmount);
            month++;
        }
        Ход решения ясен, хочу только более подробно узнать про:
        System.out.printf("Месяц %d, сумма накоплений: %d%n", monthCount, depositAmount);
        в частности: printf - ?, %d - ?, %d%n и далее
        Есть может быть направление: что почитать, что изучить, чтобы применять?
        Или это будет дальше?
         */
        // Задание 2
        System.out.println("Задание 2:");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (num = 10; num > 0; num--) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Задание 3
        /*
        подсмотрел в "Обсуждениях" решение данной задачи через Стримы.
        Стримы - это что за зверь и как с ним бороться?
        Или снова узнаю позже?
         */
        System.out.println("Задание 3:");
        int populationCountryY = 12_000_000;
        int rate = 1000;
        int birthRatePer1000 = 17;
        int mortalityRatePer1000 = 8;
        int birthMortalityRatePer1000 = birthRatePer1000 - mortalityRatePer1000;
        for (i = 1; i <= 10; i++) {
            populationCountryY += populationCountryY * birthMortalityRatePer1000 / rate;
            System.out.println("Год " + i + ", численность населения составляет " + populationCountryY);
        }
        // Задание 4
        System.out.println("Задание 4:");
        /*
        В условиях задачи не написано, что кладутся каждый месяц по 15000.
        Я понял, что положили разово 15000 и дальше рассчитываем только прибавку процента.
        Поэтому решение такое
        invest взято из Задачи 1
        Соответственно, в Задаче 5 и Задаче 6 исходные аналогичны
         */
        int percent = 7;
        i = 1;
        System.out.println(i + " месяц - " + invest + " рублей");
        while (invest <= 12_000_000) {
            i++;
            invest += invest/100 * percent;
            System.out.println(i + " месяц - " + String.format("%.2f", invest) + " рублей");
        }
        // Задание 5
        System.out.println("Задание 5:");
        invest = 15000;
        i = 1;
        while (invest <= 12_000_000) {
            i++;
            invest += invest/100 * percent;
            if (i % 6 == 0) {
                System.out.println(i + " месяц - " + String.format("%.2f", invest) + " рублей");
            }
        }
        // Задание 6
        System.out.println("Задание 6:");
        invest = 15000;
        int nineYearsInMonth = 12 * 9;
        for (i = 2; i <= nineYearsInMonth; i++) {
            invest += invest/100 * percent;
            if (i % 6 == 0) {
                System.out.println(i + " месяц - " + String.format("%.2f", invest) + " рублей");
            }
        }
        // Задание 7
        System.out.println("Задание 7:");
        for (int day = 4; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        // Задание 8
        System.out.println("Задание 8:");
        for (int year = 0; year <= 5000; year = year + 79) {
            if (year >= 1824 && year <= 2124) {
                System.out.println(year);
            }
        }
        // Задание 8 v2 - Решение №2
        System.out.println("Задание 8 v2:");
        int year = 0;
        while (year <= 5000) {
            year++;
            if (year % 79 == 0 && year >= 1824 && year <= 2124) {
                System.out.println(year);
            }
        }
    }
}