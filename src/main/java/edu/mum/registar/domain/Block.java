package edu.mum.registar.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String blockName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Section> sections=new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
    
    public void addSection(Section section) {
    	for(int i=0;i<this.sections.size();i++) {
    		if(section.getId()==this.sections.get(i).getId())
    			//this.sections.remove(i);
    			throw new IllegalArgumentException("The section is already assigned.");
    	}
    	this.sections.add(section);
    }

	public void removeSection(long id) {
		for(int i=0;i<this.sections.size();i++) {
    		if(id==this.sections.get(i).getId())
    			this.sections.remove(i);
    	}
		
	}
}
