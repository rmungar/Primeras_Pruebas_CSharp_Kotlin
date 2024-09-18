enum class Perks(val perkName: String, val effect: String, val percentage: Float) {

    HEALING("Healing Bonus", "Increases incoming healing by 15%", 0.15F),
    FIRE_EFFECT("Fire Effect", "Adds a flaming effect to all your weapons (+10% FINAL DAMAGE)", 0.1F),
    GUARD("Guard", "Adds a damage reduction factor of 25% to all incoming damage", 0.25F),
    TTA("True Type Advantage", "Adds a flat damage increase of 50% to all outgoing damage", 0.5F)

}