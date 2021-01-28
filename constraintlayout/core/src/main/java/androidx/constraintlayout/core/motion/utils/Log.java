package androidx.constraintlayout.core.motion.utils;

public class Log {
    private static Log logger = new Log();
    private Log(){

    }

    public static void setLogger(Log logger) {
        Log.logger = logger;
    }

    public static void e(String tag, String msg) {
        logger.eInternal(tag,msg);
    }

    protected void vInternal(String tag, String msg) {
        System.out.println(tag+msg);
    }
    protected void eInternal(String tag, String msg) {
        System.err.println(tag+msg);
    }

    public static void v(String tag,String msg) {
        logger.vInternal(tag,msg);
    }
}
