package org.example.test_data

import org.example.EnquiryQuoted
import org.example.ProductData
import org.example.QuotedPremium
import org.example.SuccessfulQuote
import org.example.enums.BusinessLineId
import org.example.enums.ProductCode

class TestDataGenerator {
    companion object {
        fun enquiryQuoted(): EnquiryQuoted {
            return EnquiryQuoted(
                id = "enquiry-quoted-1",
                transactionSource = "website",
                quotes = listOf(
                    qgl10Quote(), qgl11Quote(), qgl14Quote(),
                    homeEmergencyPlusQuote(), homeEmergencySelectFreeQuote(), homeEmergencySelectPaidQuote(),
                    homeLegalPlus(), homeLegalSelectFree(), homeLegalSelectPaid(),
                    oneKey(), twoKey(), threeKey(), fourKey()
                )
            )
        }

        private fun qgl14Quote(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "qgl14Quote",
                quoteReference = "qgl14Quote",
                productData = ProductData(
                    productCode = ProductCode.qgl14,
                    businessLineId = BusinessLineId.home
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 120,
                    netAmount = 100
                ),
                eligibleProductCodes = listOf(
                    ProductCode.home_emergency_plus,
                    ProductCode.home_emergency_select_paid,
                    ProductCode.home_legal_plus,
                    ProductCode.home_legal_select_paid,
                    ProductCode.key_cover_four_fob,
                    ProductCode.key_cover_three_fob,
                    ProductCode.key_cover_two_fob,
                    ProductCode.key_cover_one_fob
                )
            )
        }

        private fun qgl10Quote(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "qgl10Quote",
                quoteReference = "qgl10Quote",
                productData = ProductData(
                    productCode = ProductCode.qgl10,
                    businessLineId = BusinessLineId.home
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 140,
                    netAmount = 120
                ),
                eligibleProductCodes = listOf(
                    ProductCode.home_emergency_plus,
                    ProductCode.home_emergency_select_free,
                    ProductCode.home_legal_plus,
                    ProductCode.home_legal_select_free,
                    ProductCode.key_cover_four_fob,
                    ProductCode.key_cover_three_fob,
                    ProductCode.key_cover_two_fob,
                    ProductCode.key_cover_one_fob
                )
            )
        }

        private fun qgl11Quote(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "qgl11Quote",
                quoteReference = "qgl11Quote",
                productData = ProductData(
                    productCode = ProductCode.qgl11,
                    businessLineId = BusinessLineId.home
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 160,
                    netAmount = 140
                ),
                eligibleProductCodes = listOf(
                    ProductCode.home_emergency_plus,
                    ProductCode.home_emergency_select_free,
                    ProductCode.home_legal_plus,
                    ProductCode.home_legal_select_free,
                    ProductCode.key_cover_four_fob,
                    ProductCode.key_cover_three_fob,
                    ProductCode.key_cover_two_fob,
                    ProductCode.key_cover_one_fob
                )
            )
        }

        private fun homeEmergencySelectFreeQuote(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "homeEmergencySelectFreeQuote",
                quoteReference = "homeEmergencySelectFreeQuote",
                productData = ProductData(
                    productCode = ProductCode.home_emergency_select_free,
                    businessLineId = BusinessLineId.home_emergency
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 0,
                    netAmount = 0
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun homeEmergencySelectPaidQuote(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "homeEmergencySelectPaidQuote",
                quoteReference = "homeEmergencySelectPaidQuote",
                productData = ProductData(
                    productCode = ProductCode.home_emergency_select_paid,
                    businessLineId = BusinessLineId.home_emergency
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 20,
                    netAmount = 10
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun homeEmergencyPlusQuote(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "homeEmergencyPlusQuote",
                quoteReference = "homeEmergencyPlusQuote",
                productData = ProductData(
                    productCode = ProductCode.home_emergency_plus,
                    businessLineId = BusinessLineId.home_emergency
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 40,
                    netAmount = 30
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun homeLegalSelectFree(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "homeLegalSelectFree",
                quoteReference = "homeLegalSelectFree",
                productData = ProductData(
                    productCode = ProductCode.home_legal_select_free,
                    businessLineId = BusinessLineId.home_legal
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 0,
                    netAmount = 0
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun homeLegalSelectPaid(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "homeLegalSelectPaid",
                quoteReference = "homeLegalSelectPaid",
                productData = ProductData(
                    productCode = ProductCode.home_legal_select_paid,
                    businessLineId = BusinessLineId.home_legal
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 15,
                    netAmount = 5
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun homeLegalPlus(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "homeLegalPlus",
                quoteReference = "homeLegalPlus",
                productData = ProductData(
                    productCode = ProductCode.home_legal_plus,
                    businessLineId = BusinessLineId.home_legal
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 25,
                    netAmount = 15
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun oneKey(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "oneKey",
                quoteReference = "oneKey",
                productData = ProductData(
                    productCode = ProductCode.key_cover_one_fob,
                    businessLineId = BusinessLineId.key
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 10,
                    netAmount = 5
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun fourKey(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "fourKey",
                quoteReference = "fourKey",
                productData = ProductData(
                    productCode = ProductCode.key_cover_four_fob,
                    businessLineId = BusinessLineId.key
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 40,
                    netAmount = 35
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun twoKey(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "twoKey",
                quoteReference = "twoKey",
                productData = ProductData(
                    productCode = ProductCode.key_cover_two_fob,
                    businessLineId = BusinessLineId.key
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 20,
                    netAmount = 15
                ),
                eligibleProductCodes = listOf()
            )
        }

        private fun threeKey(): SuccessfulQuote {
            return SuccessfulQuote(
                id = "threeKey",
                quoteReference = "threeKey",
                productData = ProductData(
                    productCode = ProductCode.key_cover_three_fob,
                    businessLineId = BusinessLineId.key
                ),
                quotedPremium = QuotedPremium(
                    grossAmount = 30,
                    netAmount = 25
                ),
                eligibleProductCodes = listOf()
            )
        }
    }

}