import java.awt.*;
public class Checkboxeg1
{
Checkboxeg1(){
Frame f=new Frame("CheckBox Example");
Checkbox checkbox1=new Checkbox("C++");
checkbox1.setBounds(100,100,50,50);
Checkbox heckbox2=new Checkbox("Java",true);
checkbox2.setBounds(100,150,50,50);
f.add(checkbox1);
f.add(checkbox2);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
public static void main(String args[])
{
new Checkboxeg1();
}
}
