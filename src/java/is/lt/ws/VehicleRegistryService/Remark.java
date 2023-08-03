package is.lt.ws.VehicleRegistryService;

public class Remark {
	public ExtensionData ExtensionData;
	public String Date;
	public String Text;
	public String InvalidDate;

	public ExtensionData getExtensionData() {
		return ExtensionData;
	}
	public void setExtensionData(ExtensionData extensionData) {
		ExtensionData = extensionData;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public String getInvalidDate() {
		return InvalidDate;
	}
	public void setInvalidDate(String invalidDate) {
		InvalidDate = invalidDate;
	}

}