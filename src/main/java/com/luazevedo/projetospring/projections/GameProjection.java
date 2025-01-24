package com.luazevedo.projetospring.projections;

public interface GameProjection {

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
