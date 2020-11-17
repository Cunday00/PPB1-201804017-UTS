package com.example.musik

object databand {
    private val  namaband = arrayOf(
        "Boyce Avenue",
        "Fear Loathing In Las Vegas",
        "One Ok Rock",
        "SecondHand Serenade",
        "Tonight Alive",
        "30 Second To Mars"
    )
    private val judullagu = arrayOf(
        "Lazy Song",
        "Let Me Hear",
        "The Begining",
        "Power Of Love",
        "Wave",
        "This Is War"
    )
    private val logoband = intArrayOf(
        R.drawable.ba,
        R.drawable.falilv,
        R.drawable.oor,
        R.drawable.shs,
        R.drawable.ta,
        R.drawable.tstm
    )
    val listData: ArrayList<band>
        get() {
            val listband = arrayListOf<band>()
            for (position in namaband.indices){
                val Band = band()
                Band.nama = namaband[position]
                Band.lagu = judullagu[position]
                Band.logo = logoband[position]
                listband.add(Band)
            }
            return listband
        }

}