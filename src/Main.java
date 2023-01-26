public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        // write your code here
        int one = 4648355;
        System.out.println("Значение переменной one с типом int равно " +one);
        byte two = 123;
        System.out.println("Значение переменной two с типом byte равно " +two);
        short three = 31382;
        System.out.println("Значение переменной three с типом short равно " +three);
        long four = 318546;
        System.out.println("Значение переменной four с типом long равно " + four);
        float five = (float) 5.684;
        System.out.println("Значение переменной five с типом float равно " + five);
        double six = 5.478653148;
        System.out.println("Значение переменной six с типом duoble равно " + six);
            }
    public static void task2 () {
        System.out.println("Задача 2");
        // write your code here
        float one = (float) 27.12;
        System.out.println(one);
        long two = 987678965549L;
        System.out.println(two);
        double three = 2.786;
        System.out.println(three);
        short four = 569;
        System.out.println(four);
        int five = -159;
        System.out.println(five);
        int six = 27897;
        System.out.println(six);
        byte seven = 67;
        System.out.println(seven);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // write your code here
        int studentsLP = 23;
        int studensAS = 27;
        int studensEA = 30;
        int papers = 480;
        int papersOneStudens = papers / (studentsLP + studensAS + studensEA);
        System.out.println("На каждого ученика рассчитано " + papersOneStudens + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int efficiency = 16;
        int time = 2;
        int productivityPerMinute = efficiency / time;
        int minutesInHours = 60;
        int hoursPerDay = 24;
        int dayPerMonth = 30;
        int one = 20 * productivityPerMinute;
        System.out.println("За 20 минут машина произвела " + one + " штук бутылок");
        int two = hoursPerDay * minutesInHours * productivityPerMinute;
        System.out.println("За сутки машина произвела " + two + " штук бутылок");
        int three = hoursPerDay * minutesInHours * 3 * productivityPerMinute;
        System.out.println("За 3 дня машина произвела " + three + " штук бутылок");
        int four = dayPerMonth * hoursPerDay * minutesInHours * productivityPerMinute;
        System.out.println("За месяц машина произвела " + four + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int paint = 120;
        int white = 2;
        int brown = 4;
        int klassroom = paint / (white + brown);
        int whitebuy = klassroom * white;
        int brownbuy = klassroom * brown;
        System.out.println("В школе, где " + klassroom + " классов, нужно " + whitebuy + " банок белой краски и " + brownbuy + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int bananaWeight = 80;
        int banana = 5;
        double milkWeight = 1.05;
        int milk = 200;
        int eiscreamWeight = 100;
        int eiscram = 2;
        int eggsWeight = 70;
        int eggs = 4;
        int fullBanane = bananaWeight * banana;
        double fullMilk = milkWeight * milk;
        int fullEiscream = eiscreamWeight * eiscram;
        int fullEggs = eggsWeight * eggs;
        double fullRezept = fullBanane + fullMilk + fullEggs + fullEiscream;
        System.out.println("Общий вес продуктов " + fullRezept + " в гр.");
        int grammVKg = 1000;
        double fullRezeptKg = fullRezept / grammVKg;
        System.out.println("Общий вес продуктов " + fullRezeptKg + " в кг.");
    }
    public static void  task7 () {
        System.out.println("Задача 7");
        int weihgtKG = 7;
        int grammVKg = 1000;
        int weightKg = weihgtKG * grammVKg;
        int min = 250;
        int max = 500;
        int loseWeightMin = weightKg / min;
        System.out.println(loseWeightMin+ " Дней уйдет на похудение, если спортсмен будет худеть по " + min + " грамм, в день");
        int loseWeightMax = weightKg / max;
        System.out.println(loseWeightMax + " Дней уйдет на похудение, если спортсмен будет худеть по " + max + " грамм в день");
        int loseWeightMiddle = (loseWeightMax + loseWeightMin) / 2;
        System.out.println(loseWeightMiddle + " дней в среднем уйдет на похудение");
    }
    public static void  task8 () {
        System.out.println("Задача 8");
        int mashaToGetPay = 67760;
        int denisToGetPay = 83690;
        int kristinaToGetPay = 76230;
        float salaryIncrease = (float) 1.1;
        int monthPerYear = 12;
        float mashaNewPay = mashaToGetPay * salaryIncrease;
        float denisNewPay = denisToGetPay * salaryIncrease;
        float kristinaNewPay = kristinaToGetPay * salaryIncrease;
        int mashaYearPay = mashaToGetPay * monthPerYear;
        int denisYearPay = denisToGetPay * monthPerYear;
        int kristinaYearPay = kristinaToGetPay * monthPerYear;
        float mashaYearPayNew = mashaNewPay * monthPerYear;
        float denisYearPayNew = denisNewPay * monthPerYear + 1f;
        float kristinaYearPayNew = kristinaNewPay * monthPerYear;
        float masha = mashaYearPayNew - mashaYearPay;
        float denis = denisYearPayNew - denisYearPay;
        float kristina = kristinaYearPayNew - kristinaYearPay;
        System.out.println("Маша теперь получает " + mashaNewPay + " рублей. Годовой доход вырос на " + masha + " рублей");
        System.out.println("Денис теперь получает " + denisNewPay + " рублей. Годовой доход вырос на " + denis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewPay + " рублей. Годовой доход вырос на " + kristina + " рублей");
    }
}

