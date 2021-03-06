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
package com.crumbpicker.client.activities.scrollwidget;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.crumbpicker.client.ClientFactory;
import com.crumbpicker.client.DetailActivity;

/**
 * @author Daniel Kurka
 *
 */
public class ScrollWidgetActivity extends DetailActivity {

	private final ClientFactory clientFactory;

	/**
	 *
	 */
	public ScrollWidgetActivity(ClientFactory clientFactory) {
		super(clientFactory.getScrollWidgetView(), "nav");
		this.clientFactory = clientFactory;

	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		super.start(panel, eventBus);
		ScrollWidgetView view = clientFactory.getScrollWidgetView();

		view.getHeader().setText("Scroll Widget");

		panel.setWidget(view);
	}

}
