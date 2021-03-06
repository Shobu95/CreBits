package com.shobu95.crebits.database.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "transactions")
data class Transaction(

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    var type: String? = null,
    var amount: String? = null,
    var date: String? = null,
    var time: String? = null,
    var description: String? = null

) : Parcelable {
    override fun toString(): String {
        return "Transaction(" +
                "id=$id, " +
                "type=$type, " +
                "amount=$amount, " +
                "date=$date, " +
                "time=$time, " +
                "description=$description)"
    }
}