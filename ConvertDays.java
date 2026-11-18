public class Solution{
    public static void main(String[] args) {
        // convert day into years,weeks
        int days=400;
        int years=days/365;
        days=days%365;
        int weeks=days/7;
        days=days%7;
        System.out.println("Years: "+years);
        System.out.println("Weeks: "+weeks);
        System.out.println("Days: "+days);
    }
}
