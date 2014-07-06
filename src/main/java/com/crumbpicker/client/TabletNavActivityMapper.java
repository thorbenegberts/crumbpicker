package com.crumbpicker.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.crumbpicker.client.activities.AboutPlace;
import com.crumbpicker.client.activities.ShowCaseListActivity;
import com.crumbpicker.client.activities.UIActivity;
import com.crumbpicker.client.activities.UIPlace;
import com.crumbpicker.client.activities.animation.AnimationActivity;
import com.crumbpicker.client.activities.animation.AnimationPlace;
import com.crumbpicker.client.activities.animationdone.AnimationCubePlace;
import com.crumbpicker.client.activities.animationdone.AnimationDissolvePlace;
import com.crumbpicker.client.activities.animationdone.AnimationFadePlace;
import com.crumbpicker.client.activities.animationdone.AnimationFlipPlace;
import com.crumbpicker.client.activities.animationdone.AnimationPopPlace;
import com.crumbpicker.client.activities.animationdone.AnimationSlidePlace;
import com.crumbpicker.client.activities.animationdone.AnimationSlideUpPlace;
import com.crumbpicker.client.activities.animationdone.AnimationSwapPlace;
import com.crumbpicker.client.activities.button.ButtonPlace;
import com.crumbpicker.client.activities.buttonbar.ButtonBarPlace;
import com.crumbpicker.client.activities.carousel.CarouselPlace;
import com.crumbpicker.client.activities.elements.ElementsPlace;
import com.crumbpicker.client.activities.forms.FormsPlace;
import com.crumbpicker.client.activities.gcell.GroupedCellListPlace;
import com.crumbpicker.client.activities.popup.PopupPlace;
import com.crumbpicker.client.activities.progressbar.ProgressBarPlace;
import com.crumbpicker.client.activities.progressindicator.ProgressIndicatorPlace;
import com.crumbpicker.client.activities.pulltorefresh.PullToRefreshPlace;
import com.crumbpicker.client.activities.scrollwidget.ScrollWidgetPlace;
import com.crumbpicker.client.activities.searchbox.SearchBoxPlace;
import com.crumbpicker.client.activities.slider.SliderPlace;
import com.crumbpicker.client.activities.tabbar.TabBarPlace;
import com.crumbpicker.client.places.HomePlace;

public class TabletNavActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public TabletNavActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	private UIActivity uiActivity;
	private ShowCaseListActivity showCaseListActivity;
	private AnimationActivity animationActivity;

	private Activity getUIActivity() {
		if (uiActivity == null) {
			uiActivity = new UIActivity(clientFactory);
		}
		return uiActivity;
	}

	private Activity getShowCaseListActivity() {
		if (showCaseListActivity == null) {
			showCaseListActivity = new ShowCaseListActivity(clientFactory);
		}
		return showCaseListActivity;
	}

	private Activity getAnimationActicity() {
		if (animationActivity == null) {
			animationActivity = new AnimationActivity(clientFactory);
		}
		return animationActivity;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace || place instanceof AboutPlace) {
			return getShowCaseListActivity();
		}

		if (place instanceof PullToRefreshPlace || place instanceof GroupedCellListPlace || place instanceof CarouselPlace || place instanceof UIPlace || place instanceof ScrollWidgetPlace
				|| place instanceof ElementsPlace || place instanceof FormsPlace || place instanceof ButtonBarPlace || place instanceof SearchBoxPlace || place instanceof TabBarPlace
				|| place instanceof ButtonPlace || place instanceof PopupPlace || place instanceof ProgressBarPlace || place instanceof SliderPlace || place instanceof ProgressIndicatorPlace) {
			return getUIActivity();
		}

		if (place instanceof AnimationPlace) {
			return getAnimationActicity();
		}

		if (place instanceof AnimationSlidePlace || place instanceof AnimationSlideUpPlace || place instanceof AnimationDissolvePlace || place instanceof AnimationFadePlace
				|| place instanceof AnimationFlipPlace || place instanceof AnimationPopPlace || place instanceof AnimationSwapPlace || place instanceof AnimationCubePlace) {
			return getAnimationActicity();
		}
		return new ShowCaseListActivity(clientFactory);
	}
}
