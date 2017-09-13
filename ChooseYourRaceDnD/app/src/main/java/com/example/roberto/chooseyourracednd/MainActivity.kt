package com.example.roberto.chooseyourracednd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent = Intent(this, SecondActivity::class.java)

        dwarfButtonId.setOnClickListener {
            intent.putExtra("race", "Dwarf")
            intent.putExtra("abilityScore", "Con +2")
            intent.putExtra("speed", "25 feet. Your speed is not reduced by wearing" +
                    "Heavy Armor")
            intent.putExtra("skill", "Darkvision: Accustomed to life underground, " +
                    "you have superior vision in dark and dim Conditions. You can see in dim light " +
                    "within 60 feet of you as if it were bright light, and in Darkness as if it " +
                    "were dim light. You can’t discern color in Darkness, only shades of gray.\n\n" +
                    "Dwarven Resilience: You have advantage on saving throws against poison, and " +
                    "you have Resistance against poison damage. \n\n" +
                    "Dwarven Combat Training: You have proficiency with the Battleaxe, Handaxe, " +
                    "Light Hammer, and Warhammer. \n\n" +
                    "Tool Proficiency: You gain proficiency with the artisan’s tools of your " +
                    "choice: smith’s tools, brewer’s supplies, or mason’s tools. \n\n" +
                    "Stonecunning: Whenever you make an Intelligence (History) check related to " +
                    "the origin of stonework, you are considered proficient in the History skill " +
                    "and add double your proficiency bonus to the check, instead of your normal " +
                    "proficiency bonus.")
            intent.putExtra("languages", "Common and Dwarvish")
            startActivity(intent)
        }

        elfButtonId.setOnClickListener {
            intent.putExtra("race", "Elf")
            intent.putExtra("abilityScore", "Dex +2")
            intent.putExtra("speed", "30 feet")
            intent.putExtra("skill", "Darkvision: Accustomed to twilit forests and the " +
                    "night sky, you have superior vision in dark and dim Conditions. You can see " +
                    "in dim light within 60 feet of you as if it were bright light, and in Darkness " +
                    "as if it were dim light. You can’t discern color in Darkness, only shades of " +
                    "gray. \n\n" +
                    "Keen Senses: You have proficiency in the Perception skill. \n\n" +
                    "Fey Ancestry: You have advantage on saving throws against being Charmed, " +
                    "and magic can’t put you to sleep. \n\n" +
                    "Trance: Elves don’t need to sleep. Instead, they meditate deeply, remaining " +
                    "semiconscious, for 4 hours a day. (The Common word for such meditation is " +
                    "“trance.”) While meditating, you can dream after a fashion; such dreams are " +
                    "actually mental exercises that have become reflexive through years of practice. " +
                    "After Resting in this way, you gain the same benefit that a human does from 8 " +
                    "hours of sleep.")
            intent.putExtra("languages", "Common and Elvish")
            startActivity(intent)
        }

        halflingButtonId.setOnClickListener {
            intent.putExtra("race", "Halfling")
            intent.putExtra("abilityScore", "Dex + 2")
            intent.putExtra("speed", "25 feet")
            intent.putExtra("skill", "Lucky: When you roll a 1 on the d20 for an " +
                    "Attack roll, ability check, or saving throw, you can reroll the die and must " +
                    "use the new roll.\n\n" +
                    "Brave: You have advantage on saving throws against being Frightened.\n\n" +
                    "Halfling Nimbleness: You can move through the space of any creature that is " +
                    "of a size larger than yours.")
            intent.putExtra("languages", "Common and Halfling")
            startActivity(intent)
        }

        humanButtonId.setOnClickListener {
            intent.putExtra("race", "Human")
            intent.putExtra("abilityScore", "All Stats + 1")
            intent.putExtra("speed", "30 feet")
            intent.putExtra("skill", "Possibility to chose a Variant Human, consult DM")
            intent.putExtra("languages", "Common and one extra Language of your choice")
            startActivity(intent)
        }

        dragonbornButtonId.setOnClickListener {
            intent.putExtra("race", "Dragonborn")
            intent.putExtra("abilityScore", "Str +2, Cha +1")
            intent.putExtra("speed", "30 feet")
            intent.putExtra("skill", "Draconic Ancestry: You have draconic ancestry, " +
                    "Choose one type of dragon (Black - Acid, Blue - Lightning, Brass - Fire, " +
                    "Bronze - Lightning, Copper - Acid, Gold - Fire, Green - Poison, Red - Fire, " +
                    "Silver - Cold, White - Cold), your breath weapon and damage resistence are " +
                    "determined by the dragon type.\n\n" +
                    "Breath Weapon: You can use your action to exhale destructive energy. " +
                    "Your draconic ancestry determinates the size, shape, and damage type of the " +
                    "exhalation.\n\n" +
                    "Damage Resistance: You have resistance of the damage type associated with " +
                    "your draconic ancestry")
            intent.putExtra("languages", "Common and Draconic")
            startActivity(intent)
        }

        gnomeButtonId.setOnClickListener {
            intent.putExtra("race", "Gnome")
            intent.putExtra("abilityScore", "Int + 2")
            intent.putExtra("speed", "25 feet")
            intent.putExtra("skill", "Darkvision: Accustomed to life underground, you " +
                    "have superior vision in dark and dim Conditions. You can see in dim light " +
                    "within 60 feet of you as if it were bright light, and in Darkness as if it " +
                    "were dim light. You can’t discern color in Darkness, only shades of gray.\n\n" +
                    "Gnome Cunning: You have advantage on all Intelligence, Wisdom, and Charisma " +
                    "saving throws against magic.")
            intent.putExtra("languages", "Common and Gnomish")
            startActivity(intent)
        }

        halfElfButtonId.setOnClickListener {
            intent.putExtra("race", "Half-Elf")
            intent.putExtra("abilityScore", "Cha + 2, and two other of your choice + 1")
            intent.putExtra("speed", "30 feet")
            intent.putExtra("skill", "Darkvision: Thanks to your elf blood, you have " +
                    "superior vision in dark and dim Conditions. You can see in dim light within " +
                    "60 feet of you as if it were bright light, and in Darkness as if it were dim " +
                    "light. You can’t discern color in Darkness, only shades of gray.\n\n" +
                    "Fey Ancestry: You have advantage on saving throws against being Charmed, " +
                    "and magic can’t put you to sleep.\n\n" +
                    "Skill Versatility: You gain proficiency in two skills of your choice.")
            intent.putExtra("languages", "Common, Elvish, and one extra Language " +
                    "of your choice.")
            startActivity(intent)
        }

        halfOrcButtonId.setOnClickListener {
            intent.putExtra("race", "Half-Orc")
            intent.putExtra("abilityScore", "Str + 2, Con + 1")
            intent.putExtra("speed", "30 feet")
            intent.putExtra("skill", "Darkvision: Thanks to your orc blood, you have " +
                    "superior vision in dark and dim Conditions. You can see in dim light within " +
                    "60 feet of you as if it were bright light, and in Darkness as if it were dim " +
                    "light. You can’t discern color in Darkness, only shades of gray.\n\n" +
                    "Menacing: You gain proficiency in the Intimidation skill.\n\n" +
                    "Relentless Endurance: When you are reduced to 0 hit points but not " +
                    "killed outright, you can drop to 1 hit point instead. You can’t use this " +
                    "feature again until you finish a Long Rest.\n\n" +
                    "Savage Attacks: When you score a critical hit with a melee weapon " +
                    "Attack, you can roll one of the weapon’s damage dice one additional " +
                    "time and add it to the extra damage of the critical hit.")
            intent.putExtra("languages", "Common and Orc")
            startActivity(intent)
        }

        tieflingButtonId.setOnClickListener {
            intent.putExtra("race", "Tiefling")
            intent.putExtra("abilityScore", "Int + 1, Cha +2")
            intent.putExtra("speed", "30 feet")
            intent.putExtra("skill", "Darkvision: Thanks to your infernal heritage, " +
                    "you have superior vision in dark and dim Conditions. You can see in dim light " +
                    "within 60 feet of you as if it were bright light, and in Darkness as if it " +
                    "were dim light. You can’t discern color in Darkness, only shades of gray.\n\n" +
                    "Hellish Resistance: You have Resistance to fire damage.\n\n" +
                    "Infernal Legacy. You know the Thaumaturgy cantrip. When you reach " +
                    "3rd level, you can cast the Hellish Rebuke spell as a 2nd-level spell " +
                    "once with this trait and regain the ability to do so when you finish a Long " +
                    "Rest. When you reach 5th level, you can cast the Darkness spell once with this " +
                    "trait and regain the ability to do so when you finish a Long Rest. Charisma " +
                    "is your spellcasting ability for these Spells.")
            intent.putExtra("languages", "Common and Infernal")
            startActivity(intent)
        }

    }

}
