package com.dubboclub.web.model;

import org.apache.zookeeper.data.Stat;

import java.util.List;

/**
 * Created by bieber on 2015/9/24.
 */
public class SpyZooNode {
    
    private String parent;
    
    private String name;
    
    private List<SpyZooNode> childNodes;
    
    private List<SpyZooNode> nodeList;
    
    private Stat nodeStat;

    public List<SpyZooNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<SpyZooNode> nodeList) {
        this.nodeList = nodeList;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Stat getNodeStat() {
        return nodeStat;
    }

    public void setNodeStat(Stat nodeStat) {
        this.nodeStat = nodeStat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SpyZooNode> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<SpyZooNode> childNodes) {
        this.childNodes = childNodes;
    }
}
