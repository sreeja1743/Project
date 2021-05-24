package com.app.dca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dca.entity.Feed;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;

public interface IFeedRepository extends JpaRepository<Feed, Integer>{

	Feed saveFeed(Feed feed);
	
	Feed updateFeed(Feed feed);
	
	Feed likeFeed(int feedId) throws UnknownFeedException;
	
	Feed fetchFeed(int feedId) throws UnknownFeedException;
	
	Feed deleteFeed(int feedId) throws UnknownFeedException;
	
	List<Feed> fetchFeedsByDeveloper(int devId) throws UnknownDeveloperException;
	
	List<Feed> fetchFeedsByKeyword(String keyword);
	
	List<Feed> fetchFeedsByTopic(String topic);
}
