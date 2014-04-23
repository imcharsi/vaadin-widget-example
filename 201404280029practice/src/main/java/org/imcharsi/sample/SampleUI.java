package org.imcharsi.sample;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.imcharsi.sample.ui.samplecomponent.SampleComponent;

import java.util.Random;

/**
 * Created by KangWoo,Lee on 14. 4. 24.
 */
@Push
@Widgetset("org.imcharsi.sample.ui.samplecomponent.SampleComponentWidget")
public class SampleUI extends UI {
    private final VerticalLayout layout = new VerticalLayout();

    final private SampleComponent component = new SampleComponent();

    final private Button button = new Button();

    final private Random random = new Random();

    private class ListenerOne implements Button.ClickListener {
        @Override
        public void buttonClick(Button.ClickEvent event) {
            component.setCaption(Integer.toString(random.nextInt()));
        }
    }

    @Override
    protected void init(VaadinRequest request) {
        layout.addComponents(button, component);
        button.addClickListener(new ListenerOne());
        setContent(layout);
    }
}
