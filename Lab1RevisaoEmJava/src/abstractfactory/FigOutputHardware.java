package abstractfactory;

import product.HighResolution;
import product.LowResolution;

public interface FigOutputHardware {

	LowResolution createLowResOutput();
    HighResolution createHighResOutput();
	
}
