abstract class Protection(val name: String, val armor: Int, val perk: Perks?): IItem {

    override fun apply(character: Character) {
        character._inventory.add(this)
    }

    override fun toString(): String {
        if (this.perk == null) {
            return "${this.name} - ${this.armor} armor points - No perks\n"
        }
        else{
            return "${this.name} - ${this.armor} armor points - Perk: ${this.perk.perkName} (${this.perk.effect})\n"
        }
    }

}