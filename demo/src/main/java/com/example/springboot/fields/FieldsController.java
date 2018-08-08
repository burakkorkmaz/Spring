package com.example.springboot.fields;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FieldsController {

	@Autowired
	private FieldService fieldService;
	
	@RequestMapping(value = "/fields")
	public List<Field> getFields() {
		return fieldService.getAllFields();
	}
		
	@RequestMapping(value = "/field/{id}")
	public Field getField(@PathVariable Integer id) {
		return fieldService.getField(id);
	}
	
	@RequestMapping(value = "/field")
	public Field getFieldFromName(@RequestParam(value="name") String name) {
		return fieldService.getFieldFromName(name);
	}
	
	@RequestMapping(method = RequestMethod.POST, value= "/fields")
	public void addField(@RequestBody Field field) {
		fieldService.addField(field);
	}

	@RequestMapping(method = RequestMethod.PUT, value= "/fields/{id}")
	public void updateField(@RequestBody Field field, @PathVariable Integer id) {
		fieldService.updateField(field, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value= "/fields/{id}")
	public void deleteField(@RequestBody Field field, @PathVariable Integer id) {
		fieldService.deleteField(id);
	}
}
