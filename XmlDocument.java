package com.pk0804;

public interface XmlDocument {
	
	public void createXml(String fileName); 
	/** 
	* 解析XML文档 
	* @param fileName 文件全路径名称 
	*/ 
	public void parserXml(String fileName);

}
