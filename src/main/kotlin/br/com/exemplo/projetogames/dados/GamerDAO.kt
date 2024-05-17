package br.com.exemplo.projetogames.dados

import br.com.exemplo.projetogames.modelo.Gamer
import br.com.exemplo.projetogames.utilitario.toEntity
import br.com.exemplo.projetogames.utilitario.toModel
import jakarta.persistence.EntityManager

class GamersDAO(manager: EntityManager): DAO<Gamer, GamerEntity>(manager, GamerEntity::class.java) {

  override fun toEntity(objeto: Gamer): GamerEntity {
    return GamerEntity(
      objeto.id,
      objeto.nome,
      objeto.email,
      objeto.dataNascimento,
      objeto.usuario,
      objeto.plano.toEntity())
  }

  override fun toModel(entity: GamerEntity): Gamer {
    return Gamer(
      entity.nome,
      entity.email,
      entity.dataNascimento,
      entity.usuario,
      entity.id)
      .apply {
        plano = entity.plano.toModel()
      }
  }
}