package org.imcharsi.sample.ui.samplecomponent.client.shared;

import com.vaadin.shared.AbstractComponentState;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by KangWoo,Lee on 14. 4. 24.
 */
public class SampleComponentState extends AbstractComponentState {
    @Getter
    @Setter
    private String text;
}
