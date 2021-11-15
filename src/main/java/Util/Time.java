package Util;

//setting up delta time
public class Time {

    //time of app start
    public static float timeStarted = System.nanoTime();

    //time elapsed in nanoseconds
    public static float getTime() {
        return (float)((System.nanoTime() - timeStarted) * 1E-9);
    }
}
