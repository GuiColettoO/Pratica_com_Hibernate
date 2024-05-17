package br.com.exemplo.projetogames.dados

import br.com.exemplo.projetogames.modelo.Aluguel
import br.com.exemplo.projetogames.utilitario.toEntity
import br.com.exemplo.projetogames.utilitario.toModel
import jakarta.persistence.EntityManager

class AluguelDAO(manager: EntityManager): DAO<Aluguel, AluguelEntity>(manager, AluguelEntity::class.java) {
  override fun toEntity(objeto: Aluguel): AluguelEntity {
    return AluguelEntity(
      objeto.gamer.toEntity(),
      objeto.jogo.toEntity(),
      objeto.periodo)
      .apply {
        valorDoAluguel = objeto.valorDoAluguel
        id = objeto.id}
  }

  override fun toModel(entity: AluguelEntity): Aluguel {
    return Aluguel(entity.gamer.toModel(), entity.jogo.toModel(), entity.periodo)
      .apply { id = entity.id
      }
  }

}