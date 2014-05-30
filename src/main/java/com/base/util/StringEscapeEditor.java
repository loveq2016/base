package com.base.util;

import java.beans.PropertyEditorSupport;
import org.springframework.web.util.HtmlUtils;

public class StringEscapeEditor extends PropertyEditorSupport {

	public StringEscapeEditor() {

	}

	@Override
	public void setAsText(String text) {
		if (text == null) {
			setValue(null);
		} else {
			setValue(HtmlUtils.htmlEscape(text));
		}
	}

	@Override
	public String getAsText() {
		Object value = getValue();
		return value != null ? value.toString() : "";
	}
}
