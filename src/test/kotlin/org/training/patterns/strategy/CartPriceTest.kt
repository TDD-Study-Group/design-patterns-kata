package org.training.patterns.strategy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.training.patterns.strategy.Item.*
import java.time.LocalDate

class CartPriceTest {

    @Test
    fun `price all year`() {
        // Given
        val cart = Cart(CHRISTMAS_TREE, KITE, SMARTPHONE)
        // When
        val price = cart.price(LocalDate.of(2020, 2, 2))
        // Then
        Assertions.assertThat(price).isEqualTo(400.0)
    }

    @Test
    fun `price during black friday`() {
        // Given
        val cart = Cart(CHRISTMAS_TREE, KITE, SMARTPHONE)
        // When
        val price = cart.price(LocalDate.of(2020, 11, 27))
        // Then
        Assertions.assertThat(price).isEqualTo(40.0)
    }

    @Test
    fun `price at christmas`() {
        // Given
        val cart = Cart(CHRISTMAS_TREE, KITE, SMARTPHONE)
        // When
        val price = cart.price(LocalDate.of(2020, 12, 25))
        // Then
        Assertions.assertThat(price).isEqualTo(378.0)
    }

    @Test
    fun `price during summer sales`() {
        // Given
        val cart = Cart(CHRISTMAS_TREE, KITE, SMARTPHONE)
        // When
        val price = cart.price(LocalDate.of(2020, 6, 10))
        // Then
        Assertions.assertThat(price).isEqualTo(263.0)
    }
}
