package com.negodya1.vintageimprovements.infrastructure.ponder;

import com.negodya1.vintageimprovements.VintageBlocks;
import com.negodya1.vintageimprovements.VintageImprovements;
import com.negodya1.vintageimprovements.VintageItems;
import com.negodya1.vintageimprovements.infrastructure.ponder.scenes.*;
import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import com.simibubi.create.foundation.ponder.PonderRegistry;
import com.simibubi.create.infrastructure.ponder.AllPonderTags;

public class VintagePonder {
    static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(VintageImprovements.MODID);

    public static void register() {
        HELPER.forComponents(VintageBlocks.BELT_GRINDER)
                .addStoryBoard("belt_grinder/processing", BeltGrinderScenes::processing, AllPonderTags.KINETIC_APPLIANCES);

        HELPER.forComponents(VintageBlocks.SPRING_COILING_MACHINE)
                .addStoryBoard("spring_coiling_machine/processing", SpringCoilingScenes::processing, AllPonderTags.KINETIC_APPLIANCES);

        HELPER.forComponents(VintageBlocks.VACUUM_CHAMBER)
                .addStoryBoard("vacuum_chamber/processing", VacuumChamberScenes::processing, AllPonderTags.KINETIC_APPLIANCES);
        HELPER.forComponents(VintageBlocks.VACUUM_CHAMBER)
                .addStoryBoard("vacuum_chamber/secondary", VacuumChamberScenes::secondary, AllPonderTags.KINETIC_APPLIANCES);

        HELPER.forComponents(VintageBlocks.VIBRATING_TABLE)
                .addStoryBoard("vibrating_table/processing", VibratingTableScenes::processing, AllPonderTags.KINETIC_APPLIANCES);

        HELPER.forComponents(VintageBlocks.CENTRIFUGE)
                .addStoryBoard("centrifuge/processing", CentrifugeScenes::processing, AllPonderTags.KINETIC_APPLIANCES);
        HELPER.forComponents(VintageBlocks.CENTRIFUGE)
                .addStoryBoard("centrifuge/redstone", CentrifugeScenes::redstone, AllPonderTags.KINETIC_APPLIANCES);

        HELPER.forComponents(VintageBlocks.CURVING_PRESS)
                .addStoryBoard("curving_press/processing", CurvingPressScenes::processing, AllPonderTags.KINETIC_APPLIANCES);
        HELPER.forComponents(VintageBlocks.CURVING_PRESS)
                .addStoryBoard("curving_press/redstone", CurvingPressScenes::redstone, AllPonderTags.KINETIC_APPLIANCES);

        HELPER.addStoryBoard(VintageItems.REDSTONE_MODULE, "centrifuge/redstone", CentrifugeScenes::redstone, AllPonderTags.REDSTONE);
        HELPER.addStoryBoard(VintageItems.REDSTONE_MODULE, "curving_press/redstone", CurvingPressScenes::redstone, AllPonderTags.REDSTONE);

        HELPER.forComponents(VintageBlocks.HELVE)
                .addStoryBoard("helve_hammer/processing", HelveScenes::processing, AllPonderTags.KINETIC_APPLIANCES);
        HELPER.forComponents(VintageBlocks.HELVE)
                .addStoryBoard("helve_hammer/slots_blocking", HelveScenes::slots_blocking, AllPonderTags.KINETIC_APPLIANCES);

        HELPER.addStoryBoard(VintageItems.HELVE_HAMMER_SLOT_COVER, "helve_hammer/slots_blocking", HelveScenes::slots_blocking);

        HELPER.addStoryBoard(VintageItems.CONVEX_CURVING_HEAD, "curving_press/processing", CurvingPressScenes::processing);
        HELPER.addStoryBoard(VintageItems.CONCAVE_CURVING_HEAD, "curving_press/processing", CurvingPressScenes::processing);
        HELPER.addStoryBoard(VintageItems.W_SHAPED_CURVING_HEAD, "curving_press/processing", CurvingPressScenes::processing);
        HELPER.addStoryBoard(VintageItems.V_SHAPED_CURVING_HEAD, "curving_press/processing", CurvingPressScenes::processing);

        HELPER.forComponents(VintageBlocks.LATHE_ROTATING)
                .addStoryBoard("lathe/processing", LatheScenes::processing, AllPonderTags.KINETIC_APPLIANCES);
        HELPER.forComponents(VintageBlocks.LATHE_ROTATING)
                .addStoryBoard("lathe/automation", LatheScenes::automation, AllPonderTags.KINETIC_APPLIANCES);

        HELPER.addStoryBoard(VintageItems.RECIPE_CARD, "lathe/automation", LatheScenes::automation);

        HELPER.forComponents(VintageBlocks.LASER)
                .addStoryBoard("laser/processing", LaserScenes::processing, AllPonderTags.KINETIC_APPLIANCES);

        PonderRegistry.TAGS.forTag(AllPonderTags.KINETIC_APPLIANCES)
                .add(VintageBlocks.BELT_GRINDER)
                .add(VintageBlocks.SPRING_COILING_MACHINE)
                .add(VintageBlocks.VACUUM_CHAMBER)
                .add(VintageBlocks.VIBRATING_TABLE)
                .add(VintageBlocks.CENTRIFUGE)
                .add(VintageBlocks.CURVING_PRESS)
                .add(VintageBlocks.HELVE)
                .add(VintageBlocks.LATHE_ROTATING)
                .add(VintageBlocks.LASER);

        PonderRegistry.TAGS.forTag(AllPonderTags.REDSTONE)
                .add(VintageItems.REDSTONE_MODULE);
    }
}