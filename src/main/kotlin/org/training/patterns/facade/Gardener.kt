package org.training.patterns.facade

class Gardener {

    private val bushes = Bushes()
    private val roses = Roses()
    private val weeds = Weeds()

    fun tendToGarden(): List<GardenEvent> {
        val events = ArrayList<GardenEvent>()
        events.add(bushes.pruned())
        events.add(roses.watered())
        events.add(weeds.pulledUp())
        return events
    }
}
