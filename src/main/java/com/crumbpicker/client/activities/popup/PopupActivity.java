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
package com.crumbpicker.client.activities.popup;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.crumbpicker.client.ClientFactory;
import com.crumbpicker.client.DetailActivity;
import com.googlecode.mgwt.ui.client.widget.dialog.ConfirmDialog.ConfirmCallback;
import com.googlecode.mgwt.ui.client.widget.dialog.Dialogs.ButtonType;
import com.googlecode.mgwt.ui.client.widget.dialog.Dialogs.OptionCallback;
import com.googlecode.mgwt.ui.client.widget.dialog.Dialogs.OptionsDialogEntry;

/**
 * @author Daniel Kurka
 *
 */
public class PopupActivity extends DetailActivity {

	private final ClientFactory clientFactory;

	public PopupActivity(ClientFactory clientFactory) {
		super(clientFactory.getPopupView(), "nav");
		this.clientFactory = clientFactory;

	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		super.start(panel, eventBus);
		final PopupView view = clientFactory.getPopupView();

		view.getHeader().setText("Popups");

		addHandlerRegistration(view.getConfirmButton().addTapHandler(new TapHandler() {

			@Override
			public void onTap(TapEvent event) {
				view.confirmSomeStuff("Confirm this", "Confirm some more stuff", new ConfirmCallback() {

					@Override
					public void onOk() {

					}

					@Override
					public void onCancel() {

					}
				});

			}
		}));

		addHandlerRegistration(view.getSlideUpButton().addTapHandler(new TapHandler() {

			@Override
			public void onTap(TapEvent event) {
				List<OptionsDialogEntry> list = new ArrayList<OptionsDialogEntry>();
				list.add(new OptionsDialogEntry("Confirm", ButtonType.CONFIRM));
				list.add(new OptionsDialogEntry("Cancel", ButtonType.NORMAL));
				list.add(new OptionsDialogEntry("Delete", ButtonType.IMPORTANT));

				view.showSomeOptions(list, new OptionCallback() {

					@Override
					public void onOptionSelected(int index) {

					}
				});
			}
		}));

		addHandlerRegistration(view.getAlertButton().addTapHandler(new TapHandler() {

			@Override
			public void onTap(TapEvent event) {
				view.alertSomeStuff("Hi", "How are you doing?");
			}
		}));

		panel.setWidget(view);
	}
}
