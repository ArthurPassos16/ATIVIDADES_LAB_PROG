package abstractfactory;

import product.DTMonitorHighResolution;
import product.DTMonitorLowResolution;
import product.HighResolution;
import product.LowResolution;

public class FigOutputDTMonitor implements FigOutputHardware {

	@Override
	public LowResolution createLowResOutput() {
		return new DTMonitorLowResolution();
	}

	@Override
	public HighResolution createHighResOutput() {
		return new DTMonitorHighResolution();
	}

	
	
}
