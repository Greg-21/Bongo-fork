package io.github.noeppi_noeppi.mods.bongo.task;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class TaskTypeEmpty implements TaskType<TaskTypeEmpty, Void> {

    public static final TaskTypeEmpty INSTANCE = new TaskTypeEmpty();

    private TaskTypeEmpty() {

    }

    @Override
    public Class<TaskTypeEmpty> getTaskClass() {
        return TaskTypeEmpty.class;
    }

    @Override
    public Class<Void> getCompareClass() {
        return Void.class;
    }

    @Override
    public String getId() {
        return "bongo.empty";
    }

    @Override
    public String getTranslatedName() {
        return "Empty";
    }

    @Override
    public String getTranslationKey() {
        return "Empty";
    }

    @Override
    public void renderSlot(Minecraft mc, MatrixStack matrixStack, IRenderTypeBuffer buffer) {

    }

    @Override
    public void renderSlotContent(Minecraft mc, TaskTypeEmpty content, MatrixStack matrixStack, IRenderTypeBuffer buffer, boolean bigBongo) {

    }

    @Override
    public String getTranslatedContentName(TaskTypeEmpty content) {
        return "";
    }

    @Override
    public ITextComponent getContentName(TaskTypeEmpty content, MinecraftServer server) {
        return new StringTextComponent("");
    }

    @Override
    public boolean shouldComplete(TaskTypeEmpty element, PlayerEntity player, Void compare) {
        return false;
    }

    @Override
    public CompoundNBT serializeNBT(TaskTypeEmpty element) {
        return new CompoundNBT();
    }

    @Override
    public TaskTypeEmpty deserializeNBT(CompoundNBT nbt) {
        return this;
    }

    @Override
    public Stream<TaskTypeEmpty> getAllElements(MinecraftServer server, @Nullable ServerPlayerEntity player) {
        return Stream.empty();
    }
}
