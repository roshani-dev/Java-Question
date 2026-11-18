ublic class Solution{
    public static void main(String[] args) {
        //swap two numbers without using a third variable
        int a = 9;
        int b = 8;
        a = a + b; // a becomes 17
        b = a - b; // b becomes 9
        a = a - b; // a becomes 8
        System.out.println("After swapping: a = " + a + ", b = " + b);
       
}
}
