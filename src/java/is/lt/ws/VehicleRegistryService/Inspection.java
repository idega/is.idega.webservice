package is.lt.ws.VehicleRegistryService;

import java.io.Serializable;

public class Inspection implements Serializable {
	private static final long serialVersionUID = 3757494316730973670L;
	public ExtensionData ExtensionData;
	public String Date;
	public String ReinspectionDate;
	public String Station;
	public String Type;
	public String Officer;
	public String Result;
	public String Odometer;
	public Remarks Remarks;
}