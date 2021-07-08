
public class Eventos {
	public static final double peso = 0;
	public String nomeevento;
	public String responsavel;
	public String datas;
	public String hora;
	public String telefone;
	public double valorhora;
	public String indice;
	
	public void imprimir() {
		System.out.println("Nome Evento: " + nomeevento);
		System.out.println("Responsavel: " + responsavel);
		System.out.println("Data Do Evento: " + datas);
		System.out.println("Horario Inicio/Fim: "+ hora );
		System.out.println("Contato: "+ telefone);
		System.out.println("Valor: "+ valorhora);
		System.out.println("Todo Sobre o Evento: "+ indice);
	}

}
