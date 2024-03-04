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
@Table(name = "TB_STATUS")
public class Status {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_status")
  @SequenceGenerator(name = "seq_status", sequenceName = "sq_tb_status", schema = "core")
  Long idStatus;

  @Column(name = "ds_status")
  String status;

  @Column(name = "in_ativo")
  boolean ativo;

}
