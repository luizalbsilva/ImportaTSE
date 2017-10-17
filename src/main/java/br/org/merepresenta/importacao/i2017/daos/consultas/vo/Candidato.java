package br.org.merepresenta.importacao.i2017.daos.consultas.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="tse_candidato")
public class Candidato implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Version
	@Column
	private long version;
	
	@Column(columnDefinition="text")
	private String linha;

	@Column
	private int numeroLinha;

	@Column
	private LocalDate dataGeracao;
	@Column
	private LocalTime horaGeracao;
	@Column
	private Integer anoEleicao;
	@Column
	private Integer numeroTurno;
	@Column
	private String descricaoEleicao;
	@Column
	private String siglaUF;
	@Column
	private String siglaUE;
	@Column
	private String descricaoUE;
	@Column
	private String codigoCargo;
	@Column
	private String descricaoCargo;
	@Column
	private String nomeCandidato;
	@Column
	private String sequencialCandidato;
	@Column
	private String numeroCandidato;
	@Column
	private String cpfCandidato;
	@Column
	private String nomeUrnaCandidato;
	@Column
	private String codigoSituacaoCandidatura;
	@Column
	private String desSituacaoCandidatura;
	@Column
	private String numeroPartido;
	@Column
	private String siglaPartido;
	@Column
	private String nomePartido;
	@Column
	private String codigoLegenda;
	@Column
	private String siglaLegenda;
	@Column
	private String composicaoLegenda;
	@Column
	private String nomeLegenda;
	@Column
	private String codigoOcupacao;
	@Column
	private String descricaoOcupacao;
	@Column
	private LocalDate dataNascimento;
	@Column
	private String numTituloEleitoralCandidato;
	@Column
	private String idadeDataEleicao;
	@Column
	private String codigoSexo;
	@Column
	private String descricaoSexo;
	@Column
	private String codGrauInstrucao;
	@Column
	private String descricaoGrauInstrucao;
	@Column
	private String codigoEstadoCivil;
	@Column
	private String descricaoEstadoCivil;
	@Column
	private String codigoCorRaca;
	@Column
	private String descricaoCorRaca;
	@Column
	private String codigoNacionalidade;
	@Column
	private String descricaoNacionalidade;
	@Column
	private String siglaUfNascimento;
	@Column
	private Integer codigoMunicipioNascimento;
	private String nomeMunicipioNascimento;
	@Column
	private String despesaMaxCampanha;
	@Column
	private String codSitTotTurno;
	@Column
	private String descSitTotTurno;
	@Column
	private String nmEmail;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLinha() {
		return linha;
	}
	public void setLinha(String linha) {
		this.linha = linha;
	}
	public int getNumeroLinha() {
		return numeroLinha;
	}
	public void setNumeroLinha(int numero) {
		this.numeroLinha = numero;
	}
	public LocalDate getDataGeracao() {
		return dataGeracao;
	}
	public void setDataGeracao(LocalDate dataGeracao) {
		this.dataGeracao = dataGeracao;
	}
	public LocalTime getHoraGeracao() {
		return horaGeracao;
	}
	public void setHoraGeracao(LocalTime horaGeracao) {
		this.horaGeracao = horaGeracao;
	}
	public Integer getAnoEleicao() {
		return anoEleicao;
	}
	public void setAnoEleicao(Integer anoEleicao) {
		this.anoEleicao = anoEleicao;
	}
	public Integer getNumeroTurno() {
		return numeroTurno;
	}
	public void setNumeroTurno(Integer numeroTurno) {
		this.numeroTurno = numeroTurno;
	}
	public String getDescricaoEleicao() {
		return descricaoEleicao;
	}
	public void setDescricaoEleicao(String descricaoEleicao) {
		this.descricaoEleicao = descricaoEleicao;
	}
	public String getSiglaUF() {
		return siglaUF;
	}
	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}
	public String getSiglaUE() {
		return siglaUE;
	}
	public void setSiglaUE(String siglaUE) {
		this.siglaUE = siglaUE;
	}
	public String getDescricaoUE() {
		return descricaoUE;
	}
	public void setDescricaoUE(String descricaoUE) {
		this.descricaoUE = descricaoUE;
	}
	public String getCodigoCargo() {
		return codigoCargo;
	}
	public void setCodigoCargo(String codigoCargo) {
		this.codigoCargo = codigoCargo;
	}
	public String getDescricaoCargo() {
		return descricaoCargo;
	}
	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public String getSequencialCandidato() {
		return sequencialCandidato;
	}
	public void setSequencialCandidato(String sequencialCandidato) {
		this.sequencialCandidato = sequencialCandidato;
	}
	public String getNumeroCandidato() {
		return numeroCandidato;
	}
	public void setNumeroCandidato(String numeroCandidato) {
		this.numeroCandidato = numeroCandidato;
	}
	public String getCpfCandidato() {
		return cpfCandidato;
	}
	public void setCpfCandidato(String cpfCandidato) {
		this.cpfCandidato = cpfCandidato;
	}
	public String getNomeUrnaCandidato() {
		return nomeUrnaCandidato;
	}
	public void setNomeUrnaCandidato(String nomeUrnaCandidato) {
		this.nomeUrnaCandidato = nomeUrnaCandidato;
	}
	public String getCodigoSituacaoCandidatura() {
		return codigoSituacaoCandidatura;
	}
	public void setCodigoSituacaoCandidatura(String codigoSituacaoCandidatura) {
		this.codigoSituacaoCandidatura = codigoSituacaoCandidatura;
	}
	public String getDesSituacaoCandidatura() {
		return desSituacaoCandidatura;
	}
	public void setDesSituacaoCandidatura(String desSituacaoCandidatura) {
		this.desSituacaoCandidatura = desSituacaoCandidatura;
	}
	public String getNumeroPartido() {
		return numeroPartido;
	}
	public void setNumeroPartido(String numeroPartido) {
		this.numeroPartido = numeroPartido;
	}
	public String getSiglaPartido() {
		return siglaPartido;
	}
	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}
	public String getNomePartido() {
		return nomePartido;
	}
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	public String getCodigoLegenda() {
		return codigoLegenda;
	}
	public void setCodigoLegenda(String codigoLegenda) {
		this.codigoLegenda = codigoLegenda;
	}
	public String getSiglaLegenda() {
		return siglaLegenda;
	}
	public void setSiglaLegenda(String siglaLegenda) {
		this.siglaLegenda = siglaLegenda;
	}
	public String getComposicaoLegenda() {
		return composicaoLegenda;
	}
	public void setComposicaoLegenda(String composicaoLegenda) {
		this.composicaoLegenda = composicaoLegenda;
	}
	public String getNomeLegenda() {
		return nomeLegenda;
	}
	public void setNomeLegenda(String nomeLegenda) {
		this.nomeLegenda = nomeLegenda;
	}
	public String getCodigoOcupacao() {
		return codigoOcupacao;
	}
	public void setCodigoOcupacao(String codigoOcupacao) {
		this.codigoOcupacao = codigoOcupacao;
	}
	public String getDescricaoOcupacao() {
		return descricaoOcupacao;
	}
	public void setDescricaoOcupacao(String descricaoOcupacao) {
		this.descricaoOcupacao = descricaoOcupacao;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumTituloEleitoralCandidato() {
		return numTituloEleitoralCandidato;
	}
	public void setNumTituloEleitoralCandidato(String numTituloEleitoralCandidato) {
		this.numTituloEleitoralCandidato = numTituloEleitoralCandidato;
	}
	public String getIdadeDataEleicao() {
		return idadeDataEleicao;
	}
	public void setIdadeDataEleicao(String idadeDataEleicao) {
		this.idadeDataEleicao = idadeDataEleicao;
	}
	public String getCodigoSexo() {
		return codigoSexo;
	}
	public void setCodigoSexo(String codigoSexo) {
		this.codigoSexo = codigoSexo;
	}
	public String getDescricaoSexo() {
		return descricaoSexo;
	}
	public void setDescricaoSexo(String descricaoSexo) {
		this.descricaoSexo = descricaoSexo;
	}
	public String getCodGrauInstrucao() {
		return codGrauInstrucao;
	}
	public void setCodGrauInstrucao(String codGrauInstrucao) {
		this.codGrauInstrucao = codGrauInstrucao;
	}
	public String getDescricaoGrauInstrucao() {
		return descricaoGrauInstrucao;
	}
	public void setDescricaoGrauInstrucao(String descricaoGrauInstrucao) {
		this.descricaoGrauInstrucao = descricaoGrauInstrucao;
	}
	public String getCodigoEstadoCivil() {
		return codigoEstadoCivil;
	}
	public void setCodigoEstadoCivil(String codigoEstadoCivil) {
		this.codigoEstadoCivil = codigoEstadoCivil;
	}
	public String getDescricaoEstadoCivil() {
		return descricaoEstadoCivil;
	}
	public void setDescricaoEstadoCivil(String descricaoEstadoCivil) {
		this.descricaoEstadoCivil = descricaoEstadoCivil;
	}
	public String getCodigoCorRaca() {
		return codigoCorRaca;
	}
	public void setCodigoCorRaca(String codigoCorRaca) {
		this.codigoCorRaca = codigoCorRaca;
	}
	public String getDescricaoCorRaca() {
		return descricaoCorRaca;
	}
	public void setDescricaoCorRaca(String descricaoCorRaca) {
		this.descricaoCorRaca = descricaoCorRaca;
	}
	public String getCodigoNacionalidade() {
		return codigoNacionalidade;
	}
	public void setCodigoNacionalidade(String codigoNacionalidade) {
		this.codigoNacionalidade = codigoNacionalidade;
	}
	public String getDescricaoNacionalidade() {
		return descricaoNacionalidade;
	}
	public void setDescricaoNacionalidade(String descricaoNacionalidade) {
		this.descricaoNacionalidade = descricaoNacionalidade;
	}
	public String getSiglaUfNascimento() {
		return siglaUfNascimento;
	}
	public void setSiglaUfNascimento(String siglaUfNascimento) {
		this.siglaUfNascimento = siglaUfNascimento;
	}
	public Integer getCodigoMunicipioNascimento() {
		return codigoMunicipioNascimento;
	}
	public void setCodigoMunicipioNascimento(Integer codigoMunicipioNascimento) {
		this.codigoMunicipioNascimento = codigoMunicipioNascimento;
	}
	public String getNomeMunicipioNascimento() {
		return nomeMunicipioNascimento;
	}
	public void setNomeMunicipioNascimento(String nomeMunicipioNascimento) {
		this.nomeMunicipioNascimento = nomeMunicipioNascimento;
	}
	public String getDespesaMaxCampanha() {
		return despesaMaxCampanha;
	}
	public void setDespesaMaxCampanha(String despesaMaxCampanha) {
		this.despesaMaxCampanha = despesaMaxCampanha;
	}
	public String getCodSitTotTurno() {
		return codSitTotTurno;
	}
	public void setCodSitTotTurno(String codSitTotTurno) {
		this.codSitTotTurno = codSitTotTurno;
	}
	public String getDescSitTotTurno() {
		return descSitTotTurno;
	}
	public void setDescSitTotTurno(String descSitTotTurno) {
		this.descSitTotTurno = descSitTotTurno;
	}
	public String getNmEmail() {
		return nmEmail;
	}
	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

}
