/*
 * This file is part of Industrial Foregoing.
 *
 * Copyright 2018, Buuz135
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.buuz135.industrial.proxy;

import com.buuz135.industrial.api.conveyor.ConveyorUpgradeFactory;
import com.buuz135.industrial.item.*;
import com.buuz135.industrial.item.infinity.ItemInfinityDrill;
import com.buuz135.industrial.proxy.block.upgrade.*;
import com.buuz135.industrial.utils.RecipeUtils;
import com.hrznstudio.titanium.util.TitaniumMod;
import net.minecraft.item.ItemStack;


public class ItemRegistry {

    public static MeatFeederItem meatFeederItem;
    public static MobImprisonmentToolItem mobImprisonmentToolItem;
    public static IFCustomItem tinyDryRubber;
    public static IFCustomItem dryRubber;
    public static IFCustomItem plastic;
    public static FertilizerItem fertilizer;
    public static IFCustomItem pinkSlime;
    public static BookManualItem bookManualItem;
    public static IFCustomItem pinkSlimeIngot;
    public static ItemStraw strawItem;
    public static ItemConveyorUpgrade conveyorUpgradeItem;
    public static ItemArtificalDye[] dyes;
    public static ItemInfinityDrill itemInfinityDrill;

    public static ConveyorUpgradeFactory upgrade_extraction = new ConveyorExtractionUpgrade.Factory();
    public static ConveyorUpgradeFactory upgrade_insertion = new ConveyorInsertionUpgrade.Factory();
    public static ConveyorUpgradeFactory upgrade_detector = new ConveyorDetectorUpgrade.Factory();
    public static ConveyorUpgradeFactory upgrade_bouncing = new ConveyorBouncingUpgrade.Factory();
    public static ConveyorUpgradeFactory upgrade_dropping = new ConveyorDroppingUpgrade.Factory();
    public static ConveyorUpgradeFactory upgrade_blinking = new ConveyorBlinkingUpgrade.Factory();
    public static ConveyorUpgradeFactory upgrade_splitting = new ConveyorSplittingUpgrade.Factory();

    public static void registerItems(TitaniumMod mod) {
        mod.addItem(tinyDryRubber = new IFCustomItem("tinydryrubber"));
        mod.addItem(dryRubber = new IFCustomItem("dryrubber"));
        RecipeUtils.addShapelessRecipe(new ItemStack(dryRubber), new ItemStack(tinyDryRubber), new ItemStack(tinyDryRubber), new ItemStack(tinyDryRubber), new ItemStack(tinyDryRubber), new ItemStack(tinyDryRubber), new ItemStack(tinyDryRubber), new ItemStack(tinyDryRubber), new ItemStack(tinyDryRubber), new ItemStack(tinyDryRubber));
        mod.addItem(plastic = new IFCustomItem("plastic"));
//        GameRegistry.addSmelting(dryRubber, new ItemStack(plastic), 0);
        mod.addItem(fertilizer = new FertilizerItem());
        mod.addItem(meatFeederItem = new MeatFeederItem());
        mod.addItem(mobImprisonmentToolItem = new MobImprisonmentToolItem());
        mod.addItem(strawItem = new ItemStraw());
        //mod.addItem(conveyorUpgradeItem = new ItemConveyorUpgrade());
        mod.addItem(pinkSlime = new IFCustomItem("pink_slime"));
        mod.addItem(bookManualItem = new BookManualItem());
        mod.addItem(pinkSlimeIngot = new IFCustomItem("pink_slime_ingot"));
        mod.addItem(itemInfinityDrill = new ItemInfinityDrill());
        ConveyorUpgradeFactory.FACTORIES.forEach(conveyorUpgradeFactory -> mod.addItem(new ItemConveyorUpgrade(conveyorUpgradeFactory)));
//        mod.addItem(adultFilterAddomItem = new AdultFilterAddonItem());
//        mod.addItem(rangeAddonItem = new RangeAddonItem());
//        mod.addItem(energyFieldAddon = new EnergyFieldAddon());
//        mod.addItem(leafShearingAddonItem = new LeafShearingAddonItem());
//        mod.addItem(itemStackTransferAddonPull = new ItemStackTransferAddon(TransferAddon.ActionMode.PULL));
//        mod.addItem(itemStackTransferAddonPush = new ItemStackTransferAddon(TransferAddon.ActionMode.PUSH));
//        mod.addItem(fluidTransferAddonPull = new FluidTransferAddon(TransferAddon.ActionMode.PULL));
//        mod.addItem(fluidTransferAddonPush = new FluidTransferAddon(TransferAddon.ActionMode.PUSH));
//        mod.addItem(fortuneAddonItem = new FortuneAddonItem());

//        OreDictionary.registerOre("itemRubber", plastic);
//        OreDictionary.registerOre("slimeball", pinkSlime);
//        OreDictionary.registerOre("slimeballPink", pinkSlime);
//        OreDictionary.registerOre("dyeBrown", fertilizer);
//        OreDictionary.registerOre("fertilizer", fertilizer);

//        if (BlockRegistry.dyeMixerBlock.isEnabled()) {
//            for (EnumDyeColor dyeColor : EnumDyeColor.values()) {
//                Item dye = new ItemArtificalDye(dyeColor);
//                mod.addItem(dye);
//                ArrayUtils.add(dyes, dye);
//            }
//
//            String[] dyes = {"White", "Orange", "Magenta", "LightBlue", "Yellow", "Lime", "Pink", "Gray", "LightGray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};
//            for (int i = 0; i < 16; i++) {
////                OreDictionary.registerOre("dye" + dyes[i], new ItemStack(artificalDye, 1, i));
//            }
//        }
    }

    public static void createRecipes() {
        meatFeederItem.createRecipe();
        mobImprisonmentToolItem.createRecipe();
        bookManualItem.createRecipe();
        itemInfinityDrill.createRecipe();
//        RecipeUtils.addShapedRecipe(new ItemStack(conveyorUpgradeItem, 1, 0), "ipi", "idi", "ici",
//                'i', "ingotIron",
//                'p', plastic,
//                'd', Blocks.DISPENSER,
//                'c', new ItemStack(BlockRegistry.blockConveyor, 1, OreDictionary.WILDCARD_VALUE));
//        RecipeUtils.addShapedRecipe(new ItemStack(conveyorUpgradeItem, 1, 1), "ipi", "idi", "ici",
//                'i', "ingotIron",
//                'p', plastic,
//                'd', Blocks.HOPPER,
//                'c', new ItemStack(BlockRegistry.blockConveyor, 1, OreDictionary.WILDCARD_VALUE));
//        RecipeUtils.addShapedRecipe(new ItemStack(conveyorUpgradeItem, 1, 2), "ipi", "idi", "ici",
//                'i', "ingotIron",
//                'p', Blocks.STONE_PRESSURE_PLATE,
//                'd', Items.COMPARATOR,
//                'c', new ItemStack(BlockRegistry.blockConveyor, 1, OreDictionary.WILDCARD_VALUE));
//        RecipeUtils.addShapedRecipe(new ItemStack(conveyorUpgradeItem, 1, 3), "ipi", "idi", "ici",
//                'i', "ingotIron",
//                'p', Blocks.SLIME_BLOCK,
//                'd', Blocks.PISTON,
//                'c', new ItemStack(BlockRegistry.blockConveyor, 1, OreDictionary.WILDCARD_VALUE));
//        RecipeUtils.addShapedRecipe(new ItemStack(conveyorUpgradeItem, 1, 4), "ipi", "idi", "ici",
//                'i', "ingotIron",
//                'p', Blocks.IRON_BARS,
//                'd', Blocks.DROPPER,
//                'c', new ItemStack(BlockRegistry.blockConveyor, 1, OreDictionary.WILDCARD_VALUE));
//        RecipeUtils.addShapedRecipe(new ItemStack(conveyorUpgradeItem, 1, 5), "ipi", "idi", "ici",
//                'i', "ingotIron",
//                'p', Items.CHORUS_FRUIT,
//                'd', Blocks.PISTON,
//                'c', new ItemStack(BlockRegistry.blockConveyor, 1, OreDictionary.WILDCARD_VALUE));
//        RecipeUtils.addShapedRecipe(new ItemStack(conveyorUpgradeItem, 1, 6), "ici", "idi", "ici",
//                'i', "ingotIron",
//                'd', Blocks.HOPPER,
//                'c', new ItemStack(BlockRegistry.blockConveyor, 1, OreDictionary.WILDCARD_VALUE));
    }
}