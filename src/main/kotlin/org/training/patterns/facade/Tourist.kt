package org.training.patterns.facade

class VisitBushes {
    private val bushes = Bushes()
    fun gazedAt() = bushes.gazedAt()
}

class VisitRoses {
    private val roses = Roses()
    fun smelt() = roses.smelt()
}

class Tourist {

    private val bushes = VisitBushes()
    private val roses = VisitRoses()

    fun visitGarden(): List<GardenEvent> {
        val events = ArrayList<GardenEvent>()
        events.add(bushes.gazedAt())
        events.add(roses.smelt())
        return events
    }

}
