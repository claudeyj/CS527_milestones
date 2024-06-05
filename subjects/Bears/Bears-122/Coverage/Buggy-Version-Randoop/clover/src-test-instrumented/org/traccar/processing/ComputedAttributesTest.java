/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.processing;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Attribute;
import org.traccar.model.Position;

public class ComputedAttributesTest {static class __CLR4_5_2jv9jv9lwydym0b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383780158L,8589935092L,25786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testComputedAttributes() {__CLR4_5_2jv9jv9lwydym0b.R.globalSliceStart(getClass().getName(),25749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xap4ozjv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jv9jv9lwydym0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jv9jv9lwydym0b.R.globalSliceEnd(getClass().getName(),"org.traccar.processing.ComputedAttributesTest.testComputedAttributes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25749,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xap4ozjv9(){try{__CLR4_5_2jv9jv9lwydym0b.R.inc(25749);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25750);Position position = new Position();
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25751);ComputedAttributesHandler computedAttributesHandler = new ComputedAttributesHandler();
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25752);Date date = new Date();
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25753);position.setTime(date);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25754);position.setSpeed(42);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25755);position.setValid(false);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25756);position.set("adc1", 128);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25757);position.set("booleanFlag", true);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25758);position.set("adc2", 100);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25759);position.set("bitFlag", 7);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25760);position.set("event", 42);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25761);position.set("result", "success");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25762);Attribute attribute = new Attribute();

        __CLR4_5_2jv9jv9lwydym0b.R.inc(25763);attribute.setExpression("adc1");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25764);Assert.assertEquals(128, computedAttributesHandler.computeAttribute(attribute, position));

        __CLR4_5_2jv9jv9lwydym0b.R.inc(25765);attribute.setExpression("!booleanFlag");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25766);Assert.assertEquals(false, computedAttributesHandler.computeAttribute(attribute, position));

        __CLR4_5_2jv9jv9lwydym0b.R.inc(25767);attribute.setExpression("adc2 * 2 + 50");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25768);Assert.assertEquals(250, computedAttributesHandler.computeAttribute(attribute, position));

        __CLR4_5_2jv9jv9lwydym0b.R.inc(25769);attribute.setExpression("(bitFlag & 4) != 0");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25770);Assert.assertEquals(true, computedAttributesHandler.computeAttribute(attribute, position));

        __CLR4_5_2jv9jv9lwydym0b.R.inc(25771);attribute.setExpression("if (event == 42) \"lowBattery\"");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25772);Assert.assertEquals("lowBattery", computedAttributesHandler.computeAttribute(attribute, position));
        
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25773);attribute.setExpression("speed > 5 && valid");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25774);Assert.assertEquals(false, computedAttributesHandler.computeAttribute(attribute, position));
        
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25775);attribute.setExpression("fixTime");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25776);Assert.assertEquals(date, computedAttributesHandler.computeAttribute(attribute, position));
        
        // modification tests
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25777);attribute.setExpression("adc1 = 256");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25778);computedAttributesHandler.computeAttribute(attribute, position);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25779);Assert.assertEquals(128, position.getInteger("adc1"));
        
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25780);attribute.setExpression("result = \"fail\"");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25781);computedAttributesHandler.computeAttribute(attribute, position);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25782);Assert.assertEquals("success", position.getString("result"));
        
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25783);attribute.setExpression("fixTime = \"2017-10-18 10:00:01\"");
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25784);computedAttributesHandler.computeAttribute(attribute, position);
        __CLR4_5_2jv9jv9lwydym0b.R.inc(25785);Assert.assertEquals(date, position.getFixTime());
        
    }finally{__CLR4_5_2jv9jv9lwydym0b.R.flushNeeded();}}

}
