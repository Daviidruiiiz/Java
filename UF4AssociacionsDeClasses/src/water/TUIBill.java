package water;

import java.util.ArrayList; // importa la clase ArrayList

public class TUIBill {
	
	public static void main(String[] args) {
		LargeFamily1Bill lf1b1 = new LargeFamily1Bill(12.3,10.90, 8.23);
		LargeFamily2Bill lf2b1 = new LargeFamily2Bill(23.5,12.50, 10.25);
		NormalClientBill ncb = new NormalClientBill(82.12, 12.35, 80.50);
		LargeFamily1Bill lf1b2 = new LargeFamily1Bill(15.75, 11.20, 9.40);
		LargeFamily2Bill lf2b2 = new LargeFamily2Bill(30.25, 14.80, 11.75);
		NormalClientBill ncb2 = new NormalClientBill(95.60, 13.80, 90.75);
		NormalClientBill ncb3 = new NormalClientBill(72.20, 23.80, 30.75);

		System.out.println("\n\nQué tipo de factura es?\n");
		ArrayList<Bill> bills = new ArrayList<Bill>();
		bills.add(lf1b1);
		bills.add(lf2b1);
		bills.add(ncb);
		bills.add(lf1b2);
		bills.add(lf2b2);
		bills.add(ncb2);
		bills.add(ncb3);
		
		int countLF1 = 0;
		int countLF2 = 0;
		int countNormal = 0;
		double totalSewerageLarge1 = 0;
		double totalSewerageLarge2 = 0;
		double totalCleaningUpLarge2 = 0;
		
		for (Bill b : bills) {
			b.details();
			System.out.println("----------------------------------------------");
			if (b instanceof LargeFamily1Bill) {
				System.out.println("Es una factura para una Gran Familia Tipo 1");
				countLF1++;
				totalSewerageLarge1 += b.sewerageAmount();
			} else if (b instanceof LargeFamily2Bill) {
				System.out.println("Es una factura para una Gran Familia Tipo 2");
				countLF2++;
				totalSewerageLarge2 += b.sewerageAmount();
				totalCleaningUpLarge2 += b.cleaningUpAmount();
			} else if (b instanceof NormalClientBill) {
				System.out.println("Es una factura para un Cliente Normal");
				countNormal++;
			} else {
				System.out.println("Tipo de factura desconocido");
			}
		}

		System.out.println("\nCantidad de facturas para Gran Familia Tipo 1: " + countLF1);
		System.out.println("Cantidad de facturas para Gran Familia Tipo 2: " + countLF2);
		System.out.println("Cantidad de facturas para Cliente Normal: " + countNormal);
		System.out.println("Descuentos en SwerageLarge1: " + totalSewerageLarge1);
		System.out.println("Descuentos en SwerageLarge2: " + totalSewerageLarge2);
		System.out.println("Descuentos en totalCleaningUpLarge2: " + totalCleaningUpLarge2);
	
	}
}
