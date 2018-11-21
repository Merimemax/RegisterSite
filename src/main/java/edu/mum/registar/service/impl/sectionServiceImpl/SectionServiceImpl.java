package edu.mum.registar.service.impl.sectionServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.registar.domain.Section;
import edu.mum.registar.repository.SectionRepository;
import edu.mum.registar.service.sectionService.SectionService;
@Service
public class SectionServiceImpl implements SectionService {
	@Autowired
	private SectionRepository sectionRepository;

	@Override
	public List<Section> getSections() {
		// TODO Auto-generated method stub
		return (List<Section>) sectionRepository.findAll();
	}

	@Override
	public Section getOne(long id) {
		// TODO Auto-generated method stub
		return sectionRepository.findById(id).get();
	}

}