/*
 * xw * Copyright 2010 Daniel Kurka
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.crumbpicker.client.activities.elements;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

import com.crumbpicker.client.DetailViewGwtImpl;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.input.MDateBox;
import com.googlecode.mgwt.ui.client.widget.input.MEmailTextBox;
import com.googlecode.mgwt.ui.client.widget.input.MNumberTextBox;
import com.googlecode.mgwt.ui.client.widget.input.MPasswordTextBox;
import com.googlecode.mgwt.ui.client.widget.input.MPhoneNumberTextBox;
import com.googlecode.mgwt.ui.client.widget.input.MTextArea;
import com.googlecode.mgwt.ui.client.widget.input.MTextBox;
import com.googlecode.mgwt.ui.client.widget.input.MUrlTextBox;
import com.googlecode.mgwt.ui.client.widget.input.checkbox.MCheckBox;
import com.googlecode.mgwt.ui.client.widget.input.listbox.MListBox;
import com.googlecode.mgwt.ui.client.widget.input.radio.MRadioButton;
import com.googlecode.mgwt.ui.client.widget.list.widgetlist.WidgetList;

/**
 * @author Daniel Kurka
 *
 */
public class ElementsViewImpl extends DetailViewGwtImpl implements ElementsView {

  public ElementsViewImpl() {

    scrollPanel.setScrollingEnabledX(false);
    FlowPanel container = new FlowPanel();

    WidgetList widgetList = new WidgetList();
    widgetList.setHeader(new Label("Simple input"));
    container.add(widgetList);

    scrollPanel.setWidget(container);

    scrollPanel.setUsePos(MGWT.getOsDetection().isAndroid2x());

    MTextBox mTextBox = new MTextBox();
    mTextBox.setPlaceHolder("textbox");
    widgetList.add(mTextBox);

    MPasswordTextBox mPasswordTextBox = new MPasswordTextBox();
    mPasswordTextBox.setPlaceHolder("password box");
    widgetList.add(mPasswordTextBox);

    MNumberTextBox numberBox = new MNumberTextBox();
    numberBox.setPlaceHolder("number keyboard");
    widgetList.add(numberBox);

    MDateBox dateBox = new MDateBox();
    dateBox.setPlaceHolder("mm/dd//yyyy");
    widgetList.add(dateBox);
//    dateBox.setValue(new Date());

    WidgetList widgetList1 = new WidgetList();
    widgetList1.setHeader(new Label("More input"));

    MPhoneNumberTextBox phoneBox = new MPhoneNumberTextBox();
    phoneBox.setPlaceHolder("phonebox");
    widgetList1.add(phoneBox);

    MUrlTextBox urlBox = new MUrlTextBox();
    urlBox.setPlaceHolder("url keyboard");
    widgetList1.add(urlBox);

    MEmailTextBox emailBox = new MEmailTextBox();
    emailBox.setPlaceHolder("email keyboard");
    widgetList1.add(emailBox);

    MTextArea mTextArea = new MTextArea();
    mTextArea.setPlaceHolder("text area");
    widgetList1.add(mTextArea);

    container.add(widgetList1);

    WidgetList widgetList2 = new WidgetList();
    widgetList2.setHeader(new Label("Select inputs"));

    MListBox mListBox = new MListBox();
    mListBox.addItem("iPhone");
    mListBox.addItem("iPad");
    mListBox.addItem("iPod");
    widgetList2.add(mListBox);

    MCheckBox mCheckBox = new MCheckBox();
    // mCheckBox.setText("smeeee");
    widgetList2.add(mCheckBox);

    MCheckBox mCheckBox1 = new MCheckBox();
    // mCheckBox1.setText("again");
    mCheckBox1.setImportant(true);
    widgetList2.add(mCheckBox1);

    MRadioButton androidRadioButton = new MRadioButton("os");
    androidRadioButton.setText("Android");
    widgetList2.add(androidRadioButton);

    MRadioButton iOSRadioButton = new MRadioButton("os");
    iOSRadioButton.setText("iOS");
    widgetList2.add(iOSRadioButton);

    container.add(widgetList2);

  }

}
