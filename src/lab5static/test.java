package lab5static;

public class test {
    public static void main(String[] args) {
        double sellPrice = 15000.0;
        double vat = TaxUtil.calVat(sellPrice);
        double inclueVat = TaxUtil.calIncludeVat(sellPrice);
        double wht = TaxUtil.calWHT(sellPrice);



        System.out.println("Sell Price = " + sellPrice + " ฿");
        System.out.println("Calculate VAT(7%) = " + vat +" ฿");
        System.out.println("Total Price (Include VAT)= " + inclueVat+ " ฿");
        System.out.println("Withholding TAX (3%) = " +wht+" ฿");
        System.out.println("Balance on Check  = " +(inclueVat-wht)+" ฿");
    }
}
