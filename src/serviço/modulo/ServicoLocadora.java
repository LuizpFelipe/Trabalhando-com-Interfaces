package serviço.modulo;

import entidade.modulo.AluguelDeCarro;
import entidade.modulo.Fatura;

public class ServicoLocadora {
	private Double precoProDia;
	private Double precoPorHora;
	
	private BrasilTaxa taxabrail;

	public ServicoLocadora(Double precoProDia, Double precoPorHora, BrasilTaxa taxabrail) {
		this.precoProDia = precoProDia;
		this.precoPorHora = precoPorHora;
		this.taxabrail = taxabrail;
	}

	public Double getPrecoProDia() {
		return precoProDia;
	}

	public void setPrecoProDia(Double precoProDia) {
		this.precoProDia = precoProDia;
	}

	public Double getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(Double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	public BrasilTaxa getTaxabrail() {
		return taxabrail;
	}

	public void setTaxabrail(BrasilTaxa taxabrail) {
		this.taxabrail = taxabrail;
	}
	
	public void gerandoFatura(AluguelDeCarro aluguelDeCarro) {
		long t1 = aluguelDeCarro.getStart().getTime();
		long t2 = aluguelDeCarro.getFinish().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		double basicoPagamento;
		if(horas <=12) {
			 basicoPagamento = Math.ceil(horas) * precoPorHora;
		}else {
			basicoPagamento = Math.ceil(horas / 24) * precoProDia; 
		}
		
		double taxa = taxabrail.BrasilTaxa(basicoPagamento);
		
		aluguelDeCarro.setFatura(new Fatura(basicoPagamento, taxa));
	}
}
