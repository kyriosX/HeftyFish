package com.kirioslab.heftyfish.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kirioslab.heftyfish.model.BlogPostHeader;

public interface BlogPostRepository extends CrudRepository<BlogPostHeader, Long>{

	Optional<BlogPostHeader> findFirstByOrderByPublishDateDesc();

	List<BlogPostHeader> findTop5ByOrderByPublishDateDesc();

}
