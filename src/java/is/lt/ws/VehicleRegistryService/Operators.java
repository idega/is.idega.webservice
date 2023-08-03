package is.lt.ws.VehicleRegistryService;

import java.io.Serializable;
import java.util.List;

public class Operators implements Serializable {

	private static final long serialVersionUID = -2834154728944585355L;

	public List<Operator> Operator;

	public Operators() {
		super();
	}

	public Operators(List<Operator> operators) {
		this();

		Operator = operators;
	}

	public List<Operator> getOperator() {
		return Operator;
	}

	public void setOperator(List<Operator> operator) {
		Operator = operator;
	}

}