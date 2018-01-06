package org.vaadin.lightvaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import java.util.Date;

@Title("Light Vaadin")
@Theme("valo")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new VerticalLayout(
            new Label("Hello Vaadin LIGHT!"),
            new Button("Click me", event -> {
                Notification.show("Hello at " + new Date());
            }))
        );
    }
}
