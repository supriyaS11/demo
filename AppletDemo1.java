import java.applet.*;
import java.awt.*;


class AppletDemo extends Applet
{

public void init()
{
System.out.println("method is initialized");
}

public void start()
{
System.out.println("methodis started");
}

public void paint(Graphics g)
{
g.drawString("Paint",10,20);
}

public void stop()
{
System.out.println("metod get stop");
}

public void destroy()
{
System.out.println("method is destroyed");
}
}
/*<applet code="AppletDemo.class"
width=400 height=500>
</applet>*/