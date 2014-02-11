package com.dnh.android.commons.view.sidenavigation;

/**
 * Item of side navigation.
 *
 * @author johnkil
 */
public class SideNavigationItem {

    public static int DEFAULT_ICON_VALUE = -1;

    private int id;
    private String text;
    private int icon = DEFAULT_ICON_VALUE;

    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

}
