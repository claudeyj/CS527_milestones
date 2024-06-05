/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2017 Andrey Kunitsyn (andrey@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.notification;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Event;
import org.traccar.model.Position;
import org.traccar.model.User;

public final class NotificationMail {public static class __CLR4_5_25b35b3lwydzlch{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,6966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private NotificationMail() {try{__CLR4_5_25b35b3lwydzlch.R.inc(6879);
    }finally{__CLR4_5_25b35b3lwydzlch.R.flushNeeded();}}

    private static Properties getProperties(PropertiesProvider provider) {try{__CLR4_5_25b35b3lwydzlch.R.inc(6880);
        __CLR4_5_25b35b3lwydzlch.R.inc(6881);Properties properties = new Properties();
        __CLR4_5_25b35b3lwydzlch.R.inc(6882);String host = provider.getString("mail.smtp.host");
        __CLR4_5_25b35b3lwydzlch.R.inc(6883);if ((((host != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6884)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6885)==0&false))) {{
            __CLR4_5_25b35b3lwydzlch.R.inc(6886);properties.put("mail.transport.protocol", provider.getString("mail.transport.protocol", "smtp"));
            __CLR4_5_25b35b3lwydzlch.R.inc(6887);properties.put("mail.smtp.host", host);
            __CLR4_5_25b35b3lwydzlch.R.inc(6888);properties.put("mail.smtp.port", provider.getString("mail.smtp.port", "25"));

            __CLR4_5_25b35b3lwydzlch.R.inc(6889);String starttlsEnable = provider.getString("mail.smtp.starttls.enable");
            __CLR4_5_25b35b3lwydzlch.R.inc(6890);if ((((starttlsEnable != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6891)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6892)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6893);properties.put("mail.smtp.starttls.enable", Boolean.parseBoolean(starttlsEnable));
            }
            }__CLR4_5_25b35b3lwydzlch.R.inc(6894);String starttlsRequired = provider.getString("mail.smtp.starttls.required");
            __CLR4_5_25b35b3lwydzlch.R.inc(6895);if ((((starttlsRequired != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6896)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6897)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6898);properties.put("mail.smtp.starttls.required", Boolean.parseBoolean(starttlsRequired));
            }

            }__CLR4_5_25b35b3lwydzlch.R.inc(6899);String sslEnable = provider.getString("mail.smtp.ssl.enable");
            __CLR4_5_25b35b3lwydzlch.R.inc(6900);if ((((sslEnable != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6901)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6902)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6903);properties.put("mail.smtp.ssl.enable", Boolean.parseBoolean(sslEnable));
            }
            }__CLR4_5_25b35b3lwydzlch.R.inc(6904);String sslTrust = provider.getString("mail.smtp.ssl.trust");
            __CLR4_5_25b35b3lwydzlch.R.inc(6905);if ((((sslTrust != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6906)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6907)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6908);properties.put("mail.smtp.ssl.trust", sslTrust);
            }

            }__CLR4_5_25b35b3lwydzlch.R.inc(6909);String sslProtocols = provider.getString("mail.smtp.ssl.protocols");
            __CLR4_5_25b35b3lwydzlch.R.inc(6910);if ((((sslProtocols != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6911)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6912)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6913);properties.put("mail.smtp.ssl.protocols", sslProtocols);
            }

            }__CLR4_5_25b35b3lwydzlch.R.inc(6914);String username = provider.getString("mail.smtp.username");
            __CLR4_5_25b35b3lwydzlch.R.inc(6915);if ((((username != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6916)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6917)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6918);properties.put("mail.smtp.username", username);
            }
            }__CLR4_5_25b35b3lwydzlch.R.inc(6919);String password = provider.getString("mail.smtp.password");
            __CLR4_5_25b35b3lwydzlch.R.inc(6920);if ((((password != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6921)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6922)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6923);properties.put("mail.smtp.password", password);
            }
            }__CLR4_5_25b35b3lwydzlch.R.inc(6924);String from = provider.getString("mail.smtp.from");
            __CLR4_5_25b35b3lwydzlch.R.inc(6925);if ((((from != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6926)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6927)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6928);properties.put("mail.smtp.from", from);
            }
        }}
        }__CLR4_5_25b35b3lwydzlch.R.inc(6929);return properties;
    }finally{__CLR4_5_25b35b3lwydzlch.R.flushNeeded();}}

    public static void sendMailSync(long userId, Event event, Position position) throws MessagingException {try{__CLR4_5_25b35b3lwydzlch.R.inc(6930);
        __CLR4_5_25b35b3lwydzlch.R.inc(6931);User user = Context.getPermissionsManager().getUser(userId);

        __CLR4_5_25b35b3lwydzlch.R.inc(6932);Properties properties = getProperties(new PropertiesProvider(Context.getConfig()));
        __CLR4_5_25b35b3lwydzlch.R.inc(6933);if ((((!properties.containsKey("mail.smtp.host"))&&(__CLR4_5_25b35b3lwydzlch.R.iget(6934)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6935)==0&false))) {{
            __CLR4_5_25b35b3lwydzlch.R.inc(6936);properties = getProperties(new PropertiesProvider(user));
            __CLR4_5_25b35b3lwydzlch.R.inc(6937);if ((((!properties.containsKey("mail.smtp.host"))&&(__CLR4_5_25b35b3lwydzlch.R.iget(6938)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6939)==0&false))) {{
                __CLR4_5_25b35b3lwydzlch.R.inc(6940);Log.warning("No SMTP configuration found");
                __CLR4_5_25b35b3lwydzlch.R.inc(6941);return;
            }
        }}

        }__CLR4_5_25b35b3lwydzlch.R.inc(6942);Session session = Session.getInstance(properties);

        __CLR4_5_25b35b3lwydzlch.R.inc(6943);MimeMessage message = new MimeMessage(session);

        __CLR4_5_25b35b3lwydzlch.R.inc(6944);String from = properties.getProperty("mail.smtp.from");
        __CLR4_5_25b35b3lwydzlch.R.inc(6945);if ((((from != null)&&(__CLR4_5_25b35b3lwydzlch.R.iget(6946)!=0|true))||(__CLR4_5_25b35b3lwydzlch.R.iget(6947)==0&false))) {{
            __CLR4_5_25b35b3lwydzlch.R.inc(6948);message.setFrom(new InternetAddress(from));
        }

        }__CLR4_5_25b35b3lwydzlch.R.inc(6949);message.addRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmail()));
        __CLR4_5_25b35b3lwydzlch.R.inc(6950);MailMessage mailMessage = NotificationFormatter.formatMailMessage(userId, event, position);
        __CLR4_5_25b35b3lwydzlch.R.inc(6951);message.setSubject(mailMessage.getSubject());
        __CLR4_5_25b35b3lwydzlch.R.inc(6952);message.setSentDate(new Date());
        __CLR4_5_25b35b3lwydzlch.R.inc(6953);message.setContent(mailMessage.getBody(), "text/html; charset=utf-8");

        __CLR4_5_25b35b3lwydzlch.R.inc(6954);Transport transport = session.getTransport();
        __CLR4_5_25b35b3lwydzlch.R.inc(6955);try {
            __CLR4_5_25b35b3lwydzlch.R.inc(6956);Context.getStatisticsManager().registerMail();
            __CLR4_5_25b35b3lwydzlch.R.inc(6957);transport.connect(
                    properties.getProperty("mail.smtp.host"),
                    properties.getProperty("mail.smtp.username"),
                    properties.getProperty("mail.smtp.password"));
            __CLR4_5_25b35b3lwydzlch.R.inc(6958);transport.sendMessage(message, message.getAllRecipients());
        } finally {
            __CLR4_5_25b35b3lwydzlch.R.inc(6959);transport.close();
        }
    }finally{__CLR4_5_25b35b3lwydzlch.R.flushNeeded();}}

    public static void sendMailAsync(final long userId, final Event event, final Position position) {try{__CLR4_5_25b35b3lwydzlch.R.inc(6960);
        __CLR4_5_25b35b3lwydzlch.R.inc(6961);new Thread(new Runnable() {
            public void run() {try{__CLR4_5_25b35b3lwydzlch.R.inc(6962);
                __CLR4_5_25b35b3lwydzlch.R.inc(6963);try {
                    __CLR4_5_25b35b3lwydzlch.R.inc(6964);sendMailSync(userId, event, position);
                } catch (MessagingException error) {
                    __CLR4_5_25b35b3lwydzlch.R.inc(6965);Log.warning(error);
                }
            }finally{__CLR4_5_25b35b3lwydzlch.R.flushNeeded();}}
        }).start();
    }finally{__CLR4_5_25b35b3lwydzlch.R.flushNeeded();}}

}
