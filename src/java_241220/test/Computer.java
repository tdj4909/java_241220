package java_241220.test;

public class Computer extends Calculator{

	@Override
	public Double calPAI(double param) {
		return param * param * Constants.PAI_2;
	}

}
