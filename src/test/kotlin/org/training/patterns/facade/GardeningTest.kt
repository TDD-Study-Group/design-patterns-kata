package org.training.patterns.facade

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.training.patterns.facade.GardenEvent.*

class GardeningTest {
    @Test
    fun `The gardener tends to the garden`() {
        val events = Gardener().tendToGarden()
        assertThat(events).containsExactlyInAnyOrder(BUSH_PRUNED, ROSES_WATERED, WEEDS_PULLED_UP)
    }

    @Test
    fun `The tourist visits the garden`() {
        val events = Tourist().visitGarden()
        assertThat(events).containsExactlyInAnyOrder(ROSES_SMELT, BUSH_GAZED_AT)
    }
}
