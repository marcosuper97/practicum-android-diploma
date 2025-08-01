package ru.practicum.android.diploma.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "filters")
data class FiltersEntity(
    @PrimaryKey
    val id: Int = 1,
    val country: String? = null,
    val countryId: String? = null,
    val area: String? = null,
    val areaId: String? = null,
    val industry: String? = null,
    val industryId: String? = null,
    val salary: String? = null,
    val onlyWithSalary: Boolean? = null,
) {
    companion object {
        val EMPTY = FiltersEntity()
    }
}
