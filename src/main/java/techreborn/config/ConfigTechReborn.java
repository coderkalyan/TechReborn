package techreborn.config;

import java.io.File;

import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.Configuration;

public class ConfigTechReborn {
	private static ConfigTechReborn instance = null;
	public static String CATEGORY_WORLD = "world";
	public static String CATEGORY_POWER = "power";
	public static String CATEGORY_CRAFTING = "crafting";
	public static String CATEGORY_UU = "uu";

	// WORLDGEN
	public static boolean GalenaOreTrue;
	public static int GalenaOreRare;

	public static boolean IridiumOreTrue;
	public static int IridiumOreRare;

	public static boolean RubyOreTrue;
	public static int RubyOreRare;

	public static boolean SapphireOreTrue;
	public static int SapphireOreRare;

	public static boolean BauxiteOreTrue;
	public static int BauxiteOreRare;

	public static boolean CopperOreTrue;
	public static int CopperOreRare;

	public static boolean TinOreTrue;
	public static int TinOreRare;

	public static boolean LeadOreTrue;
	public static int LeadOreRare;

	public static boolean SilverOreTrue;
	public static int SilverOreRare;

	public static boolean PyriteOreTrue;
	public static int PyriteOreRare;

	public static boolean CinnabarOreTrue;
	public static int CinnabarOreRare;

	public static boolean SphaleriteOreTrue;
	public static int SphaleriteOreRare;

	public static boolean TungstenOreTrue;
	public static int TungstenOreRare;

	public static boolean SheldoniteOreTrue;
	public static int SheldoniteOreRare;

	public static boolean OlivineOreTrue;
	public static int OlivineOreRare;

	public static boolean SodaliteOreTrue;
	public static int SodaliteOreRare;


	// Power
	public static int ThermalGenertaorOutput;
	public static int CentrifugeInputTick;
	// Charge
	public static int AdvancedDrillCharge;
	public static int LapotronPackCharge;
	public static int LithiumBatpackCharge;
	public static int OmniToolCharge;
	public static int RockCutterCharge;
	public static int GravityCharge;
	public static int CentrifugeCharge;
	public static int ThermalGeneratorCharge;
	// Tier
	public static int AdvancedDrillTier;
	public static int LapotronPackTier;
	public static int LithiumBatpackTier;
	public static int OmniToolTier;
	public static int RockCutterTier;
	public static int GravityTier;
	public static int CentrifugeTier;
	public static int ThermalGeneratorTier;
	// Crafting
	public static boolean ExpensiveMacerator;
	public static boolean ExpensiveDrill;
	public static boolean ExpensiveDiamondDrill;
	public static boolean ExpensiveSolar;
	
	//UU
	public static boolean HideUuRecipes;
	public static boolean UUrecipesIridiamOre;


	public static Configuration config;

	private ConfigTechReborn(File configFile)
	{
		config = new Configuration(configFile);
		config.load();

		ConfigTechReborn.Configs();

		config.save();

	}

	public static ConfigTechReborn initialize(File configFile)
	{

		if (instance == null)
			instance = new ConfigTechReborn(configFile);
		else
			throw new IllegalStateException(
					"Cannot initialize TechReborn Config twice");

		return instance;
	}

	public static ConfigTechReborn instance()
	{
		if (instance == null)
		{

			throw new IllegalStateException(
					"Instance of TechReborn Config requested before initialization");
		}
		return instance;
	}

