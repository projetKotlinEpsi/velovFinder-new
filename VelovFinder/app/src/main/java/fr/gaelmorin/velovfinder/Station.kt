package fr.gaelmorin.velovfinder

import android.hardware.camera2.CameraManager
import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson
import java.util.*

/**
 * Created by nabil on 05/07/18.
 */


data class Station(
        val status: String,
        val bike_stands: Int,
        val availability: String,
        val available_bike_stands: Int,
        val available_bikes: Int,
        val address: String,
        val lat: Float,
        val lng: Float,
        val last_update_fme: Date

){
    class Deserializer: ResponseDeserializable<Array<Station>> {
        override fun deserialize(content: String): Array<Station>? = Gson().fromJson(content, Array<Station>::class.java)
    }
}