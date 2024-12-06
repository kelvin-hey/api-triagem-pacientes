package br.com.zeroes.triagem_pacientes.model;

import br.com.zeroes.triagem_pacientes.model.enums.Etnia;
import br.com.zeroes.triagem_pacientes.model.enums.Situacao;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(nullable = false, unique = true)
    private Long cpf;

    // Cartão Nacional de Saúde
    @Column(nullable = true)
    private Long cns;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = true)
    private Integer idade;

    @Column(nullable = true, length = 20)
    private String sexo;

    @Column(nullable = true)
    private Long telefone;

    @Column(nullable = true)
    private Long celular;

    @Column(nullable = true, length = 100)
    private String cidade;

    @Column(nullable = true)
    private Integer cep;

    @Column(nullable = true, length = 100)
    private String logradouro;

    @Column(nullable = true)
    private Integer numeroResidencia;

    @Column(nullable = true, length = 100)
    private String complemento = "Casa";

    @Column(nullable = true, length = 50)
    private String bairro;

    @Column(nullable = true, length = 2)
    private String uf = "PR";

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, length = 50)
    private Etnia etnia;

    @Column(nullable = true, length = 100)
    private String nomeResponsavel;

    @Column(nullable = true, length = 100)
    private String grauParentesco;

    @Column(nullable = true, length = 100)
    private String filiacao;

    @Column(nullable = true, length = 50)
    private String nacionalidade;

    @Column(nullable = true, length = 50)
    private String naturalidade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, length = 50)
    private Situacao situacao = Situacao.AGUARDANDO;

    @Column(nullable = true)
    private LocalDate dataAtendimento;

    @Column(nullable = true)
    private LocalTime horaEntrada;

    @Column(nullable = true)
    private LocalTime horaSaida;

    public Paciente() {}

    public Paciente(String nome, Long cpf, Long cns, LocalDate dataNascimento, Integer idade, String sexo,
                    Long telefone, Long celular, String cidade, Integer cep, String logradouro,
                    Integer numeroResidencia, String complemento, String bairro, String uf, Etnia etnia,
                    String nomeResponsavel, String grauParentesco, String filiacao, String nacionalidade,
                    String naturalidade, Situacao situacao, LocalDate dataAtendimento,
                    LocalTime horaEntrada, LocalTime horaSaida) {
        this.nome = nome;
        this.cpf = cpf;
        this.cns = cns;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numeroResidencia = numeroResidencia;
        this.complemento = complemento;
        this.bairro = bairro;
        this.uf = uf;
        this.etnia = etnia;
        this.nomeResponsavel = nomeResponsavel;
        this.grauParentesco = grauParentesco;
        this.filiacao = filiacao;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.situacao = situacao;
        this.dataAtendimento = dataAtendimento;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getCns() {
        return cns;
    }

    public void setCns(Long cns) {
        this.cns = cns;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(Integer numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Etnia getEtnia() {
        return etnia;
    }

    public void setEtnia(Etnia etnia) {
        this.etnia = etnia;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", cns=" + cns +
                ", dataNascimento=" + dataNascimento +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", telefone=" + telefone +
                ", celular=" + celular +
                ", cidade='" + cidade + '\'' +
                ", cep=" + cep +
                ", logradouro='" + logradouro + '\'' +
                ", numeroResidencia=" + numeroResidencia +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", uf='" + uf + '\'' +
                ", etnia='" + etnia + '\'' +
                ", nomeResponsavel='" + nomeResponsavel + '\'' +
                ", grauParentesco='" + grauParentesco + '\'' +
                ", filiacao='" + filiacao + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", naturalidade='" + naturalidade + '\'' +
                ", situacao=" + situacao +
                ", dataAtendimento=" + dataAtendimento +
                ", horaEntrada=" + horaEntrada +
                ", horaSaida=" + horaSaida +
                '}';
    }
}