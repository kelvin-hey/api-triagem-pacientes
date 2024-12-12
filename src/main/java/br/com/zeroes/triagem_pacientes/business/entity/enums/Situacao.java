package br.com.zeroes.triagem_pacientes.business.entity.enums;

public enum Situacao {
    AGUARDANDO("Aguardando Recepção"),
    SENDO_RECEPCIONADO("Sendo Recepcionado"),
    AGUARDANDO_ACOLHIMENTO("Aguardando Acolhimento"),
    SENDO_ACOLHIDO("Sendo Acolhido"),
    AGUARDANDO_CLASSIFICACAO_RISCO("Aguardando Classificação de Risco"),
    PASSANDO_CLASSIFICACAO("Passando por Classificação"),
    AGUARDANDO_ATENDIMENTO_MEDICO("Aguardando Atendimento Médico"),
    EM_ATENDIMENTO_MEDICO("Em Atendimento Médico"),
    RETORNO_CONSULTA("Retorno Consulta"),
    AGUARDANDO_ATENDIMENTO_ENFERMAGEM("Aguardando Atendimento de Enfermagem"),
    EM_ATENDIMENTO_ENFERMAGEM("Em Atendimento de Enfermagem"),
    ENCAMINHAMENTO("Encaminhamento"),
    DISPENSADO("Dispensado"),
    ATENDIMENTO_CONCLUIDO("Atendimento concluído"),
    ATRIBUIDO_LEITO("Atribuido leito");

    private String descricao;

    Situacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
