package com.crumbpicker.client.activities.pulltorefresh;

import java.util.List;

import com.crumbpicker.client.DetailView;
import com.crumbpicker.client.activities.home.Topic;
import com.googlecode.mgwt.ui.client.widget.base.HasRefresh;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullArrowWidget;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullPanel.Pullhandler;

public interface PullToRefreshDisplay extends DetailView {

	public void render(List<Topic> topics);

	public void setHeaderPullHandler(Pullhandler pullHandler);

	public void setFooterPullHandler(Pullhandler pullHandler);

	public PullArrowWidget getPullHeader();

	public PullArrowWidget getPullFooter();

	public void refresh();

	public HasRefresh getPullPanel();

}
