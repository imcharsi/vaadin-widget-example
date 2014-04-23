package org.imcharsi.sample.ui.samplecomponent;

import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Notification;
import org.imcharsi.sample.ui.samplecomponent.client.shared.SampleComponentServerRpc;
import org.imcharsi.sample.ui.samplecomponent.client.shared.SampleComponentState;

/**
 * Created by KangWoo,Lee on 14. 4. 24.
 */
public class SampleComponent extends AbstractComponent {
    private class RpcOne implements SampleComponentServerRpc {
        @Override
        public void somethingHappened(String what) {
            Notification.show(what, Notification.Type.HUMANIZED_MESSAGE);
        }
    }

    public SampleComponent() {
        registerRpc(new RpcOne());
    }

    @Override
    protected SampleComponentState getState() {
        return (SampleComponentState) super.getState();
    }

    @Override
    public void setCaption(String caption) {
        getState().setText(caption);
    }
}
