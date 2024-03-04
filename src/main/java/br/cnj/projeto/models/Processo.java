package br.cnj.projeto.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TB_PROCESSO")
public class Processo {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_processo")
  @SequenceGenerator(name = "seq_processo", sequenceName = "sq_tb_processo", schema = "core")
  Long idProcesso;

  @Column(name = "nr_processo")
  String numeroProcesso;

  @Column(name = "nr_proceso_origem")
  String numeroProcessoOrigem;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "nr_proceso_origem", referencedColumnName = "nr_processo", insertable = false, updatable = false)
  Processo processoOrigem;

  @Column(name = "ds_complemento")
  String complemento;

  @Column(name = "dt_inicio")
  LocalDate dtInicio;

  @Column(name = "dt_fim")
  LocalDate dtFim;

  @Column(name = "id_jbpm")
  Long idJbpm;

  @Column(name = "nr_duracao")
  Long duracao;

  @Column(name = "nm_actor_id")
  Long actorId;

  @Column(name = "ds_nm_usu_casdastro_processo")
  String nomeUsuarioCadastroProcesso;

  @Column(name = "id_pk_tb_processo_pg")
  Long procesoPg;

  @Column(name = "id_sessao_pg")
  long sessaoPg;

  @Column(name = "nr_processo_temp")
  long numeroProcessoTemporario;

}
