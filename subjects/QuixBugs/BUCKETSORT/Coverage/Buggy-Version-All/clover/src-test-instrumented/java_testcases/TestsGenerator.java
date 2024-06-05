/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.junit.Ignore;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java_testcases.junit.QuixFixOracleHelper;
import spoon.Launcher;
import spoon.OutputType;
import spoon.SpoonModelBuilder.InputType;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.AnnotationFactory;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;
import spoon.support.reflect.code.CtBlockImpl;

/**
 * Class that generates the test cases from the json files.
 *
 * @author Matias Martinez
 *
 */
public class TestsGenerator {static class __CLR4_5_22xq2xqlwzsbeg2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,4024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static int TIMEOUT = 3000;
    public static int DELTA_FLOAT_COMPARISON = 0;

    public static double[] DELTAS_TESTS_SQRT = new double[] { 0.01, 0.5, 0.3, 0.2, 0.01, 0.05, 0.03 };
    // Test to add anotation ignore: key is program+test_id
    public static List<String> TEST_T_ADD_IGNORE = java.util.Arrays.asList("LEVENSHTEIN3");

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void createTestCases(String ROOT_DIR, List<String> inputs, String program, String output,
        String testPackageName, String subjectsPakcageName) throws Exception {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3806);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3807);System.out.println("generating test case for program : " + program);

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3808);File outputSrcDirectory = new File(output);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3809);outputSrcDirectory.mkdirs();

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3810);createOracle(outputSrcDirectory, testPackageName);

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3811);System.out.println("Generating test cases at " + outputSrcDirectory);
        // Initialization of model
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3812);final Launcher comp = new Launcher();
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3813);comp.getEnvironment().setShouldCompile(true);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3814);comp.buildModel();
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3815);Factory f = (Factory) comp.getFactory();

        // Creation of test class
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3816);String name = program.toUpperCase() + "_TEST";
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3817);CtClass ctclass = f.createClass(name);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3818);CtPackage p = f.Core().createPackage();
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3819);p.setSimpleName(testPackageName);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3820);ctclass.setParent(p);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3821);ctclass.setVisibility(ModifierKind.PUBLIC);

        // Creation of test cases
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3822);int i_nr_testcase = 0;
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3823);for (String i_input : inputs) {{

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3824);CtMethod ctm = f.createMethod();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3825);ctm.setSimpleName("test_" + (i_nr_testcase));
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3826);ctm.setVisibility(ModifierKind.PUBLIC);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3827);ctm.setType(f.Type().VOID.unbox());
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3828);CtBlock block = new CtBlockImpl<>();

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3829);ctm.setBody(block);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3830);ctclass.addMethod(ctm);

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3831);ctm.addThrownType(f.createCtTypeReference(Exception.class));

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3832);JsonArray jelement = (JsonArray) new JsonParser().parse(i_input);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3833);JsonElement jsonInput = jelement.get(0);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3834);JsonElement jsonOutPutExpected = jelement.get(1);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3835);String expected = QuixFixOracleHelper.removeSymbols(jsonOutPutExpected.toString());

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3836);Type[] parametersTypes = getTypesOfParameters(program, program.toUpperCase(), subjectsPakcageName);

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3837);Class returnType = getReturnType(program, program.toUpperCase(), subjectsPakcageName);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3838);boolean isOutputDecimal = returnType.getSimpleName().toLowerCase().equals("double");

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3839);CtCodeSnippetStatement stmtInvProgramUnderRepair = f.Core().createCodeSnippetStatement();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3840);stmtInvProgramUnderRepair.setValue(returnType.getCanonicalName() + " result = " + subjectsPakcageName + "."
                    + program.toUpperCase() + "." + program.toLowerCase() + "("
                    + (getParametersString(parametersTypes, jsonInput)) + ")");

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3841);block.addStatement(stmtInvProgramUnderRepair);

            // If the output is a primitive or a wrapper number, we compare them
            // directlu
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3842);if ((((isNumber(returnType) || returnType.isPrimitive())&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3843)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3844)==0&false))) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3845);CtCodeSnippetStatement stmtAssert = f.Core().createCodeSnippetStatement();
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3846);if ((((returnType.getSimpleName().toLowerCase().equals("double"))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3847)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3848)==0&false))) {{
                    __CLR4_5_22xq2xqlwzsbeg2.R.inc(3849);stmtAssert.setValue("org.junit.Assert.assertEquals( (" + returnType.getCanonicalName() + ") "
                            + expected + ", result, " + getFloatComparisonDelta(program, i_nr_testcase) + ")");
                } }else {{
                    __CLR4_5_22xq2xqlwzsbeg2.R.inc(3850);stmtAssert.setValue("org.junit.Assert.assertEquals( (" + returnType.getCanonicalName() + ") "
                            + expected + ", result" + ")");

                }
                }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3851);block.addStatement(stmtAssert);

            } }else {{// If the output is not a Number nor primitive, we transform
                    // it to string a compare them.
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3852);CtCodeSnippetStatement stmtCall = f.Core().createCodeSnippetStatement();

                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3853);stmtCall.setValue(
                        "String resultFormatted = " + testPackageName + "." + QuixFixOracleHelper.class.getSimpleName()
                                + ".format(" + "result," + (!isOutputDecimal) + ")");
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3854);block.addStatement(stmtCall);
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3855);CtCodeSnippetStatement stmtAssert = f.Core().createCodeSnippetStatement();
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3856);stmtAssert.setValue("org.junit.Assert.assertEquals(" + "\""
                        + QuixFixOracleHelper.format(expected, (!isOutputDecimal)) + "\"" + ", resultFormatted)");
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3857);block.addStatement(stmtAssert);
            }

            }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3858);AnnotationFactory af = f.Annotation();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3859);af.annotate(ctm, org.junit.Test.class, "timeout", getTimeOut(program, i_nr_testcase));

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3860);if ((((TEST_T_ADD_IGNORE.contains(program.toUpperCase() + i_nr_testcase))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3861)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3862)==0&false))) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3863);af.annotate(ctm, Ignore.class);
            }
            }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3864);i_nr_testcase++;
        }
        // We configure the output and compile the tests generated
        }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3865);comp.setSourceOutputDirectory(outputSrcDirectory);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3866);comp.getFactory().getEnvironment().setShouldCompile(true);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3867);comp.getFactory().getEnvironment().setNoClasspath(true);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3868);comp.getModelBuilder().compile();
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3869);JDTBasedSpoonCompiler jdtSpoonModelBuilder = new JDTBasedSpoonCompiler(f);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3870);jdtSpoonModelBuilder.setSourceOutputDirectory(outputSrcDirectory);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3871);jdtSpoonModelBuilder.generateProcessedSourceFiles(OutputType.COMPILATION_UNITS);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3872);jdtSpoonModelBuilder.compile(InputType.CTTYPES);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3873);jdtSpoonModelBuilder.generateProcessedSourceFiles(OutputType.CLASSES);

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3874);System.out.println("Generated test cases stored at " + outputSrcDirectory);
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    private boolean createOracle(File outputSrcDirectory, String testPackage) throws IOException {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3875);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3876);boolean created = false;
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3877);File oracleFile = new File((outputSrcDirectory).getAbsoluteFile() + File.separator
                + QuixFixOracleHelper.class.getCanonicalName().replaceAll("\\.", File.separator) + ".java");
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3878);if ((((oracleFile.exists())&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3879)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3880)==0&false))) {{

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3881);File destinationOracle = new File((outputSrcDirectory).getAbsoluteFile() + File.separator + testPackage
                    + File.separator + QuixFixOracleHelper.class.getSimpleName() + ".java");
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3882);if ((((!destinationOracle.exists())&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3883)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3884)==0&false))) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3885);System.out.println("Creating oracle java file at " + destinationOracle);
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3886);FileUtils.copyFile(oracleFile, destinationOracle);
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3887);this.replaceImport(destinationOracle, testPackage);
            }
            }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3888);created = true;
        }
        }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3889);return created;
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    /**
     * Check if the type is a Number (Wrapper or primitive)
     */
    public boolean isNumber(Class type) {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3890);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3891);return Number.class.isAssignableFrom(type) || (type.isPrimitive() && (type.getSimpleName().equals("double")
                || type.getSimpleName().equals("int") || type.getSimpleName().equals("float")));
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    /**
     * By Sophie Ye, and refactored.
     *
     * @param types
     * @param input
     * @return
     */
    public static String getParametersString(Type[] types, JsonElement input) {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3892);

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3893);JsonArray inputArray;
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3894);if ((((input.isJsonArray())&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3895)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3896)==0&false))) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3897);inputArray = input.getAsJsonArray();
        } }else {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3898);inputArray = new JsonArray();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3899);inputArray.add(input);
        }
        }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3900);String parameterStr = "";
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3901);if ((((types.length == inputArray.size())&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3902)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3903)==0&false))) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3904);for (int i = 0; (((i < types.length)&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3905)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3906)==0&false)); i++) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3907);JsonElement elementJSON = inputArray.get(i);
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3908);String thisType = types[i].getTypeName();
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3909);parameterStr += getParameterObject(elementJSON, thisType) + ",";
            }
        }} }else {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3910);System.out.println("Incompatible types: Object cannot be converted.");
        }
        }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3911);return parameterStr.substring(0, parameterStr.length() - 1);
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    /**
     * By Sophie Ye, and refactored. I changed to allow recursivity in data
     * conversion.
     *
     * @param types
     * @param input
     * @return
     */
    private static String getParameterObject(JsonElement jsonElement, String thisType) {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3912);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3913);String parameterStr = "";
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3914);if (((("java.util.ArrayList".equals(thisType))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3915)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3916)==0&false))) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3917);String arrStr = jsonElement.toString().replace("[", "(").replace("]", ")");
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3918);parameterStr = parameterStr + "new " + thisType + "(java.util.Arrays.asList" + arrStr + ")";
        } }else {__CLR4_5_22xq2xqlwzsbeg2.R.inc(3919);if ((((thisType.contains("[]"))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3920)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3921)==0&false))) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3922);String arrStr = jsonElement.toString().replace("[", "{").replace("]", "}");
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3923);parameterStr = parameterStr + "new " + thisType + "" + arrStr;
        } }else {__CLR4_5_22xq2xqlwzsbeg2.R.inc(3924);if (((("java.lang.Object".equals(thisType))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3925)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3926)==0&false))) {{

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3927);if ((((jsonElement instanceof Iterable)&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3928)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3929)==0&false))) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3930);List<String> arguments = new ArrayList<>();
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3931);Iterable it = (Iterable) jsonElement;
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3932);for (Object object : it) {{

                    __CLR4_5_22xq2xqlwzsbeg2.R.inc(3933);arguments.add(getParameterObject((JsonElement) object, "java.lang.Object"));
                }
                }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3934);String arrStr = arguments.toString().replace("[", "(").replace("]", ")");
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3935);parameterStr = "new java.util.ArrayList(java.util.Arrays.asList" + arrStr + ")";
            } }else {{
                //
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3936);parameterStr = (jsonElement.toString());
            }
        }} }else {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3937);parameterStr = parameterStr + "(" + thisType + ")" + jsonElement.toString();
        }
        }}}__CLR4_5_22xq2xqlwzsbeg2.R.inc(3938);return parameterStr;
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3939);

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3940);String ROOT_DIR = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3941);String DIR_JSON = ROOT_DIR + "/json_testcases/";
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3942);String subjectPackageName = "java_programs";
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3943);String testPackageName = "java_testcases.junit";

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3944);String[] names = new String[] { "bitcount", "bucketsort", "find_first_in_sorted", "find_in_sorted", "flatten",
                "gcd", "get_factors", "hanoi", "is_valid_parenthesization", "kheapsort", "knapsack", "kth",
                "lcs_length", "levenshtein", "lis", "longest_common_subsequence", "max_sublist_sum", "mergesort",
                "next_palindrome", "next_permutation", "pascal", "possible_change", "powerset", "quicksort", "rpn_eval",
                "shunting_yard", "sieve", "sqrt", "subsequences", "to_base", "wrap", };

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3945);for (String prog : names) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3946);List<String> tests = read(DIR_JSON + File.separator + prog + ".json");
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3947);String programToExecute = prog;
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3948);String out = ROOT_DIR;
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3949);TestsGenerator ct = new TestsGenerator();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3950);ct.createTestCases(ROOT_DIR, tests, programToExecute, out, testPackageName, subjectPackageName);

        }
        }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3951);System.out.println("End");
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    /**
     * Each line is a test case
     *
     * @param filejson
     * @return
     */
    public static List<String> read(String filejson) {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3952);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3953);List<String> s = new ArrayList<>();
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3954);try {
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3955);File file = new File(filejson);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3956);FileReader fileReader = new FileReader(file);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3957);BufferedReader bufferedReader = new BufferedReader(fileReader);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3958);String line;
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3959);while ((line = bufferedReader.readLine()) != null) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3962);s.add(line);

            }
            }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3963);fileReader.close();
        } catch (IOException e) {
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3964);e.printStackTrace();
        }
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3965);return s;
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    /**
     * Returns types of the parameters of a method which name is given as parameter
     *
     * @param methodName
     * @param className
     * @param packageName
     * @return
     * @throws Exception
     */
    public static Type[] getTypesOfParameters(String methodName, String className, String packageName)
            throws Exception {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3966);
        // Get parameter type for class method.
        // try {
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3967);Class target_class = Class.forName(packageName + "." + className);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3968);Method[] method = target_class.getDeclaredMethods();

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3969);for (Method m : method) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3970);if ((((!m.getName().equals(methodName))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3971)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3972)==0&false))) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3973);continue;
            }

            }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3974);Type[] types = m.getParameterTypes();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3975);return types;
        }
        }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3976);return null;
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    /**
     * Returns the *return* type of the parameters of a method which name is given
     * as parameter
     *
     * @param methodName
     * @param className
     * @param packageName
     * @return
     * @throws Exception
     */
    public static Class getReturnType(String methodName, String className, String packageName) throws Exception {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3977);

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3978);Class target_class = Class.forName(packageName + "." + className);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3979);Method[] method = target_class.getDeclaredMethods();

        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3980);for (Method m : method) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3981);if ((((!m.getName().equals(methodName))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3982)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3983)==0&false))) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(3984);continue;
            }

            }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3985);Class type = m.getReturnType();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3986);return type;
        }
        }__CLR4_5_22xq2xqlwzsbeg2.R.inc(3987);return null;
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    private static double getFloatComparisonDelta(String program, int nrTestcase) {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3988);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3989);if ((((program.toLowerCase().equals("sqrt"))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3990)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3991)==0&false))) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3992);return DELTAS_TESTS_SQRT[nrTestcase];
        } }else {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3993);return DELTA_FLOAT_COMPARISON;
        }

    }}finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    /**
     * Some special timeouts for given methods
     *
     * @param program
     * @param nrTestcase
     * @return
     */
    private static int getTimeOut(String program, int nrTestcase) {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(3994);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(3995);if ((((program.toLowerCase().equals("levenshtein") && nrTestcase == 3)&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3996)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(3997)==0&false))) {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3998);return 40000;
        } }else {{
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(3999);return TIMEOUT;
        }

    }}finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

    public void replaceImport(File fileOracle, String testPackage) {try{__CLR4_5_22xq2xqlwzsbeg2.R.inc(4000);
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(4001);List<String> lines = new ArrayList<String>();
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(4002);String line = null;
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(4003);String lineSep = System.lineSeparator();
        __CLR4_5_22xq2xqlwzsbeg2.R.inc(4004);try {

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4005);FileReader fr = new FileReader(fileOracle);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4006);BufferedReader br = new BufferedReader(fr);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4007);while ((line = br.readLine()) != null) {{
                __CLR4_5_22xq2xqlwzsbeg2.R.inc(4010);if ((((line.trim().startsWith("package"))&&(__CLR4_5_22xq2xqlwzsbeg2.R.iget(4011)!=0|true))||(__CLR4_5_22xq2xqlwzsbeg2.R.iget(4012)==0&false)))
                    {__CLR4_5_22xq2xqlwzsbeg2.R.inc(4013);line = "package " + testPackage + ";";
                }__CLR4_5_22xq2xqlwzsbeg2.R.inc(4014);lines.add(line + lineSep);
            }
            }__CLR4_5_22xq2xqlwzsbeg2.R.inc(4015);fr.close();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4016);br.close();

            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4017);FileWriter fw = new FileWriter(fileOracle);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4018);BufferedWriter out = new BufferedWriter(fw);
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4019);for (String s : lines)
                {__CLR4_5_22xq2xqlwzsbeg2.R.inc(4020);out.write(s);
            }__CLR4_5_22xq2xqlwzsbeg2.R.inc(4021);out.flush();
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4022);out.close();
        } catch (Exception ex) {
            __CLR4_5_22xq2xqlwzsbeg2.R.inc(4023);ex.printStackTrace();
        }
    }finally{__CLR4_5_22xq2xqlwzsbeg2.R.flushNeeded();}}

}
