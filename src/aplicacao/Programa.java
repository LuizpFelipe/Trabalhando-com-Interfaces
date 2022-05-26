package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.modulo.AluguelDeCarro;
import entidade.modulo.Veiculos;
import serviço.modulo.BrasilTaxa;
import serviço.modulo.ServicoLocadora;

public class Programa {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Entre Com os Dados da Locadora:");
		System.out.print("Modelo do Carro:");
		String carro = sc.nextLine();
		System.out.print("Data da retirada: dd/mm/yyyy hh/ss:");
		Date retirada = sdf.parse(sc.nextLine());
		System.out.println("Data da Devoulção: dd/mm/yyyy hh/ss:");
		Date devolucao = sdf.parse(sc.nextLine());
		
		AluguelDeCarro cr = new AluguelDeCarro(retirada, devolucao, new Veiculos(carro)); 
		
		System.out.print("Preço por hora:");
		double hora = sc.nextDouble();
		System.out.print("Preço por Dia:");
		double dia = sc.nextDouble();
		
		ServicoLocadora servico = new ServicoLocadora(dia, hora, new BrasilTaxa());
		
		servico.gerandoFatura(cr);
		
		System.out.println("Fatura:");
		System.out.println("Pagament Basico: " + String.format("%.2f", cr.getFatura().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", cr.getFatura().getTaxa()));
		System.out.println("Pagament Total: " + String.format("%.2f", cr.getFatura().pagamentoTota()));
		
		
		
		
		sc.close();
	}

}
