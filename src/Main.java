

public class Main {

    public static void main(String[] args) {
        checkLeapYear(2021);
        deliverABankCard();
        choiceVersionApplicationFromOs();

    }

    // excersice 1
    public static void printResultOfLeapYear(int year, String textLeapYear) {
        System.out.println(year + textLeapYear);
    }

    public static void checkLeapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            printResultOfLeapYear(year, " — високосный год");
        } else {
            printResultOfLeapYear(year, " — невисокосный год");
        }

    }

    // excersice 2

    public static void choiceVersionApplicationFromOs() {
        equalsParametresDevices(1, 2021);
    }

    public static void equalsParametresDevices(int typeOs, int yearOfIssue) {
        int currentYear = 2022;
        if(typeOs == 0 && yearOfIssue > currentYear ) {
            equalsVersionAndOsAndPrintResult("облегченную версию ", "iOS");
        } else if (typeOs == 0 && yearOfIssue < currentYear ) {
            equalsVersionAndOsAndPrintResult("обычную версию ", "iOS");
        } else if (typeOs == 1 && yearOfIssue > currentYear ) {
            equalsVersionAndOsAndPrintResult("облегченную версию ", "Android");
        } else if (typeOs == 1 && yearOfIssue < currentYear ) {
            equalsVersionAndOsAndPrintResult("обычную версию ", "Android");
        }
    }

    public static void equalsVersionAndOsAndPrintResult(String version, String Os) {
        System.out.println("Установите " + version + "приложения для " + Os);
    }

    // excersice 3


    public static void deliverABankCard() {
        calculateDaysDeliver(20);
    }

    public static void calculateDaysDeliver(int deliveryDistance ) {
        int daysDelivery;
        if (deliveryDistance == 20) {
            daysDelivery = 1;
            calculateDaysDeliverAdnPrintResult(daysDelivery);
   } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            daysDelivery = 2;
            calculateDaysDeliverAdnPrintResult(daysDelivery);
    } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            daysDelivery = 3;
            calculateDaysDeliverAdnPrintResult(daysDelivery);
    }

    }
    public static void calculateDaysDeliverAdnPrintResult(int daysDelivery) {
        System.out.println( "Потребуется дней: " + daysDelivery );
    }

}