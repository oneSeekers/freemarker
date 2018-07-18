package com.fly.freemarker.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 1.要使用freemarker首先需要一个模板文件
 * 2.创建一个configuration对象（freemarker的jar包中提供的）
 * 3.设置模板文件的保存目录
 * 4.设置模板文件的格式，一般是UTF-8
 * 5.加载模板文件，创建一个模板对象
 * 6.创建一个数据集，可以是pojo，也可以是map  推荐使用map
 * 7.创建一个Writer对象，指定输出文件的路径以及文件名。
 * 8.生成文件。
 * 9.关闭流
 * @author Administrator
 *
 */
public class FreeMarkerTest {

	/**
	 * 步骤：
	 * 1.在resource下创建ftl文件夹，并且在文件夹中创建hello.ftl（后缀不一定是ftl）
	 * 2.创建一个configuration对象
	 * @throws IOException 
	 */
	@Test
	public void test1() throws Exception {
		Configuration configuration = new Configuration(Configuration.getVersion());
		
		String path = this.getClass().getClassLoader().getResource("ftl/").getPath();
		File file = new File(path);
		configuration.setDirectoryForTemplateLoading(file);//这儿只是模板的目录
		
		configuration.setDefaultEncoding("utf-8");
		
		Template template = configuration.getTemplate("hello.ftl");//在目录下的模板文件
		
		Map data = new HashMap();
		data.put("hello", "hello freemarker!");
		
		Writer out = new FileWriter(new File(this.getClass().getResource("ftl/").getPath()+"freemarker.txt"));//目标文件
		template.process(data, out);
		out.close();
		
	}
}
