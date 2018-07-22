package lab8interface.manager;

import lab8interface.abstractClass.MyPrinter;
import lab8interface.interfaceClass.Scanner;

public class EpsonPrinter extends MyPrinter implements Scanner {
    @Override
    public void print() {
        System.out.println("Epson Printing....");
    }

    @Override
    public void scan() {
        System.out.println("Epson Scanting....");
    }
}