	public static void Configs()
	{
		GalenaOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.galenaOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.galenaOre.tooltip"))
				.getBoolean(true);
		IridiumOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.iridiumOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.iridiumOre.tooltip"))
				.getBoolean(true);
		RubyOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.rubyOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.rubyOre.tooltip"))
				.getBoolean(true);
		SapphireOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.sapphireOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.sapphireOre.tooltip"))
				.getBoolean(true);
		BauxiteOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.bauxiteOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.bauxiteOre.tooltip"))
				.getBoolean(true);
		CopperOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.copperOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.copperOre.tooltip"))
				.getBoolean(true);
		TinOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.tinOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.tinOre.tooltip"))
				.getBoolean(true);
		LeadOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.leadOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.leadOre.tooltip"))
				.getBoolean(true);
		SilverOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.silverOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.silverOre.tooltip"))
				.getBoolean(true);
		PyriteOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.pyriteOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.pyriteOre.tooltip"))
				.getBoolean(true);
		CinnabarOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.cinnabarOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.cinnabarOre.tooltip"))
				.getBoolean(true);
		SphaleriteOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.sphaleriteOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.sphaleriteOre.tooltip"))
				.getBoolean(true);
		TungstenOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.tungstonOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.tungstonOre.tooltip"))
				.getBoolean(true);
		SheldoniteOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.sheldoniteOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.sheldoniteOre.tooltip"))
				.getBoolean(true);
		OlivineOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.olivineOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.olivineOre.tooltip"))
				.getBoolean(true);
		SodaliteOreTrue = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.allow.sodaliteOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.sodaliteOre.tooltip"))
				.getBoolean(true);
		GalenaOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.galenaOre.rare"),
						8,
						StatCollector
								.translateToLocal("config.techreborn.galenaOre.rare.tooltip"))
				.getInt();
		IridiumOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.iridiumOre.rare"),
						1,
						StatCollector
								.translateToLocal("config.techreborn.iridiumOre.rare.tooltip"))
				.getInt();
		
		RubyOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.rubyOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.rubyOre.rare.tooltip"))
				.getInt();
		
		SapphireOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.sapphireOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.sapphireOre.rare.tooltip"))
				.getInt();
		
		BauxiteOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.bauxiteOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.bauxiteOre.rare.tooltip"))
				.getInt();
		
		PyriteOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.pyriteOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.pyriteOre.rare.tooltip"))
				.getInt();
		
		CinnabarOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.cinnabarOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.cinnabarOre.rare.tooltip"))
				.getInt();
		
		SphaleriteOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.sphaleriteOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.sphaleriteOre.rare.tooltip"))
				.getInt();
		
		TungstenOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.tungstenOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.tungstenOre.rare.tooltip"))
				.getInt();
		
		SheldoniteOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.sheldoniteOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.sheldoniteOre.rare.tooltip"))
				.getInt();
		
		OlivineOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.olivineOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.olivineOre.rare.tooltip"))
				.getInt();
		
		SodaliteOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.sodaliteOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.sodaliteOre.rare.tooltip"))
				.getInt();
		
		CopperOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.copperOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.copperOre.rare.tooltip"))
				.getInt();
		
		TinOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.tinOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.tinOre.rare.tooltip"))
				.getInt();
		
		LeadOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.leadOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.leadOre.rare.tooltip"))
				.getInt();
		
		SilverOreRare = config
				.get(CATEGORY_WORLD,
						StatCollector
								.translateToLocal("config.techreborn.silverOre.rare"),
						6,
						StatCollector
								.translateToLocal("config.techreborn.silverOre.rare.tooltip"))
				.getInt();

		// Power
		ThermalGenertaorOutput = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.thermalGeneratorPower"),
						30,
						StatCollector
								.translateToLocal("config.techreborn.thermalGeneratorPower.tooltip"))
				.getInt();
		CentrifugeInputTick = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.centrifugePowerUsage"),
						5,
						StatCollector
								.translateToLocal("config.techreborn.centrifugePowerUsage.tooltip"))
				.getInt();

		// Charge
		AdvancedDrillCharge = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.advancedDrillMaxCharge"),
						60000,
						StatCollector
								.translateToLocal("config.techreborn.advancedDrillMaxCharge.tooltip"))
				.getInt();
		LapotronPackCharge = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.lapotronPackMaxCharge"),
						100000000,
						StatCollector
								.translateToLocal("config.techreborn.lapotronPackMaxCharge.tooltop"))
				.getInt();
		LithiumBatpackCharge = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.lithiumBatpackMaxCharge"),
						4000000,
						StatCollector
								.translateToLocal("config.techreborn.lithiumBatpackMaxCharge.tooltip"))
				.getInt();
		OmniToolCharge = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.omniToolMaxCharge"),
						20000,
						StatCollector
								.translateToLocal("config.techreborn.omniToolMaxCharge.tooltip"))
				.getInt();
		RockCutterCharge = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.rockCutterMaxCharge"),
						10000,
						StatCollector
								.translateToLocal("config.techreborn.rockCutterMaxCharge.tooltip"))
				.getInt();
		GravityCharge = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.gravityChestplateMaxCharge"),
						100000,
						StatCollector
								.translateToLocal("config.techreborn.gravityChestplateMaxCharge.tooltip"))
				.getInt();
		CentrifugeCharge = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.centrifugeMaxCharge"),
						1000000,
						StatCollector
								.translateToLocal("config.techreborn.centrifugeMaxCharge.tooltip"))
				.getInt();
		ThermalGeneratorCharge = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.thermalGeneratorMaxCharge"),
						1000000,
						StatCollector
								.translateToLocal("config.techreborn.thermalGeneratorMaxCharge.tooltip"))
				.getInt();

		// Teir
		AdvancedDrillTier = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.advancedDrillTier"),
						2,
						StatCollector
								.translateToLocal("config.techreborn.advancedDrillTier.tooltip"))
				.getInt();
		LapotronPackTier = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.lapotronPackTier"),
						2,
						StatCollector
								.translateToLocal("config.techreborn.lapotronPackTier.tooltip"))
				.getInt();
		LithiumBatpackTier = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.lithiumBatpackTier"),
						3,
						StatCollector
								.translateToLocal("config.techreborn.lithiumBatpackTier.tooltip"))
				.getInt();
		OmniToolTier = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.omniToolTier"),
						3,
						StatCollector
								.translateToLocal("config.techreborn.omniToolTier.tooltip"))
				.getInt();
		RockCutterTier = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.rockCutterTier"),
						3,
						StatCollector
								.translateToLocal("config.techreborn.rockCutterTier.tooltip"))
				.getInt();
		GravityTier = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.gravityChestplateTier"),
						3,
						StatCollector
								.translateToLocal("config.techreborn.gravityChestplateTier.tooltip"))
				.getInt();
		CentrifugeTier = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.centrifugeTier"),
						1,
						StatCollector
								.translateToLocal("config.techreborn.centrifugeTier.tooltip"))
				.getInt();
		ThermalGeneratorTier = config
				.get(CATEGORY_POWER,
						StatCollector
								.translateToLocal("config.techreborn.thermalGeneratorTier"),
						1,
						StatCollector
								.translateToLocal("config.techreborn.thermalGeneratorTier.tooltip"))
				.getInt();

		// Crafting
		ExpensiveMacerator = config
				.get(CATEGORY_CRAFTING,
						StatCollector
								.translateToLocal("config.techreborn.allowExpensiveMacerator"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allowExpensiveMacerator.tooltip"))
				.getBoolean(true);
		ExpensiveDrill = config
				.get(CATEGORY_CRAFTING,
						StatCollector
								.translateToLocal("config.techreborn.allowExpensiveDrill"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allowExpensiveDrill.tooltip"))
				.getBoolean(true);
		ExpensiveDiamondDrill = config
				.get(CATEGORY_CRAFTING,
						StatCollector
								.translateToLocal("config.techreborn.allowExpensiveDiamondDrill"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allowExpensiveDiamondDrill.tooltip"))
				.getBoolean(true);
		ExpensiveSolar = config
				.get(CATEGORY_CRAFTING,
						StatCollector
								.translateToLocal("config.techreborn.allowExpensiveSolarPanels"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allowExpensiveSolarPanels.tooltip"))
				.getBoolean(true);
		//Uu
		HideUuRecipes = config
				.get(CATEGORY_UU,
						StatCollector
								.translateToLocal("config.techreborn.allow.hiderecipes"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.hiderecipes.tooltip"))
				.getBoolean(true);
		UUrecipesIridiamOre = config
				.get(CATEGORY_UU,
						StatCollector
								.translateToLocal("config.techreborn.allow.uurecipesIridiamOre"),
						true,
						StatCollector
								.translateToLocal("config.techreborn.allow.uurecipesIridiamOre.tooltip"))
				.getBoolean(true);

		if (config.hasChanged())
			config.save();
	}

}
