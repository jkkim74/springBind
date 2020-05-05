package com.resource.springbasic3;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        Event event = (Event)getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        //super.setAsText(text);
        setValue(new Event(Integer.parseInt(text)));
    }
}
