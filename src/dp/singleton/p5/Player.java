package dp.lec99.singleton.p5;
import javax.swing.JButton;
import javax.swing.JTextField;
public class Player extends Thread{
      int MaxDistance;
      int stopTime,step;
      JButton com;
      JTextField showMess;
      Champion champion;
       Player(int stopTime,int step,int MaxDistance,JButton com,int w,int h,
            JTextField showMess){
            this.stopTime=stopTime;
            this.step=step;
            this.MaxDistance=MaxDistance;
            this.com=com;
            this.showMess=showMess;
     }
     public void run(){
            while(true){
                int a=com.getBounds().x;
                int b=com.getBounds().y;
                if(a+com.getBounds().width>=MaxDistance){
                     champion=Champion.getChampion(com.getText());
                     showMess.setText(champion.getMess());
                     return;
                }
                a=a+step;
                com.setLocation(a,b);
               try{
                        sleep(stopTime);
               }
               catch(InterruptedException exp){}
           }
      }
}