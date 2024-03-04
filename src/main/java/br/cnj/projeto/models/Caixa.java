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
@Table(name = "TB_CAIXA")
public class Caixa {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caixa")
  @SequenceGenerator(name = "seq_caixa", sequenceName = "sq_tb_caixa", schema = "core")
  Long idCaixa;

  @Column(name = "nm_caixa")
  Long numero;

  @Column(name = "ds_caixa")
  String nome;

  @Column(name = "in_sistema")
  Long sistema;

}
