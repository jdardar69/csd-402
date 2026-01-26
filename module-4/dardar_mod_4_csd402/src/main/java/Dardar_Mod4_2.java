public class Dardar_Mod4_2 {

    // short average
    public static short average(short[] array) {
        long sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    // int average
    public static int average(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }

    // long average
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // double average
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // helper print methods (so output is easy to read)
    private static void printArray(short[] array) {
        System.out.print("[ ");
        for (short v : array) System.out.print(v + " ");
        System.out.print("]");
    }

    private static void printArray(int[] array) {
        System.out.print("[ ");
        for (int v : array) System.out.print(v + " ");
        System.out.print("]");
    }

    private static void printArray(long[] array) {
        System.out.print("[ ");
        for (long v : array) System.out.print(v + " ");
        System.out.print("]");
    }

    private static void printArray(double[] array) {
        System.out.print("[ ");
        for (double v : array) System.out.print(v + " ");
        System.out.print("]");
    }

    public static void main(String[] args) {

        // Each array is a different SIZE (assignment requirement)
        short[] shortArray = {10, 20, 30, 40};                 // size 4
        int[] intArray = {5, 15, 25, 35, 45};                  // size 5
        long[] longArray = {100L, 200L, 300L, 400L, 500L, 600L}; // size 6
        double[] doubleArray = {2.5, 3.5, 4.5};                // size 3

        System.out.println("----- Module 4.2: Overloaded Average Methods -----\n");

        System.out.print("short[] array = ");
        printArray(shortArray);
        System.out.println("\nAverage (short) = " + average(shortArray));
        System.out.println();

        System.out.print("int[] array = ");
        printArray(intArray);
        System.out.println("\nAverage (int) = " + average(intArray));
        System.out.println();

        System.out.print("long[] array = ");
        printArray(longArray);
        System.out.println("\nAverage (long) = " + average(longArray));
        System.out.println();

        System.out.print("double[] array = ");
        printArray(doubleArray);
        System.out.println("\nAverage (double) = " + average(doubleArray));

        System.out.println("\n---------------------------------------------------");
    }
}
