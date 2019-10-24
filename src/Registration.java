import java.awt.*;

        public class Registration extends Frame {

            String msg;
            Button b1=new Button("SignUp");

            Label l1=new Label("First Name:",Label.LEFT);
            Label l2=new Label("Last Name:",Label.LEFT);
            Label l3=new Label("Classification:",Label.LEFT);
            Label l4=new Label("Address:",Label.LEFT);
            Label l5=new Label("PeopleSoft:",Label.LEFT);
            Label l6=new Label("Password:",Label.RIGHT);
            TextField t1=new TextField();
            TextField t3=new TextField();
            TextField t4=new TextField();
            TextField t5=new TextField();
            TextField t6=new TextField();


            TextArea t2=new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);

            public Registration()
            {
                setBackground(Color.white);
                setForeground(Color.black);
                setLayout(null);
                add(l1);
                add(l2);
                add(l3);
                add(l4);
                add(l5);
                add(l6);

                add(t1);
                add(t2);
                add(t3);
                add(t4);
                add(t5);
                add(t6);
                add(b1);


                l1.setBounds(25,65,90,20);
                l2.setBounds(25,90,90,20);
                l4.setBounds(25,120,90,20);
                l3.setBounds(25,185,90,20);
                l5.setBounds(25,230,90,20);
                l6.setBounds(25,290,60,20);

                t1.setBounds(120,65,170,20);
                t3.setBounds(120,120,170,20);
                t2.setBounds(120,185,170,60);
                t4.setBounds(120,90,170,20);
                t5.setBounds(120,260,170,20);
                t6.setBounds(120,290,170,20);
                b1.setBounds(120,350,170,30);
            }

            public static void main(String g[]) {
                Registration stu = new Registration();
                stu.setSize(new Dimension(500, 500));
                stu.setTitle("Sign Up From");
                stu.setVisible(true);
            }
        }
