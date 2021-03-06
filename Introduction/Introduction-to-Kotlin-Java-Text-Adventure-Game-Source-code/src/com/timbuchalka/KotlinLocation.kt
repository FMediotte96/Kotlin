package com.timbuchalka

import java.util.HashMap

class Location(val locationID: Int, val description: String) {
    private val exits: MutableMap<String, Int>

    fun getExits(): Map<String, Int> {
        return HashMap(exits)
    }

    protected fun addExit(direction: String, location: Int) {
        exits.put(direction, location)
    }

    init {
        exits = HashMap()
        exits["Q"] = 0
    }
}