package entities;

public class PessoaJuridica extends Contribuintes {

	private Integer numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double impostoPago() {

		if (this.numeroFuncionarios < 10) {
			return this.getRendaAnual() * 0.16;
		} else {
			return this.getRendaAnual() * 0.14;
		}

	}

}
