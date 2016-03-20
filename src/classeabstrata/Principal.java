package classeabstrata;

import java.util.LinkedList;
import java.util.List;

class Principal {
	public static void main(String[] args) {
		List<DesenhoAbstrato> lista = new LinkedList<>();
		
		lista.add(new FormaA());
		lista.add(new FormaB());
		lista.add(new FormaC());
		lista.add(new FormaD());
		lista.add(new FormaE());
		lista.add(new FormaF());
		lista.add(new FormaG());
		lista.add(new FormaH());
		lista.add(new FormaI());
		lista.add(new FormaM());
		
		
		for (DesenhoAbstrato d : lista) {
			d.executar();
		}
	}
}
