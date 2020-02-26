package org.training.patterns.facade

class Roses {
    fun watered(): GardenEvent =
        GardenEvent.ROSES_WATERED
    fun smelt(): GardenEvent =
        GardenEvent.ROSES_SMELT
}
