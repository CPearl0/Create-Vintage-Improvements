package com.negodya1.vintageimprovements.compat.jei.category;

import com.negodya1.vintageimprovements.VintageImprovements;
import com.negodya1.vintageimprovements.compat.jei.category.animations.AnimatedHelve;
import com.negodya1.vintageimprovements.compat.jei.category.animations.AnimatedVibratingTable;
import com.negodya1.vintageimprovements.content.kinetics.helve_hammer.AutoSmithingRecipe;
import com.negodya1.vintageimprovements.content.kinetics.vibration.LeavesVibratingRecipe;
import com.simibubi.create.compat.jei.category.CreateRecipeCategory;
import com.simibubi.create.foundation.gui.AllGuiTextures;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ParametersAreNonnullByDefault
public class AutoSmithingCategory extends CreateRecipeCategory<AutoSmithingRecipe> {

	private final AnimatedHelve helve = new AnimatedHelve();

	public AutoSmithingCategory(Info<AutoSmithingRecipe> info) {
		super(info);
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, AutoSmithingRecipe recipe, IFocusGroup focuses) {
		List<Ingredient> inputs = recipe.getIngredients();
		int i = 0;
		for (Ingredient ingredient : inputs) {
			int xOffset = i * 19;
			builder
					.addSlot(RecipeIngredientRole.INPUT, 4 + xOffset, 36)
					.setBackground(getRenderedSlot(), -1, -1)
					.addIngredients(ingredient);
			i++;
		}
	}

	@Override
	public void draw(AutoSmithingRecipe recipe, IRecipeSlotsView iRecipeSlotsView, GuiGraphics graphics, double mouseX, double mouseY) {
		AllGuiTextures.JEI_ARROW.render(graphics, 12, 55);

		helve.draw(graphics, 68, 6, 0);

		graphics.drawString(Minecraft.getInstance().font,  Component.translatable(VintageImprovements.MODID + ".jei.text.auto_smithing.text1"), 96, 3, 0xFAFAFA);
		graphics.drawString(Minecraft.getInstance().font,  Component.translatable(VintageImprovements.MODID + ".jei.text.auto_smithing.text2"), 96, 14, 0xFAFAFA);
		graphics.drawString(Minecraft.getInstance().font,  Component.translatable(VintageImprovements.MODID + ".jei.text.auto_smithing.text3"), 96, 25, 0xFAFAFA);
		graphics.drawString(Minecraft.getInstance().font,  Component.translatable(VintageImprovements.MODID + ".jei.text.auto_smithing.text4"), 96, 36, 0xFAFAFA);
		graphics.drawString(Minecraft.getInstance().font,  Component.translatable(VintageImprovements.MODID + ".jei.text.auto_smithing.text5"), 96, 47, 0xFAFAFA);
		graphics.drawString(Minecraft.getInstance().font,  Component.translatable(VintageImprovements.MODID + ".jei.text.auto_smithing.text6"), 96, 58, 0xFAFAFA);
	}

}
