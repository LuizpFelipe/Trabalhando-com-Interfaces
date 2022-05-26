package entidade.modulo;

import java.util.Date;

public class AluguelDeCarro {
	private Date start;
	private Date finish;
	
	private Veiculos veiculo;
	private Fatura fatura;
	
	public AluguelDeCarro() {
		
	}

	public AluguelDeCarro(Date inicio, Date termino, Veiculos veiculo) {
		this.start = inicio;
		this.finish = termino;
		this.veiculo = veiculo;
	}
	
	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}
	
	
	
}
