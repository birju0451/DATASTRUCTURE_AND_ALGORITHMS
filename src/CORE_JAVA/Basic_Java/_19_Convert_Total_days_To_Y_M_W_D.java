package Basic_Java;

public class _19_Convert_Total_days_To_Y_M_W_D {
    public static void main(String[] args) {
        int days,years,months,weeks;
        days=1050;

        years=days/365;
        days=days%365;
        months=days/30;
        days=days%30;
        weeks=days/7;
        days=days%7;

        System.out.print("year: "+years+ "\t");
        System.out.print("months: "+months+ "\t");
        System.out.print("weeks:" + weeks+ "\t");
        System.out.print("days: " + days+ "\t");
    }
}
