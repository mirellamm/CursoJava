package HelloWorld;

public class clienteteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			clientes cliente1 = new clientes("Paulo","Lima","desenvolvedora",24);
			cliente1.imprimirDados();
			
			System.out.println("\n*Mudan�a de sobrenome*");
			cliente1.setSobrenomeCliente("Silva");
			cliente1.imprimirDados();
			
			clientes cliente2 = new clientes("Valdir","Cardoso","funcion�rio p�blico",49);
			cliente2.imprimirDados();
			
			System.out.println("\n*Mudan�a de profiss�o*");
			cliente2.setProfissao("aposentado");
			cliente2.imprimirDados();
		}

	}
