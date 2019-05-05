package com.metanova.cashgoal.models

import java.math.BigDecimal

data class Meta (
    var usuario: Usuario,
    var tipoMeta: TipoMeta,
    var monto: BigDecimal,
    var ahorrado: BigDecimal,
    var descripcion: String,
    var moneda: String,
    var nombre: String
)