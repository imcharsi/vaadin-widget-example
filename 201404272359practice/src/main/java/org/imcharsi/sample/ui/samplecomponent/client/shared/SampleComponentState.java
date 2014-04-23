package org.imcharsi.sample.ui.samplecomponent.client.shared;

import com.vaadin.shared.AbstractComponentState;

/**
 * Created by KangWoo,Lee on 14. 4. 24.
 */
public class SampleComponentState extends AbstractComponentState {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;
}
