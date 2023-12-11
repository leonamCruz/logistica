package tech.leonam.logistica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProgressoEntidade{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String dataHoraCadastro;
    private String dataHoraUltimaAtualizacao;
    private boolean recebimentoDocumento;
    private boolean liberacaoDocRecinto;
    private boolean documentoLiberado;
    private boolean envioDocTransportadora;
    private boolean agendamentoTransportadora;
    private boolean dataColeta;
    private boolean retiradaMercadoria;
    private boolean coletandoCarga;
    private boolean cargaColetada;
    private boolean cargaTransporte;
    private boolean mercadoriaDescarga;
    private boolean mercadoriaEntregue;


}
