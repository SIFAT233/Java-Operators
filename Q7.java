public class Q7 { 
    public static void main(String args[]) {
    
        int intValue = -150;
        float floatValue = 123.125f;

       
        float assignedFloat = intValue; 
        int assignedInt = (int) floatValue; 

        float castedFloat = (float) intValue; 
        int castedInt = (int) floatValue; 

        System.out.println("Sample input\tSample output");
        System.out.printf("Assignment:   %.6f assigned to an int produces %d\n", floatValue, assignedInt);

        System.out.printf("Assignment:  %d assigned to a float produces %.6f\n", intValue, assignedFloat);

        System.out.printf("Type Casting: (float) %d produces %.6f\n", intValue, castedFloat);

        System.out.printf("Type Casting: (int) %.6f produces %d\n", floatValue, castedInt);
    }


}
