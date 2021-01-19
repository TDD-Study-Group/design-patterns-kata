package org.training.patterns.facade

open class TendBushes {
    private val bushes = Bushes()
    protected fun pruned() = bushes.pruned()
}

class Gardener : TendBushes() {

    private val roses = Roses()
    private val weeds = Weeds()

    fun tendToGarden(): List<GardenEvent> {
        val events = ArrayList<GardenEvent>()
        events.add(pruned())
        events.add(roses.watered())
        events.add(weeds.pulledUp())
        return events
    }

}
