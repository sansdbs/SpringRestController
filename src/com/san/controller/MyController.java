package com.san.controller;

import java.beans.PropertyEditor;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.san.model.EmpNameEditor;
import com.san.model.Employee;

@Controller
public class MyController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[] { "empMobile" });
		binder.registerCustomEditor(String.class, "empName", (PropertyEditor) new EmpNameEditor());
	}

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");

		return model;
	}

	@RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
	/*
	 * public ModelAndView submitAdmission(@RequestParam("empId") int
	 * eid, @RequestParam("empName") String ename,
	 * 
	 * @RequestParam("empCity") String ecity) {
	 */

	// @ModelAttribute annotation binds the data respective there object so we no
	// need to use of @RequestParam annotation &
	// no need to write those many steps also no need to create object of model data
	// & addObject().

	public ModelAndView submitAdmission(@Valid @ModelAttribute("emp") Employee emp, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}

		/*
		 * Employee emp = new Employee();
		 * 
		 * emp.setEmpId(eid); emp.setEmpName(ename); emp.setEmpCity(ecity);
		 */

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headerMsg", "This is employee Information");
		// model.addObject("emp", emp);

		return model;
	}

}
