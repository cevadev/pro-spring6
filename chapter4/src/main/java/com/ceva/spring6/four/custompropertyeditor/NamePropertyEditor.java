package com.ceva.spring6.four.custompropertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] name = text.split("\\s");
        setValue(new FullName(name[0], name[1]));
    }
}
