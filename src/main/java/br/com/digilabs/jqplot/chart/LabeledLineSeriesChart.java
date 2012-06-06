/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.chart;


import java.util.Collection;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.data.LabeledLineSeriesData;
import br.com.digilabs.jqplot.elements.TickOptions;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * 
 * Simple implementation of Labeled Line Chart. This class can/should be extended.
 * 
 * @author inaiat
 */
@JqPlotPlugin(values = {
    JqPlotResources.CanvasTextRenderer,
    JqPlotResources.CategoryAxisRenderer,
    JqPlotResources.CanvasAxisLabelRenderer,
    JqPlotResources.CanvasAxisTickRenderer
})
public class LabeledLineSeriesChart<T extends Number> extends AbstractChart<LabeledLineSeriesData<T>,String> {

	private static final long serialVersionUID = -6833884146696085085L;

	private LabeledLineSeriesData<T> data = new LabeledLineSeriesData<T>();

    /**
     * Construtor
     */
    public LabeledLineSeriesChart() {
        this(null, null, null, 15);
    }
    /**
     * Construtor
     * @param title
     */
    public LabeledLineSeriesChart(String title) {
        this(title, null, null, 15);
    }

    /**
     * Construtor
     * @param title
     * @param labelX
     * @param labelY 
     */
    public LabeledLineSeriesChart(String title, String labelX, String labelY) {
        this(title, labelX, labelY, 15);
    }

    /**
     * Construtor
     * 
     * @param title
     * @param labelX
     * @param labelY
     * @param tickAngle 
     */
    public LabeledLineSeriesChart(String title, String labelX, String labelY,
            Integer tickAngle) {
        getChartConfiguration().setTitle(new Title(title));
        Axis<String> xAxis = getChartConfiguration().createXAxis();
        xAxis.setTickRenderer(JqPlotResources.CanvasAxisTickRenderer);
        TickOptions tickOptions = new TickOptions();
        tickOptions.setAngle(tickAngle);
        xAxis.setTickOptions(tickOptions);
        getChartConfiguration().createYAxis().setLabelRenderer(
                JqPlotResources.CanvasAxisLabelRenderer);
        getChartConfiguration().setLabelX(labelX);
        getChartConfiguration().setLabelY(labelY);
    }

    /**
     * 
     * @return 
     */
    public  LabeledLineSeriesData<T> getChartData() {
        return data;
    }
    
    public void addValue(Collection<T> value) {
		data.addValue(value);
	}

	public void addValues(Collection<T>... values) {
		data.addValues(values);
	}
}
