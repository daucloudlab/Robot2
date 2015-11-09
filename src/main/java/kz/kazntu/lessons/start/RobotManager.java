package kz.kazntu.lessons.start;

import kz.kazntu.lessons.models.Robot;
import kz.kazntu.lessons.models.sony.SonyHand;
import kz.kazntu.lessons.models.sony.SonyHead;
import kz.kazntu.lessons.models.toshiba.ToshibaLeg;

public class RobotManager {

    public static void main(String[] args){

        SonyHand sonyHand = new SonyHand();
        ToshibaLeg toshibaLeg = new ToshibaLeg();
        SonyHead sonyHead = new SonyHead();

        Robot robot = new Robot(sonyHand, toshibaLeg, sonyHead);

        robot.action();


    }

}