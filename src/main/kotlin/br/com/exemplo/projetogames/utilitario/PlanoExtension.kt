package br.com.exemplo.projetogames.utilitario

import br.com.exemplo.projetogames.dados.PlanoAssinaturaEntity
import br.com.exemplo.projetogames.dados.PlanoAvulsoEntity
import br.com.exemplo.projetogames.dados.PlanoEntity
import br.com.exemplo.projetogames.modelo.Plano
import br.com.exemplo.projetogames.modelo.PlanoAssinatura
import br.com.exemplo.projetogames.modelo.PlanoAvulso

fun Plano.toEntity(): PlanoEntity{
  return if (this is PlanoAssinatura) {
    PlanoAssinaturaEntity(
      this.tipo,
      this.mensalidade,
      this.jogosIncluidos,
      this.percentualDescontoReputacao,
      this.id,
    )
  } else {
    PlanoAvulsoEntity(this.tipo, this.id)
  }
}

fun PlanoEntity.toModel(): Plano {
  return if(this is PlanoAssinaturaEntity) {
    PlanoAssinatura(
      this.tipo,
      this.mensalidade,
      this.jogosIncluidos,
      this.percentualDescontoReputacao,
      this.id
    )
  } else {
    PlanoAvulso(this.tipo, this.id)
  }
}