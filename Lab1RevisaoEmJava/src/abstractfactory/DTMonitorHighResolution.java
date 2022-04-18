package abstractfactory;

public class DTMonitorHighResolution implements HighResolution {

	@Override
	public void print() {
		System.out.println("desktop monitor printing to high resolution\n");
	}
}
