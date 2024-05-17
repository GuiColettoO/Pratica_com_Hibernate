package br.com.exemplo.projetogames.dados

import br.com.exemplo.projetogames.modelo.Plano
import br.com.exemplo.projetogames.modelo.PlanoAssinatura
import br.com.exemplo.projetogames.modelo.PlanoAvulso
import br.com.exemplo.projetogames.utilitario.toEntity
import br.com.exemplo.projetogames.utilitario.toModel
import jakarta.persistence.EntityManager

class PlanosDAO(manager: EntityManager): DAO<Plano, PlanoEntity>(manager, PlanoEntity::class.java) {

  override fun toEntity(plano: Plano): PlanoEntity {
    return plano.toEntity()
  }

  override fun toModel(entity: PlanoEntity): Plano {
    return entity.toModel()
  }

}