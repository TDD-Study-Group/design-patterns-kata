package org.training.patterns.visitor

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ZooTest {

    @Test
    fun `Feeding the animals`() {
        // Given
        val zoo = Zoo(PandaBear(), Elephant(), PolarBear(), Tiger())
        val expectedInstructions = listOf(
            "Open the cage",
            "Feed the panda bear with a lot of bamboos",
            "Close the cage",
            "Open the cage",
            "Feed the elephant with peanuts and grass",
            "Close the cage",
            "Open the cage",
            "Feed the polar bear with fresh salmon",
            "Close the cage",
            "Open the cage",
            "Feed the tiger with caution or be its meal",
            "Close the cage"
        )

        // When
        val instructions = zoo.howToFeedTheAnimals()

        // Then
        Assertions.assertThat(instructions).isEqualTo(expectedInstructions)
    }

    @Test
    fun `Playing with the animals`() {
        // Given
        val zoo = Zoo(PandaBear(), Elephant(), PolarBear(), Tiger())
        val expectedInstructions = listOf(
            "Open the cage",
            "Pet the panda bear and shove them gently",
            "Don't forget to close the cage, you are not allowed to bring one home",
            "Open the cage",
            "Go hug this elephant!",
            "Close the cage",
            "Open the cage, if you dare",
            "Leave the polar bear alone, that's probably the best thing you can do",
            "Close the cage if you opened it",
            "Whatever you do, DO NOT OPEN THE CAGE",
            "Don't play with tigers... unless you want to feed them"
        )

        // When
        val instructions = zoo.howToPlayWithTheAnimals()

        // Then
        Assertions.assertThat(instructions).isEqualTo(expectedInstructions)
    }
}
