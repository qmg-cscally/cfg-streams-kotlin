package org.example

data class EnquiryQuoted(
    val id: String,
    val transactionSource: String,
    val quotes: List<SuccessfulQuote>
    )