package com.metanova.cashgoal.models

import java.math.BigDecimal

data class Egreso(
    var detalleMonto: DetalleMonto,
    var tipoEgreso: TipoEgreso,
    var monto: BigDecimal,
    var moneda:String,
    var recurrencia:String
)