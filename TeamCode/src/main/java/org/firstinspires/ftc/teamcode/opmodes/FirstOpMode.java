package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "MyFirstTeleOp", group = "TeleOp")
public class FirstOpMode extends OpMode {

    DcMotor frontLeft, frontRight,backLeft, backRight;

    public void init (){
        frontLeft = hardwareMap.dcMotor.get("front_left");
        frontRight = hardwareMap.dcMotor.get("front_right");
        backLeft = hardwareMap.dcMotor.get("back_left");
        backRight = hardwareMap.dcMotor.get("back_right");
    }
    public void loop() {
        frontRight.setPower(gamepad1.right_stick_y);
        frontLeft.setPower(gamepad1.right_stick_y);
        backRight.setPower(-gamepad1.right_stick_y);
        backLeft.setPower(-gamepad1.right_stick_y);
    }

}
