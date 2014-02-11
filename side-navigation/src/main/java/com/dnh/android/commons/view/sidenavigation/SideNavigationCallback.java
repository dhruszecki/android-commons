package com.dnh.android.commons.view.sidenavigation;

/**
 * Callback interface for {@link SideNavigationView}.
 */
public interface SideNavigationCallback {

    /**
     * Validation clicking on side navigation item.
     *
     * @param itemId id of selected item
     */
    public void onSideNavigationItemClick(int itemId);

}
