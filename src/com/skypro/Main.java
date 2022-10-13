package com.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array");

        taskOneByOne();
        taskOneByTwo();
        taskOneByThree();
        taskOneByFour();

        System.out.println("HomeWork Complete");
    }

    //task_1-4
    private static void taskOneByFour() {
        System.out.println("task_1-4");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 0) {
                System.out.print(intArray[i] + 1);
                if (i != intArray.length - 1) {
                    System.out.print(", ");
                }
            } else {
                System.out.print(intArray[i]);
                if (i != intArray.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        System.out.println();
    }

    //task_1-3
    private static void taskOneByThree() {
        System.out.println("task_1-3");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        double[] doubleArray = new double[]{1.57, 7.654, 9.986};
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        int[] randomArray = {4, 5, 6, 7, 8, 9, 2, 3, 4, 4};
        for (int i = randomArray.length - 1; i >= 0; i--) {
            System.out.print(randomArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    //task_1-2
    private static void taskOneByTwo() {
        System.out.println("task_1-2");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = new double[]{1.57, 7.654, 9.986};

        int[] randomArray = {4, 5, 6, 7, 8, 9, 2, 3, 4, 4};

        System.out.printf("%d, %d, %d\n", intArray[0], intArray[1], intArray[2]);
        System.out.printf("%f, %f, %f\n", doubleArray[0], doubleArray[1], doubleArray[2]);
        System.out.printf("%d, %d, %d, %d, %d, %d, %d, %d, %d, %d\n", randomArray[0], randomArray[1], randomArray[2], randomArray[3], randomArray[4], randomArray[5], randomArray[6], randomArray[7], randomArray[8], randomArray[9]);
        System.out.println();
    }

    //task_1-1
    private static void taskOneByOne() {
        System.out.println("task_1-1");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = new double[]{1.57, 7.654, 9.986};

        int[] randomArray = {4, 5, 6, 7, 8, 9, 2, 3, 4, 4};

        System.out.println();
    }
}