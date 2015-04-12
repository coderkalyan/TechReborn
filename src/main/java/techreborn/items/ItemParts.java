package techreborn.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import techreborn.client.TechRebornCreativeTab;

import java.util.List;

public class ItemParts extends Item{
	public static final String[] types = new String[] 
	{
		"LazuriteChunk", "SiliconPlate", "MagnaliumPlate", "EnergeyFlowCircuit", "DataControlCircuit", "SuperConductor",
		"DataStorageCircuit", "ComputerMonitor", "DiamondSawBlade","DiamondGrinder", "KanthalHeatingCoil", 
		"NichromeHeatingCoil", "CupronickelHeatingCoil", "MachineParts", "WolframiamGrinder", 
		"AluminiumMachineHull", "BronzeMachineHull","SteelMachineHull","TitaniumMachineHull" 
	};

			private IIcon[] textures;
	public ItemParts()
	{
		setCreativeTab(TechRebornCreativeTab.instance);
		setHasSubtypes(true);
		setUnlocalizedName("techreborn.part");
	}
	
	@Override
	// Registers Textures For All Dusts
	public void registerIcons(IIconRegister iconRegister)
	{
		textures = new IIcon[types.length];

		for (int i = 0; i < types.length; ++i) 
		{
			textures[i] = iconRegister.registerIcon("techreborn:" + "part"+types[i]);
		}
	}
	
	@Override
	// Adds Texture what match's meta data
	public IIcon getIconFromDamage(int meta)
	{
		if (meta < 0 || meta >= textures.length) 
		{
			meta = 0;
		}

		return textures[meta];
	}

	@Override
	// gets Unlocalized Name depending on meta data
	public String getUnlocalizedName(ItemStack itemStack)
	{
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= types.length) 
		{
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + types[meta];
	}

	// Adds Dusts SubItems To Creative Tab
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
	{
		for (int meta = 0; meta < types.length; ++meta) 
		{
			list.add(new ItemStack(item, 1, meta));
		}
	}
	
	@Override
	public EnumRarity getRarity(ItemStack itemstack) 
	{
		return EnumRarity.rare;
	}

}
