//    Урок № 2, (   Переменные ч.1)

public class Main {
    public static void main(String[] args) {
//        System.out.println("----- =====   Урок № 2, Переменные   ===== -----");

//        ----- =====   Задание № 1   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 1   ===== -----");
        byte typeByte = 87;
        short typeShort = 27555;
        int typeInt = 299999;
        long typeLong = 123456789098765L;
        float typeFloat = 4455.5677f;
        double typeDouble = 567.1234567890;
        System.out.println("Значение переменной typeByte с типом ''byte'' равно " + typeByte);
        System.out.println("Значение переменной typeShort с типом ''short'' равно " + typeShort);
        System.out.println("Значение переменной typeInt с типом ''int'' равно " + typeInt);
        System.out.println("Значение переменной typeLong с типом ''long'' равно " + typeLong);
        System.out.println("Значение переменной typeFloat с типом ''float'' равно " + typeFloat);
        System.out.println("Значение переменной typeDouble с типом ''double'' равно " + typeDouble);

//        ----- =====   Задание № 2   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 2   ===== -----");
        float a = 27.12f;
        System.out.println("Переменная float a = " + a);
        long b = 987678965549L;
        System.out.println("Переменная long b = " + b);
        float c = 2.786f;
        System.out.println("Переменная float c = " + c);
        short d = 569;
        System.out.println("Переменная short d = " + d);
        short e = -159;
        System.out.println("Переменная short e = " + e);
        short f = 27897;
        System.out.println("Переменная short f = " + f);
        byte g = 67;
        System.out.println("Переменная byte g = " + g);
        System.out.println("----- Все  переменные инициализированы -----");

//        ----- =====   Задание № 3   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 3   ===== -----");
        byte klass_1 = 23;
        byte klass_2 = 27;
        byte klass_3 = 30;
        System.out.println("У Людмилы Павловны " + klass_1 + " ученика");
        System.out.println("У Анны Сергеевны " + klass_2 + " ученика");
        System.out.println("У Екатерины Андреевны " + klass_3 + " учеников");
        int summ = klass_1 + klass_2 + klass_3;
        System.out.println("Всего в трех классах " + summ + " учеников");
        int result = 480 / summ;
        System.out.println("На каждого ученика рассчитано по " + result + " листов бумаги.");

//        ----- =====   Задание № 4   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 4   ===== -----");
        byte limit = 16 / 2;
        int cicle_20 = limit * 20;
        int cicleDay = limit * 24 * 60;
        int cicle_3_Day = limit * 3 * 24 * 60;
        int cicleMonth = limit * 30 * 24 * 60;
        System.out.println("Производительность нашей машины " + limit + " штук бутылок в минуту");
        System.out.println("За 20 минут машина произведет " + cicle_20 + " штук бутылок");
        System.out.println("За Сутки машина произведет " + cicleDay + " штук бутылок");
        System.out.println("За 3 дня машина произведет " + cicle_3_Day + " штук бутылок");
        System.out.println("За месяц машина произведет " + cicleMonth + " штук бутылок");

//        ----- =====   Задание № 5   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 5   ===== -----");
        byte white = 2;
        byte broun = 4;
        int allKlass = 120 / (white + broun);
        int allWhite = allKlass * white;
        int allBroun = allKlass * broun;
        System.out.println("На один класс требуется " + white + " банки белой и " + broun + " банки коричневой краски");
        System.out.println("В школе, где " + allKlass + " классов" + " нужно " + allWhite + " банок белой краски и " +
                allBroun + " банок коричневой краски");

//        ----- =====   Задание № 6   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 6   ===== -----");
        short banan = 80;
        short milk = 105;
        short iceCream = 100;
        short agg = 70;
        int allWeight = 5 * banan + 2 * milk + 2 * iceCream + 4 * agg;
        int allKg = allWeight / 1000;
        int gramm = allWeight % 1000;
        System.out.println("----- Рецепт -----");
        System.out.println("Бананы " + (5 * banan) + " грамм (5 штук)");
        System.out.println("Молоко " + (2 * milk) + " грамм (1 стакан)");
        System.out.println("Мороженое-пломбир " + (2 * iceCream) + " грамм (2 брикета)");
        System.out.println("Яйца " + (4 * agg) + " грамм (4 штуки)");
        System.out.println("Общий вес готового завтрака будет " + allWeight + " грамм" + " или " + allKg +
                " килограмм " + gramm + " грамм");

//        ----- =====   Задание № 7   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 7   ===== -----");
        byte weight = 7;
        int minus_250 = (int) (weight / 0.25f);
        int minus_500 = (int) (weight / 0.5f);
        int average = (minus_250 + minus_500) / 2;
        System.out.println("Спортсмену нужно сбросить " + weight + " кг.");
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на это потребуется " + minus_250 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то на это потребуется " + minus_500 + " дней");
        System.out.println("Если спортсмен будет терять каждый день от 250 до 500 грамм, то на это в среднем потребуется "
                + average + " день");

//        ----- =====   Задание № 8   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 8   ===== -----");
        int salaryMasha = 67760;
        int salaryDen = 83690;
        int salaryKris = 76230;
        float newSalaryMasha = salaryMasha * 1.1f;
        float newSalaryDen = salaryDen * 1.1f;
        float newSalaryKris = salaryKris * 1.1f;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей в месяц. Годовой доход вырос на " + (newSalaryMasha * 12 -
                salaryMasha * 12) + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей в месяц. Годовой доход вырос на " + (newSalaryDen * 12 -
                salaryDen * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKris + " рубля в месяц. Годовой доход вырос на " + (newSalaryKris * 12 -
                salaryKris * 12) + " рублей.");

    }
}