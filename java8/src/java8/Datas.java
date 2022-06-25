package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2028, Month.NOVEMBER, 24);
		
		int anos = olimpiadasRio.getYear()-hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);

		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		String valorFormatado = proximasOlimpiadas.format(formater);
		
		System.out.println(valorFormatado);
		
		DateTimeFormatter formaterComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"); 
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formaterComHoras));
		
	
		System.out.println(agora.toLocalDate());
		
		
	}

}
