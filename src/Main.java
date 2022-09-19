public class Main {
    public static void main(String[] args) {

        //Task1
        int i = 200;
        byte b = 100;
        short s = 32767;
        long l = 9399239L;
        float f = 3.3f;
        double d = 150.3;
        char bar = 35;

        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println("Значение переменной bar с типом char равно " + bar);
        System.out.println();
        //Task2
        double v = 27.12;
        long a = 987678965549L;
        float q = 2.786f;
        boolean bl = false;
        short w = 569;
        short h = -159;
        int e = 27897;
        byte r = 67;
        System.out.println();
        //Task3
        int LudPav = 23;
        int AnnSer = 27;
        int EkAnd = 30;
        int sheetNumber = 480;
        int sheetStudent = sheetNumber /(LudPav+AnnSer+EkAnd);
        System.out.println("На каждого ученика рассчитано " + sheetStudent +" листов бумаги.");
        System.out.println();
        //Task4
        int butTwoMin = 16;
        int butOneMin = 8;
        int twentyMin = butOneMin * 20;
        int day = butOneMin * 1440;
        int threуDay = butOneMin * 4320;
        int month = butOneMin * 44640;
        System.out.println("За 20 минут, машина произвела бутылок " + twentyMin + " штук.");
        System.out.println("За сутки, машина произвела бутылок " + day + " штук.");
        System.out.println("За трое суток, машина произвела бутылок " + threуDay + " штук.");
        System.out.println("За месяц, машина произвела бутылок " + month + " штук.");
        System.out.println();
        //Task5
        int sumBan = 120;
        int white = 2;
        int brown = 4;
        int classRoom =sumBan/(white + brown);
        System.out.println("В школе,где " + classRoom +" классов,нужно " + white * classRoom + " банок белой краски и "+ brown * classRoom +" банок коричневой краски.");
        System.out.println();
        //Task6
        int banans = 80;
        int milk = 105;
        int iceCream = 200;
        int egg = 70;
        double shake = (banans * 5 + milk * 2 + iceCream + egg * 4)/1000;
        System.out.println("Вес спорт-завтрака: " + shake + " кг.");
        System.out.println();
        //Task7
        int weight = 7000;
        int dietOne = weight / 500;
        int dietTwo = weight / 250;
        int average = (dietOne + dietTwo) / 2;
        System.out.println(dietOne + " дней уйдёт на похудение,если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(dietTwo + " дней уйдёт на похудение,если спортсмен будет терять каждый день по 250 грамм. ");
        System.out.println("Может потребоваться в среднем: " + average + " дней.");
        System.out.println();
        //Task8

        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristy = 76230;

        int afterRaisingM = (salaryMaria * 10)/100 + salaryMaria;
        int afterRaisingD = (salaryDenis * 10)/100 + salaryDenis;
        int afterRaisingK = (salaryKristy * 10)/100 + salaryKristy;

        int differenceBetweenM = (afterRaisingM * 12) - (salaryMaria * 12);
        int differenceBetweenD = (afterRaisingD * 12) - (salaryDenis * 12);
        int differenceBetweenK = (afterRaisingK * 12) - (salaryKristy* 12);

        System.out.println("Маша теперь получает " + afterRaisingM + " рублей. Годовой доход вырос на " + differenceBetweenM +" рублей.");
        System.out.println("Денис теперь получает " + afterRaisingD + " рублей. Годовой доход вырос на " + differenceBetweenD +" рублей.");
        System.out.println("Кристина теперь получает " + afterRaisingK + " рублей. Годовой доход вырос на " + differenceBetweenK +" рублей.");



    }
}