package serviço.modulo;

public class BrasilTaxa implements TaxaDeServico{

	
	@Override
	public double taxaDeServico(double valor) {
		if(valor <= 100) {
			return valor * 0.2;
		}else{
			return valor * 0.15;
			
		}
		
	}

	
}
