package com.kirioslab.heftyfish.dto;

public class BlogPostDto {

	private String blogPostHeader;
	private String htmlShortDescription;
	private String blogPostHeaderImage;
	private String blogPostImage;
	private String blogPostText;
	
	public String getBlogPostHeader() {
		return blogPostHeader;
	}
	
	public void setBlogPostHeader(String blogPostHeader) {
		this.blogPostHeader = blogPostHeader;
	}
	
	public String getHtmlShortDescription() {
		return htmlShortDescription;
	}
	
	public void setHtmlShortDescription(String htmlShortDescription) {
		this.htmlShortDescription = htmlShortDescription;
	}
	
	public String getBlogPostHeaderImage() {
		return blogPostHeaderImage;
	}
	
	public void setBlogPostHeaderImage(String blogPostHeaderImage) {
		this.blogPostHeaderImage = blogPostHeaderImage;
	}
	
	public String getBlogPostImage() {
		return blogPostImage;
	}
	
	public void setBlogPostImage(String blogPostImage) {
		this.blogPostImage = blogPostImage;
	}
	
	public String getBlogPostText() {
		return blogPostText;
	}
	
	public void setBlogPostText(String blogPostText) {
		this.blogPostText = blogPostText;
	}
}
