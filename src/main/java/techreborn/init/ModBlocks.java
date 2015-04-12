package techreborn.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import techreborn.blocks.BlockOre;
import techreborn.blocks.BlockQuantumChest;
import techreborn.blocks.BlockQuantumTank;
import techreborn.blocks.BlockThermalGenerator;
import techreborn.client.TechRebornCreativeTab;
import techreborn.itemblocks.ItemBlockOre;
import techreborn.itemblocks.ItemBlockQuantumChest;
import techreborn.itemblocks.ItemBlockQuantumTank;
import techreborn.tiles.TileQuantumChest;
import techreborn.tiles.TileQuantumTank;
import techreborn.tiles.TileThermalGenerator;
import techreborn.util.LogHelper;

public class ModBlocks {
	
	    public static Block thermalGenerator;
	    public static Block quantumTank;
	    public static Block quantumChest;
	    public static Block ore;
	    
	    public static void init()
	    {
	    	thermalGenerator = new BlockThermalGenerator().setBlockName("techreborn.thermalGenerator").setBlockTextureName("techreborn:ThermalGenerator_other").setCreativeTab(TechRebornCreativeTab.instance);
	    	GameRegistry.registerBlock(thermalGenerator, "techreborn.thermalGenerator");
	    	GameRegistry.registerTileEntity(TileThermalGenerator.class, "TileThermalGenerator");

	        quantumTank = new BlockQuantumTank().setBlockName("techreborn.quantumTank").setBlockTextureName("techreborn:quantumTank").setCreativeTab(TechRebornCreativeTab.instance);
	        GameRegistry.registerBlock(quantumTank, ItemBlockQuantumTank.class, "techreborn.quantumTank");
	        GameRegistry.registerTileEntity(TileQuantumTank.class, "TileQuantumTank");

	        quantumChest = new BlockQuantumChest().setBlockName("techreborn.quantumChest").setBlockTextureName("techreborn:quantumChest").setCreativeTab(TechRebornCreativeTab.instance);
	        GameRegistry.registerBlock(quantumChest, ItemBlockQuantumChest.class, "techreborn.quantumChest");
	        GameRegistry.registerTileEntity(TileQuantumChest.class, "TileQuantumChest");
        
	        ore = new BlockOre(Material.rock);
	        GameRegistry.registerBlock(ore, ItemBlockOre.class, "techreborn.ore");
			LogHelper.info("TechReborns Blocks Loaded");

	        registerOreDict();
	    }
	    
	    public static void registerOreDict()
	    {
	    	//TODO
	    }

}
