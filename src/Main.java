import java.sql.SQLOutput;
import java.util.Scanner;

void main() {

    int[][] delivaries = {{120, 129, 175}, {155, 135, 139}, {129, 130, 185}};
    String[] deliveryYear = {"Delivaries 2018", "Delivaries 2019", "delivaries 2020"};
    String[] months = {"JAN","FEB","MAR"};

    int totalDelivaries = 0;
    int maximum = delivaries[0][0];
    int minimum = delivaries[0][0];

    System.out.println("***********************=======*****************************");
    System.out.println("DELIVARIES REPORT");
    System.out.println("*****************************************************");

    //System that is used to print the months
    System.out.printf("%-18s", " ");
    for(int month = 0; month < months.length; month++){
        System.out.printf("%-8s", months[month]);
    }

    System.out.println();
    for(int delivaryYear = 0; delivaryYear < delivaries.length; delivaryYear++) {
        System.out.printf("%-18s", deliveryYear[delivaryYear]);

        int delivaryYearTotal = 0;

        for(int month = 0; month < delivaries[delivaryYear].length; month++){
            System.out.printf("%-8d", delivaries[delivaryYear][month]);

            totalDelivaries += delivaries[delivaryYear][month];


            if(delivaries[delivaryYear][month] > maximum) {
                maximum = delivaries[delivaryYear][month];
            }
            if(delivaries[delivaryYear][month] < minimum){
                minimum = delivaries[delivaryYear][month];
            }
        }
        System.out.println();
    }
    System.out.println("***********************************************************");
    System.out.println("DELIVARIES REPORT");
    System.out.println("***********************************************************");
    System.out.println("Total delivaries: " + totalDelivaries);
    System.out.println("Maximum delivaries: " + maximum);
    System.out.println("Minimum delivaries: " + minimum);
    System.out.println("************************************************************");
}



