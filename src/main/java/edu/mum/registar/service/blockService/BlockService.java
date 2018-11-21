package edu.mum.registar.service.blockService;

import java.util.List;

import edu.mum.registar.domain.Block;


public interface BlockService {
	List<Block> getBlocks();
	Block getOne(long id);

}
