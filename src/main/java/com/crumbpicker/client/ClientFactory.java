/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.crumbpicker.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.crumbpicker.client.activities.AboutView;
import com.crumbpicker.client.activities.ShowCaseListView;
import com.crumbpicker.client.activities.UIView;
import com.crumbpicker.client.activities.animation.AnimationView;
import com.crumbpicker.client.activities.animationdone.AnimationDoneView;
import com.crumbpicker.client.activities.button.ButtonView;
import com.crumbpicker.client.activities.buttonbar.ButtonBarView;
import com.crumbpicker.client.activities.carousel.CarouselView;
import com.crumbpicker.client.activities.elements.ElementsView;
import com.crumbpicker.client.activities.forms.FormsView;
import com.crumbpicker.client.activities.gcell.GroupedCellListView;
import com.crumbpicker.client.activities.popup.PopupView;
import com.crumbpicker.client.activities.progressbar.ProgressBarView;
import com.crumbpicker.client.activities.progressindicator.ProgressIndicatorView;
import com.crumbpicker.client.activities.pulltorefresh.PullToRefreshDisplay;
import com.crumbpicker.client.activities.scrollwidget.ScrollWidgetView;
import com.crumbpicker.client.activities.searchbox.SearchBoxView;
import com.crumbpicker.client.activities.slider.SliderView;
import com.crumbpicker.client.activities.tabbar.TabBarView;

/**
 * @author Daniel Kurka
 * 
 */
public interface ClientFactory {
	public ShowCaseListView getHomeView();

	public EventBus getEventBus();

	public PlaceController getPlaceController();

	/**
	 * @return
	 */
	public UIView getUIView();

	public AboutView getAboutView();

	public AnimationView getAnimationView();

	public AnimationDoneView getAnimationDoneView();

	public ScrollWidgetView getScrollWidgetView();

	public ElementsView getElementsView();

	public ButtonBarView getButtonBarView();

	public SearchBoxView getSearchBoxView();

	public TabBarView getTabBarView();

	public ButtonView getButtonView();

	/**
	 * 
	 */
	public PopupView getPopupView();

	public ProgressBarView getProgressBarView();

	public SliderView getSliderView();

	public CarouselView getCarouselHorizontalView();

	public PullToRefreshDisplay getPullToRefreshDisplay();

	public ProgressIndicatorView getProgressIndicatorView();

	public FormsView getFormsView();

	public GroupedCellListView getGroupedCellListView();

}
