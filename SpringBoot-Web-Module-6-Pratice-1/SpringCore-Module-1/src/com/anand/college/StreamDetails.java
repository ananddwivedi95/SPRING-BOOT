package com.anand.college;

import java.sql.SQLOutput;
import java.util.List;

public class StreamDetails {
    private String streamName;
    private List<String> subjects;


    public StreamDetails()
    {
        System.out.println("StreamDetail object is created");
    }
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getStreamName() {
        return streamName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "StreamSetails{" +
                "streamName='" + streamName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
