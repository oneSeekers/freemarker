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
 * 1.Ҫʹ��freemarker������Ҫһ��ģ���ļ�
 * 2.����һ��configuration����freemarker��jar�����ṩ�ģ�
 * 3.����ģ���ļ��ı���Ŀ¼
 * 4.����ģ���ļ��ĸ�ʽ��һ����UTF-8
 * 5.����ģ���ļ�������һ��ģ�����
 * 6.����һ�����ݼ���������pojo��Ҳ������map  �Ƽ�ʹ��map
 * 7.����һ��Writer����ָ������ļ���·���Լ��ļ�����
 * 8.�����ļ���
 * 9.�ر���
 * @author Administrator
 *
 */
public class FreeMarkerTest {

	/**
	 * ���裺
	 * 1.��resource�´���ftl�ļ��У��������ļ����д���hello.ftl����׺��һ����ftl��
	 * 2.����һ��configuration����
	 * @throws IOException 
	 */
	@Test
	public void test1() throws Exception {
		Configuration configuration = new Configuration(Configuration.getVersion());
		
		String path = this.getClass().getClassLoader().getResource("ftl/").getPath();
		File file = new File(path);
		configuration.setDirectoryForTemplateLoading(file);//���ֻ��ģ���Ŀ¼
		
		configuration.setDefaultEncoding("utf-8");
		
		Template template = configuration.getTemplate("hello.ftl");//��Ŀ¼�µ�ģ���ļ�
		
		Map data = new HashMap();
		data.put("hello", "hello freemarker!");
		
		Writer out = new FileWriter(new File(this.getClass().getResource("ftl/").getPath()+"freemarker.txt"));//Ŀ���ļ�
		template.process(data, out);
		out.close();
		
	}
}
