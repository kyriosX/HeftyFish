/**
 * This file was generated by the JPA Modeler
 */
package com.kirioslab.heftyfish.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author wz
 */
@Entity
@Table(name = "BLOG_POST")
public class BlogPost implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "HTML_TEXT", length = 20000)
    @Basic
    @NotNull
    @Size(min = 200, max = 20000, message = "Blog post shoul be 200 to 20000 character lenght.")
    private String htmlText;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, targetEntity = BlogPostHeader.class, mappedBy = "blogPost")
    private BlogPostHeader blogPostHeader;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHtmlText() {
        return this.htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    public BlogPostHeader getBlogPostHeader() {
        return this.blogPostHeader;
    }

    public void setBlogPostHeader(BlogPostHeader blogPostHeader) {
        this.blogPostHeader = blogPostHeader;
    }

}
