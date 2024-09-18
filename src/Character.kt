
class Character(val name: String,
                val maxHitPoints: Int = 100,
                private var currentHp: Int = maxHitPoints,
                val baseDamage: Int = 10,
                val baseArmor: Int = 0,
                var _inventory: MutableList<IItem> = mutableListOf()
) {



    fun attack(): Int{
        return ValuesManager.getTotalAttack(this)
    }

    fun defense(): Int{
        return ValuesManager.getTotalDefense(this)
    }

    fun heal(hp: Int): Int{
        val toHeal = ValuesManager.getTotalHealing(hp, this)
        var healing = 0
        if (toHeal >= maxHitPoints){
            healing = toHeal - currentHp
            currentHp = maxHitPoints
        }
        else{
            if (currentHp + toHeal > maxHitPoints){
                healing = toHeal - currentHp
                currentHp = maxHitPoints
            }
            else{
                currentHp += toHeal
                healing = toHeal
            }
        }
        return healing
    }

    fun recieveDamage( damageRecieved: Int ): Int{
        val characterDefense = defense()
        if (characterDefense <= damageRecieved){
            currentHp -= (damageRecieved - characterDefense)
        }
        return (damageRecieved - characterDefense)
    }

    fun showInventory(){
        println("\nINVENTORY:\n")
        this._inventory.forEach {
            println(it.toString())
        }
    }

    override fun toString(): String {
        return "$name - $currentHp HP - ${attack()} damage points - ${defense()} armor points - inventory: ${_inventory.size} items"
    }

}