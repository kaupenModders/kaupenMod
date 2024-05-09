package wiiu.mavity.kaupen_mod.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class KaupenConfig extends MidnightConfig {
    @Comment(category = "settings", centered = true) public static Comment comment_1;
    @Entry(category = "settings") public static boolean showTooltips = true;
}
