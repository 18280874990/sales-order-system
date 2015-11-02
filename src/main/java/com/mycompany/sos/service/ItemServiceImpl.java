/*
 * |-------------------------------------------------
 * | Copyright © 2015 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.sos.service;

import com.mycompany.sos.model.ItemEntity;
import com.mycompany.sos.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * {@link ItemServiceImpl} class 
 * 
 * implementation of the {@link ItemService} interface
 * 
 * @author colin
 *
 */
@Service("itemServiceImpl")
@Transactional
public class ItemServiceImpl implements ItemService {

	private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
	
	@Autowired
	private ItemRepository itemRepository;
		
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean addItem(ItemEntity itemEntity) {
		return itemRepository.addItem(itemEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ItemEntity> getItems() {
		logger.info("Retrieving items list from system");
		return itemRepository.getItems();
	}

}
