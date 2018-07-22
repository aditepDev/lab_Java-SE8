package lab8interface.manager;

import lab8interface.abstractClass.MyPrinter;
import lab8interface.interfaceClass.Fax;

public class CannonPrinter extends MyPrinter implements Fax {
    @Override
    public void print() {
        System.out.println("Cannon Printing....");
    }

    @Override
    public void fax() {
        System.out.println("Cannon Faxing....");
    }
}
