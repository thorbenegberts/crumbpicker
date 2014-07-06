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

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.crumbpicker.client.activities.AboutActivity;
import com.crumbpicker.client.activities.AboutPlace;
import com.crumbpicker.client.activities.ShowCaseListActivity;
import com.crumbpicker.client.activities.UIActivity;
import com.crumbpicker.client.activities.UIPlace;
import com.crumbpicker.client.activities.animation.AnimationActivity;
import com.crumbpicker.client.activities.animation.AnimationPlace;
import com.crumbpicker.client.activities.animationdone.AnimationDissolvePlace;
import com.crumbpicker.client.activities.animationdone.AnimationDoneActivity;
import com.crumbpicker.client.activities.animationdone.AnimationFadePlace;
import com.crumbpicker.client.activities.animationdone.AnimationFlipPlace;
import com.crumbpicker.client.activities.animationdone.AnimationPopPlace;
import com.crumbpicker.client.activities.animationdone.AnimationSlidePlace;
import com.crumbpicker.client.activities.animationdone.AnimationSlideUpPlace;
import com.crumbpicker.client.activities.animationdone.AnimationSwapPlace;
import com.crumbpicker.client.activities.button.ButtonActivity;
import com.crumbpicker.client.activities.button.ButtonPlace;
import com.crumbpicker.client.activities.buttonbar.ButtonBarActivity;
import com.crumbpicker.client.activities.buttonbar.ButtonBarPlace;
import com.crumbpicker.client.activities.carousel.CarouselActivity;
import com.crumbpicker.client.activities.carousel.CarouselPlace;
import com.crumbpicker.client.activities.elements.ElementsActivity;
import com.crumbpicker.client.activities.elements.ElementsPlace;
import com.crumbpicker.client.activities.forms.FormsActivity;
import com.crumbpicker.client.activities.forms.FormsPlace;
import com.crumbpicker.client.activities.gcell.GroupedCellListActivity;
import com.crumbpicker.client.activities.gcell.GroupedCellListPlace;
import com.crumbpicker.client.activities.popup.PopupActivity;
import com.crumbpicker.client.activities.popup.PopupPlace;
import com.crumbpicker.client.activities.progressbar.ProgressBarActivity;
import com.crumbpicker.client.activities.progressbar.ProgressBarPlace;
import com.crumbpicker.client.activities.progressindicator.ProgressIndicatorActivity;
import com.crumbpicker.client.activities.progressindicator.ProgressIndicatorPlace;
import com.crumbpicker.client.activities.pulltorefresh.PullToRefreshActivity;
import com.crumbpicker.client.activities.pulltorefresh.PullToRefreshPlace;
import com.crumbpicker.client.activities.scrollwidget.ScrollWidgetActivity;
import com.crumbpicker.client.activities.scrollwidget.ScrollWidgetPlace;
import com.crumbpicker.client.activities.searchbox.SearchBoxActivity;
import com.crumbpicker.client.activities.searchbox.SearchBoxPlace;
import com.crumbpicker.client.activities.slider.SliderActivity;
import com.crumbpicker.client.activities.slider.SliderPlace;
import com.crumbpicker.client.activities.tabbar.TabBarActivity;
import com.crumbpicker.client.activities.tabbar.TabBarPlace;
import com.crumbpicker.client.places.HomePlace;

/**
 * @author Daniel Kurka
 * 
 */
public class PhoneActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public PhoneActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace) {
			return new ShowCaseListActivity(clientFactory);
		}

		if (place instanceof UIPlace) {
			return new UIActivity(clientFactory);
		}

		if (place instanceof AboutPlace) {
			return new AboutActivity(clientFactory);
		}

		if (place instanceof AnimationPlace) {
			return new AnimationActivity(clientFactory);
		}

		if (place instanceof ScrollWidgetPlace) {
			return new ScrollWidgetActivity(clientFactory);
		}

		if (place instanceof ElementsPlace) {
			return new ElementsActivity(clientFactory);
		}

		if (place instanceof FormsPlace) {
			return new FormsActivity(clientFactory);
		}

		if (place instanceof ButtonBarPlace) {
			return new ButtonBarActivity(clientFactory);
		}

		if (place instanceof SearchBoxPlace) {
			return new SearchBoxActivity(clientFactory);
		}

		if (place instanceof TabBarPlace) {
			return new TabBarActivity(clientFactory);
		}

		if (place instanceof ButtonPlace) {
			return new ButtonActivity(clientFactory);
		}

		if (place instanceof PopupPlace) {
			return new PopupActivity(clientFactory);
		}

		if (place instanceof ProgressBarPlace) {
			return new ProgressBarActivity(clientFactory);
		}

		if (place instanceof ProgressIndicatorPlace) {
			return new ProgressIndicatorActivity(clientFactory);
		}

		if (place instanceof SliderPlace) {
			return new SliderActivity(clientFactory);
		}
		if (place instanceof PullToRefreshPlace) {
			return new PullToRefreshActivity(clientFactory);
		}

		if (place instanceof CarouselPlace) {
			return new CarouselActivity(clientFactory);
		}

		if (place instanceof GroupedCellListPlace) {
			return new GroupedCellListActivity(clientFactory);
		}

		if (place instanceof AnimationSlidePlace || place instanceof AnimationSlideUpPlace || place instanceof AnimationDissolvePlace || place instanceof AnimationFadePlace
				|| place instanceof AnimationFlipPlace || place instanceof AnimationPopPlace || place instanceof AnimationSwapPlace || place instanceof AnimationSwapPlace) {
			return new AnimationDoneActivity(clientFactory);
		}
		return new ShowCaseListActivity(clientFactory);
	}
}
