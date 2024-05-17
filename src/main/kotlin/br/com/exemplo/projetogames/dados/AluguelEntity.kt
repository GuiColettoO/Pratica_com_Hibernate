package br.com.exemplo.projetogames.dados

import br.com.exemplo.projetogames.modelo.Periodo
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "aluguel")
class AluguelEntity(
  @ManyToOne
  val gamer: GamerEntity = GamerEntity(),
  @ManyToOne
  val jogo: JogoEntity = JogoEntity(),
  @Embedded
  val periodo: Periodo = Periodo()
) {
  var valorDoAluguel = 0.0
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id = 0
}