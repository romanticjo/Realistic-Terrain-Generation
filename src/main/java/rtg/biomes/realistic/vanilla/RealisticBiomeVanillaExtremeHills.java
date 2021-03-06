package rtg.biomes.realistic.vanilla;

import rtg.api.RTGBiomes;
import rtg.biomes.realistic.RealisticBiomeBase;
import rtg.coast.vanilla.CoastVanillaExtremeHills;
import rtg.surface.vanilla.SurfaceVanillaExtremeHills;
import rtg.terrain.vanilla.TerrainVanillaExtremeHills;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeVanillaExtremeHills extends RealisticBiomeVanilla
{	
	public static Block topBlock = BiomeGenBase.extremeHills.topBlock;
	public static Block fillerBlock = BiomeGenBase.extremeHills.fillerBlock;
	
	public RealisticBiomeVanillaExtremeHills()
	{
		super(
			BiomeGenBase.extremeHills,
			RTGBiomes.baseRiverCold,
			new CoastVanillaExtremeHills(),
			new TerrainVanillaExtremeHills(0f, 140f, 68f, 150f),
			new SurfaceVanillaExtremeHills(topBlock, fillerBlock, false, null, 1f, 1.5f, 85f, 20f, 4f)
		);
	}	
}
