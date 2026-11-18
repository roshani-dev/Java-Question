public class Solution{
    public static void main(String[] args) {
        //calculate the simple interest
        double principal = 1000; // Principal amount
        double rate = 5; // Annual interest rate in percentage  
        double time = 3; // Time in years
        double simpleInterest = (principal * rate * time) / 100; // Simple Interest
        System.out.println("Simple Interest: " + simpleInterest);
    }       
}
