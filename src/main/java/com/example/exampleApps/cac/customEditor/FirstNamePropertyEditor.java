package com.example.exampleApps.cac.customEditor;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditorSupport;

public class FirstNamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        super.setAsText(text);
        if (text != null && !text.isEmpty()) {
            setValue(text.toUpperCase());
        }
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    @Override
    public void setSource(Object source) {
        super.setSource(source);
    }

    @Override
    public void setValue(Object value) {
        super.setValue(value);
    }

    @Override
    public Object getValue() {
        return super.getValue();
    }

    @Override
    public boolean isPaintable() {
        return super.isPaintable();
    }

    @Override
    public void paintValue(Graphics gfx, Rectangle box) {
        super.paintValue(gfx, box);
    }

    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString();
    }

    @Override
    public String getAsText() {
        return super.getAsText();
    }

    @Override
    public String[] getTags() {
        return super.getTags();
    }

    @Override
    public Component getCustomEditor() {
        return super.getCustomEditor();
    }

    @Override
    public boolean supportsCustomEditor() {
        return super.supportsCustomEditor();
    }

    @Override
    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
    }

    @Override
    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
        super.removePropertyChangeListener(listener);
    }

    @Override
    public void firePropertyChange() {
        super.firePropertyChange();
    }
}
