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
@Table(name = "tse_legenda")
public class Legenda implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Version
	@Column
	private long version;
	@Column(columnDefinition = "text")
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
	private Integer numTurno;
	@Column
	private String descricaoEleicao;
	@Column
	private String siglaUf;
	@Column
	private String siglaUe;
	@Column
	private String nomeUe;
	@Column
	private String codigoCargo;
	@Column
	private String descricaoCargo;
	@Column
	private String tipoLegenda;
	@Column
	private String numPartido;
	@Column
	private String siglaPartido;
	@Column
	private String nomePartido;
	@Column
	private String siglaColigacao;
	@Column
	private String nomeColigacao;
	@Column
	private String composicaoColigacao;
	@Column
	private String sequencialColigacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public long getVersion() {
		return version;
	}
	public void setVersion(long version) {
		this.version = version;
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
	public void setNumeroLinha(int numeroLinha) {
		this.numeroLinha = numeroLinha;
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
	public Integer getNumTurno() {
		return numTurno;
	}
	public void setNumTurno(Integer numTurno) {
		this.numTurno = numTurno;
	}
	public String getDescricaoEleicao() {
		return descricaoEleicao;
	}
	public void setDescricaoEleicao(String descricaoEleicao) {
		this.descricaoEleicao = descricaoEleicao;
	}
	public String getSiglaUf() {
		return siglaUf;
	}
	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}
	public String getSiglaUe() {
		return siglaUe;
	}
	public void setSiglaUe(String siglaUe) {
		this.siglaUe = siglaUe;
	}
	public String getNomeUe() {
		return nomeUe;
	}
	public void setNomeUe(String nomeUe) {
		this.nomeUe = nomeUe;
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
	public String getTipoLegenda() {
		return tipoLegenda;
	}
	public void setTipoLegenda(String tipoLegenda) {
		this.tipoLegenda = tipoLegenda;
	}
	public String getNumPartido() {
		return numPartido;
	}
	public void setNumPartido(String numPartido) {
		this.numPartido = numPartido;
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
	public String getSiglaColigacao() {
		return siglaColigacao;
	}
	public void setSiglaColigacao(String siglaColigacao) {
		this.siglaColigacao = siglaColigacao;
	}
	public String getNomeColigacao() {
		return nomeColigacao;
	}
	public void setNomeColigacao(String nomeColigacao) {
		this.nomeColigacao = nomeColigacao;
	}
	public String getComposicaoColigacao() {
		return composicaoColigacao;
	}
	public void setComposicaoColigacao(String composicaoColigacao) {
		this.composicaoColigacao = composicaoColigacao;
	}
	public String getSequencialColigacao() {
		return sequencialColigacao;
	}
	public void setSequencialColigacao(String sequencialColigacao) {
		this.sequencialColigacao = sequencialColigacao;
	}
}
