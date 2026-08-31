package phat.nobreakdelay;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class NoBreakDelayAddon extends MeteorAddon {
    @Override
    public void onInitialize() {
        Modules.get().add(new NoBreakDelay());
    }

    @Override
    public void onRegisterCategories() {
    }

    @Override
    public String getPackage() {
        return "phat.nobreakdelay";
    }
}
