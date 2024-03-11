// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.woowee;
import frc.robot.subsystems.ShooterMan;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ampShoot extends SequentialCommandGroup {
  /** Creates a new ampShoot. */
  public ampShoot(woowee s_woowee, ShooterMan s_ShooterMan) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new WooweePosition(s_woowee, 156).alongWith(new ShootSeperateWheels(s_ShooterMan, .01 ,.29))
    );
  }
}
