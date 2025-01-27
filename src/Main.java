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
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte j = 67;
        System.out.println("----- Инициализация переменных выполнена -----");

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
        int allBroun =allKlass * broun;
        System.out.println("На один класс требуется " + white + " банки белой и " + broun + " банки коричневой краски");
        System.out.println("В школе, где " + allKlass + " классов" + " нужно " + allWhite + " банок белой краски и " + allBroun + " банок коричневой краски");

//        ----- =====   Задание № 6   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 6   ===== -----");







    }
}