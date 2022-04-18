package subsystem;

import abstractfactory.FigOutputHardware;
import product.HighResolution;
import product.LowResolution;

public class OutputSystem {

	private LowResolution lowRes;
	private HighResolution highRes;

	public OutputSystem(FigOutputHardware factory) {
			lowRes = factory.createLowResOutput();
			highRes = factory.createHighResOutput();
	    }

	public void output() {
		lowRes.print();
		highRes.print();
	}
	
}
