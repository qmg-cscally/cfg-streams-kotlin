package org.example

import org.example.enums.BusinessLineId
import org.example.enums.ProductCode

data class ProductData(
    val productCode: ProductCode,
    val businessLineId: BusinessLineId
    )