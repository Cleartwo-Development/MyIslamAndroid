package com.cleartwo.admin.myislam.modelClasses;

import java.util.List;

public class SectionDetailsModel {
    private String section_title;
    private String section_description;
    private List<TopicModel> modelList;


    public String getSection_title() {
        return section_title;
    }


    public String getSection_description() {
        return section_description;
    }

    public SectionDetailsModel(String section_title, String section_description, List<TopicModel> modelList) {
        this.section_title = section_title;
        this.section_description = section_description;
        this.modelList = modelList;
    }

    public void setSection_description(String section_description) {
        this.section_description = section_description;
    }

    public List<TopicModel> getModelList() {
        return modelList;
    }

    public void setModelList(List<TopicModel> modelList) {
        this.modelList = modelList;
    }
}
