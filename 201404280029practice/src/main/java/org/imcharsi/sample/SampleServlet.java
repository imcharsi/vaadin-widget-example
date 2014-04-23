package org.imcharsi.sample;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

/**
 * Created by KangWoo,Lee on 14. 4. 24.
 */
@WebServlet(urlPatterns = "/*", asyncSupported = true)
@VaadinServletConfiguration(productionMode = false, ui = SampleUI.class)
public class SampleServlet extends VaadinServlet {
}
