package TemplateMethod;

public class ClaseConcreta1 extends ClaseAbstracta{

	@Override
	public int multiplicar(int num) {
		return num * 10;
	}

	@Override
	public int sumar(int num) {
		return num + 10;
	}

}
