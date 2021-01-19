package org.training.patterns.facade

class TendBushes {
    private val bushes = Bushes()
    fun pruned() = bushes.pruned()
}

class TendRoses {
    private val roses = Roses()
    fun watered() = roses.watered()
}

class TendWeeds {
    private val weeds = Weeds()
    fun pulledUp() = weeds.pulledUp()
}

class Gardener {

    private val roses = TendRoses()
    private val bushes = TendBushes()
    private val weeds = TendWeeds()

    fun tendToGarden(): List<GardenEvent> {
        val events = ArrayList<GardenEvent>()
        events.add(bushes.pruned())
        events.add(roses.watered())
        events.add(weeds.pulledUp())
        return events
    }

}
