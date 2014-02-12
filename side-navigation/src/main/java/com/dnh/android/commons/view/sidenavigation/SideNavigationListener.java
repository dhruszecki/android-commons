package com.dnh.android.commons.view.sidenavigation;

/**
 * Callback interface for {@link com.dnh.android.commons.view.sidenavigation.SideNavigationView}.
 */
public interface SideNavigationListener<T> {

    /**
     * Validation clicking on side navigation item.
     *
     * @param item selected item
     */
    public void onSideNavigationItemClick(T item);

}
