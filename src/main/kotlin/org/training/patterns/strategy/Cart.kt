package org.training.patterns.strategy

import org.training.patterns.strategy.Item.*
import java.time.LocalDate

class Cart(vararg item: Item) {
    private val items: List<Item> = item.toList()

    companion object {
        @JvmStatic
        private val BLACK_FRIDAY: LocalDate = LocalDate.of(2020, 11, 27)
        @JvmStatic
        private val CHRISTMAS: LocalDate = LocalDate.of(2020, 12, 25)
        @JvmStatic
        private val SUMMER_SALE_START: LocalDate = LocalDate.of(2020, 6, 3)
        @JvmStatic
        private val SUMMER_SALE_END: LocalDate = LocalDate.of(2020, 7, 4)
    }

    fun price(date: LocalDate): Double {
        if (date.isEqual(BLACK_FRIDAY)) {
            return items.sumByDouble { it.price } * 10 / 100
        }
        if (date.isEqual(CHRISTMAS)) {
            return items.map { item ->
                when (item) {
                    CHRISTMAS_TREE -> item.price * 150 / 100
                    else -> item.price * 90 / 100
                }
            }.sum()
        }
        if (date.isAfter(SUMMER_SALE_START) && date.isBefore(SUMMER_SALE_END)) {
            return items.map { item ->
                when (item) {
                    CHRISTMAS_TREE -> item.price * 10 / 100
                    KITE -> item.price * 50 / 100
                    SMARTPHONE -> item.price * 80 / 100
                }
            }.sum()
        }
        return items.sumByDouble { it.price }
    }

}
