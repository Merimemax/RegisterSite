package edu.mum.registar.service.sectionService;

import java.util.List;

import edu.mum.registar.domain.Section;


public interface SectionService {
	List<Section> getSections();
	Section getOne(long id);
	Section save(Section section);
	void delete(long id);

}
