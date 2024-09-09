// This file is optional to edit and can be used for manual testing.

public class Main {
    /**
     * The entry point of the application.
     * 
     * This method creates a Compare object and manually tests its methods by calling them several times with varying arguments and printing out the results.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Compare compare = new Compare();

        System.out.println("Currently, isEqual produces the following value for '4 is equal to 4':");
        boolean result11 = compare.isEqual(4,4);
        System.out.println(result11);

        System.out.println("Currently, isEqual produces the following value for '2 is equal to 7':");
        boolean result12 = compare.isEqual(2,7);
        System.out.println(result12);

        System.out.println("Currently, greaterThan produces the following value for '5 is greater than 3':");
        boolean result21 = compare.isGreaterThan(5,3);
        System.out.println(result21);

        System.out.println("Currently, greaterThan produces the following value for '4 is greater than 9':");
        boolean result22 = compare.isGreaterThan(4,9);
        System.out.println(result22);

        System.out.println("Currently, lessThan produces the following value for '3 is less than 6':");
        boolean result31 = compare.isLessThan(3,6);
        System.out.println(result31);

        System.out.println("Currently, lessThan produces the following value for '2 is less than 1':");
        boolean result32 = compare.isLessThan(2,1);
        System.out.println(result32);

        System.out.println("Currently, notEqualTo produces the following value for '1 is not equal to 9':");
        boolean result41 = compare.isNotEqualTo(1,9);
        System.out.println(result41);

        System.out.println("Currently, notEqualTo produces the following value for '8 is not equal to 8':");
        boolean result42 = compare.isNotEqualTo(8,8);
        System.out.println(result42);
    }
}
