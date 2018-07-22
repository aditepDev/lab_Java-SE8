package lab8interface;

import lab8interface.abstractClass.MyPrinter;
import lab8interface.interfaceClass.Fax;
import lab8interface.interfaceClass.Scanner;
import lab8interface.manager.CannonPrinter;
import lab8interface.manager.EpsonPrinter;
import lab8interface.manager.HPPrinter;

public class testPrinter {
    public static void main(String[] args) {

        MyPrinter hp = new HPPrinter();
        Runnable r = () -> hp.print(); //lambda thread
        r.run();

        MyPrinter epson = new EpsonPrinter();
        epson.print();

        Scanner hps = new HPPrinter();
        hps.scan();

        Fax fc = new CannonPrinter();
        fc.fax();

        HPPrinter hpm = (HPPrinter) hp;
        hpm.print();
        hpm.fax();
        hpm.scan();

        CannonPrinter cpm = (CannonPrinter) fc;
        cpm.fax();
        cpm.print();


    }
}
