package library;
public class FineCalculator {

    static int calculateDays(int d1, int m1, int y1,
            int d2, int m2, int y2) {

        int issueDays = y1 * 360 + m1 * 30 + d1;
        int returnDays = y2 * 360 + m2 * 30 + d2;

        return returnDays - issueDays;
    }

    static int calculateFine(int days) {

        int fine = 0;

        if (days > 30)
            fine = (days - 30) * 5;

        return fine;
    }
}
