package org.imcharsi.sample.ui.samplecomponent.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Random;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;
import org.imcharsi.sample.ui.samplecomponent.SampleComponent;
import org.imcharsi.sample.ui.samplecomponent.client.shared.SampleComponentServerRpc;
import org.imcharsi.sample.ui.samplecomponent.client.shared.SampleComponentState;

/**
 * Created by KangWoo,Lee on 14. 4. 24.
 */
@Connect(SampleComponent.class)
public class SampleComponentConnector extends AbstractComponentConnector {
    private final SampleComponentServerRpc serverRpc = RpcProxy.create(SampleComponentServerRpc.class, this);

    private class ListenerOne implements ClickHandler {
        @Override
        public void onClick(ClickEvent event) {
            serverRpc.somethingHappened(Integer.toString(Random.nextInt()));
        }
    }

    public SampleComponentConnector() {
        getWidget().addClickHandler(new ListenerOne());
    }

    @Override
    protected SampleComponentWidget createWidget() {
        return GWT.create(SampleComponentWidget.class);
    }

    @Override
    public SampleComponentWidget getWidget() {
        return (SampleComponentWidget) super.getWidget();
    }

    @Override
    public SampleComponentState getState() {
        return (SampleComponentState) super.getState();
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
        getWidget().setText(getState().getText());
    }
}
