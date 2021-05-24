package com.app.dca.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dca.entity.Feed;
import com.app.dca.service.IFeedService;

@RestController
public class FeedRestController {
     
	@Autowired
	private IFeedService service;
	
	@PostMapping("/feed")
	public Feed addFeed(@RequestBody Feed f) {
		return service.addFeed(f);
	}
	
	
}
