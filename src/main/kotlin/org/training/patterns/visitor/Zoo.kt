package org.training.patterns.visitor

class Zoo(vararg animals: Animal) {

    private val animals: List<Animal> = animals.asList()

    fun howToFeedTheAnimals(): List<String> {
        val instructions = ArrayList<String>()
        animals.forEach { animal ->
            when (animal) {
                is PandaBear -> {
                    instructions.add("Open the cage")
                    instructions.add("Feed the panda bear with a lot of bamboos")
                    instructions.add("Close the cage")
                }
                is Elephant -> {
                    instructions.add("Open the cage")
                    instructions.add("Feed the elephant with peanuts and grass")
                    instructions.add("Close the cage")
                }
                is PolarBear -> {
                    instructions.add("Open the cage")
                    instructions.add("Feed the polar bear with fresh salmon")
                    instructions.add("Close the cage")
                }
                is Tiger -> {
                    instructions.add("Open the cage")
                    instructions.add("Feed the tiger with caution or be its meal")
                    instructions.add("Close the cage")
                }
                else -> {
                    instructions.add("I don't know how to feed this one...")
                }
            }
        }
        return instructions
    }

    fun howToPlayWithTheAnimals(): List<String> {
        val instructions = ArrayList<String>()
        animals.forEach { animal ->
            when (animal) {
                is PandaBear -> {
                    instructions.add("Open the cage")
                    instructions.add("Pet the panda bear and shove them gently")
                    instructions.add("Don't forget to close the cage, you are not allowed to bring one home")
                }
                is Elephant -> {
                    instructions.add("Open the cage")
                    instructions.add("Go hug this elephant!")
                    instructions.add("Close the cage")
                }
                is PolarBear -> {
                    instructions.add("Open the cage, if you dare")
                    instructions.add("Leave the polar bear alone, that's probably the best thing you can do")
                    instructions.add("Close the cage if you opened it")
                }
                is Tiger -> {
                    instructions.add("Whatever you do, DO NOT OPEN THE CAGE")
                    instructions.add("Don't play with tigers... unless you want to feed them")
                }
                else -> {
                    instructions.add("I don't know how to play with this one...")
                }
            }
        }
        return instructions
    }
}
