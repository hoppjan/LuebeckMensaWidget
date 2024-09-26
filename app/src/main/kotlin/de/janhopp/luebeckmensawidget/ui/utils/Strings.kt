package de.janhopp.luebeckmensawidget.ui.utils

import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.Composable
import de.janhopp.luebeckmensawidget.R
import de.janhopp.luebeckmensawidget.api.model.Location
import de.janhopp.luebeckmensawidget.api.model.PriceGroup

@Composable
fun PriceGroup.stringRes(): String =
    stringResource(
        when (this) {
            PriceGroup.Students -> R.string.price_group_students
            PriceGroup.Employees -> R.string.price_group_employees
            PriceGroup.Guests -> R.string.price_group_guests
        }
    )

@Composable
fun Location.stringRes(): String =
    stringResource(
        when (this) {
            Location.MensaLuebeck -> R.string.location_mensa_luebeck
            Location.CafeteriaLuebeck -> R.string.location_cafeteria_luebeck
            Location.MusikhochschuleLuebeck -> R.string.location_musikhochschule_luebeck
        }
    )
