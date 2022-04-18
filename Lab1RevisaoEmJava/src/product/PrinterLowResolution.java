package product;

public class PrinterLowResolution implements LowResolution {

	@Override
	public void print() {
		System.out.println("Printer printing to low resolution\n");
	}
}
