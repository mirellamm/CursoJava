package HelloWorld;

public class clienteteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			clientes cliente1 = new clientes("Paulo","Lima","desenvolvedora",24);
			cliente1.imprimirDados();
			
			System.out.println("\n*Mudança de sobrenome*");
			cliente1.setSobrenomeCliente("Silva");
			cliente1.imprimirDados();
			
			clientes cliente2 = new clientes("Valdir","Cardoso","funcionário público",49);
			cliente2.imprimirDados();
			
			System.out.println("\n*Mudança de profissão*");
			cliente2.setProfissao("aposentado");
			cliente2.imprimirDados();
		}

	}
