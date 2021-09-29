package entities;

public class retangulo {
	
	public double largura, altura;
	
	public double perimetro() {
		return (largura + altura)*2;
	}
	
	public double area() {
		return largura * altura;
	}
	
	public double diagonal() {
      
		return Math.sqrt((largura*largura) + (altura*altura));
		
		}	
	
	}