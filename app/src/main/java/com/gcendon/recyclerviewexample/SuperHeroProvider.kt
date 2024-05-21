package com.gcendon.recyclerviewexample

class SuperHeroProvider {
    companion object {
        val superHeroList = listOf(
            SuperHero(
                "Batman",
                "DC",
                "Bruce Wayne",
                "https://cdn.europosters.eu/image/750/wall-murals/the-batman-2022-i122573.jpg"
            ),
            SuperHero(
                "Superman",
                "DC",
                "Kal-El",
                "https://sm.ign.com/t/ign_latam/screenshot/default/super_s31e.1280.jpg"
            ),
            SuperHero(
                "Aquaman",
                "DC",
                "Arthur Curry",
                "https://static.wikia.nocookie.net/batman/images/3/3b/Aquaman.jpg/revision/latest?cb=20130327162230&path-prefix=es"
            ),
            SuperHero(
                "Wolverine",
                "Marvel",
                "James Howlett",
                "https://static.wikia.nocookie.net/featteca/images/8/82/Wolverine_PNG1.png/revision/latest?cb=20220219192157&path-prefix=es"
            ),
            SuperHero(
                "Thor",
                "Marvel",
                "Thor Odinson",
                "https://www.mundodeportivo.com/alfabeta/hero/2023/11/template-54_3j4t.1700561720.8893.jpg?width=1200&aspect_ratio=16:9"
            )
        )
    }
}