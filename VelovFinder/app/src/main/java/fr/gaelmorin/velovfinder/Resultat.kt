package fr.gaelmorin.velovfinder

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson

/**
 * Created by nabil on 05/07/18.
 */

data class Resultat(
        val values: Array<Station>,
        val nb_results: Int


){
    class Deserializer: ResponseDeserializable<Resultat> {
        override fun deserialize(content: String): Resultat? = Gson().fromJson(content, Resultat::class.java)
    }
}