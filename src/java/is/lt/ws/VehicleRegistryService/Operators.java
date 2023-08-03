package is.lt.ws.VehicleRegistryService;

import java.util.List;

public class Operators {

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