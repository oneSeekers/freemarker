package com.fly.freemarker.test;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class IncludeTest {

	public static void main(String[] args)throws Exception {
		Configuration configuration = new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File(NullValue.class.getClassLoader().getResource("ftl/").getPath()));
		configuration.setDefaultEncoding("utf-8");
		Template template = configuration.getTemplate("include.ftl");
		
		Map date = new HashMap();
		
		Writer out = new FileWriter("c:/freemarker.html");
		template.process(date, out);
		out.close();
		
	}
}
