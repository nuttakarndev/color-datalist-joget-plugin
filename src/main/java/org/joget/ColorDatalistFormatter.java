package org.joget;

import com.sun.mail.util.PropUtil;
import org.joget.apps.app.service.AppPluginUtil;
import org.joget.apps.app.service.AppUtil;
import org.joget.apps.datalist.model.DataList;
import org.joget.apps.datalist.model.DataListColumn;
import org.joget.apps.datalist.model.DataListColumnFormatDefault;
import org.joget.plugin.property.service.PropertyUtil;

public class ColorDatalistFormatter extends DataListColumnFormatDefault {
    private final static String MESSAGE_PATH = "messages/form/ColorDatalistFormatter";

    @Override
    public String format(DataList dataList, DataListColumn dataListColumn, Object row, Object value) {
        String result = (String) value;
        return "<div style='display:flex;justify-content:center;align-items:center;background:" + result + ";height:5rem;color:" + getPropertyString("fontColor") + "'>" + (getPropertyString("showLabel").equals("True") ? result : "") + "</div>";
    }

    @Override
    public String getName() {
        return "Color DataList Formatter";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getDescription() {
        return AppPluginUtil.getMessage("org.joget.ColorDatalistFormatter.pluginDesc", getClassName(), MESSAGE_PATH);
    }

    @Override
    public String getLabel() {
        return AppPluginUtil.getMessage("org.joget.ColorDatalistFormatter.pluginLabel", getClassName(), MESSAGE_PATH);
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }

    @Override
    public String getPropertyOptions() {
        return AppUtil.readPluginResource(getClassName(), "/properties/form/ColorDatalistFormatter.json", null, true, MESSAGE_PATH);
    }
}
