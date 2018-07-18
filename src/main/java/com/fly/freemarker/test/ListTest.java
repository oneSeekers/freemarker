package com.fly.freemarker.test;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fly.freemarker.test.pojo.User;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class ListTest {



	/**
	 * 测试pojo类型取数据
	 */
	@Test
	public void pojoTest()throws Exception {
		Configuration configuration = new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File(this.getClass().getClassLoader().getResource("ftl/").getPath()));
		configuration.setDefaultEncoding("utf-8");
		Template template = configuration.getTemplate("list.ftl");
		
		Map data = new HashMap();
		
		List list = new ArrayList();
		list.add(new User(1, "张三1", (byte)0, "陕西1"));
		list.add(new User(2, "张三2", (byte)0, "陕西2"));
		list.add(new User(3, "张三3", (byte)0, "陕西3"));
		list.add(new User(4, "张三4", (byte)0, "陕西4"));
		list.add(new User(5, "张三5", (byte)0, "陕西5"));
		
		data.put("list", list);
		Writer out = new FileWriter("c:/freemarker.html");
		template.process(data, out);
		out.close();
	}

}
