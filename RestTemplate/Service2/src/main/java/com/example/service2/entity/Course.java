package com.example.service2.entity;

public class Course {
    private Long couId;
    private String name;

    public Course() {
    }

    public Course(Long couId, String name) {
        this.couId = couId;
        this.name = name;
    }

    public Long getCouId() {
        return couId;
    }

    public void setCouId(Long couId) {
        this.couId = couId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "couId=" + couId +
                ", name='" + name + '\'' +
                '}';
    }
}
