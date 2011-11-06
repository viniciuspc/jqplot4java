/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import jqplot.JqPlot;
import jqplot.JqPlotUtil;
import jqplot.axis.Axis;
import jqplot.axis.XAxis;
import jqplot.plugin.PluginClasses;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.enums.EnumConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import java.io.Writer;
import junit.framework.TestCase;

/**
 *
 * @author inaiat
 */
public class JqPlotUtilTest extends TestCase {

    public JqPlotUtilTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of createJquery method, of class JqPlotUtil.
     */
    public void testCreateJquery() {
        JqPlot jqPlot = new JqPlot();
        jqPlot.setSimpleTitle("TESTE");

        XAxis xAxis = jqPlot.createXAxis();
        xAxis.setLabel("X Axis");
        xAxis.setPad(0F);
        Axis yAxis = jqPlot.createYAxis();
        yAxis.setLabel("Y Axis");
        

        Axis axisDefault = new Axis();
        axisDefault.setLabelRenderer(PluginClasses.CanvasAxisLabelRenderer);
        jqPlot.setAxesDefaults(axisDefault);

        System.out.println(JqPlotUtil.createJquery(jqPlot, "chart1",  "[[3,7,9,1,4,6,8,2,5]]"));

    }
}
