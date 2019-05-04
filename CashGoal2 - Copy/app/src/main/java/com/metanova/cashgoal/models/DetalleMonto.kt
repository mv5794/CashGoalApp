package com.metanova.cashgoal.models

import java.math.BigDecimal

data class DetalleMonto(
    var usuario: Usuario,
    var saldo: BigDecimal
)