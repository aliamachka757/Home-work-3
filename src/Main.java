public class Main {
    public static void main(String[] args) {

    //Problem 5//
        System.out.println("Problem 5");
        var cansOfPaint = 120;
        var whitePaint = 2;
        var browPaint = 4;
        var paintForClass = whitePaint + browPaint;
        System.out.println(paintForClass);
        System.out.println("В школе, где " + cansOfPaint/paintForClass + " классов, нужно "+ cansOfPaint/paintForClass * browPaint + " банок белой краски и " + cansOfPaint/paintForClass * 2 +" банок коричневой краски");


        // problem 6 //
        System.out.println( " Problem 6 " );
        short banana = 5;
        short weightBanana = 80;
        short milk = 200;
        short weightMilk = 100;
        short iceCream = 2;
        short iceCreamWeight = 100;
        short eggs = 4;
        short eggsWeight = 70;
        int breakfastForSportsmen = banana * weightBanana +milk * weightMilk + iceCream * iceCreamWeight + eggs * eggsWeight ;
        System.out.println("weight of breakfast for  this sportsmen  is "+breakfastForSportsmen+ " grams ");
        int grPerKg = 1000;
        float weightKg = 20880 /grPerKg ;
        System.out.println("weight of breakfast in kg is for this sportsmen  " + weightKg+" kg ");


        // problem 7 //
        System.out.println(" Problem 7 ");

        int gramPerKg = 1000;
        int weightGoalInGr = 7 * gramPerKg;
        int weightLossInDay1 = 250;
        int weightLossInda12 = 500;
        double desireWeightLoss1 = weightGoalInGr/weightLossInDay1;
        double desireWeightLoss2 = weightGoalInGr/weightLossInda12;
        System.out.println("if every day athlete will be loosing 250 gr. he will lose desire  weight in "+desireWeightLoss1 + " days  ");
        System.out.println("If every day athlete will be loosing 500 gr he will lose desire  weight in "+desireWeightLoss2 +" days ");




        //Problem 8 //

        System.out.println("Problem 8");
        long mashaMonthlyPay = 67760;
        long denisMonthlyPay = 83690;
        long kristinaMonthlyPay = 76230;
        char  payIncrease = 10;
       long mashaPayIncrease = mashaMonthlyPay/payIncrease;
        long denisPayIncrease = denisMonthlyPay/payIncrease;
        long kristinaPayIncrease = kristinaMonthlyPay/payIncrease;
       long  mashaNewPay = mashaPayIncrease + mashaMonthlyPay;
        long denisNewPay = denisPayIncrease + denisMonthlyPay;
        long kristinaNewPAy = kristinaMonthlyPay + kristinaPayIncrease;
        long mashaPayDifference = mashaNewPay - mashaMonthlyPay;
        long denisPayDifference = denisNewPay -denisMonthlyPay;
        long kristinaPayDifference = kristinaNewPAy- kristinaMonthlyPay;
        System.out.println("Маша теперь получает " + mashaNewPay + " рублей. Годовой доход вырос на " + mashaPayDifference  + " рублей");
        System.out.println("Деннисс  теперь получает " + denisNewPay + " рублей. Годовой доход вырос на " + denisPayDifference + " рублей" );
        System.out.println("Крестина   теперь получает " + kristinaNewPAy + "рублей. Годовой доход вырос на" + kristinaPayDifference +  " рублей");



        















    }
}