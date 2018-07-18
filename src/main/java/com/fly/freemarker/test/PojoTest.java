package com.fly.freemarker.test;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fly.freemarker.test.pojo.User;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 关于freemarker所支持的数据类型的测试
 * @author Administrator
 *
 */
public class PojoTest {

	/**
	 * 测试pojo类型取数据
	 */
	@Test
	public void pojoTest()throws Exception {
		Configuration configuration = new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File(this.getClass().getClassLoader().getResource("ftl/").getPath()));
		configuration.setDefaultEncoding("utf-8");
		Template template = configuration.getTemplate("pojo.ftl");
		
		User user = new User();
		user.setId(1);
		user.setName("张三");
		user.setSex((byte)0);
		user.setAddress("西安市");
		
		Writer out = new FileWriter("c:/freemarker.html");
		template.process(user, out);
		out.close();
	}
	
	/**
	 * 测试pojo放在map中类型取数据
	 */
	@Test
	public void pojoToMapTest()throws Exception {
		Configuration configuration = new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File(this.getClass().getClassLoader().getResource("ftl/").getPath()));
		configuration.setDefaultEncoding("utf-8");
		Template template = configuration.getTemplate("pojoToMap.ftl");
		
		Map data = new HashMap();
		User user = new User();
		user.setId(1);
		user.setName("张三");
		user.setSex((byte)0);
		user.setAddress("西安市");
		data.put("user", user);
		
		Writer out = new FileWriter("c:/freemarker.html");
		template.process(data, out);
		out.close();
	}
}
