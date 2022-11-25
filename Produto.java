
public class Produto {
	
	private int codigo;
	private String nome;
	private String descricao;
	private int quantidade;

	public Produto () {
}
	public Produto(int codigo, String nome, String descricao, int quantidade) {		

		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String discricao) {
		this.descricao = discricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
	


