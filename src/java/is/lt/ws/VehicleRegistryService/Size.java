package is.lt.ws.VehicleRegistryService;

import java.io.Serializable;

public class Size implements Serializable {
	private static final long serialVersionUID = 2696714104139017243L;
	public ExtensionData ExtensionData;
	public String Length;
	public String Width;
	public String Height;
	public ExtensionData getExtensionData() {
		return ExtensionData;
	}
	public void setExtensionData(ExtensionData extensionData) {
		ExtensionData = extensionData;
	}
	public String getLength() {
		return Length;
	}
	public void setLength(String length) {
		Length = length;
	}
	public String getWidth() {
		return Width;
	}
	public void setWidth(String width) {
		Width = width;
	}
	public String getHeight() {
		return Height;
	}
	public void setHeight(String height) {
		Height = height;
	}
}