package util;

public class calculadora2 {
	
	public static final double PI = 3.14159;
	
	public double raio;

	public static double circunferencia(double raio) {
		return 2*PI*raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}
	
	public double volume() {
		return 4 * PI * raio * raio * raio / 3;
	}
	
	
}