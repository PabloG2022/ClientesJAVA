
public class TestaProduto {
	
	public static void main(String[] args){
		
		Produto p1 =new Produto(1234,"Liverpool","Time",100);
	
		System.out.println("código: " + p1.getCodigo());
		
		System.out.println("Nome: " + p1.getNome());
		
		System.out.println("Descricao: " + p1.getDescricao());
		
		System.out.println("Quantidade: " + p1.getQuantidade());
		
	}

}
