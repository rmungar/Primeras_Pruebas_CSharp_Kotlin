object ValuesManager {


    fun getTotalAttack(character: Character): Int{
        var characterFinalDamage = character.baseDamage

        for (item in character._inventory){
            if (item is Weapon){
                var additiveDamage: Int
                when (item.perk){
                    Perks.FIRE_EFFECT -> {
                        additiveDamage = item.damage + (item.damage * Perks.FIRE_EFFECT.percentage).toInt()
                        characterFinalDamage += additiveDamage
                    }
                    Perks.TTA -> {
                        additiveDamage = item.damage + (item.damage * Perks.TTA.percentage).toInt()
                        characterFinalDamage += additiveDamage
                    }
                    else -> {
                        characterFinalDamage += item.damage
                    }
                }
            }
        }
        return characterFinalDamage
    }

//--------------------------------------------------------------------------------------------------------------------//

    fun getTotalDefense(character: Character): Int{
        var characterFinalDefense = character.baseArmor

        for (item in character._inventory){
            if (item is Armor){
                var additiveArmor: Int
                if (item.perk == Perks.GUARD){
                    additiveArmor = item.armor + (item.armor * Perks.GUARD.percentage).toInt()

                    characterFinalDefense += additiveArmor
                }
                else{
                    characterFinalDefense += item.armor
                }
            }
        }
        return characterFinalDefense
    }

//--------------------------------------------------------------------------------------------------------------------//

    fun getTotalHealing(baseHealingAmount: Int, character: Character): Int{
        var finalHealing = baseHealingAmount

        for (item in character._inventory){
            if (item is Protection){
                var additiveHealing: Int
                if (item.perk == Perks.HEALING){
                    additiveHealing = ( baseHealingAmount * Perks.HEALING.percentage ).toInt()
                    finalHealing += additiveHealing
                }
            }
        }
        return finalHealing
    }

}