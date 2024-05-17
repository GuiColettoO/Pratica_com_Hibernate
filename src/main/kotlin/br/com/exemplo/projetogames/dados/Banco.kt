package br.com.exemplo.projetogames.dados

import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence


object Banco {
//    fun obterConexao(): Connection? {
//        return try {
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/projetogames", "root", "252529Gg")
//        } catch (e: SQLException) {
//            e.printStackTrace()
//            null
//        }
//    }


    fun getEntityManager(): EntityManager {
        val factory: EntityManagerFactory = Persistence.createEntityManagerFactory("projetogames")
        return factory.createEntityManager()
    }

}