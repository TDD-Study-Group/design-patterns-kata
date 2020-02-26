package org.training.patterns.facade

class Bushes {
    fun pruned(): GardenEvent =
        GardenEvent.BUSH_PRUNED
    fun gazedAt(): GardenEvent =
        GardenEvent.BUSH_GAZED_AT
}
