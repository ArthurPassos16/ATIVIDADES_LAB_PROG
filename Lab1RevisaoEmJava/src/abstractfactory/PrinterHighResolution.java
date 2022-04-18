package abstractfactory;

public class PrinterHighResolution implements HighResolution{
	@Override
	public void print() {
		System.out.println("Printer printing to high resolution\n");
	}

}
