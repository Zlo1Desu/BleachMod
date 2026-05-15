package com.zlo1desu.bleachmod.client.renderer;

import com.zlo1desu.bleachmod.item.AsauchiItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AsauchiRenderer extends GeoItemRenderer<AsauchiItem> {
    public AsauchiRenderer() {
        super(new AsauchiModel());
    }
}