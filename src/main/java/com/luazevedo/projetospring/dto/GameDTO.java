package com.luazevedo.projetospring.dto;

import com.luazevedo.projetospring.entities.Game;
import com.luazevedo.projetospring.projections.GameProjection;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameDTO(){
    }
    public GameDTO(Game entity) {
        id = entity.getId();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        title = entity.getTitle();
        year = entity.getYear();
    }
    public GameDTO(GameProjection projection) {
        id = projection.getId();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
        title = projection.getTitle();
        year = projection.getGameYear();
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
