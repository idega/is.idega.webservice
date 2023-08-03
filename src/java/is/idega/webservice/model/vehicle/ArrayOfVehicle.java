package is.idega.webservice.model.vehicle;

import java.io.Serializable;
import java.util.List;

public class ArrayOfVehicle implements Serializable {

	private static final long serialVersionUID = -5322697421394126818L;

	private List<Vehicle> Vehicle;

	private String uri;

	private String xmlns;

	private String text;

	public List<Vehicle> getVehicle() {
		return Vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		Vehicle = vehicle;
	}

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}