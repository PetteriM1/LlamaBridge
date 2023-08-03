package me.petterim1.llamabridge;

import cn.nukkit.plugin.PluginBase;

public class Loader extends PluginBase {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventsTranslatorLlama2EAPI(this), this);
        getServer().getPluginManager().registerEvents(new EventsTranslatorEAPI2Llama(this), this);
    }
}
