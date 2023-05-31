package com.example.ukl

class ItemData {
    public val data = arrayOf(
        arrayOf(
            R.drawable.corrupted_azir,
            "Corrupted Azir",
            "Rp300.000",
            "Legend of Runeterra"
        ),
        arrayOf(
            R.drawable.corrupted_nasus,
            "Corrupted Nasus",
            "Rp300.000",
            "Legend of Runeterra"
        ),
        arrayOf(
            R.drawable.corrupted_renekton,
            "Corrupted Renekton",
            "Rp300.000",
            "Legend of Runeterra"
        ),
        arrayOf(
            R.drawable.da_vinci_wings,
            "Da Vinci Wings",
            "Rp",
            "Growtopia"
        ),
        arrayOf(
            R.drawable.giant_eye_head,
            "Giant Eye Head",
            "Rp",
            "Growtopia"
        ),
        arrayOf(
            R.drawable.the_beast_with_thousand_eyes_mask,
            "The Beast with Thousand Eyes Mask",
            "Rp",
            "Growtopia"
        )
    )

    val listData: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for(aData in data){
                val item = Item()
                item.photo = aData[0] as Int
                item.name = aData[1] as String
                item.harga = aData[2] as String
                item.game = aData[3] as String

                list.add(item)
            }
            return list
        }
}