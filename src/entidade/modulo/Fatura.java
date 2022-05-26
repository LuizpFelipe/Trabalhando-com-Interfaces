package entidade.modulo;

public class Fatura {
	private Double pagamentoBasico;
	private Double taxa;
	
	public Fatura() {
	}
	
	public Fatura(double pagamentoBasico, double taxa) {
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}

	public double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double pagamentoTota() {
		return getPagamentoBasico() + getTaxa();
	}
}
