package com.example.ssbumatchupcharts.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 25

    init {
        val deets: MutableList<String> = ArrayList()
        //item 1
        deets.add("Mario: +1")
        deets.add("Luigi: 0")
        deets.add("Peach: -1")
        deets.add("Pac-man: -1")
        deets.add("Lucina: -1")
        addItem(createDummyItem(0,"Luigi: Elegant",deets))
        //item 2
        deets.clear()
        deets.add("Mario: 0")
        deets.add("Luigi: -1")
        deets.add("Peach: -1")
        deets.add("Pac-man: +1")
        deets.add("Lucina: -1")
        addItem(createDummyItem(1,"Mario: prodigy",deets))
        //item 3
        deets.clear()
        deets.add("Mario: +1")
        deets.add("Luigi: +1")
        deets.add("Peach: 0")
        deets.add("Pac-man: 0")
        deets.add("Lucina: 0")
        addItem(createDummyItem(2,"Peach: Samsora",deets))
        //item 4
        deets.clear()
        deets.add("Mario: -1")
        deets.add("Luigi +1")
        deets.add("Peach: 0")
        deets.add("Pac-man: 0")
        deets.add("Lucina: -1")
        addItem(createDummyItem(3,"Pac-man: Tea",deets))
        //item 5
        deets.clear()
        deets.add("Mario: +1")
        deets.add("Luigi +1")
        deets.add("Peach: 0")
        deets.add("Pac-man: +1")
        deets.add("Lucina: 0")
        addItem(createDummyItem(4,"Lucina: MKLeo",deets))

    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int, name: String, details: MutableList<String>): DummyItem {
        return DummyItem(position.toString(), name, makeDetails(position,name,details))
    }

    private fun makeDetails(position: Int, name: String, details: MutableList<String>): String {
        val builder = StringBuilder()
        builder.append(name)
        builder.append("'s Tier List: \n")
//        for (i in 0 until position - 1) {
//            builder.append("\nMore details information here.")
//        }
        for (i in 0 until details.size) {
            builder.append(details[i])
            builder.append("\n")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}
