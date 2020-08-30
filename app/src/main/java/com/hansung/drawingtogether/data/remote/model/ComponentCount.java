package com.hansung.drawingtogether.data.remote.model;


public class ComponentCount {

    String topic;
    int stroke;
    int rect;
    int oval;
    int text;
    int image;

    public ComponentCount(String topic) {
        this.topic = topic;
        this.stroke = 0;
        this.rect = 0;
        this.oval = 0;
        this.text = 0;
        this.image = 0;
    }

    public void increaseStroke() { stroke++; }

    public void increaseRect() { rect++; }

    public void increaseOval() { oval++; }

    public void increaseText() { text++; }

    public void increaseImage() { image++; }

    public void decreaseStroke() { stroke--; }

    public void decreaseRect() { rect--; }

    public void decreaseOval() { oval--; }

    public void decreaseText() { text--; }
}
