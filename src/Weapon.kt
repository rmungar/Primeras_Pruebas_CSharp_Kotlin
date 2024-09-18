abstract class Weapon(val name: String, val damage: Int, val perk: Perks?): IItem {

    override fun apply(character: Character) {
        character._inventory.add(this)
    }

    override fun toString(): String {
        if (this.perk == null) {
            return "${this.name} - ${this.damage} damage points - No perks\n"
        }
        else{
            return "${this.name} - ${this.damage} damage points - Perk: ${this.perk.perkName} (${this.perk.effect})\n"
        }
    }
}