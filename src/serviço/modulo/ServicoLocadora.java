package serviço.modulo;

import entidade.modulo.AluguelDeCarro;
import entidade.modulo.Fatura;

public class ServicoLocadora {
	private Double precoProDia;
	private Double precoPorHora;
	
	private TaxaDeServico taxaDeServico;

	public ServicoLocadora(Double precoProDia, Double precoPorHora, TaxaDeServico taxaDeServico) {
		this.precoProDia = precoProDia;
		this.precoPorHora = precoPorHora;
		this.setTaxaDeServico(taxaDeServico);
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
	
	public TaxaDeServico getTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(TaxaDeServico taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
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
		
		double taxa = taxaDeServico.taxaDeServico(basicoPagamento);
		
		aluguelDeCarro.setFatura(new Fatura(basicoPagamento, taxa));
	}

	
}
