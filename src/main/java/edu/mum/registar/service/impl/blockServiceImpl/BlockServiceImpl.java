package edu.mum.registar.service.impl.blockServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.registar.domain.Block;
import edu.mum.registar.repository.BlockRepository;
import edu.mum.registar.service.blockService.BlockService;

@Service
public class BlockServiceImpl implements BlockService {

	
	@Autowired
	private BlockRepository blockRepository;
	@Override
	public List<Block> getBlocks() {
		// TODO Auto-generated method stub
		return (List<Block>) blockRepository.findAll();
	}

	@Override
	public Block getOne(long id) {
		// TODO Auto-generated method stub
		Block block=blockRepository.findById(id).get();
		return block;
	}

	@Override
	public Block save(Block block) {
		// TODO Auto-generated method stub
		return blockRepository.save(block);
	}

}
