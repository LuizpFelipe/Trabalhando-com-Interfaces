package serviço.modulo;

public class BrasilTaxa {
	private Double brasilTaxa;

	public double BrasilTaxa(double valor) {
		if(valor <= 100) {
			return valor * 0.2;
		}else{
			return valor * 0.15;
			
		}
		
	}
}
