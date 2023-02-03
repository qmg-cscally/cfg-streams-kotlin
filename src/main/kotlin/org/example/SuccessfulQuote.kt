package org.example

import org.example.enums.ProductCode

data class SuccessfulQuote(
    val id: String,
    val quoteReference: String,
    val productData: ProductData,
    val quotedPremium: QuotedPremium,
    val eligibleProductCodes: List<ProductCode>
)