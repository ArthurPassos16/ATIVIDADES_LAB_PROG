package abstractfactory;

import product.HighResolution;
import product.LowResolution;
import product.PrinterHighResolution;
import product.PrinterLowResolution;

public class FigOutputPrinter implements FigOutputHardware {

	@Override
	public LowResolution createLowResOutput() {
		return new PrinterLowResolution();
	}

	@Override
	public HighResolution createHighResOutput() {
		return new PrinterHighResolution();
	}

}
