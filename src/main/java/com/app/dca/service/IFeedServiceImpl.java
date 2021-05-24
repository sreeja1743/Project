package com.app.dca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dca.entity.Feed;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.repository.IFeedRepository;

@Service
public class IFeedServiceImpl implements IFeedService{

	@Autowired
	private IFeedRepository repo;
	
	@Override
	public Feed addFeed(Feed feed){
		return repo.save(feed);
	}

	@Override
	public Feed editFeed(Feed feed) {
		return null;
	}

	@Override
	public Feed likeFeed(int feedId) throws UnknownFeedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feed getFeed(int feedId) throws UnknownFeedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feed removeFeed(int feedId) throws UnknownFeedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feed> getFeedsByDeveloper(int devId) throws UnknownDeveloperException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feed> getFeedsByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feed> getFeedsByTopic(String topic) {
		// TODO Auto-generated method stub
		return null;
	}

}
