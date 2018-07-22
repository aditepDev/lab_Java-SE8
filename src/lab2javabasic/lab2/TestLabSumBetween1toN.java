package lab2javabasic.lab2;

import java.util.ArrayList;

public class TestLabSumBetween1toN {
    public static void main(String[] args) {
        int numss = 23;
        oneToN(numss);
        oddNumber(numss);
        eveNumber(numss);
        fibonacci(numss);
        primeNumber(numss);


    }

    private static int prime(int num) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < num + 2; i++) {
            if (checkPrime(i) == 0 && i != 1 && i != 0) {
                arrList.add(i);
            }
        }

        System.out.print(arrList + ",");

        if (arrList.contains(num)) {
            System.out.println("\nเป็นจำนวนเฉพาะลำดับที่ :" + arrList.size());
        } else
            System.out.println("\nไม่ใช่จำนวนเฉพาะ");
        return 0;
    }


    private static int checkPrime(int num) {
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                //    System.out.print(i + " ");
                if (i > 1) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private static void primeNumber(int num) {
        System.out.print("\nprimeNumber : ");

        if (checkPrime(num) == 0 && num != 1 && num != 0) {
            System.out.println(num + " : จำนวนเฉพาะ");
        } else {
            System.out.println(num + " : ไม่ใช่จำนวนเฉพาะ");
        }
        prime(num);

    }


    private static void fibonacci(int num) {
        System.out.print("\nfibonacci : ");
        int a1 = 1, a2 = 1, a3;
        for (int i = 0; i < num; i++) {
            a3 = a1 + a2;
            if (a1 == a2) {
                System.out.print(a1 + " " + a2);
            }
            a1 = a2;
            a2 = a3;
            if (a1 != a2) {
                System.out.print(" " + a3);
            }
        }


    }


    private static void eveNumber(int num) {
        System.out.print("\neveNumber : ");
        for (int i = 2; i < num + 1; i += 2) {
            System.out.print(i + " ");
        }
    }

    private static void oddNumber(int num) {
        System.out.print("\noddNumber : ");
        for (int i = 1; i < num + 1; i += 2) {
            System.out.print(i + " ");
        }
    }

    private static void oneToN(int num) {
        System.out.print("oneToN : ");
        for (int i = 1; i < num + 1; i++) {
            System.out.print(i + " ");
        }
    }
}
