/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 * 
 * This file is part of OpenPnP.
 * 
 * OpenPnP is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * OpenPnP is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with OpenPnP. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 * For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp.util;

import java.io.File;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;

public class ResourceUtils {public static class __CLR4_5_2eyheyhlx1h3cag{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,19437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Get the relative path from one file to another, specifying the directory separator. If one of
     * the provided resources does not exist, it is assumed to be a file unless it ends with '/' or
     * '\'.
     * 
     * @param target targetPath is calculated to this file
     * @param base basePath is calculated from this file
     * @param separator directory separator. The platform default is not assumed so that we can test
     *        Unix behaviour when running on Windows (for example)
     * @return
     */
    public static String getRelativePath(String targetPath, String basePath, String pathSeparator) {try{__CLR4_5_2eyheyhlx1h3cag.R.inc(19385);

        // Normalize the paths
        __CLR4_5_2eyheyhlx1h3cag.R.inc(19386);String normalizedTargetPath = FilenameUtils.normalizeNoEndSeparator(targetPath);
        __CLR4_5_2eyheyhlx1h3cag.R.inc(19387);String normalizedBasePath = FilenameUtils.normalizeNoEndSeparator(basePath);

        // Undo the changes to the separators made by normalization
        __CLR4_5_2eyheyhlx1h3cag.R.inc(19388);if ((((pathSeparator.equals("/"))&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19389)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19390)==0&false))) {{
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19391);normalizedTargetPath = FilenameUtils.separatorsToUnix(normalizedTargetPath);
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19392);normalizedBasePath = FilenameUtils.separatorsToUnix(normalizedBasePath);

        }
        }else {__CLR4_5_2eyheyhlx1h3cag.R.inc(19393);if ((((pathSeparator.equals("\\"))&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19394)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19395)==0&false))) {{
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19396);normalizedTargetPath = FilenameUtils.separatorsToWindows(normalizedTargetPath);
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19397);normalizedBasePath = FilenameUtils.separatorsToWindows(normalizedBasePath);

        }
        }else {{
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19398);throw new IllegalArgumentException(
                    "Unrecognised dir separator '" + pathSeparator + "'");
        }

        }}__CLR4_5_2eyheyhlx1h3cag.R.inc(19399);String[] base = normalizedBasePath.split(Pattern.quote(pathSeparator));
        __CLR4_5_2eyheyhlx1h3cag.R.inc(19400);String[] target = normalizedTargetPath.split(Pattern.quote(pathSeparator));

        // First get all the common elements. Store them as a string,
        // and also count how many of them there are.
        __CLR4_5_2eyheyhlx1h3cag.R.inc(19401);StringBuffer common = new StringBuffer();

        __CLR4_5_2eyheyhlx1h3cag.R.inc(19402);int commonIndex = 0;
        __CLR4_5_2eyheyhlx1h3cag.R.inc(19403);while ((((commonIndex < target.length && commonIndex < base.length
                && target[commonIndex].equals(base[commonIndex]))&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19404)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19405)==0&false))) {{
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19406);common.append(target[commonIndex] + pathSeparator);
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19407);commonIndex++;
        }

        }__CLR4_5_2eyheyhlx1h3cag.R.inc(19408);if ((((commonIndex == 0)&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19409)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19410)==0&false))) {{
            // No single common path element. This most
            // likely indicates differing drive letters, like C: and D:.
            // These paths cannot be relativized.
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19411);throw new PathResolutionException("No common path element found for '"
                    + normalizedTargetPath + "' and '" + normalizedBasePath + "'");
        }

        // The number of directories we have to backtrack depends on whether the base is a file or a
        // dir
        // For example, the relative path from
        //
        // /foo/bar/baz/gg/ff to /foo/bar/baz
        //
        // ".." if ff is a file
        // "../.." if ff is a directory
        //
        // The following is a heuristic to figure out if the base refers to a file or dir. It's not
        // perfect, because
        // the resource referred to by this path may not actually exist, but it's the best I can do
        }__CLR4_5_2eyheyhlx1h3cag.R.inc(19412);boolean baseIsFile = true;

        __CLR4_5_2eyheyhlx1h3cag.R.inc(19413);File baseResource = new File(normalizedBasePath);

        __CLR4_5_2eyheyhlx1h3cag.R.inc(19414);if ((((baseResource.exists())&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19415)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19416)==0&false))) {{
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19417);baseIsFile = baseResource.isFile();

        }
        }else {__CLR4_5_2eyheyhlx1h3cag.R.inc(19418);if ((((basePath.endsWith(pathSeparator))&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19419)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19420)==0&false))) {{
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19421);baseIsFile = false;
        }

        }}__CLR4_5_2eyheyhlx1h3cag.R.inc(19422);StringBuffer relative = new StringBuffer();

        __CLR4_5_2eyheyhlx1h3cag.R.inc(19423);if ((((base.length != commonIndex)&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19424)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19425)==0&false))) {{
            __CLR4_5_2eyheyhlx1h3cag.R.inc(19426);int numDirsUp = (((baseIsFile )&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19427)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19428)==0&false))? base.length - commonIndex - 1 : base.length - commonIndex;

            __CLR4_5_2eyheyhlx1h3cag.R.inc(19429);for (int i = 0; (((i < numDirsUp)&&(__CLR4_5_2eyheyhlx1h3cag.R.iget(19430)!=0|true))||(__CLR4_5_2eyheyhlx1h3cag.R.iget(19431)==0&false)); i++) {{
                __CLR4_5_2eyheyhlx1h3cag.R.inc(19432);relative.append(".." + pathSeparator);
            }
        }}
        }__CLR4_5_2eyheyhlx1h3cag.R.inc(19433);relative.append(normalizedTargetPath.substring(common.length()));
        __CLR4_5_2eyheyhlx1h3cag.R.inc(19434);return relative.toString();
    }finally{__CLR4_5_2eyheyhlx1h3cag.R.flushNeeded();}}


    public static class PathResolutionException extends RuntimeException {
        PathResolutionException(String msg) {
            super(msg);__CLR4_5_2eyheyhlx1h3cag.R.inc(19436);try{__CLR4_5_2eyheyhlx1h3cag.R.inc(19435);
        }finally{__CLR4_5_2eyheyhlx1h3cag.R.flushNeeded();}}
    }
}
