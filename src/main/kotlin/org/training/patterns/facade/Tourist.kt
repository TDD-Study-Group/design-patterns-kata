package org.training.patterns.facade

class Tourist {

    private val bushes = Bushes()
    private val roses = Roses()

    fun visitGarden(): List<GardenEvent> {
        val events = ArrayList<GardenEvent>()
        events.add(bushes.gazedAt())
        events.add(roses.smelt())
        return events
    }
}
