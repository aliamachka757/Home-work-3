public class Main {
    public static void main(String[] args) {

    //Problem 1//
        System.out.println("Problem 1");
        byte myDog = 70;
        System.out.println(" My dog weights "+ myDog + " Lb ");
        short myWeight = 210;
        System.out.println(" My weight is " +210+ " lb ");
        int husbandWeight = 310;
        System.out.println(" My Husband Weight is " + 310 + " Lb ");
        long CombineWeight = 70L+210L+310L;
        System.out.println(" Our combine weight is "+CombineWeight+ " Lb ");
        float sonSleep = 8.5f;
        System.out.println(" My youngest son sleeps " +sonSleep+" hours a night " );
        double son2Sleeps = 9.5;
        System.out.println(" My older son sleeps " +son2Sleeps + " hours a night ");

        // Problem 2 //
        System.out.println("problem 2");
        long x = 987678965549L;
        float b = 27.12f;
        double c = 2.786;
        byte v = 67;
        short y = -159;
        int g = 27897;
        char h =  569;
        boolean k = 20 > 35;
        System.out.println("x = "+ x + "");
        System.out.println("b = " + b +"");
        System.out.println("c = " + c +"");
        System.out.println("v = " + v + "" );
        System.out.println("g = " + g + "" );
        System.out.println("h = " + h + "");
        System.out.println("k = " + k + "");

        // Problem 3 //
        System.out.println("Problem 3 ");
        int class1students = 23;
        int class2students = 27;
        int  class3students = 30;
        int amountOfStudents = 23 + 27 + 30;
        int paper = 480;
        System.out.println(" На каждого ученика рассчитано " + paper / amountOfStudents  + " листов бумаги ");


        //Problem 4 //
        System.out.println(" Problem 4 ");
        short bottlePerMinute = 16 / 2;
        short bottlePerHour = 8 * 60;
        short minutes = 20;
        short day = 24;
        short threeDays = 24 * 3;
        int oneMoths = 24 * 30;

        System.out.println(" За 20 minutes машины произвела " + bottlePerMinute * 20 +  " бутылок ");
        System.out.println(" За сутки машиныа произвела " + bottlePerHour * day + " бутылок " );
        System.out.println(" За 3 дня  машиныа произвела " + threeDays * 11520 + " бутылок " );
        System.out.println(" За 1 месяц машиныа произвела " + oneMoths * 11520 + " бутылок ");






    }
}