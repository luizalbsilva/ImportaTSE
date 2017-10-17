package br.org.merepresenta.importacao.i2017.daos.consultas.vo;

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
@Table(name = "tse_candidato_Voto")
public class CandidatoVotos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Version
	@Column
	private long version;

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
	private String codigoMunicipio;
	@Column
	private String nomeMunicipio;
	@Column
	private Integer numeroZona;
	@Column
	private String codigoCargo;
	@Column
	private String numeroCand;
	@Column
	private String sqCandidato;
	@Column
	private String nomeCandidato;
	@Column
	private String nomeUrnaCandidato;
	@Column
	private String descricaoCargo;
	@Column
	private String codSitCandSuperior;
	@Column
	private String descSitCandSuperior;
	@Column
	private String codigoSitCandidato;
	@Column
	private String descSitCandidato;
	@Column
	private String codigoSitCandTot;
	@Column
	private String descSitCandTot;
	@Column
	private String numeroPartido;
	@Column
	private String siglaPartido;
	@Column
	private String nomePartido;
	@Column
	private String sequencialLegenda;
	@Column
	private String nomeColigacao;
	@Column
	private String composicaoLegenda;
	@Column
	private Integer totalVotos;
	@Column
	private String transito;
	
	public Integer getId() {
		return id;
	}
	public long getVersion() {
		return version;
	}
	public void setVersion(long version) {
		this.version = version;
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
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}
	public Integer getNumeroZona() {
		return numeroZona;
	}
	public void setNumeroZona(Integer numeroZona) {
		this.numeroZona = numeroZona;
	}
	public String getCodigoCargo() {
		return codigoCargo;
	}
	public void setCodigoCargo(String codigoCargo) {
		this.codigoCargo = codigoCargo;
	}
	public String getNumeroCand() {
		return numeroCand;
	}
	public void setNumeroCand(String numeroCand) {
		this.numeroCand = numeroCand;
	}
	public String getSqCandidato() {
		return sqCandidato;
	}
	public void setSqCandidato(String sqCandidato) {
		this.sqCandidato = sqCandidato;
	}
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public String getNomeUrnaCandidato() {
		return nomeUrnaCandidato;
	}
	public void setNomeUrnaCandidato(String nomeUrnaCandidato) {
		this.nomeUrnaCandidato = nomeUrnaCandidato;
	}
	public String getDescricaoCargo() {
		return descricaoCargo;
	}
	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}
	public String getCodSitCandSuperior() {
		return codSitCandSuperior;
	}
	public void setCodSitCandSuperior(String codSitCandSuperior) {
		this.codSitCandSuperior = codSitCandSuperior;
	}
	public String getDescSitCandSuperior() {
		return descSitCandSuperior;
	}
	public void setDescSitCandSuperior(String descSitCandSuperior) {
		this.descSitCandSuperior = descSitCandSuperior;
	}
	public String getCodigoSitCandidato() {
		return codigoSitCandidato;
	}
	public void setCodigoSitCandidato(String codigoSitCandidato) {
		this.codigoSitCandidato = codigoSitCandidato;
	}
	public String getDescSitCandidato() {
		return descSitCandidato;
	}
	public void setDescSitCandidato(String descSitCandidato) {
		this.descSitCandidato = descSitCandidato;
	}
	public String getCodigoSitCandTot() {
		return codigoSitCandTot;
	}
	public void setCodigoSitCandTot(String codigoSitCandTot) {
		this.codigoSitCandTot = codigoSitCandTot;
	}
	public String getDescSitCandTot() {
		return descSitCandTot;
	}
	public void setDescSitCandTot(String descSitCandTot) {
		this.descSitCandTot = descSitCandTot;
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
	public String getSequencialLegenda() {
		return sequencialLegenda;
	}
	public void setSequencialLegenda(String sequencialLegenda) {
		this.sequencialLegenda = sequencialLegenda;
	}
	public String getNomeColigacao() {
		return nomeColigacao;
	}
	public void setNomeColigacao(String nomeColigacao) {
		this.nomeColigacao = nomeColigacao;
	}
	public String getComposicaoLegenda() {
		return composicaoLegenda;
	}
	public void setComposicaoLegenda(String composicaoLegenda) {
		this.composicaoLegenda = composicaoLegenda;
	}
	public Integer getTotalVotos() {
		return totalVotos;
	}
	public void setTotalVotos(Integer totalVotos) {
		this.totalVotos = totalVotos;
	}
	public String getTransito() {
		return transito;
	}
	public void setTransito(String transito) {
		this.transito = transito;
	}

}
