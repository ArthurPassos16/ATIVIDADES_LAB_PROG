package subsystem;

import abstractfactory.FigOutputDTMonitor;
import abstractfactory.FigOutputPrinter;

public class Test {

	public static void main(String[] args) {
		
		OutputSystem sys;
		
		sys = new OutputSystem(new FigOutputPrinter());
		sys.output();
		
		sys = new OutputSystem(new FigOutputDTMonitor());
		sys.output();

	}

}
