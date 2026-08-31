package phat.nobreakdelay;

import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;

public class NoBreakDelay extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    private final Setting<Double> breakDelay = sgGeneral.add(
        new DoubleSetting.Builder()
            .name("break-delay")
            .description("Break delay value for testing.")
            .defaultValue(0.35)
            .min(0.01)
            .max(10.00)
            .sliderRange(0.01, 10.00)
            .decimalPlaces(2)
            .build()
    );

    private final Setting<Boolean> onlyMining = sgGeneral.add(
        new BoolSetting.Builder()
            .name("only-while-mining")
            .description("Only active while holding the attack key.")
            .defaultValue(true)
            .build()
    );

    public NoBreakDelay() {
        super(
            Category.Player,
            "no-break-delay",
            "Configurable client-side break-delay module."
        );
    }

    public double getBreakDelay() {
        return breakDelay.get();
    }

    public boolean onlyWhileMining() {
        return onlyMining.get();
    }
}
