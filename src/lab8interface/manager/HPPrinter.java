package lab8interface.manager;

import lab8interface.abstractClass.MyPrinter;
import lab8interface.interfaceClass.Fax;
import lab8interface.interfaceClass.Scanner;

public class HPPrinter extends MyPrinter implements Fax,Scanner {
    @Override
    public void fax() {
        System.out.println("HP Faxing....");
    }

    @Override
    public void print() {
        System.out.println("HP Printing....");
    }

    @Override
    public void scan() {
        System.out.println("HP Scanning....");
    }
}
