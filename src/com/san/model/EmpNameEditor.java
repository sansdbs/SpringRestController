package com.san.model;

import java.beans.PropertyEditorSupport;

public class EmpNameEditor extends PropertyEditorSupport {

	public void setAsText(String empName) throws IllegalArgumentException {

		if (empName.contains("Mr.") || empName.contains("Ms.")) {

			setValue(empName);

		} else {
			empName = "Ms." + empName;

			setValue(empName);
		}

	}

}
