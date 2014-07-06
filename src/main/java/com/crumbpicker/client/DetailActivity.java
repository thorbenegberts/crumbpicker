package com.crumbpicker.client;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.crumbpicker.client.event.ActionEvent;
import com.crumbpicker.client.event.ActionNames;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

public class DetailActivity extends MGWTAbstractActivity {

  private final com.crumbpicker.client.DetailView detailView;

  public DetailActivity(com.crumbpicker.client.DetailView detailView, String eventId) {
    this.detailView = detailView;
  }

  @Override
  public void start(AcceptsOneWidget panel, final EventBus eventBus) {

    addHandlerRegistration(detailView.getBackbutton().addTapHandler(new TapHandler() {

      @Override
      public void onTap(TapEvent event) {
        ActionEvent.fire(eventBus, ActionNames.BACK);
      }
    }));

  }

}
