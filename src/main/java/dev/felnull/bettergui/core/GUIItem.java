package dev.felnull.bettergui.core;

import net.kyori.adventure.text.Component;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class GUIItem {
    public InventoryGUI gui;
    public ItemStack itemStack;

    public GUIItem(InventoryGUI gui, ItemStack itemStack){
        this.gui = gui;
        this.itemStack = itemStack;
    }

    public void onClick(InventoryClickEvent e){}
    public void onRightClick(InventoryClickEvent e){}
    public void onLeftClick(InventoryClickEvent e){}
    public void onMiddleClick(InventoryClickEvent e){}
    public void onDoubleClick(InventoryClickEvent e){}
    public void onShiftClick(InventoryClickEvent e){}
    public void onShiftRightClick(InventoryClickEvent e){}
    public void onShiftLeftClick(InventoryClickEvent e){}
    public void onDropClick(InventoryClickEvent e){}
    public void onControlDropClick(InventoryClickEvent e){}
    public void onOffhandClick(InventoryClickEvent e){}
    public void onNumberClick(InventoryClickEvent e){}
    public void onCreativeClick(InventoryClickEvent e){}


    public void setDisplayName(String name){
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(name);
        itemStack.setItemMeta(meta);
    }
    public void setLore(List<Component> lore){
        ItemMeta meta = itemStack.getItemMeta();
        meta.lore(lore);
        itemStack.setItemMeta(meta);
    }

    public void setCMD(int customModelData) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.setCustomModelData(customModelData);
        itemStack.setItemMeta(meta);
    }
}
