package teste2;

public class Calculadora {
	
	public double somar(double numeroUm, double numeroDois) {
		return numeroUm + numeroDois;
		
	}
	
	public double subtrair(double numeroUm, double numeroDois) {
		return numeroUm - numeroDois;
	}
	
	public double multiplicar(double numeroUm, double numeroDois) {
		return numeroUm * numeroDois;
	}
	
	public double dividir(double numeroUm, double numeroDois) {
		if (numeroDois == 0) {
			throw new ArithmeticException("Não é possivel dividir por zero.");
			
		}
		return numeroUm / numeroDois;
	}
	
	public double potenciar(double base, double expoente) {
		return Math.pow(base, expoente);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Calculadora calc = new Calculadora();
             
             System.out.println("Soma: " + calc.somar(5, 3));
             System.out.println("Subtração: " + calc.subtrair(5, 3));
             System.out.println("Multiplicação: " + calc.multiplicar(5, 3));
             System.out.println("Divisão: " + calc.dividir(10, 2));
             System.out.println("Potência: " + calc.potenciar(2, 3));
	}

}
