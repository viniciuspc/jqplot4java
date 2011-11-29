/*
 * Copyright 2011 bernardo.moura.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.digilabs.jqplot.chart.elements;

import java.util.Collection;

/**
 *
 * @author inaiat
 */
public class PointLabels {

    private Boolean show = true;
    private String location;
    private Integer edgeTolerance;
    private Collection<String> lables;

    public Collection<String> getLables() {
        return lables;
    }

    public void setLables(Collection<String> lables) {
        this.lables = lables;
    }

    public Integer getEdgeTolerance() {
        return edgeTolerance;
    }

    public void setEdgeTolerance(Integer edgeTolerance) {
        this.edgeTolerance = edgeTolerance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean isShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }
}
