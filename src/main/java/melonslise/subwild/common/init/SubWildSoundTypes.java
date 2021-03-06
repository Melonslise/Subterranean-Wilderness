package melonslise.subwild.common.init;

import net.minecraft.block.SoundType;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.util.ForgeSoundType;

public final class SubWildSoundTypes
{
	public static final SoundType WATER =
			new ForgeSoundType(1f, 1f, () -> SoundEvents.ENTITY_GENERIC_SPLASH,
					() -> SoundEvents.ENTITY_GENERIC_SWIM, () -> SoundEvents.ENTITY_GENERIC_SPLASH,
					() -> SoundEvents.ENTITY_BOAT_PADDLE_WATER, () -> SoundEvents.ENTITY_GENERIC_SPLASH);
}