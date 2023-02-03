package org.example

import org.example.enums.ProductCode
import org.example.test_data.TestDataGenerator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BaseTest {

    val enquiryQuoted = TestDataGenerator.enquiryQuoted()

    ///////////////////
    // FILTER
    ///////////////////

    @Test
    fun getOnlyTheQuoteWhereProductCodeIsQGL10() {
        val successfulQuotes = enquiryQuoted.quotes.filter {
            it.productData.productCode == ProductCode.qgl10
        }

        Assertions.assertEquals(
            1,
            successfulQuotes.size
        )
    }

    @Test
    fun getAllTheQuotesWhereBusinessLineIdIsKey() {
        //get all the quotes which have a business line id of key
        //check that you have three quotes after filtering
    }

    @Test
    fun getAllTheQuotesWhereGrossAmountIsGreaterThan125() {
        //get all the quotes which have a gross amount greater than 125
        //check that you have two quotes after filtering
    }

    @Test
    fun getAllTheQuotesWhereEligibleProductCodeListContainsHomeLegalSelectPaid() {
        //get all the quotes which have home legal select paid in the list of eligible product codes
        //check you only have one quote after filter
        //check that the product code of that one quote is qgl14
    }

    ///////////////////
    // FILTER & MAP
    ///////////////////

    @Test
    fun getTheProductCodesForAnyQuotesWhichHaveEligibleProductCodeListWhichContainsHomeLegalSelectFree() {
        //get all the quotes which have home legal select free in the list of eleigible product codes
        //then make a list of only the product codes for those quotes
        //the list of product codes should contain two entries
        //the two entries should be qgl10 and qgl11
    }

    @Test
    fun getTheGrossAmountForAllQuotesWithBusinessLineIdKey() {
        //get all the quotes that have a business line id of key
        //then make a list of only the gross amounts for those quotes
        //the list of gross amounts should have four entries
    }

    /////////////////////////
    // FILTER & MAP & REDUCE
    ////////////////////////

    @Test
    fun getTheSumOfTheGrossAmountForAllQuotesWithBusinessLineIdKey() {
        //get all the quotes that have a business line id of key
        //then make a list of only the gross amounts for those quotes
        //the list of gross amounts should have four entries
        //add the four entries together to get a total amount, which should equal 100
    }

}