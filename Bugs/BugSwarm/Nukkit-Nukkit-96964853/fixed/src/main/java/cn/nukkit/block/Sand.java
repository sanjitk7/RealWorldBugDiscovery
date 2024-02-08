package cn.nukkit.block;

import cn.nukkit.item.Tool;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class Sand extends Solid {

    public Sand() {
        this(0);
    }

    public Sand(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return SAND;
    }

    @Override
    public double getHardness() {
        return 0.5;
    }

    @Override
    public int getToolType() {
        return Tool.TYPE_SHOVEL;
    }

    @Override
    public String getName() {
        if (this.meta == 0x01) {
            return "Red Sand";
        }

        return "Sand";
    }

}
