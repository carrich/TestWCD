package com.filter;

import com.entity.Employee;
import com.googlecode.objectify.ObjectifyFilter;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/*"})
public class Filter extends ObjectifyFilter{

}
