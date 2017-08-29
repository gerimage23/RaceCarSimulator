import java.util.Random;

class Car extends Vehicle {

    private static final String[] POSSIBLE_NAMES = {"Blast","Hollo","Wolf","Fang","Eagle","Blade","Adventure","Aeon","Alabaster","Albatross","Apex","Astral","Augury","Aura","Aurora","Avalanche","Baron","Barrage","Basilisk","Behemoth","Blaze","Blend","Bliss","Blitz","Blizzard","Bolt","Buffalo","Bullet","Capital","Catalyst","Celestial","Centaur","Centurion","Charm","Chase","Climax","Cobra","Conqueror","Corsair","Cosmos","Crest","Crown","Crusader","Crux","Curiosity","Dawn","Daydream","Deputy","Desire","Dominion","Dragon","Dusk","Dynamics","Dynamo","Elysium","Eminance","Empire","Empyrean","Encounter","Enigma","Eon","Eos","Epiphany","Epitome","Escape","Essence","Eternity","Ethereal","Evolution","Excursion","Expedition","Falcon","Ferocity","Fire","Flow","Flux","Formula","Fragment","Freedom","Gallop","Grit","Guardian","Guerilla","Harmony","Heirloom","Hero","Hydra","Icon","Inception","Inferno","Inquiry","Instinct","Intro","Ivory","Jazz","Legacy","Legend","Liberty","Lightning","Lioness","Magic","Majesty","Mammoth","Marvel","Mastery","Meridian","Method","Might","Millenium","Mirage","Momentum","Moonlight","Morale","Motion","Motive","Mystery","Mythic","Nebula","Nimbus","Obsidian","Olympian","Onyx","Oracle","Orbit","Origin","Paladin","Paradox","Paragon","Parallel","Passion","Patron","Phantom","Phenomenom","Pinnacle","Portrait","Presence","Prestige","Prime","Prodigy","Prophecy","Prospect","Pulse","Purity","Pyre","Quest","Quicksilver","Radiance","Ranger","Raven","Reach","Realm","Reflect","Renegade","Resolve","Revelation","Roamer","Rune","Sanctuary","Scorpion","Scout","Serpent","Shadow","Silver","Sliver","Specter","Spire","Spirit","Spotlight","Sprite","Stardust","Starlight","Storm","Striker","Supremacy","Surge","Symbol","Tarragon","Temper","Temperament","Tempest","Thriller","Thunder","Tigress","Titan","Tracer","Tradition","Trailblazer","Treasure","Triumph","Twister","Umbra","Union","Universe","Utopia","Vagabond","Vanish","Vertex","Vigor","Vindicator","Viper","Virtue","Vision","Vortex","Voyage","Vulture","Warrior","Whim","Whirlpool","Wish","Zeal"};

    private static int speedLimit = 0;

    static void setSpeedLimit(int limit) {
        speedLimit = limit;
    }

    private int normalSpeed;

    Car() {
        Random rnd = new Random();

        this.normalSpeed = rnd.nextInt(31) + 80;  // speed between 80-110
        this.name = getCarName();  // randomized name from provided list
        this.distanceTravelled = 0;
    }

    void moveForAnHour() {
        if (speedLimit == 0) {
            this.distanceTravelled += this.normalSpeed;
        }
        else {
            this.distanceTravelled += speedLimit;
        }
    }

    private String getCarName() {
        String carName;
        Random rnd = new Random();

        carName = POSSIBLE_NAMES[rnd.nextInt(POSSIBLE_NAMES.length)];

        String secondName; // So the two names can't be the same.
        do {
            secondName = POSSIBLE_NAMES[rnd.nextInt(POSSIBLE_NAMES.length)];
        } while (carName.equals(secondName));

        carName = carName + " " + secondName;

        return carName;
    }
}

