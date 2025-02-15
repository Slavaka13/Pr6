internal class WorldMap(vararg cities: String) {
    fun findCities(count: Int) = cities.shuffled().slice(0 until count)

    private val cities: List<String> = cities.toList()
}
