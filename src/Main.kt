import Character

fun main() {

    val pj1 = Character(name = "1")

    val armor1 = Armor("Helmet", 10, Perks.GUARD)
    val armor2 = Shield("Shield", 50, Perks.HEALING)
    val weapon1 = Sword("Ex", 20, Perks.FIRE_EFFECT)
    val weapon2 = Axe("Ax", 15, Perks.TTA)

    armor1.apply(pj1)
    armor2.apply(pj1)

    weapon1.apply(pj1)
    weapon2.apply(pj1)

    println("${pj1.name} dealt ${pj1.attack()} damage to an enemy")
    println("${pj1.name} took ${pj1.recieveDamage(100)} damage from an enemy")
    println("${pj1.name} has healed ${pj1.heal(50)} hp")
    println("${pj1.name} has ${pj1.defense()} armor points")


    println(pj1.toString())
    pj1.showInventory()
    weapon1.toString()
}