package com.fangs.planetsquiz


object Constants{


    fun getCelestialBodies() : ArrayList<CelestialBody> {
        val celestialBodies = ArrayList<CelestialBody>()

        val mercury = CelestialBody(
            "Mercury",
            "Nabu, Hermes",
            "Zero confirmed Satellites",
            "Mercury does not have any moons or rings\nClosest planet to the Sun\nYour weight on Mercury would be 38% of your weight on Earth.",
            R.drawable.ic_mercury
        )
        celestialBodies.add(mercury)
        val venus = CelestialBody(
            "Venus",
            "Phosphorus, Hesperus",
            "No natural satellite today.",
            "A day on Venus is longer than a year\nVenus is hotter than Mercury despite being further away from the Sun\nVenus is the second brightest natural object in the night sky after the Moon",
            R.drawable.ic_mercury
            )
        celestialBodies.add(venus)

        val earth = CelestialBody(
            "Earth",
            "Gaia, Gaea, Terra, Tellus, the World, the Globe",
            "Moon",
            "We're the third rock from the sun\nEarth is a squashed sphere\nEarth is about 4.54 billion years old",
            R.drawable.ic_earth)
        celestialBodies.add(earth)

        val mars = CelestialBody(
            "Mars",
            "Red Planet",
            "Phobos and Deimos",
            "Mars is the fourth planet from the Sun\nMars is a terrestrial planet with a thin atmosphere composed primarily of carbon dioxide\nNamed after the Roman god of war, Mars",
            R.drawable.ic_mars
        )
        celestialBodies.add(mars)

        val jupiter = CelestialBody(
            "Jupiter",
            "Jove, Iuppiter, lovis, Diespiter,",
            "Has 67 moons confirmed Satellites. Among the famous are Europa, Ganymede, Io, Callisto, Amalthea and many more!",
            "Jupiter is the largest planet in the Solar System\nJupiter Is The Fastest Spinning Planet\nThe Great Red Spot was created by Jupiter’s turbulent and fast-moving atmosphere",
            R.drawable.ic_jupiter
        )
        celestialBodies.add(jupiter)

        val saturn = CelestialBody(
            "Saturn",
            "Chronos",
            "Saturn has 82 moons with known orbits; 53 of them have names.",
            "Saturn is the most distant planet that can be seen with the naked eye\nSaturn is the flattest planet\nSaturn's upper atmosphere is divided into bands of clouds",
            R.drawable.ic_saturn
        )
        celestialBodies.add(saturn)

        val uranus = CelestialBody(
            "Uranus",
            "Sideways Planet, Rolling Planet",
            "Uranus has 27 known moons. Some are Umbriel, Oberon, Titania and Puck",
            "Uranus turns on its axis once every 17 hours, 14 minutes\nOften referred to as an “ice giant” planet\nIt is often described as “rolling around the Sun on its side”",
            R.drawable.ic_uranus
        )
        celestialBodies.add(uranus)

        val neptune = CelestialBody(
            "Neptune",
            "Poseidon and Tangaroa",
            "Neptune has eight known satellites. Triton, Nereid, Proteus, Thalassa are some of them",
            "Neptune is the most distant planet from the Sun\nA year on Neptune lasts 165 Earth years\nNeptune has 6 faint rings",
            R.drawable.ic_neptune
        )
        celestialBodies.add(neptune)

        val sun = CelestialBody(
            "Sun",
            "Sol, Phoebus, Apollo, Ra and many more!",
            "Planets, asteroids and comets orbit around stars such as our Sun and so can also be thought of as natural satellites",
            "The Sun's surface area is 11,990 times that of the Earth's\nThe Sun contains 99.86% of the mass in the Solar System\nThe mass of the Sun is approximately 330,000 times greater than that of Earth",
            R.drawable.ic_sun
        )
        celestialBodies.add(sun)

        val moon = CelestialBody(
            "Moon",
            "Luna, Tungi, Kuu, Hli, Cap, Yoreh, Maan, Mwezi, Bulan, Marama and many more!",
            "Moon has no natural satellite",
            "The Moon is Earth's only permanent natural satellite\nThe Moon always shows Earth the same face\nThe Moon is drifting away from the Earth",
            R.drawable.ic_moon
        )
        celestialBodies.add(moon)
        return celestialBodies
    }





}