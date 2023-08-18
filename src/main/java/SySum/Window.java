package SySum;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;

import static org.lwjgl.glfw.GLFW.*;

public class Window {
    private int m_width, m_height;
    private String m_title;
    private static Window window = null;

    private Window(){
        this.m_height = 1920;
        this.m_width = 1080;
        this.m_title = "sisum";
    }

    public static Window get(){
        if (Window.window==null){
            Window.window = new Window();
        }
        return Window.window;
    }
    public void run(){
        System.out.println("Hello LWJGL" + Version.getVersion() + "!" );

        init();
        loop();

    }

    //public Function
    public void init(){
        //Setup Error callback
        //it same as we called
        //System.err.println("something Error");
        GLFWErrorCallback.createPrint(System.err).set();

        //init GLFW
        if (!glfwInit()){
            throw new IllegalStateException("Unable ot initialize GLFW");
        }
        //configure GLFW
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE); //basically create window first and make it visible
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_MAXIMIZED, GLFW_MAXIMIZED);

        //create window


    }

    public void loop(){

    }

}
