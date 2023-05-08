package net.swutm.symbolsofukraine.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.symbolsofukraine.symbolsofukraine;

public class ModPaintings {
    public static final PaintingVariant BANDYRA = registerPainting("bandyra", new PaintingVariant(64, 64));
    public static final PaintingVariant FLAG_UKRAINE = registerPainting("flag_ukraine", new PaintingVariant(64, 64));
    public static final PaintingVariant GERB_UKRAINE = registerPainting("gerb_ukraine", new PaintingVariant(64, 64));
    public static final PaintingVariant GORILKA = registerPainting("gorilka", new PaintingVariant(64, 64));
    public static final PaintingVariant KALINA = registerPainting("kalina", new PaintingVariant(64, 64));
    public static final PaintingVariant LELEKA_21 = registerPainting("leleka_21", new PaintingVariant(64, 64));
    public static final PaintingVariant MAK = registerPainting("mak", new PaintingVariant(64, 64));
    public static final PaintingVariant PISANKA = registerPainting("pisanka", new PaintingVariant(64, 64));
    public static final PaintingVariant PSHENICHA = registerPainting("pshenicha", new PaintingVariant(64, 64));
    public static final PaintingVariant SEVCHENKA = registerPainting("sevchenka", new PaintingVariant(64, 64));
    public static final PaintingVariant SV_IGOR_21 = registerPainting("sv_igor_21", new PaintingVariant(64, 64));
    public static final PaintingVariant VERBA = registerPainting("verba", new PaintingVariant(64, 64));
    public static final PaintingVariant VISIVANKA = registerPainting("visivanka", new PaintingVariant(64, 64));



    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(symbolsofukraine.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        symbolsofukraine.LOGGER.debug("Registering Paintings for " + symbolsofukraine.MOD_ID);
    }
}
