package br.cnj.projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TB_ASSUNTO")
public class Assunto {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_assunto")
  @SequenceGenerator(name = "seq_assunto", sequenceName = "sq_tb_assunto", schema = "core")
  Long idAssunto;

  @Column(name = "cd_assunto")
  String codigo;

  @Column(name = "ds_assunto")
  String descricao;

  @Column(name = "in_ativo")
  boolean ativo;

  @Column(name = "ds_caminho_completo")
  String caminhoCompleto;

}
