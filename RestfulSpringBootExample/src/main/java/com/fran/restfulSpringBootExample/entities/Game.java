package com.fran.restfulSpringBootExample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Game {

    @JsonIgnore
    private Long id;
	private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    
    @Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + "]";
	}
}
