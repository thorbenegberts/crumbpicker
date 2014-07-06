package com.crumbpicker.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.crumbpicker.client.activities.AboutActivity;
import com.crumbpicker.client.activities.AboutPlace;
import com.crumbpicker.client.activities.UIPlace;
import com.crumbpicker.client.activities.animation.AnimationPlace;
import com.crumbpicker.client.activities.animationdone.*;
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

public class TabletMainActivityMapper implements ActivityMapper {

	private final com.crumbpicker.client.ClientFactory clientFactory;

	private Place lastPlace;

	public TabletMainActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;

	}

	@Override
	public Activity getActivity(Place place) {
		Activity activity = getActivity(lastPlace, place);
		lastPlace = place;
		return activity;

	}

	private AboutActivity aboutActivity;

	private AboutActivity getAboutActivity() {
		if (aboutActivity == null) {
			aboutActivity = new AboutActivity(clientFactory);
		}

		return aboutActivity;
	}

	private Activity getActivity(Place lastPlace, Place newPlace) {
		if (newPlace instanceof HomePlace) {
			return getAboutActivity();
		}

		if (newPlace instanceof AboutPlace) {
			return getAboutActivity();
		}

		if (newPlace instanceof UIPlace) {
			return getAboutActivity();
		}

		if (newPlace instanceof ScrollWidgetPlace) {
			return new ScrollWidgetActivity(clientFactory);
		}

		if (newPlace instanceof ElementsPlace) {
			return new ElementsActivity(clientFactory);
		}

		if (newPlace instanceof FormsPlace) {
			return new FormsActivity(clientFactory);
		}

		if (newPlace instanceof ButtonBarPlace) {
			return new ButtonBarActivity(clientFactory);
		}

		if (newPlace instanceof SearchBoxPlace) {
			return new SearchBoxActivity(clientFactory);
		}

		if (newPlace instanceof TabBarPlace) {
			return new TabBarActivity(clientFactory);
		}

		if (newPlace instanceof ButtonPlace) {
			return new ButtonActivity(clientFactory);
		}

		if (newPlace instanceof PopupPlace) {
			return new PopupActivity(clientFactory);
		}

		if (newPlace instanceof ProgressBarPlace) {
			return new ProgressBarActivity(clientFactory);
		}

		if (newPlace instanceof ProgressIndicatorPlace) {
			return new ProgressIndicatorActivity(clientFactory);
		}

		if (newPlace instanceof SliderPlace) {
			return new SliderActivity(clientFactory);
		}

		if (newPlace instanceof AnimationPlace) {
			return new AboutActivity(clientFactory);
		}

		if (newPlace instanceof PullToRefreshPlace) {
			return new PullToRefreshActivity(clientFactory);
		}

		if (newPlace instanceof CarouselPlace) {
			return new CarouselActivity(clientFactory);
		}

		if (newPlace instanceof GroupedCellListPlace) {
			return new GroupedCellListActivity(clientFactory);
		}

		if (newPlace instanceof AnimationSlidePlace || newPlace instanceof AnimationSlideUpPlace || newPlace instanceof AnimationDissolvePlace || newPlace instanceof AnimationFadePlace
				|| newPlace instanceof AnimationFlipPlace || newPlace instanceof AnimationPopPlace || newPlace instanceof AnimationSwapPlace || newPlace instanceof AnimationCubePlace) {
			return new AnimationDoneActivity(clientFactory);
		}

		return null;
	}

}
