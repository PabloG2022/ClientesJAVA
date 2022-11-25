
public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private int telefone;
	private String endereco;
	
	public Cliente () {
		
	}
	public Cliente (String nome, String cpf, String email, int telefone, String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
			
	public String GetNome() {
		return nome;
}
	public String GetCpf () {
		return cpf;
	}
	public String GetEmail () {
		return email;
	}
	public int GetTelefone() {
		return telefone;
	}
	public String GetEndereco() {
		return endereco;
	}
	
	
	public String SetNome() {
		return nome;
}
	public String SetCpf () {
		return cpf;
	}
	public String SetEmail () {
		return email;
	}
	public int SetTelefone() {
		return telefone;
	}
	public String SetEndereco() {
		return endereco;
	}
		}	
	
	
		
		
		