package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class MyFIRSTJavaOpMode extends LinearOpMode {
    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;

    @Override
    public void runOpMode() {
        leftMotor = hardwareMap.get(DcMotor.class, "left_drive");
        rightMotor = hardwareMap.get(DcMotor.class, "right_drive");

        telemetry.addData("status", "Initialized");
        telemetry.update();
        //Wait for the game to start (driver presses PLAY)
        waitForStart();
        double rightPower = 0;
        double leftPower = 0;

        //run until the end of the match (driver presses STOP)
        while (this.opModeIsActive()) {


            leftPower = -gamepad1.left_stick_y;
            rightPower = -gamepad1.right_stick_y;

            leftMotor.setPower(leftPower);
            rightMotor.setPower(rightPower);

            telemetry.addData("Status", "Running");
            telemetry.update();
        }

    }
}
