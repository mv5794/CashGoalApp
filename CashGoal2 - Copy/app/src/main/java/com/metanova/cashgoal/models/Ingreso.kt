package com.metanova.cashgoal.models

import java.math.BigDecimal

data class  Ingreso(
    var detalleMonto: DetalleMonto,
    var tipoIngreso: TipoIngreso,
    var monto:BigDecimal,
    var moneda:String,
    var recurrencia:String
)